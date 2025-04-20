# Fórmula para calcular energía de inputs

La energía de un input $s$ se define como $e(s)$ donde $p(s)$ es el camino que recorrió la ejecución de $s$ y $f(p(s))$ es la frecuencia de apariciones de un camino en el test suite

$$e(s) = \frac{1}{f(p(s))^a}$$
---
# Ejercicio 1

Sea el siguiente programa:

```python
def crashme(s: str) -> None: # 0
    if len(s) > 0 and s[0] == 'b': # 1
        if len(s) > 1 and s[1] == 'a': # 2
            if len(s) > 2 and s[2] == 'd': # 3
                if len(s) > 3 and s[3] == '!': # 4
                    raise Exception() # 5
```

Asumiendo que tenemos un boosted greybox fuzzer con exponente $a=5$ y el siguiente conjunto inicial de inputs: ‘’, ‘a’, ‘b’, ‘c’, ‘d’, ‘aa’, ‘ab’, ‘ac’, ‘ba’, ‘bb’, ‘bc’, ‘bad’.

### a) Indicar el camino de ejecución de cada input

| Input $s$ | Camino $p(s)$ | Frecuencias (actuales)                                      |
| --------- | ------------- | ----------------------------------------------------------- |
| ''        | [0]           | [0] -> 1                                                    |
| 'a'       | [0]           | [0] → 2                                                     |
| 'b'       | [0, 1]        | [0] → 2, [0, 1] -> 1                                        |
| 'c'       | [0]           | [0] → 3, [0, 1] -> 1                                        |
| 'd'       | [0]           | [0] → 4, [0, 1] -> 1                                        |
| 'aa'      | [0]           | [0] → 5, [0, 1] -> 1                                        |
| 'ab'      | [0]           | [0] → 6, [0, 1] -> 1                                        |
| 'ac'      | [0]           | [0] → 7, [0, 1] -> 1                                        |
| 'ba'      | [0, 1, 2]     | [0] → 7, [0, 1] -> 1, [0, 1, 2] -> 1                        |
| 'bb'      | [0, 1]        | [0] → 7, [0, 1] -> 2, [0, 1, 2] -> 1                        |
| 'bc'      | [0, 1]        | [0] → 7, [0, 1] -> 3, [0, 1, 2] -> 1                        |
| 'bad'     | [0, 1, 2, 3]  | **[0] → 7, [0, 1] -> 3, [0, 1, 2] -> 1, [0, 1, 2, 3] ->** 1 |
### b) Indicar la energía de cada input en el conjunto inicial.

Con las frecuencias de los caminos, obtenemos para los inputs:

| Input $s$ | Camino $p(s)$ | Energía $e(s)$ |
| --------- | ------------- | -------------- |
| ''        | [0]           | $1/7^5$        |
| 'a'       | [0]           | $1/7^5$        |
| 'b'       | [0, 1]        | $1/3^5$        |
| 'c'       | [0]           | $1/7^5$        |
| 'd'       | [0]           | $1/7^5$        |
| 'aa'      | [0]           | $1/7^5$        |
| 'ab'      | [0]           | $1/7^5$        |
| 'ac'      | [0]           | $1/7^5$        |
| 'ba'      | [0, 1, 2]     | $1/1^5$ = 1    |
| 'bb'      | [0, 1]        | $1/3^5$        |
| 'bc'      | [0, 1]        | $1/3^5$        |
| 'bad'     | [0, 1, 2, 3]  | $1/1^5 = 1$    |

### c) ¿Cuál es la probabilidad que el fuzzer elija el input "bad" para mutarlo?

$$
P('bad')= \frac{\text{Energia de 'bad'}}{E_{\text{total}}} = \frac{1}{E_{\text{total}}} \approx \frac{1}{2.013} \approx 0.5  
$$

---
# Ejercicio 3

Sea el siguiente programa `cgi_decode`:

```python
def cgi_decode(s: str) -> str:
    # Mapping of hex digits to their integer values
    hex_values = {
        '0': 0, '1': 1, '2': 2, '3': 3, '4': 4,
        '5': 5, '6': 6, '7': 7, '8': 8, '9': 9,
        'a': 10, 'b': 11, 'c': 12, 'd': 13, 'e': 14, 'f': 15,
        'A': 10, 'B': 11, 'C': 12, 'D': 13, 'E': 14, 'F': 15,
    }
    t = ""
    i = 0
    while i < len(s):  # c1
        c = s[i]
        if c == '+':  # c2
            t += ' '
        elif c == '%':  # c3
            digit_high, digit_low = s[i+1], s[i+2]
            i += 2
            if digit_high in hex_values and digit_low in hex_values:  # c4 and c5
                v = hex_values[digit_high] * 16 + hex_values[digit_low]
                t += chr(v)
            else:
                raise ValueError("Invalid encoding")
        else:
            t += c
        i += 1
    return t

```

Asumiendo que tenemos un **boosted greybox fuzzer** con **exponente $a = 4$** y el siguiente conjunto inicial de inputs: "hola+mundo", "hello+world", "gracias+mundo", " %12", " %AA", " %BB", "mistring".

### a) Indicar la energía de cada input en el conjunto inicial.

| Input $s$     | Camino (números de condiciones tomadas) $p(s)$ | Frecuencia (actual) |
| ------------- | ---------------------------------------------- | ------------------- |
| hola+mundo    | [1, 1, 1, 1, 2, 1, 1, 1, 1, 1]                 | 1                   |
| hello+world   | [1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1]              | 1                   |
| gracias+mundo | [1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1]        | 1                   |
| %12           | [1, 3, 4, 5, 1]                                | 1                   |
| %AA           | [1, 3, 4, 5, 1]                                | 2                   |
| %BB           | [1, 3, 4, 5, 1]                                | 3                   |
| mistring      | [1, 1, 1, 1, 1, 1, 1, 1]                       | 1                   |

| Input $s$     | Frecuencia (de camino) $f(p(s))$ | Energía $e(s)$ |
| ------------- | -------------------------------- | -------------- |
| hola+mundo    | 1                                | $1/1^4 = 1$    |
| hello+world   | 1                                | $1/1^4 = 1$    |
| gracias+mundo | 1                                | $1/1^4 = 1$    |
| %12           | 3                                | $1/3^4$        |
| %AA           | 3                                | $1/3^4$        |
| %BB           | 3                                | $1/3^4$        |
| mistring      | 1                                | $1/1^4 = 1$    |
### b) ¿Cuál es la probabilidad que el fuzzer elija el input "mistring" para mutarlo?

$$
P('mistring')= \frac{\text{Energia de 'mistring'}}{E_{\text{total}}} = \frac{1}{E_{\text{total}}} \approx \frac{1}{4.04} \approx 0.25  
$$

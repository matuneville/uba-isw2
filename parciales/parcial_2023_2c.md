## Ejercicio 1

#### a)

Linea 6: `r = r - 1`.  

Un test case que lo mata:  
-`assertEqual(test_me(0), 1)`

#### b)

Linea 3: `r = 0 - 0`  (Trivial) ((Sale por induccion sobre r))  
0-0 = 0+0(repasar apuntes de Teresa Krick)

probar por induccion 


---
## Ejercicio 2

#### a)

| Iteracion | Input concreto | Condición de ruta                         | Fórmula para el sat solver              | Resultado posible |
| --------- | -------------- | ----------------------------------------- | --------------------------------------- | ----------------- |
| 1         |  j = 0         | 0<2 && j0=0 && 1<2 && !(j0=1) && !(2<2)   | 0<2 &&  j0=0 && 1<2 && !(j0=1) && 2<2   | UNSAT             |
|           |                |                                           | 0<2 &&  j0=0 && 1<2 && j0=1             | UNSAT             |
|           |                |                                           | 0<2 &&  j0=0 && !(1<2)                  | UNSAT             |
|           |                |                                           | 0<2 &&  !j0=0                           | j=1               |
| 2         |  j=1           | 0<2 && !(j0=0) && 1<2 && j0=1 && !(2<2)   | 0<2 && !(j0=0) && 1<2 && j0=1 && 2<2    | UNSAT             |
|           |                |                                           | 0<2 && !(j0=0) && 1<2 && !(j0=1)        | j=2               |
| 3         |  j=2           | 0<2 && !(j0=0) && 1<2 && !(j0=1) && !(2<2)| 0<2 && !(j0=0) && 1<2 && !(j0=1) && 2<2 | UNSAT             |
|           |                |                                           | 0<2 && !(j0=0) && !(1<2)                | UNSAT             |
|           |                |                                           | !(0<2)                                  | UNSAT             |
|           |                |                                           | FIN                                     |                   |




#### b)

| Árbol de cómputo de la exploración simbólica dinḿica |
| ---------------------------------------------------- |
| ![]()                                                |

---

## Ejercicio 3

#### a)




#### b)
La distancia de branches no normalizada para el test suite es:

| Branch             | Distance True | Distance False |
| ------------------ | ------------- | -------------- |
| C1 = `while i < 2` | 0             | 0              |
| C2 = `if i==j:`    | 4             | 0              |

El branch coverage es de 0.75.


---
## Ejercicio 4

```python
def parse_url_manual(url):
    scheme = ""
    netloc = ""
    path = ""            # 0
    params = ""
    query = ""
    fragment = ""

    # Split the URL into parts 
    if "://" in url:     # 1
        scheme, url = url.split("://", 1) 
    if "/" in url:      # 2
        netloc, url = url.split("/", 1)
    if "?" in url:     # 3
        path, query = url.split("?", 1)
    elif "#" in url:   # 4
        path, fragment = url.split("#", 1)
    else:         # 5
        path = url

    # Split query into parameters
    query_params = {}
    if query: # 6
        for param in query.split("&"): # 7
            key, value = param.split("=") if "=" in param else (param, "")
            query_params[key] = value

    return [scheme, netloc, path, params, query, fragment]

```

#### a)
| Emails                                     | Camino        | Freq. final de camino | Energía     |
| ------------------------------------------ | ------------- | --------------------- | ----------- |
| `https://www.example.com/path/to/resource` | 0,1,2         | 1                     | $1/1^3$     |
| `http://example.com/page?p1=v1&p2=v2`      | 0,1,2,3,6,7,7 | 1                     | $1/1^3$     |
| `ftp://ftp.example.com/resource#section1`  | 0,1,2,4       | 1                     | $1/1^3$     |
| `https://www.example.com/path?p1=v1`       | 0,1,2,3,6,7   | 3                     | $1/3^3$     |
| `https://www.example.com/path?p2=v2`       | 0,1,2,3,6,7   | 3                     | $1/3^3$     |
| `https://www.example.com/path?p3=v3`       | 0,1,2,3,6,7   | 3                     | $1/3^3$     |
 
#### b)
Probabilidad de elegir input #6 :$$\frac{e(input_6)}{\sum_i e_i} = \frac{1/3^3}{1/3^3 \times 3 + 3}$$

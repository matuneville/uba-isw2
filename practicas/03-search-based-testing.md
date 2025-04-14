## Ejercicio 1
```python
def testme(n: int) -> int:
    r: int = 0
    if n >= 0:  # C1
        i: int = 0
        while i < n:  # C2
            if i % 2 == 1:  # C3
                r = r + i
            i = i + 1
    return r


class TestSuite(unittest.TestCase):
    def test1(self):
        self.assertEqual(0, testme(-1000))
    
    def test2(self):
        self.assertEqual(0, testme(0))
    
    def test3(self):
        self.assertEqual(0, testme(1))
```
### a) Asumiendo un $K=1$ ¿Cuál es el valor de la distancia de branch no normalizada para cada decisión si ejecutamos el test suite?

| test1 | distancia True | distancia False |
| ----- | -------------- | --------------- |
| C1    | $1000$         | $0$             |
| C2    | $\infty$       | $\infty$        |
| C3    | $\infty$       | $\infty$        |

| test2 | distancia True | distancia False |
| ----- | -------------- | --------------- |
| C1    | $0$            | $1$             |
| C2    | $1$            | $0$             |
| C3    | $\infty$       | $\infty$        |

| test3 | distancia True | distancia False |
| ----- | -------------- | --------------- |
| C1    | $0$            | $2$             |
| C2    | $0$            | $0$             |
| C3    | $1$            | $0$             |
### b) ¿Cuál es el cubrimiento de líneas?

Hay un cubrimiento de líneas de $7/8$, pues la línea que corresponde al cuerpo de la condición C1 no es cubierta por ningún test case.

### c) ¿Cuál es el cubrimiento de branches?

Las branches son:
- not C1
- C1 and not C2
- C1 and C2 and not C3
- C1 and C2 and C3

La última no es cubierta por el test suite, por lo que el cubrimiento de ramas es de $3/4$.

---
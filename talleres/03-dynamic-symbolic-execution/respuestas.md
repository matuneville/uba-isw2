## Ejercicio 4

| Árbol de cómputo |
|--------------------|
| ![](img/ejercicio_4.png) |

---

## Ejercicio 5

### a)

| Iteración | Input Concreto     | Condición de Ruta                           | Especificación para Z3 | Resultado Z3         | Renombres                                               |
|-----------|--------------------|---------------------------------------------|-------------------------|----------------------|----------------------------------------------------------|
| 1         | a=0, b=0, c=0      | c1                                          | iteracion1.smt          | a=1, b=1, c=1        | c1 = (a <= 0 or b <= 0 or c <= 0)                        |
| 2         | A=1, b=1, c=1      | Not c1 and not c2 and c3                   | iteracion2.smt          | A=4, b=3, c=2        | c2 = (not (a + b > c and a + c > b and b + c > a))      |
| 3         | A=4, b=3, c=2      | Not c1 and not c2 and not c3 and not c4   | iteracion3.smt          | A=2, b=3, c=2        | c3 = (a == b and b == c)                                |
| 4         | A=2, b=3, c=2      | Not c1 and not c2 and not c3 and c4       | iteracion4.smt          | A=1, b=1, c=2        | c4 = (a == b or b == c or a == c)                        |
| 5         | A=1, b=1, c=2      | not c1 and c2                              |                         |                      |                                                          |
|           |                    |                                         | END                     |           END           |                                                          |


### b)

Branch coverage del 100%.  

### c)

| Árbol de cómputo |
|--------------------|
| ![](img/ejercicio5c.png) |

--- 

## Ejercicio 6

### a)

| Iteración | Input Concreto | Condición de Ruta                                                                 | Especificación para Z3 | Resultado Z3 | Renombres             |
|-----------|----------------|------------------------------------------------------------------------------------|-------------------------|--------------|------------------------|
| 1         | k=0.0          | c1_0 and not c2_0 and c1_1 and not c2_1 and c1_2 and not c2_2 and not c1_3        | iteracion1.smt          | unsat        | C1_0 = (0 < 3)         |
| 2         | -              | c1_0 and not c2_0 and c1_1 and not c2_1 and c1_2 and not c2_2 and c1_3            | iteracion2.smt          | k=-3         | C2_0 = (5 + k == 0)    |
| 3         | k=-3           | c1_0 and not c2_0 and c1_1 and not c2_1 and c1_2 and c2_2 and not c1_3            | iteracion3.smt          | unsat        | C1_1 = (1 < 3)         |
| 4         | -              | c1_0 and not c2_0 and c1_1 and not c2_1 and not c1_2                              | iteracion4.smt          | unsat        |                        |
| 5         | -              | c1_0 and not c2_0 and c1_1 and not c2_1 and c1_2 and c2_2 and c1_3               | iteracion5.smt          | k=-1         | C2_1 = (1 + k == 0)    |
| 6         | k=-1           | c1_0 and not c2_0 and c1_1 and c2_1 and c1_2 and not c2_2 and not c1_3           | iteracion6.smt          | unsat        | C1_2 = (2 < 3)         |
| 7         | -              | c1_0 and not c2_0 and c1_1 and c2_1 and c1_2 and not c2_2 and c1_3               | iteracion7.smt          | unsat        | C2_2 = (3 + k == 0)    |
| 8         | -              | c1_0 and not c2_0 and c1_1 and c2_1 and c1_2 and c2_2                            | iteracion8.smt          | unsat        | C1_3 = (3 < 3)         |
| 9         | -              | c1_0 and not c2_0 and c1_1 and c2_1 and not c1_2                                 | iteracion9.smt          | k=-5         |                        |
| 10        | k=-5           | c1_0 and c2_0 and c1_1 and not c2_1 and c1_2 and not c2_2 and not c1_3          | iteracion10.smt         | unsat        |                        |
| 11        | -              | c1_0 and c2_0 and c1_1 and not c2_1 and c1_2 and not c2_2 and c1_3              | iteracion11.smt         | unsat        |                        |
| 12        | -              | c1_0 and c2_0 and c1_1 and not c2_1 and c1_2 and c2_2                            | iteracion12.smt         | unsat        |                        |
| 13        | -              | c1_0 and c2_0 and c1_1 and not c2_1 and not c1_2                                 | iteracion13.smt         | unsat        |                        |
| 14        | -              | c1_0 and c2_0 and c1_1 and c2_1                                                  | iteracion14.smt         | unsat        |                        |
|           |                |                                                                                    |                         |              |                        |
|           |                | **END**                                                                            | **END**                 |              |                        |


### b)

Branch coverage del 39.39%.  

### c)

| Árbol de cómputo |
|--------------------|
| ![](img/ejercicio6c.png) |

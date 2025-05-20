## Ejercicio 1

### a) Calcular el CFG de main y double

| CFG                           |
| ----------------------------- |
| ![](../img/dataflow_cfg1.png) |
## b) Calcular el análisis interprocedural usando el dominio del signo sin contextos.


| Nodo n | IN[n] (x)     | OUT[n] (x) |
| ------ | ------------- | ---------- |
| 1      | [x→⊥, y→⊥]    | [x→⊤, y→⊤] |
| 2      | [x→⊤, y→⊤]    | [x→+, y→⊤] |
| 3      | [x→+, y→⊤]    | [x→+, y→⊤] |
| 4      | [x→+] U [x→⊥] | [res→ ]    |
| 5      |               |            |
| 6      |               |            |
| 7      |               |            |
| 8      |               |            |
| 9      |               |            |

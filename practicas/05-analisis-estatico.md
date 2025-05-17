## Ejercicio 1

1. Definir un reticulado usando el orden parcial $<Z, \leq>$. Existen elementos $\top$ y $\bot$?  
Es reticulado, ya que para cada par de elementos $a,b$ existe un único supremo y un ínfimo.  
El supremo entre $a,b$ es $max(a,b)$, y su ínfimo es $min(a,b)$, y no existe ningún otro supremo e ínfimo que valga (es decir, son únicos). No existen  $\top$ y $\bot$ ya que para cualquier elemento $a$, hay un número mayor ($a+1$) y uno menor ($a-1$) .

2. Definir un reticulado completo sobre el conjunto $Z \cup \{−\infty, \infty\}$.  
Lo defino igual que antes, mismas propiedades, $< Z \cup \{−\infty, \infty\}, \leq>$, solo que ahora sí existen  $\top$ y $\bot$ y son los infinitos. Por lo tanto, el reticulado es completo.
---
## Ejercicio 3

Sea $S=\{A,B,C\}$,  

1. Armar un reticulado de altura 2 donde los elementos de S no sean comparables.  

```
       ⊤
     / | \
    A  B  C
     \ | /
       ⊥
```

Es un reticulado, ya que para todo par de elementos de $S$, existe un supremo y un ínfimo, que son  ⊥ y ⊤ respectivamente. Y **no son comparables ya que, al estar en un mismo nivel, no se puede decir que uno sea menor o igual que otro**.  
La altura es 2 ya que la longitud del camino más largo (⊥ -> A/B/C -> ⊤) es 2.  

2. Armar el reticulado de partes de $S$. ¿Qué altura tiene?  

```
      { A,B,C }
     /    |    \
   {A,B} {A,C} {B,C}
    |   X     X  |
    {A}   {B}  {C}     
     \    |    /
          ∅
```

Tiene altura 3.  

3. Sea $N = \{1, 2\}$, donde $1 \sqsubseteq 2$ (es decir, 1 "viene antes que" 2, $1 \leq 2$). Armar el reticulado de pares $S \times N$ ¿Que pasaría si los elementos de $S$ fueran comparables y fueran un orden total?

Tenemos que $L = S \times N =\{(A,1),(A,2),(B,1),(B,2),(C,1),(C,2)\}$,  

- Si los elementos de $S$ **no son comparables**:
Entonces, por ejemplo, $(A,1)$ y $(B,1)$ no son comparables, ya que $A \nleq B$.  
El reticulado tendrá mucha incomparabilidad.  

- Si los elementos de $S$ **son totalmente comparables**:  
(Ejemplo: $A \leq B \leq C$, es un orden total)  
Entonces $L$ también se ordena mucho más, es más comparable que antes. Y si $S$ además fuera total, tenemos que el reticulado es completamente comparable.  

---
## Ejercicio 6  
Sea el reticulado de $Sign = Flat(\{−, 0, +\})$:

1. Extenderlo para incluir 2 símbolos que representen los valores mayores iguales a cero y los menores que cero.   

Entiendo que se refiere a los menores o iguales que cero (porque menores que cero es $-$). Entonces, el nuevo reticulado tiene el conjunto de elementos:  
$$Sign' = \{\bot, −, \leq0, 0, \geq0, +, \top\}$$

2. Definir la operación suma en el nuevo reticulado.  

La suma queda definida como:

| +      | ⊥   | −   | ≤0  | 0   | ≥0  | +   | ⊤   |
| ------ | --- | --- | --- | --- | --- | --- | --- |
| **⊥**  | ⊥   | ⊥   | ⊥   | ⊥   | ⊥   | ⊥   | ⊥   |
| **−**  | ⊥   | −   | −   | −   | ⊤   | ⊤   | ⊤   |
| **≤0** | ⊥   | −   | ≤0  | ≤0  | ⊤   | ⊤   | ⊤   |
| **0**  | ⊥   | −   | ≤0  | 0   | ≥0  | +   | ⊤   |
| **≥0** | ⊥   | ⊤   | ⊤   | ≥0  | ≥0  | +   | ⊤   |
| **+**  | ⊥   | ⊤   | ⊤   | +   | +   | +   | ⊤   |
| **⊤**  | ⊥   | ⊤   | ⊤   | ⊤   | ⊤   | ⊤   | ⊤   |

---
# 2da Parte  

- $\text{OUT}[n] = \text{GEN}[n] \cup (\text{IN}[n] - \text{KILL}[n])$
- $\text{IN}[n] = \bigcup \text{OUT}[p] \quad \text{(para cada predecesor p de n)}$  
Donde:  
- $\text{GEN}[n]$: qué definición genera (crea) el nodo `n` — es la propia instrucción si define una variable.  
- $\text{KILL}[n]$: qué definiciones previas de esa misma variable se anulan (matan) porque fueron sobrescritas por este nodo.  

---
## Ejercicio 8 y 9

```c
1: entry
2: x = y
3: y = 1
4: (x != 1) ?
5:    y = x * y
6:    x = x - 1
7: exit
```

GEN/KILL por nodo:  

| Nodo | Instrucción | GEN | KILL |
| ---- | ----------- | --- | ---- |
| 2    | x = y       | {2} | ∅    |
| 3    | y = 1       | {3} | ∅    |
| 4    | cond        | ∅   | ∅    |
| 5    | y = x * y   | {5} | {3}  |
| 6    | x = x - 1   | {6} | {2}  |
| 7    | exit        | ∅   | ∅    |

La tabla del algorítmo caótico iterativo nos queda:  

| Nodo n          | IN[n] = ∪ OUT[pred[n]]  | IN[n]           | OUT[n] = GEN[n] ∪ (IN[n] − KILL[n])  | OUT[n]       |
| --------------- | ----------------------- | --------------- | ------------------------------------ | ------------ |
| **1**           | —                       | —               | ∅                                    | ∅            |
| **2**           | OUT[1]                  | ∅               | {2} ∪ (∅ − ∅)                        | {2}          |
| **3**           | OUT[2]                  | {2}             | {3} ∪ ({2} − ∅)                      | {2, 3}       |
| **4**           | OUT[3]                  | {2, 3}          | ∅ ∪ ({2, 3} − ∅)                     | {2, 3}       |
| **5**           | OUT[4]                  | {2, 3}          | {5} ∪ ({2, 3} − {3})                 | {2, 5}       |
| **6**           | OUT[5]                  | {2, 3, 5}       | {6} ∪ ({2, 3, 5} − {2})              | {3, 5, 6}    |
| **4** (2da vez) | OUT[3] ∪ OUT[6]         | {2, 3, 5, 6}    | ∅ ∪ ({2, 3, 5, 6} − ∅)               | {2, 3, 5, 6} |
| **5** (2da vez) | OUT[4] (2da vez)        | {2, 3, 5, 6}    | {5} ∪ ({2, 3, 5, 6} − {3})           | {2, 5, 6}    |
| **6** (2da vez) | OUT[5] (2da vez)        | {2, 5, 6}       | {6} ∪ ({2, 5, 6} − {2})              | {5, 6}       |
| **4** (3ra vez) | OUT[3] ∪ OUT[6 2da vez] | {2, 3} ∪ {5, 6} | ∅ ∪ ({2, 3, 5, 6} − ∅)               | {2, 3, 5, 6} |
| ...             | ...                     | ...             | se estabilizan los valores del ciclo | ...          |
| **7**           | OUT[4] (estable)        | {2, 3, 5, 6}    | ∅ ∪ ({2, 3, 5, 6} − ∅)               | {2, 3, 5, 6} |

Entonces, finalmente queda así:  

| Nodo n | IN[n]        | OUT[n]       |
| ------ | ------------ | ------------ |
| **1**  | —            | ∅            |
| **2**  | ∅            | {2}          |
| **3**  | {2}          | {2, 3}       |
| **4**  | {2, 3, 5, 6} | {2, 3, 5, 6} |
| **5**  | {2, 3, 5, 6} | {2, 5, 6}    |
| **6**  | {2, 5, 6}    | {5, 6}       |
| **7**  | {2, 3, 5, 6} | {2, 3, 5, 6} |

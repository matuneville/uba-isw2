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

### Reaching Definitions Analysis
- $\text{OUT}[n] = \text{GEN}[n] \cup (\text{IN}[n] - \text{KILL}[n])$
- $\text{IN}[n] = \bigcup \text{OUT}[p] \quad \text{(para cada predecesor p de n)}$  
Donde:  
- $\text{GEN}[n]$: qué definición genera (crea) el nodo `n` — es la propia instrucción si define una variable.  
- $\text{KILL}[n]$: qué definiciones previas de esa misma variable se anulan (matan) porque fueron sobrescritas por este nodo.  

### Live Variables Analysis
- $\text{OUT}[n] = \text{IN}[n+1]$
- $\text{IN}[n] = \text{USE}[n] \cup (\text{OUT}[n] - \text{DEF}[n])$  
Donde:
- $\text{USE}[i]$ son las variables que se usan en la instrucción $i$ antes de definirse ahí.
- $\text{DEF}[i]$ son las variables que se definen o modifican en la instrucción $i$.  

### Available Expresions Analysis
- $\text{OUT}[n] = \text{GEN}[n] \cup (\text{IN}[n] - \text{KILL}[n])$
- $\text{IN}[n] = \bigcap \text{OUT}[p] \quad \text{(para cada predecesor p de n)}$  
Donde:
- $\text{GEN}[n] = \text{\{expresion X op Y computada en n, sin redefinición posterior of X o Y in n \}}$: conjunto de expresiones que se calculan en la instrucción $n$ y cuyos operandos no se redefinen posteriormente en $n$. 
- $\text{KILL}[n] = \text{\{expresiones X op Y del programa tal que X o Y estan definidas en n\}}$ =  conjunto de expresiones en el programa que incluyen variables que se definen en la instrucción $n$.  


---
## Ejercicio 8 y 9 - Reaching Definitions

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

---
## Ejercicio 10 - Live Variables

Sea el siguiente programa, donde MASK, IA, IQ, IR, IM y AM son constantes.

```c
float foo(int pid) {
1:  int i, j, h;

2:  i = pid ^ MASK;
3:  int k = i / IQ;
4:  j = IA * (i - k * IQ) - IR * k;
5:  h = j ^ MASK;

6:  if (h < 0)
7:      h = h + IM;

8:  float answer = AM * h;
9:  return answer * pid / k;
}
```

1. CFG:

```
   [1]
	↓
   [2]
	↓
   [3]
	↓
   [4]
	↓
   [5]
	↓
   [6]
  /   \
F      T
↓       ↓
[8]<---[7]
↓       
[9]
```

2. Live Variable analysis

| Línea n | DEF[n]   | USE[n]           | IN[n] = USE[n] ∪ (OUT[n] - DEF[n])  | IN[n]            | OUT[n] = IN[n+1]                  |
| ------- | -------- | ---------------- | ----------------------------------- | ---------------- | --------------------------------- |
| 9       | ∅        | {answer, pid, k} | {answer, pid, k} ∪ (∅ - ∅)          | {answer, pid, k} | OUT[9] = IN[10] = ∅               |
| 8       | {answer} | {h}              | {h} ∪ ({answer, pid, k} - {answer}) | {h, pid, k}      | OUT[8] = IN[9] = {answer, pid, k} |
| 7       | {h}      | {h}              | {h} ∪ ({h, pid, k} - {h})           | {h, pid, k}      | OUT[7] = IN[8] = {h, pid, k}      |
| 6       | ∅        | {h}              | {h} ∪ ({h, pid, k} - ∅)             | {h, pid, k}      | OUT[6] = IN[7] = {h, pid, k}      |
| 5       | {h}      | {j}              | {j} ∪ ({h, pid, k} - {h})           | {j, pid, k}      | OUT[5] = IN[6] = {h, pid, k}      |
| 4       | {j}      | {i, k}           | {i, k} ∪ ({j, pid, k} - {j})        | {i, k, pid}      | OUT[4] = IN[5] = {j, pid, k}      |
| 3       | {k}      | {i}              | {i} ∪ ({i, k, pid} - {k})           | {i, pid}         | OUT[3] = IN[4] = {i, k, pid}      |
| 2       | {i}      | {pid}            | {pid} ∪ ({i, pid} - {i})            | {pid}            | OUT[2] = IN[3] = {i, pid}         |
| 1       | ∅        | ∅                | ∅ ∪ ({pid} - ∅)                     | {pid}            | OUT[1] = IN[2] = {pid}            |
> Observación: para entenderlo de manera práctica, IN[n] serían las variables vivas que llegan a la línea n, mientras que OUT[n] serían las variables vivas que salen de la línea n.  
> 
> Por ejemplo: las líneas 6 y 7 usan la variable $h$ (la 6 para ver una condición, y la 7 la redefine utilizándola a sí misma), por lo tanto, tienen a $h$ viva en su IN. Entonces le entra $h$ a la línea 8, pero luego no vuelve a ser usada en el programa, por lo que no está presente en OUT[8].  
> 
> Viéndolo desde el otro lado, en la línea 5 se define $h$, y como es usada en las siguientes líneas, está en OUT[5]. Pero vemos que en las líneas anteriores no se usa nunca $h$, por lo que no está presente en IN[5]. 


3. Si las constantes fueran variables, deberíamos tenerlas en cuenta para el análisis de variables vivas.

---
## Ejercicio 11 - Live Expressions

```c
void foo(int[] m){

1: int a = 3;
2: int i = a + 2;

3: while (i <= a){
4:     int t = m[i] ∗ a;
5:     m[i] = t;
6:     int j = i + 1;
7:     i = j;
8:     a = bar(m,a)
   }
}
```

Expresiones relevantes para el análisis: $\text{\{ m[i], m[i] × a, a+2, i+1, bar(m,a)\}}$

| Línea n   | GEN[n]           | KILL[n]                   | IN[n] = ⋂ OUT[preds(n)]        | OUT[n] = GEN[n] ∪ (IN[n] - KILL[n])              | OUT[n]                |
| --------- | ---------------- | ------------------------- | ------------------------------ | ------------------------------------------------ | --------------------- |
| 1         | ∅                | {m[i] × a, a+2, bar(m,a)} | ∅                              | ∅ ∪ (∅ - {m[i] × a, a+2, bar(m,a)})              | ∅                     |
| 2         | {a+2}            | {i+1}                     | OUT[1] = ∅                     | {a+2} ∪ (∅ - {i+1})                              | {a+2}                 |
| 3         | ∅                | ∅                         | OUT[2] ∩ OUT[8] = {a+2}        | ∅ ∪ ({a+2} - ∅)                                  | {a+2}                 |
| 4         | {m[i], m[i] × a} | ∅                         | OUT[3] = {a+2}                 | {m[i], m[i] × a} ∪ ({a+2} - ∅)                   | {m[i], m[i] × a, a+2} |
| 5         | ∅                | {m[i], m[i] × a}          | OUT[4] = {m[i], m[i] × a, a+2} | ∅ ∪ ({m[i], m[i] × a, a+2} - {m[i], m[i] × a})   | {a+2}                 |
| 6         | {i+1}            | ∅                         | OUT[5] = {a+2}                 | {i+1} ∪ ({a+2} - ∅)                              | {a+2, i+1}            |
| 7         | ∅                | {i+1}                     | OUT[6] = {a+2, i+1}            | ∅ ∪ ({a+2, i+1} - {i+1})                         | {a+2}                 |
| 8         | {bar(m,a)}       | {m[i] × a, a+2, bar(m,a)} | OUT[7] = {a+2}                 | {bar(m,a)} ∪ ({a+2} - {m[i] × a, a+2, bar(m,a)}) | {bar(m,a)}            |
| 3 (bucle) | ∅                | ∅                         | OUT[2] ∩ OUT[8] = {a+2}        | ∅ ∪ ({a+2} - ∅)                                  | {a+2}                 |

---
## Ejercicio 12

1. **Dirección del análisis**:  
    - **Forward**: la información fluye en la dirección del flujo de control (de entrada a salida).  
    - **Backward**: la información fluye en sentido opuesto (de salida a entrada).  
        
2. **Naturaleza del análisis**:  
    - **May**: analiza si **puede** existir información en algún camino (conservadora respecto a la posibilidad).  
    - **Must**: analiza si **debe** existir en **todos** los caminos (conservadora respecto a la certeza).  
        

| |Forward|Backward|
|---|---|---|
|**May**|Reaching Definitions, Sign Analysis|Live Variables|
|**Must**|Available Expressions|Very Busy Expressions|

---
## Ejercicio 14

```c
1: x = 1 ;
2: sensible(x) ;
3: y = input ;
4: if (y > 0)
5:     z = x + 1 ;
6: else
7:     z = 0 ;
8: insensible(x) ;
```

1. Defino el reticulado:

```
       S
       |
       I
```

Cuyo orden es $I ⊑ S$.  

2. Abstracción del Dataflow:   
	- Dominio: Funciones `Var → {S, I}`
	- Unión (join): Para cada variable `v`, `S ⊔ I = S`, `S ⊔ S = S`, `I ⊔ I = I`
	- Inicialización: Todas las variables se inician como `Insensible`.  
- Función transfer:  
	- `sensible(x)`: marca `x` como `S`
	- `insensible(x)`: marca `x` como `I` (fuerza el valor)
	- `y = f(x1, ..., xn)`: si alguna de `x1, ..., xn` es `S`, entonces `y` es `S`, sino `I`.  

3. Resultado del análisis:

| Nodo (linea) | OUT(x) | OUT(y) | OUT(z)    |
| ------------ | ------ | ------ | --------- |
| 1            | I      | I      | I         |
| 2            | S      | I      | I         |
| 3            | S      | S      | I         |
| 4            | S      | S      | I         |
| 5            | S      | S      | S         |
| 7            | S      | S      | I         |
| 8            | **I**  | S      | S (S ⊔ I) |

---
## Ejercicio 15

```c
1: y = 0;
2: x = 0;
3: z = 1;
4: while (true) {
5:     x = y + 1;
6:     if (y == 0)
7:         x = 0;
8: }
```

2. El reticulado queda como:
	- Elementos: pares de igualdad de la forma {(x,y), (x,z), (y,z)} 
		- Top (⊤): todos iguales
		- Bottom (⊥): sin igualdades (∅)
		- Orden parcial: de la forma ∅ ⊑ {(x,y)} ⊑ {(x,y), (x,z)} ⊑ ⊤
	- Función de transferencia:
		- Asignación `x=y`: agrega (x,y) y (y,x)
		- Asignación `x=z` cuando está (x,y): quita (x,y) y (y,x) y agrega (x,z) y (z,x) 
		- if y while: no afecta a las igualdades directamente
	- Ecuaciones de dataflow:  
```
OUT[n] = transfer(IN[n], instr[n])
IN[n] = ⋂ OUT[p] for all predecesores p of n
```

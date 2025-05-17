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

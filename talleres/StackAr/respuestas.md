# Taller #1 - Mutation Analysis

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Resultados de generación de mutantes

1. ¿Cuántos mutantes se generaron en total?
   - Respuesta: Se generaron 75 mutantes

2. ¿Qué operador de mutación generó más mutantes? ¿Cuántos y por qué?
   - Respuesta: Counts:
     - Binary: 3 + 3 + 5 = 11
     - Conditionals: 10 + 10 = 20
     - Constants: 6 + 5 + 8 = 19
     - Returns: 3 + 3 + 4 + 6 = 16
     - Unary: 3
    Conditionals generó más mutantes. Tiene sentido ya que un código suele estar lleno de condicionales. Los algoritmos con los que trabaja un stack deben evaluar muchos condicionales, por ejemplo, validar que no se pueda hacer pop cuando el stack está vacío, para instanciar el stack, entre otros. 

3. ¿Qué operador de mutación generó menos mutantes? ¿Cuántos y por qué?
   - Respuesta: Unary generators, generó 3, ya que se utilizan pocos operadores unarios de ++ y --.

---

## Ejercicio 2: Evaluación de test suites

1. ¿Cuántos mutantes vivos y muertos encontraron cada uno de los test suites?
   - **StackTests1**:
     - Mutantes vivos: 56
     - Mutantes muertos: 19
     - Mutation score: 25%
   - **StackTests2**:
     - Mutantes vivos: 38
     - Mutantes muertos:37
     - Mutation score: 49%

2. ¿Cuál es el mutation score de cada test suite?
   - **StackTests1**: 25%
   - **StackTests2**: 49%

---

## Ejercicio 3: Mejora del test suite

1. ¿Cuál es el mutation score logrado para los tests de StackTests3?
   - Respuesta: 88%

2. ¿Cuántos mutantes vivos y muertos encontraron?
   - Mutantes vivos: 9
   - Mutantes muertos: 66

3. Comente cuáles son todos los mutantes vivos que quedaron y por qué son equivalentes al programa original (si no lo fueran, todavía es posible mejorar el mutation score).
   - Respuesta:
     - `StackArMutated746 (FalseConditionalsMutator: Se reemplazó la condición 'isEmpty()' por false en la línea 45.)`. No se puede matar este mutante ya que luego realiza la validación nuevamente en `top()`, haciendo que lance la excepción nuevamente.
    
4. ¿Cuál es el instruction coverage promedio que lograron para las clases mutadas?
   - Respuesta: 64%

5. ¿Cuál es el peor instruction coverage que lograron para una clase mutada? ¿Por qué creen que sucede esto?
   - Respuesta: La que cambia el tamaño default de 10 a -1. Como el constructor no permite instanciar un stack que tiene tamaño negativo y arroja excepción, no puede cubrir todo el resto de lineas.

   
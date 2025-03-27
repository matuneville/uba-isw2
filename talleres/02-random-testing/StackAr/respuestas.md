# Taller #2 - Random Testing

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Generación de Tests con Randoop

1. ¿Cuántos casos de test produjo Randoop?
   - Respuesta: 940

2. ¿Hay casos de test que fallan?
   - Respuesta: No

3. ¿Cuál es el instruction coverage alcanzado por los tests generados para la clase StackAr?
   - Respuesta: 83%

---

## Ejercicio 2: Validación de StackAr y detección de fallas

1. Ejecutar Randoop por 1 minuto sobre StackAr y correr los tests generados:
   - ¿Hay casos de test que fallan? ¿Cuántos?
     - Respuesta: 549 de 3777 fallan
   - Si hay tests que fallan, analizar y explicar por qué fallan.
     - Respuesta: Fallan ya que no pasan `method repOK`, o sea digamos, rompen el invariante. Esto pasa porque el metodo pop no esta seteando en null
     el elemento que se esta sacando de la lista.

2. Reparar StackAr si es necesario, volver a ejecutar Randoop y confirmar que no haya tests fallando.
   - Descripción de las modificaciones realizadas:
     - Respuesta: Se agrego la linea `elems[readIndex] = null;` en el metodo pop para reemplazar por null el elemento sacado, cumpliendo asi el invariante.

3. Reportar el instruction coverage alcanzado por los últimos casos de tests generados por Randoop para la clase StackAr.
   - Respuesta: 83%

---

## Ejercicio 3: Análisis de Mutantes con Pitest

1. Ejecutar Pitest sobre el último test suite generado por Randoop:
   - ¿Cuántos mutantes construye Pitest? ¿Cuál es el mutation score?
     - Respuesta: 36 mutantes, mutation score del 78%

2. Extender manualmente el test suite para mejorar el mutation score con Pitest:
   - ¿Cuál es el mejor mutation score que se pudo obtener?
     - Respuesta: 97%
   - Si hay mutantes equivalentes, explicar cuáles son y justificar por qué son equivalentes.
     - Respuesta: Queda un solo mutante vivo. Dicho mutante reemplaza la multiplicacion por division en la linea 113 que corresponde al metodo hashCode. Como se puede observar, este mutante es equivalente porque la cuenta que se esta haciendo toma dos operandos: 31 y 1. Multiplicar y dividir por 1 es equivalente, lo que resulta en la equivalencia de ambos programas.

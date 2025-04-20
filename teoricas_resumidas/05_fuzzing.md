# Fuzzing

Técnica de testing que consiste en **enviar entradas aleatorias** o modificadas ("**ruido**") a un programa con el objetivo de:
- identificar fallos,
- **crashes** o
- **vulnerabilidades de seguridad**.

Surgió inspirado en situaciones reales, como el ruido en líneas telefónicas que afectaba la ejecución de comandos en sistemas UNIX. Barton P. Miller fue pionero en este campo, demostrando en 1989 que entre el 25% y 33% de los programas UNIX podían ser crasheados con entradas aleatorias.

Miller destacó la importancia de:
1. Verificar límites en accesos a memoria
2. Validar exhaustivamente entradas
3. Controlar códigos de retorno
4. Desconfiar de inputs externos

---
# Tipos de Fuzzing  

### 1. Random Black-Box Fuzzing

El enfoque más básico que trata al sistema como una caja negra, **generando entradas completamente aleatorias**. Si bien es simple de implementar, tiene **baja efectividad para alcanzar zonas profundas del código** 

> ej: un programa que recibe URLs de entrada, para fuzzearlo bien se requieren entradas que sigan las normas básicas del protocolo, es decir, que sean `http(s)://xxxx.com/net/...`. Una entrada completamente aleatoria es poco probable que tenga esta forma.

Limitaciones:
- Baja probabilidad de generar inputs válidos
- Cobertura de código insuficiente
- Ineficiente para encontrar vulnerabilidades complejas

### 2. Mutation-Based Fuzzing

Introduce el concepto de semillas (**seeds**) - **inputs iniciales válidos que se mutan** mediante:

- Inserción/eliminación de caracteres
- Flip de bits/bytes
- Operaciones aritméticas simples
- Sustitución por valores conocidos (MAX_INT, NULL, etc.)

Algoritmo básico de BlackBox fuzzing basado en mutaciones:

```       
- Mientras haya presupuesto disponible:
    - Si aún quedan entradas originales en el SEED:
        - Toma la siguiente entrada del conjunto original.
        - La usa directamente como prueba.
            
    - Si ya se usaron todas las entradas originales:
        - Selecciona aleatoriamente una entrada del SEED.
        - Aplica una mutación para generar una nueva prueba.
            
	- EJECUTA la prueba generada (ya sea original o mutada).        
    - REPORTA si ocurre un cuelgue, error o falla de aserción.
```

### 3. Grey-Box Fuzzing

Revolucionó el campo al incorporar **retroalimentación de cobertura** (coverage ya sea de lineas, branches, ...) mediante instrumentación ligera. Mantiene un corpus de inputs que:

- Ejercitan nuevas rutas de ejecución
- Aumentan la cobertura de branches/bloques básicos

Si una entrada explora nuevas rutas de ejecución, se agrega al conjunto de semillas para futuras mutaciones, junto con una **energía** asociada (probabilidad de elegirlo).

El funcionamiento del algoritmo es el siguiente:
```
- Mientras haya presupuesto (tiempo, recursos, etc):
    - Si aún quedan entradas originales por probar:
        - EJECUTA la entrada correspondiente del SEED.
        - REPORTA si ocurre un fallo, cuelgue u otro comportamiento inesperado.
            
    - Si ya se usaron todas las entradas originales:
        - Selecciona aleatoriamente una entrada del SEED.
        - La muta para generar una nueva entrada de prueba.
        - EJECUTA esta nueva entrada.
        - REPORTA si ocurre un fallo o cuelgue.
            
        - Si la nueva entrada agrega MAYOR COBERTURA:
            - Se agrega al SEED para futuras mutaciones.
```
### 4. "Boosted" Grey-Box Fuzzing (AFL)

Surge ante la observación de que la mayoría de los inputs durante greybox fuzzing el mismo camino de ejecución.

La idea es **aumentar la probabilidad de elegir un input de la semilla** de acuerdo a las **chances de descubrir otros caminos en el CFG**.

```
- Mientras haya presupuesto (tiempo, recursos, etc):
    - Si aún quedan entradas originales por probar:
        - EJECUTA la entrada correspondiente del SEED.
        - REPORTA si ocurre un fallo, cuelgue u otro comportamiento inesperado.
            
    - Si ya se usaron todas las entradas originales:
        - Selecciona SEGUN ENERGÍA una entrada del SEED.
        - La muta para generar una nueva entrada de prueba.
        - EJECUTA esta nueva entrada.
        - REPORTA si ocurre un fallo o cuelgue.
            
        - Si la nueva entrada agrega MAYOR COBERTURA:
            - Se agrega al SEED para futuras mutaciones.

    - Se actualiza la ENERGÍA de cada entrada en el SEED, en función de su efectividad reciente.
```

Ejemplo visual de cálculos de frecuencia:

| Iter | Input | Camino    | Frecuencias                         |
| ---- | ----- | --------- | ----------------------------------- |
| 1    | aaaa  | [1]       | [1] → 1                             |
| 2    | aaab  | [1]       | [1] → 2                             |
| 3    | aaac  | [1]       | [1] → 3                             |
| 4    | aaad  | [1]       | [1] → 4                             |
| 5    | aaa.  | [1]       | [1] → 5                             |
| 6    | baa.  | [1, 2, 3] | [1] → 5, [1,2,3] → 1                |
| 7    | baad  | [1, 2, 3] | [1] → 5, [1,2,3] → 2                |
| 8    | bacd  | [1, 2, 3] | [1] → 5, [1,2,3] → 3                |
| 9    | badc  | [1,2,3,4] | [1] → 5, [1,2,3] → 3, [1,2,3,4] → 1 |

Y energía:

| Iter | Input | Camino       | Energía         |
|------|-------|--------------|-----------------|
| 1    | aaaa  | [1]          | $1/(5^3)$       |
| 2    | aaab  | [1]          | $1/(5^3)$       |
| 3    | aaac  | [1]          | $1/(5^3)$       |
| 4    | aaad  | [1]          | $1/(5^3)$       |
| 5    | aaa.  | [1]          | $1/(5^3)$       |
| 6    | baa.  | [1, 2, 3]    | $1/(3^3)$       |
| 7    | baad  | [1, 2, 3]    | $1/(3^3)$       |
| 8    | bacd  | [1, 2, 3]    | $1/(3^3)$       |
| 9    | badc  | [1,2,3, 4]   | $1/(1^3)$       |

---

## Herramientas Populares  

### American Fuzzy Lop (AFL)  
Uno de los fuzzers más utilizados, variante del **greybox fuzzing**.
Especializado en programas C/C++. AFL aplica **mutaciones determinísticas** (a diferencia del greybox que aplica operaciones random) y mide cobertura a nivel de bloques básicos. Su proceso incluye:  
1. Reducir entradas iniciales a su mínima expresión.  
2. Aplicar estrategias de mutación como flip de bits, operaciones aritméticas o inserción de valores conocidos.  
3. Retener entradas que aumenten la cobertura.  

### Grammar-Based Fuzzing  
Genera entradas válidas basadas en gramáticas formales, útiles para lenguajes como JavaScript o XML. Herramientas como LangFuzz y DomFuzz usan fragmentos de código conocidos para crear pruebas que exploten vulnerabilidades pasadas.  

### Sanitizers y Aplicaciones  

Los sanitizers son instrumentaciones que detectan errores en tiempo de ejecución:

1. **AddressSanitizer (ASan)**:
    - Detecta overflows, use-after-free
    - Overhead: ~2x velocidad
    
2. **UndefinedBehaviorSanitizer (UBSan)**:
    - Captura comportamientos indefinidos (shift overflow, NULL derefs)
    - Overhead mínimo
    
3. **MemorySanitizer (MSan)**:
    - Detecta reads de memoria no inicializada
    - Overhead: ~3x velocidad
    
4. **LeakSanitizer (LSan)**:
    - Identifica memory leaks
    - Bajo overhead

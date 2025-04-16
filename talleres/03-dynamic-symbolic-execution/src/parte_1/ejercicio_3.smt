; Ejercicio 3
; COMPLETAR

(declare-const a1 Int)
(declare-const a2 Int)
(declare-const a3 Int)

(assert (=
          a1
          (mod 16 2)))

(assert (=
          a2
          (div 16 4)))

(assert (=
          a3
          (rem 16 5)))

(check-sat)
(get-model)



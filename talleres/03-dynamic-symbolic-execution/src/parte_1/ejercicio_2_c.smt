; Ejercicio 2 c) x ∗ y = 64
; COMPLETAR

(declare-const x Int)
(declare-const y Int)
(assert (=
          (* x y)
          64))
(check-sat)
(get-model)
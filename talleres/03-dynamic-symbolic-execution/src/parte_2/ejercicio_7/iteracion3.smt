(declare-const n Int)

; c1_0 = (assert (< 0 n))
; c1_1 = (assert (< 1 n))

(assert (< 0 n)) ; c1_0
(assert (< 1 n)) ; c1_1

(assert (< 2 n)) ; c1_2

(assert (<= n 2)) ; u(c1) <= 2

(check-sat)
(get-model)

; unsat
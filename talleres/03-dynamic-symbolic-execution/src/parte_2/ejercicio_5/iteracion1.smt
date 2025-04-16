(declare-const a Int)
(declare-const b Int)
(declare-const c Int)

; Not C1
(assert (> a 0))
(assert (> b 0))
(assert (> c 0))

(check-sat)
(get-model)
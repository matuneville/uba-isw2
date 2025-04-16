(declare-const a Int)
(declare-const b Int)
(declare-const c Int)

; Not C1
(assert (> a 0))
(assert (> b 0))
(assert (> c 0))

; C2
(assert (or (<= (+ a b) c) (<= (+ a c) b) (<= (+ b c) a)))

(check-sat)
(get-model)
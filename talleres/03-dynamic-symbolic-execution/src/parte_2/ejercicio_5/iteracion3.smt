(declare-const a Int)
(declare-const b Int)
(declare-const c Int)

; Not C1
(assert (> a 0))
(assert (> b 0))
(assert (> c 0))

; Not C2
(assert (> (+ a b) c))
(assert (> (+ a c) b))
(assert (> (+ b c) a))

; Not C3
(assert (or (not (= a b)) (not (= b c))))

; C4
(assert (or (= a b) (= b c) (= a c)))


(check-sat)
(get-model)
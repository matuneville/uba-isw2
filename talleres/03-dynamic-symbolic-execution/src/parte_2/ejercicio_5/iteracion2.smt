(declare-const a Int)
(declare-const b Int)
(declare-const c Int)

; c1=(a<=0 or b<=0 or c<=0)
; not c1 = a>0 and b>0 and c>0

; c2=(not (a + b > c and a + c > b and b + c > a))
; not c2 = a + b > c and a + c > b and b + c > a

; c3=(a == b and b == c)
; not c3 = a != b or b != c

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

(check-sat)
(get-model)
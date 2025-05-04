(declare-const a Int)
(declare-const b Int)
(declare-const c Int)

; c1=(a<=0 or b<=0 or c<=0)
; not c1 = a>0 and b>0 and c>0

; Not C1
(assert (> a 0))
(assert (> b 0))
(assert (> c 0))

(check-sat)
(get-model)
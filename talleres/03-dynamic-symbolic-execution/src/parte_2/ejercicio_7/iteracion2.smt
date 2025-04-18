(declare-const n Int)

; c1_0 = (assert (< 0 n))
; c1_1 = (assert (< 1 n))

(assert (< 0 n)) ; c1_0
(assert (< 1 n)) ; c1_1

(check-sat)
(get-model)

; sat
; (model 
;   (define-fun n () Int
;     2)
; )
(declare-const k Real)

; c1_0 and c2_0 and c1_1 and not c2_1 and c1_2 and not c2_2 and c1_3

; c1_0 = (0 < 3)        (assert (< 0 3))
; c2_0 = (5 + k == 0)   (assert (= 0 (+ 5 k)))
; c1_1 = (1 < 3)        (assert (< 1 3))
; c2_1 = (1 + k == 0)   (assert (= 0 (+ 1 k)))
; c1_2 = (2 < 3)        (assert (< 2 3))
; c2_2 = (3 + k == 0)   (assert (= 0 (+ 3 k)))
; c1_3 = (3 < 3)        (assert (< 3 3))

(assert (< 0 3))                ; c1_0
(assert (= 0 (+ 5 k)))          ; c2_0
(assert (< 1 3))                ; c1_1
(assert (not (= 0 (+ 1 k))))    ; not c2_1
(assert (< 2 3))                ; c1_2
(assert (not (= 0 (+ 3 k))))    ; not c2_2
(assert (< 3 3))                ; c1_3

(check-sat)
(get-model)
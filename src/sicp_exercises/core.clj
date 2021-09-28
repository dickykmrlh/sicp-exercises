(ns sicp-exercises.core)

;; Exercises Chapter 1
(defn largest-squares [a b c]
  (cond
    (and (> a b) (> b c)) (+ (* a a) (* b b))
    (and (> b a) (> a c)) (+ (* a a) (* b b))
    (and (> a b) (> c b)) (+ (* a a) (* c c))
    (and (> c a) (> a b)) (+ (* a a) (* c c))
    (and (> b a) (> c a)) (+ (* b b) (* c c))
    (and (> c a) (> b a)) (+ (* b b) (* c c))))

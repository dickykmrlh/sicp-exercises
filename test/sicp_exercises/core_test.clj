(ns sicp-exercises.core-test
  (:require [clojure.test :refer :all]
            [sicp-exercises.core :refer :all]))

(deftest largest-squares-core-test
  (testing "a and b is the biggest"
    (testing "a is bigger then b"
      (is (= 13 (largest-squares 3 2 1))))
    (testing "b is bigger then a"
      (is (= 13 (largest-squares 2 3 1)))))
  (testing "b and c is the biggest"
    (testing "b is bigger then c"
      (is (= 13 (largest-squares 1 3 2))))
    (testing "c is bigger then b"
      (is (= 13 (largest-squares 1 2 3)))))
  (testing "a and c is the biggest"
    (testing "a is bigger then c"
      (is (= 13 (largest-squares 3 1 2))))
    (testing "c is bigger then a"
      (is (= 13 (largest-squares 2 1 3))))))
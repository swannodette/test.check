(ns cljs.test.check.test
  (:require [cljs.test :as test :refer-macros [deftest testing is]]
            [cljs.test.check.generators :as gen]
            [cljs.test.check.properties :as prop :include-macros true]
            [cljs.test.check.rose-tree :as rose]
            [cljs.test.check.cljs-test :as ct :refer-macros [defspec]]
            [cljs.reader :as r]))

(deftest generators-are-generators
  (testing "generator? returns true when called with a generator"
    (is (gen/generator? gen/int))
    (is (gen/generator? (gen/vector gen/int)))
    (is (gen/generator? (gen/return 5)))))


(deftest values-are-not-generators
  (testing "generator? returns false when called with a value"
    (is (not (gen/generator? 5)))
    (is (not (gen/generator? int)))
    (is (not (gen/generator? [1 2 3])))))

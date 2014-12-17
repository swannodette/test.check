(ns cljs.test.check.browser-runner
  (:require [cljs.nodejs :as nodejs]
            [cljs.test :as test :refer-macros [run-tests]]
            [cljs.test.check.test]
            [cljs.test.check.generators :as gen]))

(enable-console-print!)

(time (doall (gen/sample gen/keyword 200)))
(time (doall (gen/sample (gen/vector gen/int) 200)))

(run-tests
  'cljs.test.check.test)

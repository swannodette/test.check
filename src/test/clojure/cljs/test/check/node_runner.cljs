(ns cljs.test.check.node-runner
  (:require [cljs.nodejs :as nodejs]
            [cljs.test :as test :refer-macros [run-tests]]
            [cljs.test.check.test]
            [cljs.test.check.generators :as gen]))

(nodejs/enable-util-print!)

(defn -main []
  (time (doall (gen/sample gen/keyword 200)))
  (time (doall (gen/sample (gen/vector gen/int) 200)))
  (run-tests
    'cljs.test.check.test))

(set! *main-cli-fn* -main)

(comment

  )

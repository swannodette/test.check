(ns cljs.test.check.run-tests
  (:require [cljs.nodejs :as nodejs]
            [cljs.test :as test :refer-macros [run-tests]]
            [cljs.test.check.test]))

(nodejs/enable-util-print!)

(defn -main []
  (run-tests
    'cljs.test.check.test))

(set! *main-cli-fn* -main)

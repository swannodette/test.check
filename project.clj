(defproject org.clojure/test.check "0.6.2-SNAPSHOT"
  :description "A QuickCheck inspired property-based testing library."
  :url "https://github.com/clojure/test.check"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies []
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.6.0"]
                                  [org.clojure/clojurescript "0.0-2489"]]}}
  :global-vars {*warn-on-reflection* true}
  :plugins [[codox "0.8.10"]
            [lein-cljsbuild "1.0.4-SNAPSHOT"]]
  :codox {:defaults {:doc/format :markdown}}
  :cljsbuild
  {:builds
   [{:id "node-dev"
     :source-paths ["src/main/clojure" "src/test/clojure"]
     :notify-command ["node" "resources/run.js"]
     :compiler {:optimizations :none
                :static-fns true
                :target :nodejs
                :output-to "target/cljs/node_dev/tests.js"
                :output-dir "target/cljs/node_dev/out"
                :source-map true}}
    {:id "browser-dev"
     :source-paths ["src/main/clojure" "src/test/clojure"]
     :notify-command ["open" "resources/run_tests.html"]
     :compiler {:optimizations :none
                :static-fns true
                :output-to "target/cljs/browser_dev/tests.js"
                :output-dir "target/cljs/browser_dev/out"
                :source-map true}}
    {:id "adv"
     :source-paths ["src/main/clojure" "src/test/clojure"]
     :notify-command ["node" "target/cljs/test_adv/tests.js"]
     :compiler {:optimizations :advanced
                :target :nodejs
                :pretty-print false
                :output-to "target/cljs/test_adv/tests.js"
                :output-dir "target/cljs/test_adv/out"}}]})

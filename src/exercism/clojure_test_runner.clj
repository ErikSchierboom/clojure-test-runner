(ns exercism.clojure-test-runner
  (:require
   [clojure.test :refer [deftest testing is]]
   [cheshire.core :as json])
  (:gen-class))

(defn -main
  "Tests a solution file and writes `results.json` to output directory"
  [slug input output]
  (spit (str output "results.json")
        (json/generate-string {:slug slug :input input :output output})))

(comment
  (-main "two-fer" "in-dir/" "out-dir/"))
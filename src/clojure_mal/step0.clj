(ns clojure-mal.step0)

(defn repl-loop []
  (let [input-line (read-line)]
    (println "HOWDY > " input-line)))

(defn -main [& args]
  (repl-loop))

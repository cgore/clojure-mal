(ns clojure-mal.step0)

(defn repl-loop []
  (let [input-line (read-line)]
    (when input-line
      (println "HOWDY >" input-line)
      (recur))))

(defn -main [& args]
  (repl-loop))

(ns clojure-mal.step0)

(defn repl-loop []
  (println "HOWDY >")
  (let [input-line (read-line)]
    (when input-line
      (println "OKAY ...")
      (println input-line)
      (recur))))

(defn -main [& args]
  (repl-loop))

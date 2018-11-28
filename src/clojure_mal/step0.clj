(ns clojure-mal.step0)

(defn reader []
  (read-line))

(defn repl-loop []
  (println "HOWDY >")
  (let [input-line (reader)]
    (when input-line
      (println "OKAY ...")
      (println input-line)
      (recur))))

(defn -main [& args]
  (repl-loop))

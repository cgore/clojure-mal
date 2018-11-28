(ns clojure-mal.step1)

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

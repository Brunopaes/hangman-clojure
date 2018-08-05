(ns fib.core
  (:gen-class))

(defn fib[x]
    (if (= x 0) 0
      (if (= x 1) 1
        (+ (fib (- x 1)) (fib (- x 2))
      )
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

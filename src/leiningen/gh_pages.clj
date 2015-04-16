(ns leiningen.gh-pages
  (:require [clojure.pprint :as pp]))

(defn gh-pages
  "I don't do a lot."
  [project & args]
  (println "Args:" (pr-str args))
  (pp/pprint project))

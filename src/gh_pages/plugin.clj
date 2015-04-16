(ns gh-pages.plugin
  (:require [leiningen.compile]
            [robert.hooke :refer [add-hook]]))

(defn on-compile [f & args]
  (println "Intercepting compile in gh-pages...")
  (apply f args))

(defn hooks []
  (add-hook
    #'leiningen.compile/compile
    on-compile))
(ns battlesnake-clojure.server
  (:use compojure.core)
  (:require
   [ring.adapter.jetty :as jetty]))

(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "5000"))]
    (jetty/run-jetty main-routes {:port port})))

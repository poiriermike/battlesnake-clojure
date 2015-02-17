(ns battlesnake-clojure.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.json :as middleware]))


(defn move
  [request]
  {:status 200
   :body {:move "right"
          :taunt "shit!"}})

(defn start
  [request]
  {:status 200
   :body {:name SNAKE
          :color "#ff00ff"
          :head_url "http://example.com"
          :taunt "battlesnake-clojure!"}})

(defroutes app-routes
  (GET "/" [] "Clojure BattleSnake")
  (POST "/start" [] start)
  (POST "/move" [] move)
  (route/not-found "Not Found"))

(def app
  (-> (handler/site app-routes)
      (middleware/wrap-json-body {:keywords? true})
      (middleware/wrap-json-params)
      (middleware/wrap-json-response)))

(ns clj-imageboard.routes.home
  (:require [compojure.core :refer :all]
            [clj-imageboard.views.layout :as layout]))

(defn home [] 
  (layout/common [:h1 "Hello World!"]))

(defroutes home-routes
  (GET "/" [] (home)))

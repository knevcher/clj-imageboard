(ns clj-imageboard.views.layout
  (:require [hiccup.page :refer [html5 include-css]]))

(defn common [& body]
  (html5
    [:head
     [:title "Welcome to clj-imageboard"]
     (include-css "/css/screen.css")]
    [:body body]))

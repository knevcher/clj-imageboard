(ns clj-imageboard.models.db
  (:use (korma core db))
  (:require [
             [clojure.string :as str]
             ]
            )
  )


(def db {:subprotocol "postgresql"
         :subname "//localhost/imageboard"
         :user "cloj"
         :password "123"})

(defdb korma-db db)

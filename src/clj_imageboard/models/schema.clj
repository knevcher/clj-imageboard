(ns clj-imageboard.models.schema
  (:require [[clj-imageboard.models.db :as db]])
  )

(defn create-users-table []
  (sql/create-table
   :users
   [:id "integer"]
   [:username "varchar(50)"]))

(ns clj-imageboard.models.entities
  (use 'korma.core)
  (:require [clj-imageboard.models.db :as db ])
  )

(declare users boards posts)





(defentity users
  (pk :id)
  (table :users)
  (database db))


;;  (has-one address)
;;  (has-many email)
;;  (belongs-to account)
;;  (many-to-many posts :users_posts))

(defentity posts
  (pk :id)
  (table :posts)
  (database db))

(defentity boards
  (pk :id)
  (table :boards)
  (database db))

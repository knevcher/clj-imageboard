(defproject clj-imageboard "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [ring-server "0.2.8"]
                 [org.postgresql/postgresql "9.2-1002-jdbc4"]
                 [korma "0.3.0-RC5"]
                 [lib-noir "0.6.9"]
                 ]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler clj-imageboard.handler/war-handler
         :init clj-imageboard.handler/init
         :destroy clj-imageboard.handler/destroy}
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.3"] [ring/ring-devel "1.1.8"]]}}

  )

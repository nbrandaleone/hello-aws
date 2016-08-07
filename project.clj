(defproject hello-aws "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [hiccup "1.0.5"]
                 [ring-server "0.4.0"]
                 [http.async.client "1.1.0"]]
  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler hello-aws.handler/app
         :init hello-aws.handler/init
         :destroy hello-aws.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.3.1"]]}})

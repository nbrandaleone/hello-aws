(defproject hello-aws "0.1.0-SNAPSHOT"
  :description "A mini web-site, grabbing AWS meta-data for display"
  :url "http://hosted_by_aws.com"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [hiccup "1.0.5"]
                 [ring-server "0.4.0"]
                 [http-kit "2.2.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler hello-aws.handler/app
         :init hello-aws.handler/init
         :destroy hello-aws.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, 
	:auto-reload? false, :port ~(System/getenv "RING_PORT")}}
   :dev
   {:dependencies [[ring/ring-mock "0.3.0"] [ring/ring-devel "1.6.0-beta4"]]}})

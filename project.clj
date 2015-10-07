(defproject docker-client-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url ""
  :java-source-paths ["src/main/java"]
  :main ^:skip-aot docker-client-clj.core
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.slf4j/slf4j-api "1.7.6"]
                 [com.google.guava/guava "17.0"]
                 [com.fasterxml.jackson.jaxrs/jackson-jaxrs-json-provider "2.2.3"]
                 [com.fasterxml.jackson.datatype/jackson-datatype-guava "2.2.3"]
                 [com.fasterxml.jackson.core/jackson-databind "2.2.3"]
                 [org.glassfish.jersey.core/jersey-client "2.13"]
                 [org.glassfish.jersey.connectors/jersey-apache-connector "2.13"]
                 [org.glassfish.jersey.media/jersey-media-json-jackson "2.13"]
                 [org.apache.commons/commons-compress "1.8.1"]
                 [org.apache.httpcomponents/httpclient "4.3.5"]
                 [com.github.jnr/jnr-unixsocket "0.4"]
                 [commons-lang/commons-lang "2.6"]
                 [org.bouncycastle/bcpkix-jdk15on "1.51"]
                 ])

(defproject dactyl-keyboard "0.1.0-SNAPSHOT"
  :description "A parametrized, split-hand, concave, columnar, erogonomic keyboard"
  :url "http://example.com/FIXME"
  :main dactyl-keyboard.dactyl
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-watch "0.0.2"]]
  :watch {
    :rate 500 ;; check file every 500ms ('watchtower' is used internally)
    :watchers {
      :compile {
        :watch-dirs ["src"]
        :file-patterns [#"\.clj"]
        :tasks ["run 1"]}}}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [unicode-math "0.2.0"]
                 [scad-clj "0.4.0"]])



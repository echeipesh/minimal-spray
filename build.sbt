name := "minimal-spray"

scalaVersion := "2.11.8"

fork in Test := false
parallelExecution in Test := false

libraryDependencies ++= Seq(
  "com.typesafe.akka"           %% "akka-actor"    % "2.4.14",
  "io.spray"          %% "spray-routing" % "1.3.3",
  "io.spray"          %% "spray-can"     % "1.3.3",
  "org.apache.commons" % "commons-io" % "1.3.2"
)

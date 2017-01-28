name := "minimal-spray"

scalaVersion := "2.11.8"

fork in Test := false
parallelExecution in Test := false

scalacOptions ++= Seq("-Xmax-classfile-name","72")


libraryDependencies ++= Seq(
  "com.typesafe.akka"           %% "akka-actor"    % "2.4.14",
  "io.spray"          %% "spray-routing" % "1.3.3",
  "io.spray"          %% "spray-can"     % "1.3.3",
  "org.apache.commons" % "commons-io" % "1.3.2"
)

// assemblyExcludedJars in assembly := {
//   val cp = (fullClasspath in assembly).value
//   cp filter {_.data.getName == "shapeless_2.11-1.2.4.jar"}
// }

enablePlugins(JavaAppPackaging)

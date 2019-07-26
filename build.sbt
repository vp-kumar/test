name := "test"
 
version := "1.0"
 
scalaVersion := "2.11.11"
 
sbtVersion := "0.12.3"

val log4j        = "log4j" % "log4j" % "1.2.13"
val logback      = "ch.qos.logback" % "logback-classic" % "1.1.2"
val typesafe     = "com.typesafe" % "config" % "1.3.0"


val jsonitor    = "com.jsoniter" % "jsoniter" % "0.9.22"

val junit	= "junit" % "junit" % "4.12" % "test"
val scalaTest         = "org.scalatest" %% "scalatest" % "3.0.1" % Test
val scalaMock         = "org.scalamock" %% "scalamock" % "4.1.0" % Test


libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-servlet" % "9.3.12.v20160915",
  "org.eclipse.jetty" % "jetty-server" % "9.3.12.v20160915"
)

libraryDependencies := Seq(jsonitor, typesafe, logback, log4j, scalaTest, junit, scalaMock)

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-servlet" % "9.3.12.v20160915",
  "org.eclipse.jetty" % "jetty-server" % "9.3.12.v20160915"
)
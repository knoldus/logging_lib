
ThisBuild / version := "1.0"

ThisBuild / scalaVersion := "2.13.10"

ThisBuild / organization := "knoldus"

lazy val root = (project in file("."))
  .settings(
    name := "Logging_lib"
  )

libraryDependencies ++= Seq(
  "com.rollbar" % "rollbar-java" % "1.9.0",
  "net.logstash.logback" % "logstash-logback-encoder" % "6.3",
  "com.typesafe.play" %% "play-json" % "2.9.4",
  "org.slf4j" % "slf4j-api" % "1.7.36",
  "ch.qos.logback" % "logback-classic" % "1.2.10",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4"
)

publishMavenStyle := true
resolvers += ArtifactRegistryResolver.forRepository("https://asia-maven.pkg.dev/sonarqube-289802/knoldus-aws-lib")

publishTo := Some(ArtifactRegistryResolver.forRepository("https://asia-maven.pkg.dev/sonarqube-289802/knoldus-aws-lib"))
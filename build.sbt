scalaVersion := "2.13.8"
organization := "dev.zio"
name         := "zio-streams-quickstart"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"         % "2.0.0",
  "dev.zio" %% "zio-test"    % "2.0.0" % Test,
  "dev.zio" %% "zio-streams" % "2.0.0"
)

name := """openschool-p2-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.5.0.akka23",
  "org.mockito" % "mockito-core" % "1.10.17" % "test"
)

resolvers ++= Seq(
	"Typesafe repository snapshots"     	at "http://repo.typesafe.com/typesafe/snapshots/",
	"Typesafe repository releases"      	at "http://repo.typesafe.com/typesafe/releases/",
	"Sonatype repo"                     	at "https://oss.sonatype.org/content/groups/scala-tools/",
	"Sonatype releases"                 	at "https://oss.sonatype.org/content/repositories/releases",
	"Sonatype snapshots"                	at "https://oss.sonatype.org/content/repositories/snapshots",
	"Sonatype staging"                  	at "http://oss.sonatype.org/content/repositories/staging",
	"Sonatype Snapshots" 			at "https://oss.sonatype.org/content/repositories/snapshots/",
	"scalaz-bintray" 			at "http://dl.bintray.com/scalaz/releases",
	"Typesafe repository mvn" 		at "http://repo.typesafe.com/typesafe/maven-releases/"
)



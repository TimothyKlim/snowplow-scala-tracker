/*

 * Copyright (c) 2013-2015 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
import sbt._
import Keys._

object Dependencies {

  val resolutionRepos = Seq(
    // For Twitter's LRU cache
    "Twitter Maven Repo" at "http://maven.twttr.com/",
    "Sonatype" at "https://oss.sonatype.org/content/repositories/releases"
  )

  object V {
    // Java
    val commonsLang = "3.4"
    val commonsCodec = "1.10"
    val jodaTime = "2.9.4"
    val jodaMoney = "0.11"
    val jodaConvert = "1.8.1"
    val jackson = "1.9.13"

    // Scala
    val json4s = "3.4.0"
    val spray = "1.3.3"
    val akka = "2.4.10"
    val collUtil = "6.37.0"

    // Java (test only)
    val mockito = "1.10.19"

    // Scala (test only)
    val specs2 = "3.7"
  }

  object Libraries {
    // Java
    val commonsCodec = "commons-codec" % "commons-codec" % V.commonsCodec
    val commonsLang = "org.apache.commons" % "commons-lang3" % V.commonsLang
    val jodaTime = "joda-time" % "joda-time" % V.jodaTime
    val jodaMoney = "org.joda" % "joda-money" % V.jodaMoney
    val jodaConvert = "org.joda" % "joda-convert" % V.jodaConvert
    val jackson = "org.codehaus.jackson" % "jackson-mapper-asl" % V.jackson

    // Scala
    val akka = "com.typesafe.akka" %% "akka-actor" % V.akka
    val akkaHttp = "com.typesafe.akka" %% "akka-http-experimental" % V.akka
    val json4sJackson = "org.json4s" %% "json4s-jackson" % V.json4s
    val collUtil = "com.twitter" %% "util-collection" % V.collUtil

    // Java (test only)
    val mockito = "org.mockito" % "mockito-all" % V.mockito % "test"

    // Scala (test only)
    val specs2 = "org.specs2" %% "specs2" % V.specs2 % "test"
    // val akkaHttpTest = "com.typesafe.akka" %% "akka-http-testkit" % V.akka % "test"
  }
}

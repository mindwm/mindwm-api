package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller()(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}
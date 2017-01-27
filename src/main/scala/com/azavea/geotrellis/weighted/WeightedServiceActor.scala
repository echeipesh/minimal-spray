/*
 * Copyright (c) 2016 Azavea.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.azavea.geotrellis.weighted

import akka.actor._
import spray.http._
import spray.routing._


import scala.collection.JavaConversions._
import scala.concurrent.Future

class WeightedServiceActor(staticPath: String)
    extends Actor
    with HttpService {
  override def actorRefFactory = context
  override def receive = runRoute(serviceRoute)
  implicit val executionContext = actorRefFactory.dispatcher

  def serviceRoute =
    pathPrefix("ping") {
      complete { "pong" }
    } /* ~
    pathPrefix("gt") {
      pathPrefix("tms")(tms) ~
      path("colors")(colors) ~
      path("breaks")(breaks)
    } ~
    pathEndOrSingleSlash {
      getFromFile(staticPath + "/index.html")
    } ~
    pathPrefix("") {
      getFromDirectory(staticPath)
    } */
}

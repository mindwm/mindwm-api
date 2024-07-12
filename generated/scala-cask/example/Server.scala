//> using scala "3.4.1"
//> using lib "org.openapitools::caskgen:0.0.1"
//> using repositories https://maven.pkg.github.com/GIT_USER_ID/GIT_REPO_ID


/**
* This single file can contain the business logic for a REST service.
* ====================================
* == zero-install build with docker ==
* ====================================
*
*
* ```
* docker build . -t caskgen:latest
* ```
* ======================
* == Building Locally ==
* ======================
* This project can be built using [[scala-clit][https://scala-cli.virtuslab.org]]
*
* To simply run the project
* ```
* scala-cli Server.scala
* ```
*
* To create a runnable jar, run:
* ```
* scala-cli --power package Server.scala -o app-assembly --assembly
* ```
*
* To produce a docker image (no need for the Dockerfile), run:
* ```
* scala-cli --power package --docker Server.scala --docker-image-repository app-docker
* ```
*
* To generate an IDE project:
* ```
* scala-cli setup-ide . --scala 3.3
* ```
*/
package app

import MindwWM.BaseApp
import MindwWM.api.*
import MindwWM.model.*

import java.io.File

// TODO - write your business logic for your services here (the defaults all return 'not implemented'):

/** This is your main entry point for your REST service
 *  It extends BaseApp which defines the business logic for your services
 */
object Server extends BaseApp():
  start()


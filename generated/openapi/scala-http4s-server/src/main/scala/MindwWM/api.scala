package MindwWM

import org.http4s.circe._
import cats.Monad
import cats.syntax.all._
import cats.data.OptionT
import cats.data.Kleisli
import org.http4s._
import org.http4s.server._

import MindwWM.apis._

final case class API [
  F[_]: JsonDecoder: Monad
](
)(
){



  val routesAll =
}

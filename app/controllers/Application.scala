package controllers

import actors.EchoActor
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  import play.api.Play.current

  def ws = WebSocket.acceptWithActor[String, String] { implicit request =>
    EchoActor.props
  }
}

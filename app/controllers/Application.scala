package controllers

import play.api.libs.concurrent.Execution.Implicits.defaultContext
import org.slf4j.{LoggerFactory, Logger}
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("OpenSchool"))
  }

}

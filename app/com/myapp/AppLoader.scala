package com.myapp

import play.api.ApplicationLoader.Context
import play.api.{Application, ApplicationLoader, BuiltInComponentsFromContext}

/**
 * @author steven
 *
 */
class AppLoader extends ApplicationLoader {
  override def load(context: Context): Application = new AppComponents(context).application
}

class AppComponents(context: Context) extends BuiltInComponentsFromContext(context) {
  lazy val router = new Routes(httpErrorHandler, appController, assets)

  lazy val appController = new controllers.Application
  lazy val assets = new controllers.Assets(httpErrorHandler)
}


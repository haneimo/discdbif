package work.katagata.app

import work.katagata.app.auth.AuthenticationSupport
import org.scalatra._

class MyScalatraServlet extends ScalatraServlet with AuthenticationSupport{
  before() {
    requireLogin()
  }

  get("/") {    
    views.html.hello()
        views.html.hello()
  }

}

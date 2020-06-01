package io.tray

trait Username {
  def username: String
}

case class User(username: String) extends Username {}
case class Position(var position: String, username: String) extends Username {
  var count: Int = 0

  def reposition(p : String) {
    count += 1
    position = p
  }
}


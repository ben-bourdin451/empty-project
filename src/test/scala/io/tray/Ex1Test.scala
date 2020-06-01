package io.tray

class Ex1Test extends BaseSpec {
  behavior.of("Replacing position")
  it should "not modify original class" in {
    val p = new Position("up", "test")
    p.position should equal("up")

    p.reposition("down")
    p.position should equal("down")
  }

  behavior.of("Counter")
  it should "increment the count when repositioning" in {
    val p = new Position("up", "test")
    p.count should equal(0)

    p.reposition("down")
    p.count should equal(1)

    p.reposition("left")
    p.count should equal(2)
  }

  behavior.of("User name")
  it should "have the username" in {
    val u = new User("ben")
    u.username should equal("ben")
  }
}



import org.newdawn.slick.AppGameContainer
import org.newdawn.slick.BasicGame
import org.newdawn.slick.GameContainer
import org.newdawn.slick.Graphics
import org.newdawn.slick.SlickException

object BasicScalaTest {

  def main(args: Array[String]) = {

    try {
      val app: AppGameContainer = new AppGameContainer(new BasicScalaTest)
      app.setDisplayMode(500, 400, false)
      app.start()
    }
    catch {
      case e: SlickException => {
        e.printStackTrace()
      }
    }

  }
}

class BasicScalaTest() extends BasicGame("Wizard game") {
  @throws[SlickException]
  def init(container: GameContainer) {
  }

  @throws[SlickException]
  def update(container: GameContainer, delta: Int) {
  }

  @throws[SlickException]
  def render(container: GameContainer, g: Graphics) {
  }
}


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

// Not the right way?
//-Djava.library.path="C:\Users\jakob\Documents\GAMEDEV\slick\lib"

public class BasicJavaTest extends BasicGame {

    public BasicJavaTest() {
        super("Wizard game");
    }

    public static void main(String[] arguments) {
        try {
            AppGameContainer app = new AppGameContainer(new BasicJavaTest());
            app.setDisplayMode(500, 400, false);
            app.start();
        }
        catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void init(GameContainer container) throws SlickException {

    }

    public void update(GameContainer container, int delta) throws SlickException {

    }

    public void render(GameContainer container, Graphics g) throws SlickException {

    }

}

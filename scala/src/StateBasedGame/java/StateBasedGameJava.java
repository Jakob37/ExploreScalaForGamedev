package StateBasedGame.java;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class StateBasedGameJava extends StateBasedGame{

    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new StateBasedGameJava("State game"));
            app.setDisplayMode(500, 400, false);
            app.start();
        }
        catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public StateBasedGameJava(String name) {
        super(name);
    }

    public void initStatesList(GameContainer container) throws SlickException {
        addState(new Menu());
    }
}

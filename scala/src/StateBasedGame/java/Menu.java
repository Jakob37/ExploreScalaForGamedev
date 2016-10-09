package StateBasedGame.java;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

// Based on:
// http://lyndonarmitage.com/an-introduction-to-state-based-games-slick-library/

public class Menu extends BasicGameState {

    private StateBasedGame game;

    public void init(GameContainer container, StateBasedGame game)
        throws SlickException {
        this.game = game;
    }

    public void render(GameContainer container, StateBasedGame game, Graphics g)
        throws SlickException {
        g.setColor(Color.white);
        g.drawString("Higher or lower", 50, 10);

        g.drawString("1. Play Game", 50, 100);
        g.drawString("2. High Scores", 50, 120);
        g.drawString("3. Quit", 50, 140);
    }

    public void update(GameContainer container, StateBasedGame game, int delta)
        throws SlickException {

    }

    public void keyReleased(int key, char c) {
        switch(key) {
            case Input.KEY_1:
                game.enterState(0, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                break;
            case Input.KEY_2:
                break;
            case Input.KEY_3:
                break;
            default:
                break;
        }
    }

    public int getID() {
        return 0;
    }
}

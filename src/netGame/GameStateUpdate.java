package netGame;

import java.io.Serializable;

public class GameStateUpdate implements Serializable {
    public float x;
    public float y;
    public float angle;


    public GameStateUpdate(float x, float y, float angle) {
        this.x = x;
        this.y = y;
        this.angle = angle;
    }
}

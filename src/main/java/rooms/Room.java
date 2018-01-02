package rooms;

import java.util.Random;

public abstract class Room {

    private boolean canExit;

    public Room() {
        this.canExit = true;
    }

    public int getRandomNumber(int max) {
        Random rand = new Random();
        return rand.nextInt(max);
    }


}

package rooms;

import enemies.Enemy;

public class EnemyRoom extends Room {

    private Enemy enemy;

    public EnemyRoom() {
       randomEnemy();
       setCanExit(false);
    }

    public  void randomEnemy() {
        int result = getRandomNumber(2);
        if (result == 0);
    }



}

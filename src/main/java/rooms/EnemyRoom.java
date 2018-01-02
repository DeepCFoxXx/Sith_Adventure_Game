package rooms;

import enemies.Enemy;
import enemies.MaceWindu;
import enemies.Yoda;

public class EnemyRoom extends Room {

    private Enemy enemy;

    public EnemyRoom() {
       randomEnemy();
       setCanExit(false);
    }

    public void randomEnemy() {
        int result = getRandomNumber(2);
        if (result == 0) {
            this.enemy = new Yoda(50, 300, "Yoda");
        } else if  (result == 1) {
            this.enemy = new MaceWindu(100, 500, "Mace Windu");
        }
    }


    public Enemy getEnemy() {
        return enemy;
    }
}

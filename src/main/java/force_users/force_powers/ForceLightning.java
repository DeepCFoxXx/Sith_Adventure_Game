package force_users.force_powers;

import enemies.Enemy;
import force_users.IAbility;

public class ForceLightning implements IAbility {

    private int damage;

    public ForceLightning() {
        this.damage = 100;
    }


    public void use(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}

package force_users.force_powers;

import enemies.Enemy;
import force_users.IAbility;

public class ForcePush implements IAbility {

    private int damage;

    public ForcePush() {
        this.damage = 70;
    }

    public void use(Enemy enemy) {
        enemy.takeDamage(damage);
    }

}

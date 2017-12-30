package force_users.force_powers;

import enemies.Enemy;

public class ForceLightning implements IAbility {

    private int damage;

    public ForceLightning() {
        this.damage = 100;
    }


    public void use(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}

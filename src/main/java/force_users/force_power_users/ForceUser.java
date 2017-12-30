package force_users.force_power_users;

import enemies.Enemy;
import force_users.force_powers.ForcePush;
import force_users.force_powers.IAbility;
import players.Player;
import summons.ISummons;

public class ForceUser extends Player {

    private IAbility forcePower;
    private ISummons summons;

    public ForceUser(String name, int health, IAbility forcePower, ISummons summons) {
        super(name, health);
        this.forcePower = forcePower;
        this.summons = summons;
    }

//    public void use(Enemy enemy) {
//        forcePower.use(enemy);
//    }


//    public void setForcePower(IAbility forcePush) {
//        this.forcePower = forcePower;
//    }
}

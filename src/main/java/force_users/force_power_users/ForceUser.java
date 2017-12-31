package force_users.force_power_users;

import enemies.Enemy;
import force_users.force_powers.ForcePush;
import force_users.force_powers.IAbility;
import players.Player;
import summons.ISummons;

public abstract class ForceUser extends Player {

    private IAbility ability;
    private ISummons summons;

    public ForceUser(String name, int health, IAbility ability, ISummons summons) {
        super(name, health);
        this.ability = ability;
        this.summons = summons;
    }

    public void use(Enemy enemy) {
        this.ability.use(enemy);
    }
}

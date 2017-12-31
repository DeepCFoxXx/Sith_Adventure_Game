package force_users.force_power_users;

import enemies.Enemy;
import force_users.force_powers.IAbility;
import summons.ISummons;

public class DarthSidious extends ForceUser {

    public DarthSidious(String name, int health, IAbility ability, ISummons summons) {
        super(name, health, ability, summons);
    }

    public String speak() {
        return "Are you threatening me, Master Jedi?";
    }
}

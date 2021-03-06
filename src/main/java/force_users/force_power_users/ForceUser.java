package force_users.force_power_users;

import enemies.Enemy;
import force_users.force_powers.ForcePush;
import force_users.force_powers.IAbility;
import players.Player;
import summons.ISummons;
import summons.SuperStarDestroyer;


public abstract class ForceUser extends Player {

    private IAbility ability;
    private ISummons summons;

    public ForceUser(String name, int health, IAbility ability, ISummons summons) {
        super(name, health);
        this.ability = ability;
        this.summons =summons;
    }

    public void use(Enemy enemy) {
        this.ability.use(enemy);
    }

    public void summon(Enemy enemy) {
        this.summons.summon(enemy);
    }

    public void setAbility(IAbility forcePush) {
        this.ability = forcePush;
    }

    public void setSummons(ISummons superStarDestroyer) {
        this.summons = superStarDestroyer;
    }
}

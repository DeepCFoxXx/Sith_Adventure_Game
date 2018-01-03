package force_users.force_power_users;

import force_users.force_powers.IAbility;
import summons.ISummons;

public class DarthPlagueis extends ForceUser {

    public DarthPlagueis(String name, int health, IAbility ability, ISummons summons) {
        super(name, health, ability, summons);
    }

    public String speak() {
        return "The power of the dark side is an illness no true Sith would wish to be cured of";
    }
}

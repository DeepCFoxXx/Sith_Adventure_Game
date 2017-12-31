package force_healer;

import players.Player;

public class ForceHeal implements IForceHeal {

    private int healValue;

    public ForceHeal() {
        this.healValue = 50;
    }

    public void heal(Player player){
        player.getHealth();
    }

}

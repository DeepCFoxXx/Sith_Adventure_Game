package force_healer;


public class ForceHeal  implements Regen {

    private int healValue;

    public ForceHeal() {
        this.healValue = 50;
    }

    public int getHealValue() {
        return this.healValue;
    }


}

package artifacts;

public class SithHolocron implements IArtifacts {

    public int amount;

    public SithHolocron() {
        this.amount = 1000;
    }

    @Override
    public int getValue() {
        return amount;
    }
}

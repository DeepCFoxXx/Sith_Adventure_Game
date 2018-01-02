package artifacts;

public class JediHolocron implements IArtifacts {

  public int amount;

  public JediHolocron() {
      this.amount = 500;
  }

  @Override
  public int getValue() {
      return amount;
  }

}

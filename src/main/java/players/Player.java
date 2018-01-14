package players;

public abstract class Player {

    private String name;
    private int health;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void heal(int regen) {
        this.health += regen;
    }
}


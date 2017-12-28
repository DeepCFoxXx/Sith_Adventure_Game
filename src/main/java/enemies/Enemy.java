package enemies;

public abstract class Enemy {

    private int attack;
    private int health;
    private String name;

    public Enemy(int attack, int health, String name) {
        this.attack = attack;
        this.health = health;
        this.name = name;

    }

    public int getAttack() {
        return this.attack;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public void takeDamage(int value) {
        this.health -= value;
    }

}

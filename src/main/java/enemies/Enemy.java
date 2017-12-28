package enemies;

public abstract class Enemy {

    private int attack;
    private int health;

    public Enemy(int attack, int health){
        this.attack = attack;
        this.health = health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getHealth() {
        return this.health;
    }
}

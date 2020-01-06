public abstract class Character {
    protected int health;
    protected int attackPower;

    public Character(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }

    public void decressLife(int value) {
        this.health -= value;
    }

    public int getLife() {
        return health;
    }
}


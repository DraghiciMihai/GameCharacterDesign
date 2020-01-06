public abstract class Character {
    protected int health;
    protected int attackPower;
    
    public Character(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void decressLife(int value);

    public int getLife() {
        return health;
    }
}


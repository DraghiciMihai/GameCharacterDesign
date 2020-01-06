public class Hero extends Character implements Actions {
    public Hero(int health, int attackPower) {
        super(health, attackPower);
    }

    public void decressLife(int value) {
        super.health-=value;
    }

    public void attack(Character character) {
        character.decressLife(this.attackPower);
    }
}

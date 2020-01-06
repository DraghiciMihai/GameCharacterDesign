public class Hero extends Character implements Actions {
    public Hero(int health, int attackPower) {
        super(health, attackPower);
    }

    public void attack(Character character) {
        character.decressLife(this.attackPower);
    }
}

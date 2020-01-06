public class NonPlayerCharacter extends Character implements Actions {
    public NonPlayerCharacter(int health, int attackPower) {
        super(health, attackPower);
    }

    public void attack(Character character){
        character.decressLife(this.attackPower);
        System.out.println("O sa te atac!");
    }
}

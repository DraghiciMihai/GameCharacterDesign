public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(100, 20);
        NonPlayerCharacter enemy = new NonPlayerCharacter(50,10);
        enemy.attack(hero);
        System.out.println(hero.getLife());
        hero.attack(enemy);
        System.out.println(enemy.getLife());
    }
}
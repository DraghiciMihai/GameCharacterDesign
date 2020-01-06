import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void gameTest() {
        Hero hero = new Hero(100, 10);
        NonPlayerCharacter enemy1 = new NonPlayerCharacter(100, 2);
        System.out.println("Eroul o sa fie atacat");
        enemy1.attack(hero);
        Assert.assertEquals(98, hero.getLife());
        System.out.println("Eroul ataca");
        hero.attack(enemy1); // nu printeaza nimic pe ecran
        Assert.assertEquals(90, enemy1.getLife());
    }
}

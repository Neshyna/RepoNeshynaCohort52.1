package hw23;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("warrior");
        Mage mage = new Mage("mage");
        Archer archer = new Archer("archer");

        mage.arrayGameCharachter();
        //GameCharacter gameCharacter = new GameCharacter();
        //exeCute array with a help of child class, because can't create object of abstract class GameCharacter here
        //array can be executed by child class as well as it inherits all methods


    }

}

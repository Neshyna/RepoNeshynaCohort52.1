package hw23;
/*
Task 2
Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
Определите абстрактный метод attack(), который будет различаться для разных типов персонажей
(например, воин атакует мечом, а маг использует магические заклинания).
Создайте несколько конкретных подклассов, представляющих разные типы персонажей, такие как
Warrior, Mage, Archer, и т. д.
Переопределите метод attack() для каждого класса.
Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
 */
abstract class GameCharacter {

    protected String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    abstract void attack();

    public void arrayGameCharachter(){

        GameCharacter[] gameCharacters = new GameCharacter[3];

        GameCharacter warrior = new Warrior("warrior");
        GameCharacter mage = new Mage("mage");
        GameCharacter archer = new Archer("archer");

        gameCharacters[0] = warrior;
        gameCharacters[1] = mage;
        gameCharacters[2] = archer;

        for(int i = 0; i < gameCharacters.length; i++){
            gameCharacters[i].attack();
        }


    }
}

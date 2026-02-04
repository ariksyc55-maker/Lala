package lesson_4;

public class Game {
    public static void main(String[] args) {

        Warrior warriorOne = new Warrior();
        warriorOne.name = "Артур";
        warriorOne.abilities = "Воин";
        warriorOne.health = 200;
        warriorOne.power = 45;

        Warrior warriorTwo = new Warrior();
        warriorTwo.name = "Фростморн";
        warriorTwo.abilities = "Воин";
        warriorTwo.health = 200;
        warriorTwo.power = 40;

        Mage mageOne = new Mage();
        mageOne.name = "Ягермейстер";
        mageOne.abilities = "Маг";
        mageOne.health = 100;
        mageOne.power = 50;

        Mage mageTwo = new Mage();
        mageTwo.name = "Ильестр";
        mageTwo.abilities = "Маг";
        mageTwo.health = 120;
        mageTwo.power = 45;

        Rogue rogueOne = new Rogue();
        rogueOne.name = "Берсек";
        rogueOne.abilities = "Разбойник";
        rogueOne.health = 120;
        rogueOne.power = 50;

        Rogue rogueTwo = new Rogue();
        rogueTwo.name = "Брианна";
        rogueTwo.abilities = "Разбойник";
        rogueTwo.health = 150;
        rogueTwo.power = 40;

        getVoice(warriorOne);
        getVoice(warriorTwo);
        getVoice(mageOne);
        getVoice(mageTwo);
        getVoice(rogueOne);
        getVoice(rogueTwo);
    }
    public static void getVoice(Convocation convocation) {
        convocation.voice();
    }
}

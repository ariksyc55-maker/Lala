package lesson_4.hero;

import lesson_4.Hero;

public class Mage extends Hero {
    public String name;
    public String abilities;
    public int health;
    public int power;

    public void voice() {
        System.out.println("Я представитель класса " + abilities + ". Моё имя " + name);
        System.out.println(" -У меня здоровье " + health + " и моя сила " + power);
    }
}

package lesson_4.Hero;

import lesson_4.Convocation;

public class Rogue extends Convocation {
    public String name;
    public String abilities;
    public int health;
    public int power;

    public void voice() {
        System.out.println("Я представитель класса " + abilities + ". Моё имя " + name);
        System.out.println(" -У меня здоровье " + health + " и моя сила " + power);
    }
}

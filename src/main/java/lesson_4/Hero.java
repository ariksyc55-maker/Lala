package lesson_4;

public class Hero {
    public int health;
    public int power;
    public String name;
    public String abilities;

    public void voice() {
        System.out.println("Я представитель класса " + abilities + ". Моё имя " + name);
        System.out.println(" -У меня здоровье " + health + " и моя сила " + power);
        System.out.println();
    }
}

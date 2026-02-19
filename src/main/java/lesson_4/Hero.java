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

    public String toString() {
        return name + " (" + abilities + ") - Здоровье: " + health + ", Сила: " + power;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void theLossWords() {
        if (this.health == 0) {
            System.out.println(this.name + ": Я пал в бою, это был честный поединок...");
        } else if (this.health >= 0) {
            System.out.println(this.name + ": Я ранен, но могу продолжать сражаться!");
        }
    }
    public void theWinnerWord(){
        System.out.println(this.name + ": Атакую");
    }

}


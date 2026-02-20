package lesson_4;

public class Hero {
    public int health;
    public int power;
    public String name;
    public String clazz;

    public void voice() {
        System.out.println("Я представитель класса " + clazz + ". Моё имя " + name);
        System.out.println(" -У меня здоровье " + health + " и моя сила " + power);
        System.out.println();
    }
    public void attack(Hero targetHero){
        targetHero.takeDamage(power);
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
    public void wordsBeforeTheAttack(){
    }
    public void wordsOfThreat (){
        System.out.println(this.name);
    }
}


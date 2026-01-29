package lesson_5;

public class Runner {
  public static void main(String[] args) {
    Cat catOne = new Cat();
    catOne.name = "Barsik";
    catOne.age = 3;

    Cat catTwo = new Cat();
    catTwo.name = "Sharik";
    catTwo.age = 5;

    Dog dogOne = new Dog();
    dogOne.name = "Bobic";
    dogOne.age = 2;

    Dog dogTwo = new Dog();
    dogTwo.name = "Pesik";
    dogTwo.age = 4;

    Cow cow = new Cow();


    getVoice(catOne);
    getVoice(dogTwo);
    getVoice(cow);
  }

  public static void getVoice(Animal animal) {
    animal.voice();
  }
}

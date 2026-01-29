package lesson_5;

public class Cat extends Animal {
  public String name;
  public int age;

  public void voice() {
    System.out.println("Мяу, я " + name + ", мне " + age + " лет");
  }
}

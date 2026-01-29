package lesson_5;

public class Dog extends Animal {
  public String name;
  public int age;

  public void voice() {
    System.out.println("Гав-гав, я " + name + ", мне " + age + " лет");
  }
}

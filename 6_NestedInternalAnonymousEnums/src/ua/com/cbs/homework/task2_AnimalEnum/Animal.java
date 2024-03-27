package ua.com.cbs.homework.task2_AnimalEnum;

public enum Animal {
  CAT(5), DOG(8), CAMEL(15), ELEPHANT(20);

  private int age;

  Animal(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "name=" + name() +
        ", age=" + age +
        '}';
  }
}

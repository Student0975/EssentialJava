package ua.com.cbs.homework.task2_AnimalEnum;

public class Main {

  public static void main(String[] args) {
    System.out.println(Animal.CAT);
    System.out.println(Animal.DOG);
    System.out.println(Animal.CAMEL);
    System.out.println(Animal.ELEPHANT);

    System.out.println("-".repeat(25));

    Animal[] values = Animal.values();
    for (Animal animal : values) {
      System.out.println(animal);
    }

    System.out.println("-".repeat(25));

    System.out.println(Animal.valueOf("CAT"));
    System.out.println(Animal.valueOf("DOG"));
    System.out.println(Animal.valueOf("CAMEL"));
    System.out.println(Animal.valueOf("ELEPHANT"));
  }
}

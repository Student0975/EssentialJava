package ua.com.csb.homework.task3RemovalAnimalFromZoo;

import ua.com.csb.homework.task2Zoo.Zoo;

import java.util.ArrayList;

/**
 * Використовуючи клас Zoo Завдання 2, видалити 3-ю, 5-у, 7-у тварину, дізнатися розмір списку і вивести в консоль.
 */

public class RemovalAnimal {

  public static void main(String[] args) {
    ArrayList<String> animals = Zoo.fillInZoo();
    System.out.println("Initial number of animals in the Zoo : " + animals.size());
    System.out.println(animals);
    System.out.println("-".repeat(15));

    animals.remove(3);
    System.out.println("Number of animals in the Zoo after removal 3rd animal : " + animals.size());
    System.out.println(animals);
    System.out.println("-".repeat(15));

    animals.remove(5 - 1); // because initial index 5 got into index 4 after 1 time deletion
    System.out.println("Number of animals in the Zoo after removal 5th animal : " + animals.size());
    System.out.println(animals);
    System.out.println("-".repeat(15));

    animals.remove( 7 - 2); // because initial index 7 got into index 5 after 2 times deletion
    System.out.println("Number of animals in the Zoo after removal 7th animal : " + animals.size());
    System.out.println(animals);
  }

  private static void remove(ArrayList<String> animals, int numberOfAnimals) {
    for (int i = 0; i < numberOfAnimals; i++) {
      animals.remove(0);
    }
  }
}

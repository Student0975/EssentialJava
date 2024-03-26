package ua.com.csb.homework.task2Zoo;

import java.util.ArrayList;

/**
 * Створити клас Zoo.
 * У класі створити список, який записати 8 тварин через метод add(index, element).
 * Вивести список у консоль.
 */

public class Zoo {

  public static void main(String[] args) {

    ArrayList<String> animals = fillInZoo();
    zooShow(animals);
  }

  private static void zooShow(ArrayList<String> animals) {
    for (String animal: animals) {
      System.out.println(animals.indexOf(animal) + ", " + animal);
    }
  }

  public static ArrayList<String> fillInZoo() {
    String[] animalsName = {"Tiger", "Elephant", "Camel", "Lion", "Bear", "Polar bear", "Wolf", "Rhinoceros"};

    ArrayList<String> animals = new ArrayList<>();
    for (int i = 0; i < animalsName.length; i++) {
      animals.add(i,animalsName[i]);
    }
    return animals;
  }
}

package ua.com.csb.homework.task4ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * Створити клас Main, створити список цілих чисел і за допомогою ListIterator пройтись по списку і збільшити значення на 1.
 */

public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("Initial arrayList  : " + numbers);

    ListIterator<Integer> iterator = numbers.listIterator();
    int i = 0;
    while (iterator.hasNext()) {
      Integer integer = iterator.next();
      numbers.set(i, ++integer);
      i++;
    }
    System.out.println("Modified arrayList : " + numbers);
  }
}

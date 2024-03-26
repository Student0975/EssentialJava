package ua.com.csb.homework.task5Friends;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Cтворити клас Friends.
 * За допомогою методів ArrayList додати масив імена друзів.
 * Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
 */

public class Friends {

  public static void main(String[] args) {
    ArrayList<String> friendsName = new ArrayList<>();
    friendsName.add("Biden");
    friendsName.add("Macron");
    friendsName.add("Snow");
    friendsName.add("Jackson");
    friendsName.add("Brown");
    friendsName.add("Apple");
    friendsName.add("Green");
    System.out.println("Initial list of friends           : "  + friendsName);

    Object[] names = friendsName.toArray();
    Arrays.sort(names);
    System.out.println("List of friends after sorting A-Z : " + Arrays.toString(names));
  }
}

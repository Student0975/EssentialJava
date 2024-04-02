package ua.com.csb.homework.task3_Price;

import ua.com.csb.homework.task3_Price.exception.EmptyShopNameException;
import ua.com.csb.homework.task3_Price.exception.NoShopExistException;

import java.util.Comparator;
import java.util.InputMismatchException;

import static ua.com.csb.homework.task3_Price.Main.priceArrayList;
import static ua.com.csb.homework.task3_Price.Main.scanner;

public class HandlerModule {

  public void process(int choiceNumber) {
    switch (choiceNumber) {
      case 1 -> {
        System.out.println("Input a good's name :");
        String nameGood = scanner.nextLine();

        System.out.println("Input a shop's name where is the good :");
        String nameShop = scanner.nextLine();

        System.out.println("Input a good's price :");
        try {
          Double goodPrice = scanner.nextDouble();
          priceArrayList.add(new Price(nameGood, nameShop, goodPrice));
          priceArrayList.sort(Comparator.comparing(Price::getShopName));
        } catch (InputMismatchException ex) {
          System.err.println("Must be only digits!");
          scanner.nextLine();
        }
      }
      case 2 -> {
        System.out.println("Input a shop's name from where you'd like to see the list of goods :");
        String nameShop = scanner.nextLine();
        Price findingShopName = new Price("", nameShop, 0.00);
        try {
          if (nameShop.isEmpty()) {
            throw new EmptyShopNameException("Shop's name can not be empty!");
          }
          if (!priceArrayList.contains(findingShopName)) {
            throw new NoShopExistException("No " + nameShop.toUpperCase() + " shop exists!");
          }

          for (Price price : priceArrayList) {
            if (price.getShopName().equalsIgnoreCase(nameShop)) {
              System.out.println(price);
            }
          }

        } catch (EmptyShopNameException | NoShopExistException ex) {
          System.err.println(ex.getMessage());
        }
      }
    }
  }
}


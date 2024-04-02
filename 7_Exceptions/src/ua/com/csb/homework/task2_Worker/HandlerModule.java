package ua.com.csb.homework.task2_Worker;

import ua.com.csb.homework.task2_Worker.exception.WrongExpirienceValueException;
import ua.com.csb.homework.task2_Worker.exception.WrongFormatYearException;
import ua.com.csb.homework.task2_Worker.exception.YearOverCurrentException;

import java.time.Year;
import java.util.Comparator;
import java.util.InputMismatchException;

import static ua.com.csb.homework.task2_Worker.Main.listWorkers;
import static ua.com.csb.homework.task2_Worker.Main.scanner;

public class HandlerModule {

  public void process(int choiceNumber) {
    String surnameInitials = "";
    String position = "";
    int yearIn = 0;
    int yearNow = Year.now().getValue();

    switch (choiceNumber) {
      case 1 -> {
        int currentNumber = listWorkers.size() + 1;

        System.out.println("Input the last name and initials " + currentNumber + " of the worker:");
        surnameInitials = scanner.nextLine();

        System.out.println("Input a current position " + currentNumber + " of the worker:");
        position = scanner.nextLine();

        System.out.println("Input an year of starting the current position " + currentNumber + " of the worker:");
        try {
          yearIn = scanner.nextInt();
          if (yearIn > 9999 || yearIn < 1000) {
            throw new WrongFormatYearException("Wrong year format. Year format must be : YYYY");
          }
          if (yearIn > yearNow) {
            throw new YearOverCurrentException("Year of stating job can not be in future!");
          }

          listWorkers.add(new Worker(surnameInitials, position, yearIn));

        } catch (InputMismatchException ex) {
          System.err.println("Must be only number!");
          scanner.nextLine();
        } catch (WrongFormatYearException | YearOverCurrentException ex) {
          System.err.println(ex.getMessage());
          scanner.nextLine();
        }
      }
      case 2 -> {
        int experience = -1;

        System.out.println("Input value of length of the service:");
        try {
          experience = scanner.nextInt();
          if (experience < 0) {
            throw new WrongExpirienceValueException("Experience value must be only positive integer number!");
          }
          int i = 0;
          System.out.printf("List of workers with %s year(s) length of service :\n", experience);
          for (Worker worker : listWorkers) {
            if ((yearNow - worker.getYearStartWork()) > experience)
              System.out.printf("%s. %s\n", ++i, worker.getSurnameInitials());
          }
          if (i == 0) {
            System.out.println("No specific workers...");
          }
        } catch (WrongExpirienceValueException ex) {
          System.err.println(ex.getMessage());
          scanner.nextLine();
        } catch (InputMismatchException ex) {
          System.err.println("Must be only number!");
          scanner.nextLine();
        }
      }

      case 3 -> {
        listWorkers.sort(Comparator.comparing(Worker::getSurnameInitials));
        for (Worker worker : listWorkers) {
          System.out.println(worker.toString());
        }
      }
    }
  }
}


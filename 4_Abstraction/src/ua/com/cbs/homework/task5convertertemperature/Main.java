package ua.com.cbs.homework.task5convertertemperature;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double temperature = -273.15;

    do {
      System.out.println("Input a temperature degrees Celsius: :");
      try {
        temperature = scanner.nextDouble();
      } catch (InputMismatchException ex) {
        scanner.next();
      }
    } while (checkingInputConditions(temperature));

    ConverterTemperature converterTemperature = new ConverterCelsiusToFahrenheit();
    System.out.printf("\nTemperature in degrees Celsius equals temperature in degrees Fahrenheit : %.2f = %.2f", temperature,
        converterTemperature.convert(temperature));
    converterTemperature = new ConverterCelsiusToKelvin();
    System.out.printf("\nTemperature in degrees Celsius equals temperature in Kevins             : %.2f = %.2f", temperature,
        converterTemperature.convert(temperature));
  }

  private static boolean checkingInputConditions(double temperature) {
    if(temperature <= -273.15) {
      System.out.println("""
          Input must NOt be less than absolute zero in celsius = -273.15!
          Try to input again, please!
          """);
    }
    return false;
  }
}

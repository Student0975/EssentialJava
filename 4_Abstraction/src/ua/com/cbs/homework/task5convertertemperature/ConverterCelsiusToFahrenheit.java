package ua.com.cbs.homework.task5convertertemperature;

public class ConverterCelsiusToFahrenheit extends ConverterTemperature{

  @Override
  double convert(double celsius) {
    return (9 * celsius / 5) + 32;
  }
}

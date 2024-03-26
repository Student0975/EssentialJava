package ua.com.cbs.homework.task5convertertemperature;

public class ConverterCelsiusToKelvin extends ConverterTemperature{

  @Override
  double convert(double celsius) {
    return celsius - 273.15;
  }
}

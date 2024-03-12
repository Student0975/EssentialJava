package ua.com.cbs.homework.task5Address;

public class Address {
  private int index;
  private String country;
  private String city;
  private String street;
  private String house;
  private String apartment;

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  @Override
  public String toString() {
    return "Address is {" +
        "\nindex=" + index +
        ",\ncountry='" + country + '\'' +
        ",\ncity='" + city + '\'' +
        ",\nstreet='" + street + '\'' +
        ",\nhouse='" + house + '\'' +
        ",\napartment='" + apartment + '\'' +
        "\n}";
  }
}

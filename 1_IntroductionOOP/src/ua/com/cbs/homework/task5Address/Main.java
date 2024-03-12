package ua.com.cbs.homework.task5Address;

/**
 * Створити клас із ім'ям Address.
 * У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
 * Для кожного поля створити метод з двома методами доступу (get, set)
 * Створити екземпляр класу Address. У поля екземпляра записати інформацію про поштову адресу.
 * Виведіть на екран значення полів, що описують адресу.
 */

public class Main {
  public static void main(String[] args) {
    Address myAddress = new Address();
    myAddress.setIndex(65101);
    myAddress.setCountry("Ukraine");
    myAddress.setCity("Odesa");
    myAddress.setStreet("Derybasivska");
    myAddress.setHouse("1");
    myAddress.setApartment("2a");

    System.out.println(myAddress);
  }
}

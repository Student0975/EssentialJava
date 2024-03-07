package ua.com.cbs.homework.task3Book;

/**
 * Потрібно: Створити клас Book (Main).
 * Створити класи Title, Author та Content, кожен з яких повинен містити одне рядкове поле та метод void show().
 * Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
 * Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
 */

public class Book {

  public static void main(String[] args) {
    Title title = new Title();
    title.setTitle("Great book");

    Author author = new Author();
    author.setAuthor("Cool author");

    Content content = new Content();
    content.setContent("Amazing content");

    title.show();
    author.show();
    content.show();
  }
}

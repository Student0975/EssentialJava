package ua.com.cbs.homework.task2AbstractHadler;

public class TXTHandler extends AbstractHandler{
  @Override
  void open() {
    System.out.println("Open   a TXT format");
  }

  @Override
  void create() {
    System.out.println("Create a TXT format");
  }

  @Override
  void change() {
    System.out.println("Change a TXT format");
  }

  @Override
  void save() {
    System.out.println("Save   a TXT format");
  }
}

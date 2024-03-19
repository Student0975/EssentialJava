package ua.com.cbs.homework.task2AbstractHadler;

public class XMLHandler extends AbstractHandler{
  @Override
  void open() {
    System.out.println("Open   a XML format");
  }

  @Override
  void create() {
    System.out.println("Create a XML format");
  }

  @Override
  void change() {
    System.out.println("Change a XML format");
  }

  @Override
  void save() {
    System.out.println("Save   a XML format");
  }
}

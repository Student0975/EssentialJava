package ua.com.cbs.homework.task2AbstractHadler;

public class DOCHandler extends AbstractHandler{
  @Override
  void open() {
    System.out.println("Open   a DOC format");
  }

  @Override
  void create() {
    System.out.println("Create a DOC format");
  }

  @Override
  void change() {
    System.out.println("Change a DOC format");
  }

  @Override
  void save() {
    System.out.println("Save   a DOC format");
  }
}

package ua.com.cbs.homework.DocumentWorker;

public class ExpertDocumentWorker extends ProDocumentWorker{

  @Override
  public void saveDocument() {
    System.out.println("Document saved in the new format");
  }
}

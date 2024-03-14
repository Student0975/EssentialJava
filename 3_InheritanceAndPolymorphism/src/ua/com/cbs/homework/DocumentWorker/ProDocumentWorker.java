package ua.com.cbs.homework.DocumentWorker;

public class ProDocumentWorker extends DocumentWorker{

  @Override
  public void editDocument(){
    System.out.println("Document edited");
  }

  @Override
  public void saveDocument() {
    System.out.println("Document saved in old format, saving in other formats available in Exp version");
  }
}

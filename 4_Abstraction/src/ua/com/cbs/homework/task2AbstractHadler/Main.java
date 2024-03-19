package ua.com.cbs.homework.task2AbstractHadler;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<AbstractHandler> documents = new ArrayList<>();
    documents.add(new DOCHandler());
    documents.add(new TXTHandler());
    documents.add(new XMLHandler());

    for (AbstractHandler doc : documents) {
      doc.create();
      doc.open();
      doc.change();
      doc.save();
      System.out.println("-".repeat(15));
    }

  }
}

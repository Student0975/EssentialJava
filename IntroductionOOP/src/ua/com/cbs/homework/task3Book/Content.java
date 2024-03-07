package ua.com.cbs.homework.task3Book;

public class Content {
  private String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  void show() {
    System.out.println("It's a content : " + content);
  }
}

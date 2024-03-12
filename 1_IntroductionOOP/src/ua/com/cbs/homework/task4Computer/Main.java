package ua.com.cbs.homework.task4Computer;

public class Main {
  public static void main(String[] args) {
    Computer[] computers = new Computer[5];
    for (int i = 0; i < computers.length; i++) {
      computers[i] = new Computer(i);
    }
//    computers[0] = new Computer(0);
//    computers[1] = new Computer(1);
//    computers[2] = new Computer(2);
//    computers[3] = new Computer(3);
//    computers[4] = new Computer(4);

    for (Computer comp : computers) {
      System.out.println(comp);
    }

  }
}
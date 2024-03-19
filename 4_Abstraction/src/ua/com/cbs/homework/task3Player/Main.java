package ua.com.cbs.homework.task3Player;

public class Main {
  public static void main(String[] args) {
    System.out.println("Play & Record");
    System.out.println("-".repeat(15));
    Player player = new Player();
    player.play();
    player.pause();
    player.stop();
    player.record();
  }
}

package ua.com.csb.homework.teachers;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> teachers = new ArrayList<>();
    teachers.add("teacher_1");
    teachers.add("teacher_2");
    teachers.add("teacher_3");
    teachers.add("teacher_4");
    teachers.add("teacher_5");
    System.out.println(teachers);
    System.out.println("Index the best teacher  : " + teachers.indexOf("teacher_3"));
    System.out.println("Index the worst teacher : " + teachers.indexOf("teacher_1"));
  }
}

package ua.com.cbs.homework.task2Classroom;

import java.util.ArrayList;
import java.util.Random;

/**
 * Створити клас, який представляє навчальний клас ClassRoom.
 * Створіть клас учень Pupil. У тілі класу створіть методи void study(), void read(), void write(), void relax().
 * Створіть 3 похідні класу ExcellentPupil, GoodPupil, BadPupil від класу базового класу Pupil і
 * перевизначте кожен із методів, залежно від успішності учня.
 * Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
 * Передбачте можливість, що користувач може передати 2 або 3 аргументи.
 * Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
 */

public class Main {

  public static void main(String[] args) {
    ArrayList<Pupil> pupils= new ArrayList<>();
    pupils.add(new ExcellentPupil());
    pupils.add(new ExcellentPupil());
    pupils.add(new GoodPupil());
    pupils.add(new GoodPupil());
    pupils.add(new BadPupil());
    pupils.add(new BadPupil());

    Random randomIndex = new Random();

    Classroom classroom1 = new Classroom(pupils.get(randomIndex.nextInt(6 - 1) + 1),
        pupils.get(randomIndex.nextInt(6 - 1) + 1));
    classroom1.showInfo("\nClassroom1 info :", classroom1);

    Classroom classroom2 = new Classroom(pupils.get(randomIndex.nextInt(6 - 1) + 1),
        pupils.get(randomIndex.nextInt(6 - 1) + 1));
    classroom2.showInfo("\nClassroom2 info :", classroom2);

    Classroom classroom3 = new Classroom(pupils.get(randomIndex.nextInt(6 - 1) + 1),
        pupils.get(randomIndex.nextInt(6 - 1) + 1),
        pupils.get(randomIndex.nextInt(6 - 1) + 1)
    );
    classroom3.showInfo("\nClassroom3 info :", classroom3);

    Classroom classroom4 = new Classroom(pupils.get(randomIndex.nextInt(6 - 1) + 1),
        pupils.get(randomIndex.nextInt(6 - 1) + 1),
        pupils.get(randomIndex.nextInt(6 - 1) + 1),
        pupils.get(randomIndex.nextInt(6 - 1) + 1));
    classroom4.showInfo("\nClassroom4 info :", classroom4);
  }


}

package ua.com.cbs.homework.task5_Animal;

import java.util.Objects;

public class Animal {

  private String name;
  private int age;
  private boolean isTailExisted;

  public Animal() {
  }

  public Animal(String name, int age, boolean isTailExisted) {
    this.name = name;
    this.age = age;
    this.isTailExisted = isTailExisted;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isTailExisted() {
    return isTailExisted;
  }

  public void setTailExisted(boolean tailExisted) {
    isTailExisted = tailExisted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Animal animal)) return false;
    return Objects.equals(getName(),animal.getName()) &&
        getAge()==animal.getAge() &&
        isTailExisted() == animal.isTailExisted();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getAge(), isTailExisted());
  }

  @Override
  public String toString() {
    String isTale = isTailExisted ? "yes" : "no";
    return "Animal{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", isTailExisted=" + isTale +
        '}';
  }
}

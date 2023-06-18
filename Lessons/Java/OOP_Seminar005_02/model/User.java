package model;

/*
В данном абстрактном классе реализован принцип Dependency Inversion Principle.
Данный класс не зависит от классов наследников Student, Teacher. В то же время, наоборот, классы наследники зависят
от данного абстрактного класса
 */

public abstract class User {
    String name;
    Integer bornYear;

    public User(String name, Integer bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBornYear() {
        return bornYear;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }

    @Override
    public String toString() {
        return name + " " + bornYear;
    }
}

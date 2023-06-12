package model;

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

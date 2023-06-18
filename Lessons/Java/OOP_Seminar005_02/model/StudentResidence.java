package model;

import model.Student;

import java.util.ArrayList;
import java.util.List;
/*
В классе StudentResidence присутствуют принципы SOLID:
1. Single Responsibility Principle - класс отвечает только за одно решение (создание комнаты в общежитии студентов)
2. Open-Closed Principle - Класс открыт для расширения, но не для модификации
 */
public class StudentResidence {
    private int roomNumber;
    private List<Student> list;

    public StudentResidence() {
        this.list = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
}

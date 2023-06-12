package service;

import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    List<Student> studentList;

    public StudentServiceImpl() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public Student addStudent(String name, Integer yearBorn) {
        return new Student(name, yearBorn);
    }
}

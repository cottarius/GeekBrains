package controller;

import model.Student;
import model.StudentResidence;
import model.StudyGroup;
import model.Teacher;
import service.StudentResidenceServiceImpl;
import service.StudentServiceImpl;
import service.StudyGroupServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {
    StudyGroupServiceImpl studyGroupServiceImpl = new StudyGroupServiceImpl();
    StudentServiceImpl dataService = new StudentServiceImpl();
    StudentResidenceServiceImpl studentResidenceService = new StudentResidenceServiceImpl();

    public void getRoom(StudentResidence room){
        studentResidenceService.getRoom(room);
    }
    public StudentResidence createRoom (int number, List<Student> students){
        return studentResidenceService.createRoom(number, students);
    }
    public StudyGroup createGroup(List<Student> studentList, Teacher teacher) throws Exception {
        return studyGroupServiceImpl.createGroup(studentList, teacher);
    }

    public Student addStudent(String name, Integer yearBorn){
        return this.dataService.addStudent(name, yearBorn);
    }
    public void read(StudyGroup group) {
        studyGroupServiceImpl.readGroup(group);
    }

}

package service;

import model.Student;
import model.StudentResidence;

import java.util.List;

public class StudentResidenceServiceImpl implements StudentResidenceService{

    @Override
    public StudentResidence createRoom(int number, List<Student> students) {
        StudentResidence studentResidence = new StudentResidence();
        studentResidence.setRoomNumber(number);
        studentResidence.setList(students);
        return studentResidence;
    }

    public void getRoom(StudentResidence room){
        System.out.println("Room №" + room.getRoomNumber());
        for(Student student : room.getList())
        {
            System.out.println("\t" + student.getStudentId() + " " + student.getName() + " " + student.getBornYear());
        }
    }
}

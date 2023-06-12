package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.List;

public interface StudyGroupService {
    public StudyGroup createGroup(List<Student> students, Teacher teacher);
    public void readGroup(StudyGroup group);
}

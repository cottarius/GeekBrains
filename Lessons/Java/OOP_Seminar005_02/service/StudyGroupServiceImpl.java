package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.List;

public class StudyGroupServiceImpl implements StudyGroupService{
    StudyGroup studyGroup = new StudyGroup();
    static Integer idGenerator = 0;

    @Override
    public StudyGroup createGroup(List<Student> students, Teacher teacher) {
        studyGroup.setStudentList(students);
        studyGroup.setTeacher(teacher);
        studyGroup.setId(idGenerator++);
        return studyGroup;
    }

    @Override
    public void readGroup(StudyGroup group) {
        System.out.println("Group № " + studyGroup.getId());
        System.out.println(studyGroup.getTeacher());
        for(Student s : studyGroup.getStudentList()){
            System.out.println("\t" + s);
        }
        System.out.println();
    }
}

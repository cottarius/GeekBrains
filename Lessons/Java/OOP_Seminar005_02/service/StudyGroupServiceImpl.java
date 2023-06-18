package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.List;

public class StudyGroupServiceImpl implements StudyGroupService{
    //StudyGroup studyGroup = new StudyGroup();
    static Integer idGenerator = 0;

    @Override
    public StudyGroup createGroup(List<Student> students, Teacher teacher) {
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.setStudentList(students);
        studyGroup.setTeacher(teacher);
        studyGroup.setId(idGenerator++);
        return studyGroup;
    }

    @Override
    public void readGroup(StudyGroup group) {
        System.out.println("Group № " + group.getId());
        System.out.println(group.getTeacher());
        for(Student s : group.getStudentList()){
            System.out.println("\t" + s);
        }
        System.out.println();
    }
}

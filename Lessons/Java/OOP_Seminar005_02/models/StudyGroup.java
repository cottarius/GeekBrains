package model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    static Integer idGenerator = 0;
    private List<Student> studentList;
    private Teacher teacher;
    private Integer id;

    public StudyGroup() {
        this.studentList = new ArrayList<>();
    }
    public static Integer getIdGenerator() {
        return idGenerator;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}

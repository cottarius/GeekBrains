package model;

public class Teacher extends User{
    private static Integer idGenerator = 0;
    private Disciple disciplesTaught;

    private Integer idTeacher;

    public Teacher(String name, Integer bornYear, Disciple disciplesTaught) {
        super(name, bornYear);
        this.disciplesTaught = disciplesTaught;
        this.idTeacher = idGenerator++;
    }

    @Override
    public String toString() {
        return "teacher " + idTeacher + " " + disciplesTaught + " " + super.toString();
    }
}

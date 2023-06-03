// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Petrov",15, true, "Moscow");
        Teacher teacher = new Teacher("Sergey", "Ivanov", 34, "Rostov");
        student.tellInfo();
        System.out.println(student.isWorking());
        System.out.println(student.getPlaceOfLiving());
        teacher.tellInfo();
        System.out.println(teacher.getPlaceOfLiving());
    }
}
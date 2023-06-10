import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher ivanov = new Teacher(1, "Ivan", "Ivanov", "!?", LocalDate.now());
        Teacher petrov = new Teacher(4, "Petr", "Petrov", "!?", LocalDate.now());
        Teacher sidorov = new Teacher(2, "Sidr", "Sidorov", "!?", LocalDate.now());
        Teacher antonov = new Teacher(3, "Anton", "Antonov", "!?", LocalDate.now());

        List<User> teachers = new ArrayList<>();
        teachers.add(ivanov);
        teachers.add(petrov);
        teachers.add(sidorov);
        teachers.add(antonov);

        System.out.println("teachers");
        System.out.println(teachers + "\n");

        teachers.sort(new UserComparator<>());
        System.out.println("Sorted list:");
        System.out.println(teachers + "\n");

        System.out.println("Iterator:");
        Iterator<User> iterator = teachers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println();

        System.out.println("TeacherGroupIterator");
        List<Teacher> listTeachers = new ArrayList<>();
        listTeachers.add(ivanov);
        listTeachers.add(petrov);
        listTeachers.add(sidorov);
        listTeachers.add(antonov);

        TeacherGroup tGroup = new TeacherGroup(listTeachers);
        System.out.println(tGroup);
        System.out.println();

        TeacherGroupIterator teacherIterator = tGroup.iterator();
        while (teacherIterator.hasNext()){
            System.out.println(teacherIterator.next());
        }

    }
}
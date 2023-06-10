import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
   private int counter;
   private List<Student> list;

    public StudentGroupIterator(StudentGroup list) {
        this.list = list.getStudents();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < list.size();
    }

    @Override
    public Student next() {
        if(!hasNext()){
            throw new RuntimeException("Exception");
        }
        return list.get(counter++);
    }
}

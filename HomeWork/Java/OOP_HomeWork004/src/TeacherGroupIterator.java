import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher>{
    private int counter;
    private List<Teacher> list;

    public TeacherGroupIterator(TeacherGroup list) {
        this.list = list.getTeachers();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < list.size();
    }

    @Override
    public Teacher next() {
        if(!hasNext()){
            throw new RuntimeException("Exception");
        }
        return list.get(counter++);
    }
}

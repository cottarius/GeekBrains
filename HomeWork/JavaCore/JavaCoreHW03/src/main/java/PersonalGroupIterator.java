import java.util.Iterator;
import java.util.List;

public class PersonalGroupIterator implements Iterator<BaseWorker> {
    private int counter;
    private List<BaseWorker> list;

    public PersonalGroupIterator(Personal list) {
        this.list = list.getWorkers();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < list.size();
    }

    @Override
    public BaseWorker next() {
        if(!hasNext()){
            throw new RuntimeException("Exception");
        }
        return list.get(counter++);
    }
}

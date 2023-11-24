import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<BaseWorker>{
    List<BaseWorker> workers;

    public Personal(List<BaseWorker> workers) {
        this.workers = workers;
    }

    public void addWorkers(BaseWorker worker){
        workers.add(worker);
    }

    public List<BaseWorker> getWorkers() {
        return workers;
    }

    @Override
    public PersonalGroupIterator iterator() {
        return new PersonalGroupIterator(this);
    }

    @Override
    public String toString() {
        return "Personal{" +
                "workers=" + workers +
                '}';
    }
}

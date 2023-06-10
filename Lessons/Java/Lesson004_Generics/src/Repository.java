import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repository<T extends Content> implements Iterable<Content> {
    List<T> ds;
    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n >> %s created\n", this.name);
    }
    public void add(T content){
        ds.add(content);
    }
    public int count(){
        return ds.size();
    }
    public T get(Integer index){
        return ds.get(index);
    }

    @Override
    public Iterator<Content> iterator() {
        return new ContentIterator((List<Content>) ds);
    }
}

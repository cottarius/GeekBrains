import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HotWaterIterator implements Iterator<Product> {
    private int counter;
    private LinkedList<Product> hotWaters;

    public HotWaterIterator(LinkedList<Product> hotWaters) {
        this.counter = 0;
        this.hotWaters = hotWaters;
    }

    @Override
    public boolean hasNext() {
        return counter < hotWaters.size();
    }

    @Override
    public Product next() {
        if(!hasNext()){
            throw new RuntimeException("hotWaters");
        }
        return hotWaters.get(counter++);
    }
}

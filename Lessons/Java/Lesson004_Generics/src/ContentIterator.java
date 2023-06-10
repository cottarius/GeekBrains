import java.util.Iterator;
import java.util.List;

class ContentIterator implements Iterator<Content> {
    private int counter;
    private List<Content> list;

    public ContentIterator(List<Content> list) {
        this.counter = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return counter < list.size();
    }

    @Override
    public Content next() {
        if(!hasNext()){
            throw new RuntimeException("Exception");
        }
        return list.get(counter++);
    }
}

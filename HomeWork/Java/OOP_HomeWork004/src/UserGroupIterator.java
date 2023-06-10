import java.util.Iterator;
import java.util.List;

public class UserGroupIterator<T extends User> implements Iterator<T>{
    private int counter;
    private final List<T> userList;

    public UserGroupIterator(UserGroup userList) {
        counter = 0;
        this.userList = (List<T>) userList;
    }

    @Override
    public boolean hasNext() {
        return counter < userList.size();
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw  new RuntimeException("Exception");
        }
        return userList.get(counter++);
    }
}

import java.util.LinkedList;
import java.util.List;

public interface VendingMachine {
    public void putProduct(LinkedList<Product> item);
    public Product getProduct();
}

import java.nio.channels.Pipe;
import java.util.LinkedList;

public class HotWaterVendingMachine implements VendingMachine{
    private LinkedList<Product> hotWaters;
    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotWaters = item;
    }
    @Override
    public Product getProduct() {
        return hotWaters.pop();
    }
}

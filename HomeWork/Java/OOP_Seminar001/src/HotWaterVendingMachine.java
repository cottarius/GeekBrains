import java.util.Iterator;
import java.util.LinkedList;

public class HotWaterVendingMachine implements VendingMachine, Iterable<Product> {
    private LinkedList<Product> hotWaters;

    public void putProduct(LinkedList<Product> item) {
        this.hotWaters = item;
    }

    @Override
    public Product getProduct() {
        return hotWaters.pop();
    }

    public void print() {
        for (Product product : hotWaters) {
            System.out.println(product);
        }
        System.out.println();
    }

    public LinkedList<Product> sortProductByPrice(LinkedList<Product> products) {
        products.sort(new PriceComparator());
        return products;
    }

    public LinkedList<Product> sortProductByTemp(LinkedList<Product> products) {
        products.sort(new TempComparator());
        return products;
    }

    @Override
    public Iterator<Product> iterator() {
        return new HotWaterIterator(hotWaters);
    }
}

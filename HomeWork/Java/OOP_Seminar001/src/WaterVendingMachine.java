import java.util.Comparator;
import java.util.LinkedList;

public class WaterVendingMachine implements VendingMachine {
    private LinkedList<Product> waters;

    public void putProduct(LinkedList<Product> item) {
        this.waters = item;
    }
    @Override
    public Product getProduct() {
        return waters.pop();
    }
    public void print() {
        for (Product product : waters) {
            System.out.println(product);
        }
        System.out.println();
    }
    public LinkedList<Product> sortProductByPrice(LinkedList<Product> products) {
        products.sort(new PriceComparator());
        //products.sort(Comparator.comparingInt(p -> p.price));
        return products;
    }
}

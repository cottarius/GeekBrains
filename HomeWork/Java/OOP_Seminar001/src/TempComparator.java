import java.util.Comparator;

public class TempComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(Math.toIntExact(((HotWater) (o1)).temperature), Math.toIntExact(((HotWater) (o2)).temperature));
    }
}

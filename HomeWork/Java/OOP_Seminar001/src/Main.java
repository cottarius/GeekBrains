import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();
        Water bonAqua = new Water("BonAqua", 30);
        Water redKey = new Water("RedKey", 35);
        Water coolWater = new Water("CoolWater", 25);
        Water water = new Water("Water", 15);

        LinkedList<Product> list = new LinkedList<>();
        list.add(bonAqua);
        list.add(redKey);
        list.add(coolWater);
        list.add(water);

        wvm.putProduct(list);
        wvm.print();
        System.out.println("sort by price");
        wvm.sortProductByPrice(list);
        wvm.print();

//        System.out.println(wvm.getProduct());
//        System.out.println(wvm.getProduct());

        System.out.println("------------------------------------------");

        HotWaterVendingMachine hwvm = new HotWaterVendingMachine();
        HotWater nescafe = new HotWater("Nescafe", 50, 80);
        HotWater jacobs = new HotWater("Jacobs", 45, 85);
        HotWater greenfield = new HotWater("Greenfield", 55, 90);
        LinkedList<Product> hotWaters = new LinkedList<>();
        hotWaters.add(nescafe);
        hotWaters.add(jacobs);
        hotWaters.add(greenfield);
        hwvm.putProduct(hotWaters);
        hwvm.print();
        System.out.println("sort by price");
        hwvm.sortProductByPrice(hotWaters);
        hwvm.print();
        System.out.println("sort by Temperature");
        hwvm.sortProductByTemp(hotWaters);
        hwvm.print();

        System.out.println();

        System.out.println("Iterator");
        Iterator<Product> iterator = hwvm.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");


        List<Product> list1 = hotWaters.stream().sorted().toList();
        System.out.println(list1);


//        System.out.println(hwvm.getProduct());
//        System.out.println(hwvm.getProduct());
//        System.out.println(hwvm.getProduct());
    }
}
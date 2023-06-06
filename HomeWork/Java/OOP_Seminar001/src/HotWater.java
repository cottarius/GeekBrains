public class HotWater extends Product implements Comparable<Product>{
    public Long temperature;
    public HotWater(String name, int price, long temperature) {
        super(name, price);
        this.temperature = temperature;
    }
    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public void setName(String name) {
        super.name = name;
    }
    @Override
    public int getPrice() {
        return super.price;
    }
    @Override
    public void setPrice(int price) {
        super.price = price;
    }
    public long getTemperature() {
        return this.temperature;
    }
    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "HotWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.temperature.compareTo(((HotWater) (o)).temperature);
    }
}

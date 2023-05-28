public class HotWater extends Product{
    int temperature;
    public HotWater(String name, int price, int temperature) {
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
    public int getTemperature() {
        return this.temperature;
    }
    public void setTemperature(int temperature) {
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
}

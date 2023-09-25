package models;

public class Coffee extends HotDrink{
    private String brand;
    private String sort;


    public Coffee(int temperature, int coast, int id, boolean isReadyToServe, String brand, String sort) {
        super(temperature, coast, id, isReadyToServe);
        this.brand = brand;
        this.sort = sort;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public boolean isReadyToServe() {
        return super.isReadyToServe();
    }

    @Override
    public void setReadyToServe(boolean readyToServe) {
        super.setReadyToServe(readyToServe);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "brand='" + brand + '\'' +
                ", sort='" + sort + '\'' +
                ", temperature=" + temperature +
                ", coast=" + coast +
                ", id=" + id +
                ", isReadyToServe=" + isReadyToServe +
                '}';
    }
}

public abstract class Product {
    /*
    Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts
    (List<Product>), сохраняющий в себе список исходных продуктов и getProducts(String name)
     */
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getName();
    public abstract void setName(String name);
    public abstract int getPrice();
    public abstract void setPrice(int price);

}

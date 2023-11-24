public abstract class BaseWorker implements Comparable<BaseWorker>{

    //region Поля
    protected String name;
    protected double salary;
    //endregion

    //region Конструктор
    protected BaseWorker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    //endregion

    //region Setters/Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //endregion

    abstract double averageSalary();

    //region Override Methods
    @Override
    public int compareTo(BaseWorker o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", name, averageSalary());
    }
    //endregion
}

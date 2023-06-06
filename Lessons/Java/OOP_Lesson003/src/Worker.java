public class Worker {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String fullName() {
        return String.format("\n%s %d %d", name, age, salary);
    }
    @Override
    public String toString() {
        return String.format("\n%s %d %d", name, age, salary);
    }
}

public class Teacher extends Human implements PlaceOfLiving{
    String city;
    public Teacher(String name, String lastName, int age, String city) {
        super(name, lastName, age);
        this.city = city;
    }

    @Override
    protected void tellInfo() {
        System.out.println("Привет! Меня зовут " + name + " " + lastName + ". Мне " + age +
                ". И я учитель");
    }

    @Override
    public String getPlaceOfLiving() {
        return city;
    }
}

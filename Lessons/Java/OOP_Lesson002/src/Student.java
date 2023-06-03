public class Student extends Human implements AdditionalWork, PlaceOfLiving{
    private boolean job;
    private String city;
    public Student(String name, String lastName, int age, boolean job, String city) {
        super(name, lastName, age);
        this.job = job;
        this.city = city;
    }

    @Override
    public void tellInfo() {

        System.out.println("Привет! Меня зовут " + name + " " + lastName + ". Мне " + age +
        ". И я ученик");
    }

    @Override
    public boolean isWorking() {
        return job;
    }

    @Override
    public String getPlaceOfLiving() {
        return city;
    }
}

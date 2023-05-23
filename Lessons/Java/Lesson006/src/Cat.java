import java.util.List;

public class Cat {
    /*
    1. Продумайте структоуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю.Д.Куклачева
    Можно записать в текстовом виде, не обязательно реализовывать в Java
    */
    private String name;
    private String poroda;
    private int age;
    private String owner;
    private List<String> healthHistory;

    public Cat(String name, String poroda, int age, String owner) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name + ", poroda: " + poroda + ", age: " + age + ", owner: " + owner;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && poroda.equals(cat.poroda) && age == cat.age && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 11*poroda.hashCode() + 17*owner.hashCode();
    }
}

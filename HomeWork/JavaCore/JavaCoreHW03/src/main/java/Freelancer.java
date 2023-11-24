public class Freelancer extends BaseWorker{

    private Freelancer(String name, double salary) {
        super(name, salary);
    }

    public static Freelancer create(String name, double payment){
        if(name == null || name.equals("")){
            throw new RuntimeException("Отсутствует имя");
        }
        if((payment == 0 || name.isEmpty())){
            throw new RuntimeException(("Не введена зарплата"));
        }
        return new Freelancer(name, payment);
    }
    @Override
    double averageSalary() {
        return (20.8 * 8 * salary);
    }
}

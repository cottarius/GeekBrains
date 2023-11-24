public class Worker extends BaseWorker{

    private Worker(String name, double payment) {
        super(name, payment);
    }
    public static Worker create(String name, double payment){
        if(name == null || name.equals("")){
            throw new RuntimeException("Отсутствует имя");
        }
        if((payment == 0 || name.isEmpty())){
            throw new RuntimeException(("Не введена зарплата"));
        }
        return new Worker(name, payment);
    }

    @Override
    double averageSalary() {
        return salary;
    }
}

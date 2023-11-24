import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BaseWorker worker1 = Worker.create("Ivanov", 25000);
        BaseWorker worker2 = Worker.create("Petrov", 27500);
        BaseWorker worker3 = Worker.create("Abasov", 28900);
        BaseWorker worker4 = Worker.create("Sidorov", 24750);
        BaseWorker worker5 = Freelancer.create("Provorov", 100);
        BaseWorker worker6 = Freelancer.create("Isaev", 110);
        BaseWorker worker7 = Freelancer.create("Govorov", 95);
        BaseWorker worker8 = Freelancer.create("Tarasov", 104);

        List<BaseWorker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);
        workers.add(worker6);
        workers.add(worker7);
        workers.add(worker8);

        System.out.print("Вывод списка сотрудников без сортировки:\n" + workers);

        System.out.println("\n");



        System.out.println("Список, отсортированный с помощью интерфейса comparable по полю [name]:");
        Collections.sort(workers);
        for (BaseWorker worker : workers) {
            System.out.println(worker);
        };

        System.out.println();

        Personal personal = new Personal(workers);

        System.out.println("Список, выведенный с помощью интерфейса Iterable:");
        for (BaseWorker baseWorker : personal) {
            System.out.println(baseWorker);
        }

    }
}

import models.Coffee;
import models.Tea;
import service.CoffeeVendingMachine;
import service.CoffeeVendingMachineImpl;
import service.TeaVendingMachine;
import service.TeaVendingMachineImpl;

import java.util.ArrayList;
import java.util.List;

public class OOP_Seminar007{
    public static void main(String[] args) {
        CoffeeVendingMachine coffeeVendingMachine = new CoffeeVendingMachineImpl();
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee(60, 40, 0, true, "Nescafe", "arabica"));
        coffeeVendingMachine.loadSomething(coffees);
        coffeeVendingMachine.sell(0);
        coffeeVendingMachine.sell(5);

        TeaVendingMachine teaVendingMachine = new TeaVendingMachineImpl();
        List<Tea> teas = new ArrayList<>();
        teas.add(new Tea(70, 35, 0, true, false, "India"));
        teaVendingMachine.loadSomething(teas);
        teaVendingMachine.sell(0);
        teaVendingMachine.sell(1);
    }


}

package service;

import models.Coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CoffeeVendingMachineImpl implements CoffeeVendingMachine{
    Logger logger = Logger.getAnonymousLogger();
    private List<Coffee> coffees = new ArrayList<>();
//    @Override
//    public void roast() {
//
//    }

    @Override
    public void sell(int id) {
        if(id < coffees.size()) {
            logger.info(String.valueOf(id));
            logger.info("selling this coffee...");
            coffees.remove(id);
            logger.info("drink had been sold!");
        } else {
            logger.warning("no such id!");
        }
    }

    @Override
    public void loadSomething(List<Coffee> drinks) {
        logger.info(drinks.toString());
        logger.info("these drinks are been loaded! ");
        coffees.addAll(drinks);
    }

    @Override
    public String toString() {
        return "CoffeeVendingMachineImpl{" +
                "coffees=" + coffees +
                '}';
    }
}

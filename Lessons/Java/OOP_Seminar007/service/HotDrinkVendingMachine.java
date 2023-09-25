package service;

import models.HotDrink;

import java.util.List;
public interface HotDrinkVendingMachine<T extends HotDrink> {
    void sell(int id);
    void loadSomething(List<T> drinks);
}

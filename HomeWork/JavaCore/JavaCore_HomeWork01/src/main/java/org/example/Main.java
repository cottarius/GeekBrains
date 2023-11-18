package org.example;

import model.Model;
import view.View;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Model model = new Model(5, 7);
        View view = new View();
        int result = model.multiply();
        view.print(result);
        result = model.substruction();
        view.print(result);
        result = model.addition();
        view.print(result);
        result = model.division();
        view.print(result);

    }
}
package controller;

import complex.model.*;
import complex.service.*;
import view.View;

import java.util.InputMismatchException;

public class Controller {
    View view;

    public Controller(View view) {
        this.view = view;
    }

    public void buttonClick() {
        try {
            Complex c1 = new Complex(view.inputValue("Re: "), view.inputValue("Im: "));
            char operation = view.inputOperationSign("Operation Sign: ");
            Complex c2 = new Complex(view.inputValue("Re: "), view.inputValue("Im: "));
            switch (operation) {
                case '+' -> {
                    ComplexOperation complexOperation = new ComplexAddition();
                    Complex result = complexOperation.mathOperation(c1, c2);
                    complexOperation.print(result);
                }
                case '-' -> {
                    ComplexOperation complexOperation = new ComplexSubstraction();
                    Complex result = complexOperation.mathOperation(c1, c2);
                    complexOperation.print(result);
                }
                case '*' -> {
                    ComplexOperation complexOperation = new ComplexMultiplication();
                    Complex result = complexOperation.mathOperation(c1, c2);
                    complexOperation.print(result);
                }
                case '/' -> {
                    ComplexOperation complexOperation = new ComplexDivision();
                    Complex result = complexOperation.mathOperation(c1, c2);
                    complexOperation.print(result);
                }
                default -> throw new IllegalStateException("Unexpected value: " + operation);
            }
        }
        catch (InputMismatchException ex){
            System.out.println("Введены некорректные данные!");
            System.out.println(ex.getMessage());
        }
    }
}

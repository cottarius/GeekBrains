package controller;

import complex.model.*;
import complex.service.*;
import view.View;

public class Controller {
    View view;


    public Controller(View view) {
        this.view = view;
    }
    public void buttonClick(){
        Complex c1 = new Complex(view.getValue("Re: "), view.getValue("Im: "));
        char operation = view.getOperationSign("Operation Sign: ");
        Complex c2 = new Complex(view.getValue("Re: "), view.getValue("Im: "));
        switch (operation){
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
}

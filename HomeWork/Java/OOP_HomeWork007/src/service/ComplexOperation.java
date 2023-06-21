package service;

import model.complex.Complex;

public interface ComplexOperation {
    Complex mathOperation(Complex c1, Complex c2);
    void print(Complex complex);
}

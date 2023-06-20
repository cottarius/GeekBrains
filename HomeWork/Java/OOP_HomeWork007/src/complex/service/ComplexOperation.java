package complex.service;

import complex.model.Complex;

public interface ComplexOperation {
    Complex mathOperation(Complex c1, Complex c2);
    public void print(Complex complex);
}

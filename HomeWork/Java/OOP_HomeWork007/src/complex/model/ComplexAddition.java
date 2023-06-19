package complex.model;

public class ComplexAddition implements ComplexOperation {
    @Override
    public Complex mathOperation(Complex c1, Complex c2) {
        Complex temp = new Complex(0, 0);
        temp.setRe(c1.getRe() + c2.getRe());
        temp.setIm(c1.getIm() + c2.getIm());
        return temp;
    }

    public void print(Complex complex) {
        System.out.printf("Re: %s; Im: %s", complex.getRe(), complex.getIm());
    }
}

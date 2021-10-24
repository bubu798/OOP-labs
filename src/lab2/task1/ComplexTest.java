package lab2.task1;

public class ComplexTest {
    public static void main(String[] args) {
        Complex nrcomplex1 = new Complex(0, -1);
        Complex nrcomplex2 = new Complex(2, 1);
        Complex nrcomplex3 = new Complex(0, 1);
        Complex nrcomplex4 = new Complex(1, 0);
        Complex nrcomplex5 = new Complex(-1, -1);
        Complex nrcomplex6 = new Complex(1, 1);
        nrcomplex1.showNumber();
        nrcomplex2.showNumber();
        nrcomplex3.showNumber();
        nrcomplex4.showNumber();
        nrcomplex5.showNumber();
        nrcomplex6.showNumber();
        nrcomplex1.addWithComplex(nrcomplex2);
        nrcomplex1.showNumber();
    }
}

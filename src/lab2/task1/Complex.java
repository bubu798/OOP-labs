package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }


    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex() {
        this(0, 0);
    }
    public Complex(Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }
    void addWithComplex(Complex nr) {
        this.real += nr.real;
        this.imaginary += nr.imaginary;
    }
    void showNumber() {
        if (this.imaginary == 0) {
            System.out.println(this.real);
        } else if (this.imaginary == 1 && this.real == 0){
            System.out.println("i");
        } else if (this.imaginary == 1){
            System.out.println(this.real + " + i");
        } else if (this.imaginary == -1 && this.real == 0){
            System.out.println("-i");
        }else if (this.imaginary == -1){
            System.out.println(this.real + " - i");
        } else if (this.real == 0) {
            System.out.println(this.imaginary + "i");
        } else if (this.imaginary > 0) {
            System.out.println(this.real + " + " + this.imaginary + "i");
        } else if (this.imaginary < 0) {
            System.out.println(this.real + " - " + Math.abs(this.imaginary) + "i");
        }
    }
}

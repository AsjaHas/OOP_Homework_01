package Task3;

public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        // No need to do this because default values are set to 0
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(final int real, final int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int Re() {
        return this.real;
    }

    public int Im() {
        return this.imaginary;
    }

    public Complex add(Complex z1) {
        return new Complex(this.real + z1.Re(), this.imaginary + z1.Im());
    }

    public Complex sub(Complex z1) {
        return new Complex(this.real - z1.Re(), this.imaginary - z1.Im());
    }

    public void printComplex() {
        if (this.real != 0 && this.imaginary == 0) {
            System.out.println(this.real);
            return;
        }

        if (this.real == 0 && this.imaginary != 0) {
            System.out.println(this.imaginary + "i");
            return;
        }
//      this.imaginary ==0
        if (this.real == 0) {
            System.out.println(0);
            return;
        }
//      this.real!=0 && this.imaginary!=0
//      if for negative b so it doesn't print out a+-bi
        if (this.imaginary > 0) {
            System.out.println(this.real + "+" + this.imaginary + "i");
        } else {
            System.out.println(this.real + "" + this.imaginary + "i");
        }

    }
}

package org.AsjaHas.qamp.oop.homework1.Task3;

public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this(0, 0);
//        this.real = 0;
//        this.imaginary = 0;
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

    public Complex add(final Complex z1) {
        return new Complex(this.real + z1.Re(), this.imaginary + z1.Im());
    }

    public Complex sub(final Complex z1) {
        return new Complex(this.real - z1.Re(), this.imaginary - z1.Im());
    }

    public void printComplex() {
        if (this.real != 0 && this.imaginary == 0) {
            System.out.println(this.real);
        } else if (this.real == 0 && this.imaginary != 0) {
            System.out.println(this.imaginary + "i");
        } else if (this.real == 0) {
            System.out.println(0);
        } else {
            if (this.imaginary > 0) {
                System.out.println(this.real + "+" + this.imaginary + "i");
            } else {
                System.out.println(this.real + "" + this.imaginary + "i");
            }
        }
    }
}

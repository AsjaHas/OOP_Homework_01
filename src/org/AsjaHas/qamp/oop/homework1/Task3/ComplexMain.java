package org.AsjaHas.qamp.oop.homework1.Task3;

public class ComplexMain {
    public static void main(String[] args) {
        final Complex z = new Complex(2, -3);
        System.out.println(z.Re());
        System.out.println(z.Im());
        final Complex z1 = new Complex(2, 1);
        final Complex z2 = z.add(z1);
        z2.printComplex();
        final Complex z3 = z.sub(z1);
        z3.printComplex();
    }
}

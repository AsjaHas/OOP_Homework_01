package org.AsjaHas.qamp.oop.homework1.Task2;

public class RectangleMain {
    public static void main(String[] args) {
        final Rectangle rectangle = new Rectangle(2, 3);
        final Rectangle rectangle1 = new Rectangle(3, 3);

        printRectangle(rectangle);
        printRectangle(rectangle1);

        rectangle.setA(4);
        printRectangle(rectangle);
    }

    private static void printRectangle(Rectangle rectangle) {
        String rectangleOrSquare = "rectangle";

        if (rectangle.isSquare()) {
            rectangleOrSquare = "square";
            System.out.println("This is a " + rectangleOrSquare + " with side a = " + rectangle.getA() + ".");

        } else {
            System.out.println("This is a " + rectangleOrSquare + " with side a = " + rectangle.getA() + " , and side b = " + rectangle.getB() + ".");
        }
        System.out.println("The circumference of this " + rectangleOrSquare + " is " + rectangle.getCircumference() + ".");
        System.out.println("The area of this " + rectangleOrSquare + " is " + rectangle.getArea() + "." + "\n");
    }
}




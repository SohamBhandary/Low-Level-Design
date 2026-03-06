/*
OCP - Open Closed Principle

Definition:
A class should be open for extension
but closed for modification.

Meaning:
We should be able to add new behavior
without changing existing code.
*/

// Base class
abstract class Shape {

    // Each shape will implement its own area logic
    abstract double calculateArea();
}


// Rectangle implementation
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}


// Circle implementation
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class OCP {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());

        /*
        If we want to add Triangle later,
        we simply create a new class.

        We DO NOT modify existing classes.
        */
    }
}
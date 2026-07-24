package mypackage;

interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

public class ShapeAreaCalculator {

    public static void main(String[] args) {

        Circle c = new Circle(5);

        System.out.println("Area of Circle = " + c.area());
    }
}

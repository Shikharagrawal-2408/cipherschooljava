//inheritance


abstract class Shape {
    abstract double calculateArea();
    
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    double radius;
    
    Circle(double r) {
        radius = r;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape implements Drawable {
    double length, breadth;
    
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    
    @Override
    double calculateArea() {
        return length * breadth;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class ques11 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.displayShape();
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        System.out.println();

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.displayShape();
        rectangle.draw();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

// Abstract class: Shape
abstract class Shape {
    // Abstract method
    public abstract void draw();
}

// Subclass: Circle extends Shape
class Circle extends Shape {
    // Override the draw method for Circle
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass: Rectangle extends Shape
class Rectangle extends Shape {
    // Override the draw method for Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to demonstrate dynamic method dispatch
public class DrawShape {
    public static void main(String[] args) {
        // Declare a Shape reference, but assign a Circle object to it
        Shape shape;

        // Dynamic method dispatch: Shape reference points to a Circle object
        shape = new Circle();
        shape.draw();  // Calls the draw method of Circle

        // Dynamic method dispatch: Shape reference points to a Rectangle object
        shape = new Rectangle();
        shape.draw();  // Calls the draw method of Rectangle
    }
}

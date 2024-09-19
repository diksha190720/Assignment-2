// Base class: Shape
class Shape {
    // Field for shape type
    protected String shapeType;

    // Constructor for Shape
    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    // Method to display the type of shape
    public void displayShapeType() {
        System.out.println("Shape Type: " + shapeType);
    }
}

// Subclass: Circle extends Shape
class Circle extends Shape {
    // Field for radius
    protected double radius;

    // Constructor for Circle
    public Circle(double radius) {
        super("Circle"); // Call the constructor of Shape class
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

// Subclass: ColoredCircle extends Circle
class ColoredCircle extends Circle {
    // Field for color
    private String color;

    // Constructor for ColoredCircle
    public ColoredCircle(double radius, String color) {
        super(radius); // Call the constructor of Circle class
        this.color = color;
    }

    // Method to display the color of the circle
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Main class to test multilevel inheritance
public class Circle1 {
    public static void main(String[] args) {
        // Create a ColoredCircle object
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "Red");

        // Display the shape type (from Shape class)
        coloredCircle.displayShapeType();

        // Display the radius (from Circle class)
        coloredCircle.displayRadius();

        // Calculate and display the area (from Circle class)
        double area = coloredCircle.calculateArea();
        System.out.println("Area of the circle: " + area);

        // Display the color (from ColoredCircle class)
        coloredCircle.displayColor();
    }
}

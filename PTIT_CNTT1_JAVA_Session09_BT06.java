import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isSquare() {
        return width == height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class PTIT_CNTT1_JAVA_Session09_BT06 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6));

        double totalArea = 0;

        System.out.println("Ket qua tinh toan hinh hoc:\n");

        int index = 1;
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.printf("%d. Hinh tron (r=%.1f) - Dien tich: %.2f\n\n",
                        index++, c.getRadius(), area);
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                if (r.isSquare()) {
                    System.out.printf("%d. Hinh vuong (canh %.1f) - Dien tich: %.2f\n\n",
                            index++, r.getWidth(), area);
                } else {
                    System.out.printf("%d. Hinh chu nhat (%.1f x %.1f) - Dien tich: %.2f\n\n",
                            index++, r.getWidth(), r.getHeight(), area);
                }
            }
        }

        System.out.printf("=> Tong dien tich cac hinh: %.2f", totalArea);
    }
}

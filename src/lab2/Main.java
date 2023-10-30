package lab2;

// Класс точки на плоскости
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}


class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}


class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон, нельзя добавить больше окружностей.");
        }
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            Circle circle = circles[i];
            Point center = circle.getCenter();
            double radius = circle.getRadius();
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.println("Центр: (" + center.getX() + ", " + center.getY() + ")");
            System.out.println("Радиус: " + radius);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Point center1 = new Point(0, 0);
        Circle circle1 = new Circle(center1, 5);

        Point center2 = new Point(2, 3);
        Circle circle2 = new Circle(center2, 4);

        Tester tester = new Tester(2);
        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.printCircles();
    }
}


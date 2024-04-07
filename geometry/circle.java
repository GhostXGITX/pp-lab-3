package geometry;

public class circle {
    private point center;
    private double radius;

    public circle(point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

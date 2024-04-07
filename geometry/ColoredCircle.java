package geometry;
//import geometry.circle;

public class ColoredCircle extends circle {
    private String color;

    public ColoredCircle(point center, double radius, String color) {
        super(center, radius);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}

import geometry.point;
import geometry.circle;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        
        point center = new point(3.0, 4.0);

        circle circle = new circle(center, 5.0);

        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "blue");

        
        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
   
        circle[] circles = new circle[2];
        circles[0] = circle;
        circles[1] = coloredCircle;

        for (circle c : circles) {
            double area = c.getArea();
            System.out.println("Pole powierzchni koła: " + area);

            if (c instanceof ColoredCircle) {
                String color = ((ColoredCircle) c).getColor();
                System.out.println("Kolor koła: " + color);
   
   
   
    }
}
    }
}

import geometry.point;
import geometry.circle;

public class Main {
    public static void main(String[] args) {
        
        point center = new point(3.0, 4.0);

        
        circle circle = new circle(center, 5.0);

        
        System.out.println("Właściwości koła:");
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}

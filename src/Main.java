import java.lang.Math.*;
public class Main {
    public static void main ( String arg[] ) {
        Circle circle = new Circle(5, 10);
        Rectangle rectangle = new Rectangle(4,5);

        System.out.println ("Площа прямокутника = " + rectangle.getArea () + " cm^2");
        System.out.println ("Периметр прямокутника = " + rectangle.RectanglePerimeter () + " cm" );
        System.out.println ();
        System.out.println ("Площа кола = " + circle.getArea () + " cm^2");
        System.out.println ("Довжина кола = " + Math.round (circle.CircleLength ()) + " cm");
    }
}

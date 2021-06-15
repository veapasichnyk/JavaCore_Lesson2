public class Circle extends Shapes {
    double radius;
    double diameter;
    double length;

    public Circle(double r, double d) {
        radius = r;
        diameter = d;
    }
    public double getArea() {
        area = 3.14*(radius*radius);
        return (area);
    }
    public double CircleLength() {
        length = 3.14*diameter;
        return (length);
    }
}

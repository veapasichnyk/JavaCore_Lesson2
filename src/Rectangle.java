public class Rectangle extends Shapes {
    double length;
    double width;
    double perimeter;

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public double getArea() {
        area = length * width;
        return (area);
    }

    public double RectanglePerimeter () {
        perimeter = 2 * length + 2 * width;
        return (perimeter);
    }
}

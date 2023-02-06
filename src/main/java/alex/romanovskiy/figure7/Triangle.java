package alex.romanovskiy.figure7;

public class Triangle extends Figure {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double a = length(this.a, this.b);
        double b = length(this.b, this.c);
        double c = length(this.c, this.a);

        return area(a, b, c);
    }
    @Override
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString();
    }

    private double length(Point xY1, Point xY2) {
        return Math.sqrt(Math.pow((xY2.getX() - xY1.getX()), 2) + Math.pow((xY2.getY() - xY1.getY()), 2));
    }
}

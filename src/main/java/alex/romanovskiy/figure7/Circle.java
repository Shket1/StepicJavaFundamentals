package alex.romanovskiy.figure7;

public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String pointsToString() {
        return center.toString();
    }

    private double length(Point xY1, Point xY2) {
        return Math.sqrt(Math.pow((xY2.getX() - xY1.getX()), 2) + Math.pow((xY2.getY() - xY1.getY()), 2));
    }
}

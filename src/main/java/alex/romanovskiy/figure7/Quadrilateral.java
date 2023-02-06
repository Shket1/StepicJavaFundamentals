package alex.romanovskiy.figure7;

public class Quadrilateral extends Figure {
    private Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public double area() {
        double ab = length(this.a, this.b);
        double bc = length(this.b, this.c);

        double ca = length(this.c, this.a);

        double ad = length(this.a, this.d);
        double dc = length(this.d, this.c);

        return Math.round((area(ab, bc, ca) + area(ca, ad, dc)) * 100) / 100;
    }
    @Override
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString() + d.toString();
    }

    private double length(Point xY1, Point xY2) {
        return Math.sqrt(Math.pow((xY2.getX() - xY1.getX()), 2) + Math.pow((xY2.getY() - xY1.getY()), 2));
    }
}

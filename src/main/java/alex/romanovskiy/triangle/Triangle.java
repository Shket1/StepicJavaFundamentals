package alex.romanovskiy.triangle;

public class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double length(Point xY1, Point xY2) {
        return Math.sqrt(Math.pow((xY2.getX() - xY1.getX()), 2) + Math.pow((xY2.getY() - xY1.getY()), 2));
    }

    public double area() {
        double a = length(this.a, this.b);
        double b = length(this.b, this.c);
        double c = length(this.c, this.a);
        double p = (a + b + c) / 2;

        if ((a > (b + c)) || (b > (c + a)) || (c > (a + b))) {
            return 0;
        }
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

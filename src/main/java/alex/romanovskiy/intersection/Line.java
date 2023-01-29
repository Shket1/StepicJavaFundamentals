package alex.romanovskiy.intersection;

public class Line {
    int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null;
        } else if (this.b == other.b) {
            return new Point(0, b);
        }
        int x = (other.b - this.b) / (k - other.k);
        int y = k * x + b;
        return new Point(x, y);
    }
}

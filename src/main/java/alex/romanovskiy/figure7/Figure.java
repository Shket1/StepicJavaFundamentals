package alex.romanovskiy.figure7;

import java.math.BigDecimal;

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;

        if ((a > (b + c)) | (b > (c + a)) | (c > (a + b))) {
            return 0;
        }
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

package alex.romanovskiy.triangle;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[6];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }

        Point a = new Point(mas[0], mas[1]);
        Point b = new Point(mas[2], mas[3]);
        Point c = new Point(mas[4], mas[5]);

        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();

        if (result <= 0) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}

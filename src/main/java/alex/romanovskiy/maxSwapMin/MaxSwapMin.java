package alex.romanovskiy.maxSwapMin;

/*
С клавиатуры вводится число n (n >= 2) за ним вводится n действительных чисел.
 Ваша задача - поменять местами максимальный и минимальный элементы.
  после чего выведите на экран массив через пробел.
   Гарантируется, что максимальный и минимальный элементы содержатся в единственном экземпляре.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaxSwapMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] dab = new Double[n];
        double min = 0, max = 0;
        int indmax = 0, indmin = 0;
        for (int i = 0; i < n; i++) {
            double j = sc.nextDouble();
            if (j > max || i == 0) {
                max = j;
                indmax = i;
            }
            if (j < min || i == 0) {
                min = j;
                indmin = i;
            }
            dab[i] = j;
        }
        double ind = dab[indmin];
        dab[indmin] = dab[indmax];
        dab[indmax] = ind;
        Arrays.stream(dab).forEach(e-> System.out.print(e + " "));
    }
}

package alex.romanovskiy;

/*
Вводятся 2 натуральных числа: n и m. Затем вводится двумерный массив размером n*m.
 Определите, есть в ней строка и столбец, произведение элементов которой равно 15.
  Выведите на экран два ответа "YES/NO" построчно.
 */

import java.util.Scanner;

public class RowAndColumn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        boolean is_line = false;
        boolean is_column = false;
        for (int i = 0; i < n; i++) {
            int line = 1;
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                line *= arr[i][j];
            }
            if (line == 15) is_line = true;
        }
        int column = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                column *= arr[j][i];
            }
            if (column == 15) is_column = true;
        }
        System.out.println((is_line) ? "YES" : "NO");
        System.out.println((is_column) ? "YES" : "NO");
    }
}

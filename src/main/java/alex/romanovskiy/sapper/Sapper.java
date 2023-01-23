package alex.romanovskiy.sapper;
/*
Заполните поле для игры Сапёр.

На вход подаются натуральные числа m и n - размеры игрового поля, затем k - количество мин,
 далее координаты мин - x и y для каждой мины, нумерация координат начинается с единицы.

Необходимо вывести на печать игровое поле:

- если в клетке расположена мина, выведите для этой клетки "m" (латиница);

- если в клетке мины нет, нужно посчитать, сколько мин расположено в соседних клетках (включая угловые и боковые),
 и вывести для этой клетки посчитанное число.

Примечание. Каждая строка оканчивается символом (не пробелом!).

Sample Input 1:
3 2
3
1 1
2 2
3 2

Sample Output 1:
m 2
3 m
2 m
 */

import java.util.Scanner;

public class Sapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String line = sc.nextLine();
        int amountMin = sc.nextInt();
        int[][] field = new int[x][y];
        int[][] minCoordinates = new int[amountMin][2];
        for (int i = 0; i < amountMin; i++) {
            if (i == 0) {
                String line1 = sc.nextLine();
            }
            for (int j = 0; j < 2; j++) {
                minCoordinates[i][j] = sc.nextInt() - 1;
            }
            if (i < amountMin - 1) {
                String line2 = sc.nextLine();
            }
        }
        for (int i = 0; i < amountMin; i++) {
            field[minCoordinates[i][0]][minCoordinates[i][1]] = 9;
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] >= 9) {
                    if (i == 0 && j == 0) {
                        field[i][j + 1] += 1;
                        field[i + 1][j + 1] += 1;
                        field[i + 1][j] += 1;
                    }
                    if (i == 0 && j == field[i].length - 1) {
                        field[i][j - 1] += 1;
                        field[i + 1][j - 1] += 1;
                        field[i + 1][j] += 1;
                    }
                    if (i < field.length - 1 && i > 0 && j < field[i].length - 1 && j > 0) {
                        field[i - 1][j - 1] += 1;
                        field[i][j - 1] += 1;
                        field[i + 1][j - 1] += 1;
                        field[i + 1][j] += 1;
                        field[i + 1][j + 1] += 1;
                        field[i][j + 1] += 1;
                        field[i - 1][j + 1] += 1;
                        field[i - 1][j] += 1;
                    }
                    if (i == field.length - 1 && j == 0) {
                        field[i - 1][j] += 1;
                        field[i - 1][j + 1] += 1;
                        field[i][j + 1] += 1;
                    }
                    if (i == field.length - 1 && j == field[i].length - 1) {
                        field[i][j - 1] += 1;
                        field[i - 1][j - 1] += 1;
                        field[i - 1][j] += 1;
                    }
                    if (i == 0 && j > 0 && j < field[i].length - 1) {
                        field[i][j - 1] += 1;
                        field[i + 1][j - 1] += 1;
                        field[i + 1][j] += 1;
                        field[i + 1][j + 1] += 1;
                        field[i][j + 1] += 1;
                    }
                    if (j == 0 && i > 0 && i < field.length - 1) {
                        field[i - 1][j] += 1;
                        field[i - 1][j + 1] += 1;
                        field[i][j + 1] += 1;
                        field[i + 1][j + 1] += 1;
                        field[i + 1][j] += 1;
                    }
                    if (i == field.length - 1 && j > 0 && j < field[i].length - 1) {
                        field[i][j - 1] += 1;
                        field[i - 1][j - 1] += 1;
                        field[i - 1][j] += 1;
                        field[i - 1][j + 1] += 1;
                        field[i][j + 1] += 1;
                    }
                    if (j == field[i].length - 1 && i > 0 && i < field.length - 1) {
                        field[i + 1][j] += 1;
                        field[i + 1][j - 1] += 1;
                        field[i][j - 1] += 1;
                        field[i - 1][j - 1] += 1;
                        field[i - 1][j] += 1;
                    }
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print((field[i][j] >= 9) ? "m" : field[i][j]);
                if (j < field[i].length - 1) {
                    System.out.print(" ");
                }
            }
            if (i < field.length - 1) {
                System.out.println();
            }
        }
    }
}

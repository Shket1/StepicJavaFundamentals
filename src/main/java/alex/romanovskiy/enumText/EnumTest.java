package alex.romanovskiy.enumText;
import java.util.*;

public class EnumTest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();
            System.out.println(Direction.closestToDegrees(d));
        }
    }

    enum Direction {
        N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

        Direction(final int degrees) {
            this.degrees = degrees;
        }

        private int degrees;

        public static Direction closestToDegrees(int degrees) {
            if (degrees > 360) {
                degrees = degrees % 360;

            } if (degrees < 0) {
                degrees = (degrees % 360) + 360;

            } if (degrees >= 293 && degrees <= 337) {
                return NW;

            } else if (degrees >= 338) {
                return N;

            } else {
                int res = 0;
                for (Direction ob : Direction.values()) {
                    res = degrees - ob.degrees;
                    if (res < 23) {
                        return ob;
                    }
                }
            }
            return null;
        }
    }

package alex.romanovskiy.StringsRegexStrBuffStrBuild;

import java.util.*;
import java.util.regex.*;

public class SplitToArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("[ ,.;:?!,]+");
        String[] str = p.split(sc.nextLine());
        System.out.print(Arrays.toString(str));
    }
}

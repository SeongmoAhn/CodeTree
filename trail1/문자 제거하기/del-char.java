import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while (true) {
            str = fun(str, sc.nextInt());
            System.out.println(str);
            if (str.length() == 1) break;
        }
    }

    public static String fun(String str, int idx) {
        if (idx >= str.length()) {
            return str.substring(0, str.length() - 1);
        }
        return str.substring(0, idx) + str.substring(idx + 1);
    }
}
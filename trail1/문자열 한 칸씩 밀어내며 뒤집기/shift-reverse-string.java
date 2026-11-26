import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int Q = sc.nextInt();
        while (Q-- != 0) {
            int type = sc.nextInt();
            if (type == 1) {
                str = one(str);
            } else if (type == 2) {
                str = two(str);
            } else {
                str = three(str);
            }
            System.out.println(str);
        }
    }
    public static String one(String str) {
        return str.substring(1) + str.charAt(0);
    }
    public static String two(String str) {
        return str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
    }
    public static String three(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
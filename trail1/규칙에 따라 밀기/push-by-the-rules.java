import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String oper = sc.next();
        int op = 0;
        for (int i = 0; i < oper.length(); i++) {
            if (oper.charAt(i) == 'L') op--;
            else op++;
        }
        while (op > 0) {
            str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
            op--;
        }
        while (op < 0) {
            str = str.substring(1) + str.charAt(0);
            op++;
        }
        System.out.print(str);
    }
}
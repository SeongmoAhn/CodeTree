import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int N = sc.nextInt();
        while (N-- != 0) {
            str += sc.next();
        }
        int i;
        for (i = 0; i + 5 < str.length(); i += 5) {
            System.out.println(str.substring(i, i + 5));
        }
        if (i < str.length()) {
            System.out.print(str.substring(i, str.length()));
        }
    }
}
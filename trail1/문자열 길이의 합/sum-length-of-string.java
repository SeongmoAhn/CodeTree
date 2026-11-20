import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt1 = 0, cnt2 = 0;
        while (N-- != 0) {
            String str = sc.next();
            cnt1 += str.length();
                if (str.charAt(0) == 'a') cnt2++;
        }
        System.out.printf("%d %d", cnt1, cnt2);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) arr[i] = sc.next();
        char ch = sc.next().charAt(0);
        int cnt = 0, len = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i].charAt(0) == ch) {
                cnt++;
                len += arr[i].length();
            }
        }
        System.out.printf("%d %.2f", cnt, (double)len / cnt);
    }
}
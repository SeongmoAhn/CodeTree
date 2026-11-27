import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int cnt = 0;
        while (N-- != 0) {
            if (str.equals(sc.next()))
                cnt++;
        }
        System.out.print(cnt);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        while (n-- != 0) {
            double s = 0;
            for (int i = 0; i < 4; i++) s += sc.nextDouble();
            s /= 4;
            if (s >= 60) {
                cnt++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
        System.out.print(cnt);
    }
}
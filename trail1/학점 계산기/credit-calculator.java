import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 0;
        for (int i = 0; i < n; i++) {
            s += sc.nextDouble();
        }
        s = s / n;
        System.out.printf("%.1f\n", s);
        System.out.print(s >= 4.0 ? "Perfect" : s >= 3.0 ? "Good" : "Poor");
    }
}
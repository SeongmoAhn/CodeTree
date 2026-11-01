import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = 0;
        for (int i = 0; i < 8; i++) s += sc.nextDouble();
        System.out.printf("%.1f", s / 8.);
    }
}
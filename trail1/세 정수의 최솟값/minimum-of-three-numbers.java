import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 200;
        for (int i = 0; i < 3; i++) {
            int b = sc.nextInt();
            if (b < a) a = b;
        }
        System.out.print(a);
    }
}
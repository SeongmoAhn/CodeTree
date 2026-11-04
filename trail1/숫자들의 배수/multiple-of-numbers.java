import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = n; ; i += n) {
            if (i % 5 == 0) cnt++;System.out.printf("%d ", i);
            if (cnt == 2) return;
            
        }
    }
}
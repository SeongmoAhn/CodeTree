import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[110];
        int s = 0;
        for (int i = 0; i < 110; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                System.out.print(s);
                return;
            }
            s += arr[i];
            if (i > 2) s -= arr[i - 3];
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1, min = 21;
        for (int i = 0; i < 3; i++) {
            int l = sc.next().length();
            if (l > max) max = l;
            if (l < min) min = l;
        }
        System.out.print(max - min);
    }
}
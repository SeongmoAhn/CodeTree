import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("\\.");
        System.out.print(a[1] + "-" + a[2] + "-" + a[0]);
    }
}
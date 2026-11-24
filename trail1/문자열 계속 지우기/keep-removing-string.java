import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next(), B = sc.next();
        int idx;
        while ((idx = A.indexOf(B)) != -1) {
            A = A.substring(0, idx) + A.substring(idx + B.length());
            idx = A.indexOf(B);
        }
        System.out.print(A);
    }
}
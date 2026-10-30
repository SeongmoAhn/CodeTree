import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split(":");
        System.out.print((Integer.parseInt(arr[0]) + 1) + ":" + arr[1]);
    }
}
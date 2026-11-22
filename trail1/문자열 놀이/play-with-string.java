import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int T = sc.nextInt();
        while (T-- != 0) {
            if (sc.nextInt() == 1) {
                type1(arr, sc.nextInt(), sc.nextInt());
            } else {
                type2(arr, sc.next().charAt(0), sc.next().charAt(0));
            }
            System.out.println(String.valueOf(arr));
        }
    }

    public static void type1(char[] arr, int a, int b) {
        char temp = arr[a - 1];
        arr[a - 1] = arr[b - 1];
        arr[b - 1] = temp;
    }

    public static void type2(char[] arr, char x, char y) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) arr[i] = y;
        }
    }
}
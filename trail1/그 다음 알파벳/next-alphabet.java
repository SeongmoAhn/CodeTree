import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) sc.next().charAt(0) + 1;
        if (a == (int) 'z' + 1) a = 'a';
        System.out.print((char) a);
    }
}
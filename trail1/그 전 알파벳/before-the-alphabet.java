import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = (char) ((int) sc.next().charAt(0) - 1);
        if (c == 'a' - 1) c = 'z';
        System.out.print(c);
    }
}
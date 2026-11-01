import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10; i++) str.append(sc.next().charAt(0));
        System.out.print(str.reverse().toString());
    }
}
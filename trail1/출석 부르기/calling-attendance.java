import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a == 1 ? "John" : a == 2 ? "Tom" : a == 3 ? "Paul" : "Vacancy");
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String str;
        if (ch == 'S') str = "Superior";
        else if (ch == 'A') str = "Excellent";
        else if (ch == 'B') str = "Good";
        else if (ch == 'C') str = "Usually";
        else if (ch == 'D') str = "Effort";
        else str = "Failure";
        System.out.print(str);
    }
}
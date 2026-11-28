import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int ko, en, ma;
    public Student(String name, int ko, int en, int ma) {
        this.name = name; this.ko = ko; this.en = en; this.ma = ma;
    }

    @Override
    public int compareTo(Student stu) {
        if (this.ko == stu.ko) {
            if (this.en == stu.en) {
                return stu.ma - this.ma;
            }
            return stu.en - this.en;
        }
        return stu.ko - this.ko;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] students = new Student[N];
        for (int i = 0; i < N; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(students);
        for(Student stu : students) {
            System.out.printf("%s %d %d %d\n", stu.name, stu.ko, stu.en, stu.ma);
        }
    }
}
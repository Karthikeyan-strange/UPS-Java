import java.util.Scanner;
class Student {
    int id;
    String name;
    int age;
    Student(int id) {
        this.id = id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name for Student " + id + ": ");
        this.name = sc.nextLine();
        System.out.println("Enter Age for Student " + id + ": ");
        this.age = sc.nextInt();
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class obj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Student s = new Student(i);
            s.display();
        }
    }
}
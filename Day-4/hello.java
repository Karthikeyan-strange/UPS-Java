import java.util.Scanner;
class Stud{
    int rollno;
    String name;
    float marks;
    void getData(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        rollno = sc.nextInt();
        System.out.println("Enter Name: ");
        name = sc.next();
        System.out.println("Enter Marks: ");
        marks = sc.nextFloat();
    }
    void displayData(){
        System.out.println("Roll No: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}
class hello{
    public static void main(String args[]){
        Stud s1=new Stud();
        s1.getData();
        s1.displayData();
        Stud s2=new Stud();
        s2.getData();
        s2.displayData();
        Stud s3=new Stud();
        s3.getData();
        s3.displayData();
    }
}
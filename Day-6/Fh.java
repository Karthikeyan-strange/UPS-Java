import java.io.FileWriter;
import java.util.Scanner;

class Fh{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of student:");
        int n=sc.nextInt();
        try{
            FileWriter fw = new FileWriter("Data.txt",true);
            for(int x=0;x<n;x++){
            
            System.out.println("Enter the Student name:");
            String name=sc.next();
            fw.write("Student name:"+name+" ");
            System.out.println("Enter the rollno:");
            int rollno=sc.nextInt();
            fw.write("Student Roll No:"+rollno+" ");
            System.out.println("Enter the grade:");
            char grade=sc.next().charAt(0);
            fw.write("Student Class:"+grade+"\n");}
            fw.close();
            System.out.println("Data written to file successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
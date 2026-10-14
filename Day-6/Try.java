import java.util.Scanner;

class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide:");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        try {
            if(b==0){
            throw new ArithmeticException("Custom Exception: Division by zero is not allowed.");}
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        } finally {
            System.out.println("This block is executed always.");
        }
        sc.close();
    }
}
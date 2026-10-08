import java.util.Scanner;
class doloop{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);        
    //     int st=sc.nextInt();
    //     int end=sc.nextInt();
    //     int sum=0;
    //     do{
    //         sum+=st;
    //         st++;
    //     }while(st<=end);
    //     System.out.println(sum);
    // }

    // int num=sc.nextInt();
    // int fact=1;
    // do{
    //     fact*=num;
    //     num--;
    // }while(num>=1);
    // System.out.println(fact);
    System.out.println("Enter a number to count its digits:");
    int num=sc.nextInt();
    int digit_count=0;
    do{
        digit_count++;
        num/=10;
    }while(num>0);
    System.out.println(digit_count);
    }
}
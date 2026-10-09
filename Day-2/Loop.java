import java.util.Scanner;
class Loop{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int st=sc.nextInt();
        int end=sc.nextInt();
        if(st%2==1){
            st=st+1;
        }
        while(st<=end){
            System.out.println(st);
            st+=2;
        }






    }
}
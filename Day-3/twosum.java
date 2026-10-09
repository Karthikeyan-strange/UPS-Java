import java.util.Scanner;
class Twosum{
    public static void getarr(int res[]){
        Scanner sc=new Scanner(System.in);
        for(int x=0;x<res.length;x++){
            res[x]=sc.nextInt();
        }
    }
    public static int finder(int res[],int target){
        for(int x=0;x<res.length;x++){
            for(int y=x+1;y<res.length;y++){
                if(res[x]+res[y]==target){
                    System.out.println(x + " " + y);
                    return 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int res[]=new int[size];
        getarr(res);
        int target=sc.nextInt();
        finder(res, target);


    }

}
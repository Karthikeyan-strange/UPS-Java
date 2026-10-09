import java.util.Scanner;
class Charr{
    public static void getarr(char arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the first array:");
        char arr[]=new char[size];
        getarr(arr);
        System.out.println("Enter the elements of the second array:");  
        char arr1[]=new char[size];
        getarr(arr1);
        System.out.println("The elements of the array are:");
        char res[]=new char[arr.length+arr1.length];
        for(int x=0;x<res.length;x++){
            if(x<arr.length){
                res[x]=arr[x];
            }
            else{
                res[x]=arr1[x-arr.length];
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
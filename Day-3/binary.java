import java.util.Scanner;
class binary{
    public static void getarr(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void linearsearch(int arr[],int target){
        for(int x=0;x<arr.length;x++){
            if(arr[x]==target){
                System.out.println("Element found at index: "+x);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        getarr(arr);
        System.out.println("Enter the element to search:");
        int target=sc.nextInt();
        linearsearch(arr, target);
    }

}
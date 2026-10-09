import java.util.Scanner;

class Twoarr {

    public static void getarr(int[][] arr, Scanner sc) {
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] addMatrices(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int column = arr1[0].length;

        int[][] sum = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[row][column];

        System.out.println("Enter the first matrix:");
        getarr(arr1, sc);

        System.out.println("Enter the second matrix:");
        getarr(arr2, sc);

        int[][] result = addMatrices(arr1, arr2);

        System.out.println("The sum of the matrices is:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

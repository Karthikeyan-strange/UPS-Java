import java.util.Scanner;

class Minmax {

    public static int maxi(int res[]) {
        int fmax = res[0];

        for (int i = 1; i < res.length; i++) {
            if (res[i] > fmax) {
                fmax = res[i];
            }
        }
        return fmax;
    }

    public static int mini(int res[]) {
        int fmin = res[0];

        for (int i = 1; i < res.length; i++) {
            if (res[i] < fmin) {
                fmin = res[i];
            }
        }
        return fmin;
    }

    public static int smax(int res[], int fmax) {
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < res.length; i++) {
            if (res[i] > smax && res[i] < fmax) {
                smax = res[i];
            }
        }
        return smax;
    }

    public static int smin(int res[], int fmin) {
        int smin = Integer.MAX_VALUE;

        for (int i = 0; i < res.length; i++) {
            if (res[i] < smin && res[i] > fmin) {
                smin = res[i];
            }
        }
        return smin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int res[] = new int[size];
        System.out.println("Enter the values:");
        for (int i = 0; i < res.length; i++) {
            res[i] = sc.nextInt();
        }
        int fmax = maxi(res);
        int fmin = mini(res);
        int secondMax = smax(res, fmax);
        int secondMin = smin(res, fmin);
        System.out.println("First max: " + fmax);
        System.out.println("First min: " + fmin);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second max: Not found");
        } else {
            System.out.println("Second max: " + secondMax);
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Second min: Not found");
        } else {
            System.out.println("Second min: " + secondMin);
        }

        sc.close();
    }
}

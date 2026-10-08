import java.util.Scanner;

class D2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.println("\nEnter the music director code:");
            System.out.println("1 -> Anirudh");
            System.out.println("2 -> Yuvan");
            System.out.println("3 -> Sai Abhyankar");
            System.out.println("4 -> Sam CS");

            int code = sc.nextInt();

            switch (code) {

                case 1:
                    System.out.println("Which type of Anirudh song:");
                    System.out.println("1 -> Melody");
                    System.out.println("2 -> Vibe");
                    System.out.println("3 -> Breakup");
                    System.out.println("4 -> Motivation");

                    int type = sc.nextInt();

                    if (type == 1)
                        System.out.println("Play melody song");
                    else if (type == 2)
                        System.out.println("Play vibe song");
                    else if (type == 3)
                        System.out.println("Play breakup song");
                    else if (type == 4)
                        System.out.println("Play motivation song");
                    else
                        System.out.println("Wrong song type");

                    break;

                case 2:
                    System.out.println("Which type of Yuvan song:");
                    System.out.println("1 -> Melody");
                    System.out.println("2 -> Vibe");
                    System.out.println("3 -> Breakup");
                    System.out.println("4 -> Motivation");

                    int type1 = sc.nextInt();

                    if (type1 == 1)
                        System.out.println("Play melody song");
                    else if (type1 == 2)
                        System.out.println("Play vibe song");
                    else if (type1 == 3)
                        System.out.println("Play breakup song");
                    else if (type1 == 4)
                        System.out.println("Play motivation song");
                    else
                        System.out.println("Wrong song type");

                    break;

                case 3:
                    System.out.println("Which type of Sai song:");
                    System.out.println("1 -> Melody");
                    System.out.println("2 -> Vibe");
                    System.out.println("3 -> Breakup");
                    System.out.println("4 -> Motivation");

                    int type2 = sc.nextInt();

                    if (type2 == 1)
                        System.out.println("Play melody song");
                    else if (type2 == 2)
                        System.out.println("Play vibe song");
                    else if (type2 == 3)
                        System.out.println("Play breakup song");
                    else if (type2 == 4)
                        System.out.println("Play motivation song");
                    else
                        System.out.println("Wrong song type");

                    break;

                case 4:
                    System.out.println("Which type of Sam song:");
                    System.out.println("1 -> Melody");
                    System.out.println("2 -> Vibe");
                    System.out.println("3 -> Breakup");
                    System.out.println("4 -> Motivation");

                    int type3 = sc.nextInt();

                    if (type3 == 1)
                        System.out.println("Play melody song");
                    else if (type3 == 2)
                        System.out.println("Play vibe song");
                    else if (type3 == 3)
                        System.out.println("Play breakup song");
                    else if (type3 == 4)
                        System.out.println("Play motivation song");
                    else
                        System.out.println("Wrong song type");

                    break;

                default:
                    System.out.println("Wrong code");
            }

            System.out.println("\nDo you want to continue? (Y/N)");
            again = sc.next().charAt(0);

        } while (again == 'Y' || again == 'y');

        System.out.println("Program stopped. Thank you!");
        sc.close();
    }
}
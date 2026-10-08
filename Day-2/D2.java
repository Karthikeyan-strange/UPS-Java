
import java.util.Scanner;

class D2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the music director code:");
        System.out.println("1-> Anirudh");
        System.out.println("2-> Yuvan");
        System.out.println("3-> Sai abyankar");
        System.out.println("4-> Sam CS");
        int code=sc.nextInt();
        switch(code){
            case 1:
                System.out.println("Which type of  Anirudh song :");
                System.out.println("Melody 1-Vibe 2-Breakup 3-Motivation 4");
                String type=sc.next();
                if(type.equals("Melody")){ System.out.println("Play melody song");}
                else if(type.equals("Vibe")){ System.out.println("Play vibe song");}
                else if(type.equals("Breakup")){System.out.println("Play breakup song");}
                else {System.out.println("Play Motivation song");}
                break;
            case 2:
                System.out.println("Which type of  Yuvan song :");
                System.out.println("Melody 1-Vibe 2-Breakup 3-Motivation 4");
                int type1=sc.nextInt();
                if(type1==1){ System.out.println("Play melody song");}
                else if(type1==2){ System.out.println("Play vibe song");}
                else if(type1==3){System.out.println("Play breakup song");}
                else {System.out.println("Play Motivation song");}
                break;
            case 3:
                System.out.println("Which type of  Sai song :");
                System.out.println("Melody 1-Vibe 2-Breakup 3-Motivation 4");
                int type2=sc.nextInt();
                if(type2==1){ System.out.println("Play melody song");}
                else if(type2==2){ System.out.println("Play vibe song");}
                else if(type2==3){System.out.println("Play breakup song");}
                else {System.out.println("Play Motivation song");}
                break;
            case 4:
                System.out.println("Which type of  Sam song :");
                System.out.println("Melody 1-Vibe 2-Breakup 3-Motivation 4");
                int type3=sc.nextInt();
                if(type3==1){ System.out.println("Play melody song");}
                else if(type3==2){ System.out.println("Play vibe song");}
                else if(type3==3){System.out.println("Play breakup song");}
                else {System.out.println("Play Motivation song");}
                break;

            default:
                System.out.println("Wrong code");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        int P = scn.nextInt();
        System.out.print("Enter Rate : ");
        int R = scn.nextInt();
        System.out.print("Enter Time : ");
        int T = scn.nextInt();
        System.out.print("Simple Interest = ");
        SimpleInterest(P, R, T);
    }

    public static void SimpleInterest(int P, int R, int T){
        int SI = (P*R*T)/100;
        System.out.print(SI);
    }
}

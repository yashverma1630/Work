import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter car name : ");
        String car = scn.nextLine();

        String s = (car.equals("i10"))?"car is i10":"it is not i10";

        System.out.print(s);
    }
}

import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scn.nextInt();
        int result = SumofDigits(number);
        System.out.print("The Sum of Digits in Number = "+ result);
    }
    public static int SumofDigits(int number){
        int sum = 0;
        while (number>0){
            sum += (number%10);
            number = number/10;
        }
        return sum;
    }
}
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input first number : ");
        double x = scn.nextDouble();

        System.out.print("Input second number : ");
        double y = scn.nextDouble();

        System.out.print("Input third number : ");
        double z = scn.nextDouble();

        System.out.print(smallest(x,y,z));
    }

    public static double smallest(double x, double y, double z){
        return Math.min(Math.min(x,y),z);
    }
}

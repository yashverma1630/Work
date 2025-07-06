import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Double a[] = new Double[n];

        for(int i=0; i<n; i++){
            a[i]=scn.nextDouble();
        }

        System.out.print(average(n,a));
    }

    public static double average(int n, Double a[]){
        double sum=0;

        for(int i=0 ;i<n; i++){
            sum+=a[i];
        }
        return (sum/n);
    }
}

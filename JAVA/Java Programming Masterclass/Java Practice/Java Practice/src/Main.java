/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String initial = Integer.toString(n);

        String rev="";


        while(n>0){
            rev+= Integer.toString(n%10);
            n/=10;
        }

        if(initial.equals(rev)){
            System.out.println("yes");
        }

	    else{
            System.out.println("No");
        }

    }
}
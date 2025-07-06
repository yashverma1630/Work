import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        System.out.print(middle(s));
    }

    public static String middle(String s){
        int position;
        if(s.length()%2!=0){
            position = s.length()/2;
            return(s.substring(position,position+1));//s.substring(int beginning index, int ending index);
            //it will return number at position but it will not include the ending index
        }

        else{
            return ("You cannot find the middle character because the length of string is even");
        }
    }
}

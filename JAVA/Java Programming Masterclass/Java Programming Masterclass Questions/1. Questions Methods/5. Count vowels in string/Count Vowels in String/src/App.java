import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int c = CountVowelsInString(str);
        System.out.print(c);
    }
    public static int CountVowelsInString(String str){
        int count = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}

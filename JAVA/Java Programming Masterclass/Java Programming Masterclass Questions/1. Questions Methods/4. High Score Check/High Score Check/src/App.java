import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scn.nextLine();
        System.out.print("Enter Highscore: ");
        int highscore = scn.nextInt();
        int position = position(highscore);
        display(name, position);
    }

    public static void display(String name, int position){
        System.out.print(name + " managed to get into position "+position+" on the high score list");
    }

    public static int position(int highscore){
        int position = 4;
        if(highscore>=1000){
            position = 1;
        }

        else if(highscore>=500){
            position = 2;
        }

        else if(highscore>=100){
            position = 3;
        }

        return(position);
    }
}

import java.util.*;
public class App {
    public static void main(String[] args){
        int newscore = CalculateScore("Yash", 200);
        System.out.println("NewScore is " + newscore);

        double aanyanewscore = CalculateScore(200);
        System.out.println("her new Score is "+ aanyanewscore);
    }

    public static int CalculateScore(String name, int score){
        System.out.println("Student name is "+ name + " and his score is "+ score);
        return (score*100);
    }

    public static double CalculateScore(double score){
        System.out.println("Student name is Aanya and her score is " + score);
        return (Math.pow(score,2));
    }
}

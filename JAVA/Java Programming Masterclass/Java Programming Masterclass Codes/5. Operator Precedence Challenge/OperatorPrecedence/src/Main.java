public class Main {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80.00d;
        double result = (a+b)*100.00d;
        System.out.println("The result is equals to "+result);
        double remainder = result%40.00d;
        System.out.println("The remainder is equals to "+remainder);
        boolean isremainder = (remainder==0)? true:false;
        System.out.println("remainder is equal to zero, true or false ? "+isremainder);
        String s = (isremainder)?"remainder is 0":"got some remainder";
        System.out.print(s);
    }
}

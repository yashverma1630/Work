public class Laptop {
    private String brand="ASUS";
    private String model="TUF Gaming A15";
    private int qty=2;
    private int cost=2_40_000;

    public String getBrand(){
        return brand;
    }
    public void describeLaptop(){
        System.out.println(
                brand + " "+
                        model+ " "+
                        qty+" "+
                        cost+" "
        );
    }
}

public class Dog extends Animal{
    private String earShape;
    private String tailShape;
    public Dog(){
        super("Labrador","5",10.0);
    }

    public Dog(String type, double weight){
        this(type,weight, "floppy","twisted");
    }

    public Dog(String type, Double weight, String earShape, String tailShape) {
        super(type, weight<15 ?"small":(weight<35?"medium":"large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if(type == "worlf"){
            System.out.print("ow woooo ");
            System.out.println();
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();

        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Woof! ");
    }

    private void run(){
        System.out.print("Dog Running ");
    }

    private void walk(){
        System.out.print("Dog Walking ");
    }

    private void wagTail(){
        System.out.print("wagging tail ");
    }
}

package poo.clases;

public class car {

    int type;
    String brand;
    public car(int type, String brand) {
        this.type=type;
        this.brand=brand;
    }

    public void acelerate(){
        System.out.println("Acelerating....");
    }

    public void speed(int speedMax) {
        System.out.println("Speed Max is: " + speedMax);
    }

}
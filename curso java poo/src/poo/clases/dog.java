package poo.clases;

public class dog {
    int ID;
    String type;
    int price;

    public dog(int ID, String type, int price){
        this.ID = ID;
        this.type = type;
        this.price = price;
    }

    public void run(){
        System.out.println("Running");
    }

    public void dataDog() {
        System.out.println("id: "+ ID);
        System.out.println("type: "+ type);
        System.out.println("price: "+ price);
    }

}
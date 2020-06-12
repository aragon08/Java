package poo.clases;

public class animal {

    public animal() {
        System.out.println("soy un animal");
    }

    public animal(String tipo) {
        System.out.println("tipo: "+tipo);
    }
    
    
}

class leon extends animal{

    public leon() {
        super("felino");
        System.out.println("Soy un leon");
    }
    
}
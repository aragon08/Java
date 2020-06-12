package poo.clases;

public class padre {
    protected String nombre = "Carlos";

    public void saludo() {
        System.out.println("buenos dia familia......");
    }
}

/**
 * Innerpadre
 */
class hijo extends padre {
    private String nombre_hijo = "Benito";
    
    public static void main(String[] args) {
        hijo nuevo_hijo = new hijo();
        nuevo_hijo.saludo();
        System.out.println("tu hijo: "+nuevo_hijo.nombre_hijo);
    }
}
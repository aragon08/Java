package poo.clases;

class fruta {
   public void colorF(){
       System.out.println("Frutas tropicales");
   } 
}

/**
 * manzana
 */
class manzana extends fruta {
    public void colorF() {
        System.out.println("Manzana = Rojo");
    }
    
}

class platano extends fruta{
    public void colorF() {
        System.out.println("Platano = Amarillo");
    }
}
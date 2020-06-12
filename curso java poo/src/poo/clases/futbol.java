package poo.clases;

public abstract class futbol {
    public abstract void ciudad();
    public void pais_origen(){
        System.out.println("pais = españa");
    }
}

class club extends futbol{
    public void ciudad(){
        System.out.println("ciudad = barcelona");
    }
}
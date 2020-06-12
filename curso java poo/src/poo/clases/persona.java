package poo.clases;

public class persona {
    int edad;
    String nombre;

    public persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void datos(){
        System.out.println("edad: "+edad+" nombre: "+nombre);
    }
    
}
package poo.clases;

public class alumno {
    // public String nombre = "Carlos";
    // private int edad = 31;

    // private String nombre;
    // private int edad;

    // public alumno(String nombre, int edad){
    //     this.nombre = nombre;
    //     this.edad = edad;
    // }

    // public void respuesta(){
    //     System.out.println(this.nombre + " edad: "+ this.edad);
    // }

    // public static alumno mayor(alumno al1, alumno al2){
    //     if (al1.edad >= al2.edad) {
    //         return al1;
    //     }else{
    //         return al2;
    //     }
    // }

    
    final int edad = 31;
    final double PI = 3.14; //final: define un valor exacto, unico, que no va a cambiar

    public static void main(String[] args) {
        alumno jose = new alumno();
        System.out.println(jose.PI);
    }

}
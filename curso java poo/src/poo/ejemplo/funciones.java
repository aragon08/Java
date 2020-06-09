package poo.ejemplo;

import java.util.Scanner;

public class funciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int n1,n2,op_suma,op_resta,op_multi;
         float op_div;

         System.out.println("ingresa un numero");
         n1 = entrada.nextInt();
         System.out.println("ingresa otr numero");
        n2 = entrada.nextInt();

        op_suma= suma(n1,n2);
        op_resta=resta(n1,n2);
        op_multi=multiplicacion(n1,n2);
        op_div=division(n1,n2);
        resultado(op_suma,op_resta,op_multi,op_div);
    }

    public static int suma(int n1, int n2){
        int suma;
        suma = n1 + n2;
        return suma;
    }
    public static int resta(int n1, int n2){
        int resta;
        resta = n1 - n2;
        return resta;
    }
    public static int multiplicacion(int n1, int n2){
        int multiplicacion;
        multiplicacion = n1 * n2;
        return multiplicacion;
    }
    public static float division(int n1, int n2){
        float division;
        division = n1 / n2;
        return division;
    }
    public static void resultado(int s, int r, int m, float d){
        System.out.println("resouesta: ");
        System.out.println(" ");
        System.out.println("suma: "+s);
        System.out.println("resta: "+r);
        System.out.println("multiplicacion: "+m);
        System.out.println("division: "+d);
    }

}
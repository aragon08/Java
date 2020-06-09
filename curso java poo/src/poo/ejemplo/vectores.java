package poo.ejemplo;

import java.util.Scanner;

public class vectores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Leer 5 numeros y mostrarlos en el mismo orden introducido
        // int [] array = new int[5];
        // for (int c =0; c<5; c++) {
        //     System.out.println("ingrese un nuemro");
        //     array[c] = entrada.nextInt();
        // }
        // for (int c=0; c<5; c++) {
        //     System.out.println(array[c]);
        // }

        //Pedir 6 numeros enteros y luego muestre los numeros con par o impar
        // int [] num = new int[6];
        // System.out.println("ingresa 6 numeros");
        //  for (int c =0; c<6; c++) {
        //     num[c] = entrada.nextInt();
        //  }
        //  for (int c =0; c<6; c++) {
        //     if (num[c] % 2 == 0 ) {
        //         System.out.println(num[c]+" par");
        //     }else{
        //         System.out.println(num[c]+" impar");
        //     }
        // }

        //invertir el array
        // int [] array = new int[8];
        // for (int c = 0; c<8; c++) {
        //     array[c]= entrada.nextInt();
        // }
        // System.out.println("Invertido");
        // for (int c = 7; c >=0; c--) {
        //     System.out.println(array[c]);
        // }

        /*Escribir un programa que lea 8 numeros por teclado y que los almacene en un array.
        Rota los elementos del array(el elemento de la posicion 0 debe pasar a la posicion 1,
        el de la 1 a la 2, etc.). El elemento que se encuentra en la ultima posicion
        debe paar a la posicion 0. Finalmente muestra el contenido del array.
        */

        int [] array = new int[8];
        int c;
        System.out.println("ingrese 8 numeros");
        for (c=0;c<8;c++) {
            array[c] = entrada.nextInt();
        }
        System.out.println("Array Original ");
        for (c=0;c<8;c++) {
            System.out.printf(" | "+c);
        }
        System.out.println(" | ");
        for (c=0;c<25;c++) {
            System.out.print(" - ");
        }
        System.out.println("-");
        for (c=0;c<8;c++) {
            System.out.printf(" | "+array[c]);
        }
        System.out.println(" | ");

        //Rotar de posicioin

        int aux = array[7];
        for(c =7; c>0;c--){
            array[c]= array[c-1];
        }
        array[0]= aux;
        System.out.println("Array recorrido");
        for(c=0; c<8; c++){
            System.out.printf(" | "+ c);
        }
        System.out.println(" | ");
        for (c=0;c<25;c++) {
            System.out.print(" - ");
        }
        System.out.println("-");
        for(c=0; c<8; c++){
            System.out.printf(" | "+array[c]);
        }
        System.out.println(" | ");

    }
}
package poo.ejemplo;

import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        //genera un matriz con letras y mostrarlas en pantalla
        //Scanner entrada = new Scanner(System.in);
        int f = 4;
        int c = 5;

        char [][] alfabeto = new char[f][c];
        char letra = 'A';

        //Cargar la matriz
        for(int c1 = 0; c1<f;c1++){
            for(int c2 = 0; c2<c;c2++){
                alfabeto[c1][c2] = letra;
                letra++;
            }
        }

        //Mostrar elementos de la matriz
        for(int c1 = 0; c1<f;c1++){
            for(int c2 = 0; c2<c;c2++){
                System.out.print(""+alfabeto[c1][c2]);
            }
            System.out.println(" ");
        }
        
    }
}
package poo.ejemplo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        // System.out.println("ingresa la edad");
        // int edad = Integer.parseInt(entrada.nextLine());
        // System.out.println("edad: "+ edad);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad;
        edad = entrada.nextInt();
        System.out.println("edad: "+ edad);
    }
}
package poo.ejemplo;

import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // int n;
        // System.out.println("ingresa un numero: ");
        // n = entrada.nextInt();
        
        //genera impares
        //int c=1;
        //int i = 0;
        // while (c<=n) {
        //     i= 2 * c - 1;
        //     System.out.println(i);
        //     c++;
        // }

        //generar 4, 7, 10, 13
        // int c1 = 1;
        // int c2 = 4;
        // while (c1<=n) {
        //     System.out.println(c2);
        //     c1++;
        //     c2+=3;
        // }

        //generar 765765765765765765....
        // int c = 0;
        // int w = 7;//interruptor
        // while (c<=n) {
        //     System.out.println(w);
        //     if (w>5) {
        //         w--;
        //     }else{
        //         w=7;
        //     }
        //     c++;
        // }

        //generar 2113111411115....
        // int c1 = 0;
        // int c2 = 0;
        // int uno = 2;
        // int t = 2;
        // while (c1<=n) {
        //     System.out.println(t);
        //     if(c2 < uno){
        //         t = 1;
        //         c2++;            
        //     }else{
        //         uno++;
        //         t = uno;
        //         c2 = 0;
        //     }
        //     c1++;
        // }

        //generar 12345
        //generar 1234
        //generar 123
        //generar 12
        //generar 1
        // int no,l;
        // System.out.println("numero limite");
        // l = entrada.nextInt();
        // for (int c=0; c<=l; c++) {
        //     no = c + 1;
        //     while (no<=l) {
        //         System.out.println(no - c);
        //         no++;
        //     }
        //     System.out.println(" ");
        // }

        //generar 1
        //generar 13
        //generar 135
        //generar 1357

        int n;
        n= entrada.nextInt();

        for (int c1 = 1; c1 <= n; c1++) {
            System.out.println(" ");
            for (int c2 = 1; c1*2>=c2; c2++) {
                if ((c2 % 2) != 0) {
                    System.out.println(c2);
                }
            }
        }
    }
}
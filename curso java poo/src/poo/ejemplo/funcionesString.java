package poo.ejemplo;

public class funcionesString {
    public static void main(String[] args) {
        String cadena = "java";
        String cadena2 = "curso";
        System.out.println(cadena);
        System.out.println(cadena.length());
        String cadena3 = cadena + cadena2;
        System.out.println(cadena3);

        String cadena4 = "Programacion";
        String cadena5 = "programacion";
        System.out.println(cadena4.equals(cadena5));
        System.out.println(cadena4.equalsIgnoreCase(cadena5));
        String cadena6 = "ProgrAmaciOn";
        System.out.println(cadena6.toLowerCase());
        System.out.println(cadena6.toUpperCase());
        System.out.println(cadena6.charAt(2));

    }
}
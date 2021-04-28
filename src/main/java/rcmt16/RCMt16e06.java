/*
Escribe un programa que solicite al usuario que introduzca un email y que extraiga el nombre 
del usuario (lo que hay antes de la arroba) y el TLD (el dominio de nivel superior, lo que va después 
del punto

fecha: 28/04/2021
alumeno: Rafael Chamorro Maceiras

*/
package rcmt16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RCMt16e06 {

    static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("Introduce email:");
        String email = teclado.nextLine();
        
        String regemail = "([^@]+)@[^@]+\\.([a-zA-Z]{2,})";
        Pattern patron = Pattern.compile("([^@]+)@[^@]+\\.([a-zA-Z]{2,})");
        Matcher matcher = patron.matcher(email);
        matcher.find();
        System.out.println("nombre de usuario: " + matcher.group(1));
        System.out.println("Dominio TLD: "+ matcher.group(2));

    }
    
}

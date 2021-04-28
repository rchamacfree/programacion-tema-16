/*
Haz un programa que cree una ListaPequeña de tipo String de 5 elementos. Añádele 6 ó 7 String 
a la lista y muestra su contenido, para ver si ha crecido por encima de esos 5 elementos

fecha: 28/04/2021
alumno: Rafael Chamorro Maceiras.
 */
package rcmt16;

import java.util.ArrayList;



public class RCMt16e07 {

    
    public static void main(String[] args) {
        ListaPequena <String> lista = new ListaPequena<>(5);
        lista.añadir("leche");
        lista.añadir("café");
        lista.añadir("azucar");
        lista.añadir("Zumo");
        lista.añadir("galletas");
        lista.añadir("Bizcochos");
        lista.añadir("Campurrianas");
        
      ArrayList <String> valores = lista.getValores();
      for (String x: valores) System.out.println(x);
    }
    
}

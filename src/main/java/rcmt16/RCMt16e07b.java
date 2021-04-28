/*
Crea otro programa similar al anterior, pero en vez de trabajar con String trabaje con una clase 
que hayas creado previamente, por ejemplo: Persona_v4

fecha: 28/04/2021
alumno: Rafael Chamorro Maceiras.
 */
package rcmt16;

import java.time.LocalDate;
import java.util.ArrayList;




public class RCMt16e07b {

    public static void main(String[] args) {
        ListaPequena <Persona_v4b> lista = new ListaPequena<>(5);
        
        lista.añadir(new Persona_v4b("Rafa","666555444","rafa@gmail.com",LocalDate.parse("1974-01-08")));
        lista.añadir(new Persona_v4b("Jose","611222333","Jose@gmail.com",LocalDate.parse("1894-05-22")));
        lista.añadir(new Persona_v4b("Cintia","698765258","cintia@gmail.com",LocalDate.parse("1984-12-29")));
        lista.añadir(new Persona_v4b("Bea","689789789","Bea@gmail.com",LocalDate.parse("1968-11-24")));
        lista.añadir(new Persona_v4b("Carmen","655888666","Carmen@gmail.com",LocalDate.parse("1974-01-08")));
        lista.añadir(new Persona_v4b("Manuela","123456789","manu@gmail.com",LocalDate.parse("1954-02-18")));
        lista.añadir(new Persona_v4b("Angeles","981234234","Angeles@gmail.com",LocalDate.parse("1973-05-16")));
        lista.añadir(new Persona_v4b("Maria Jose","646369258","MJose@gmail.com",LocalDate.parse("1964-10-02")));
        
        ArrayList <Persona_v4b> personas = lista.getValores();
        for (Persona_v4b p: personas) System.out.println(p);
       
        
        
      //ArrayList <String> valores = lista.getValores();
      //for (String x: valores) System.out.println(x);
    }
    
}

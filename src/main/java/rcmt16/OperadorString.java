/*
 Crea una clase (no genérica) llamada OperadorString que implemente la interfaz anterior 
con Strings. Lla suma de Strings es la concatenación de la primera cadena pasada como 
parámetro con la segunda. La resta de String será eliminar todas las ocurrencias de la 
cadena segundo operando que se encuentren en la cadena primer operando, por 
ejemplo, resta (“AbcDDxxDD”,”DD”) devolvería “Abcxx”

fecha: 29/04/2021
alumno: Rafael Chamorro Maceiras
 */
package rcmt16;

/**
 *
 * @author rchamac
 */
public class OperadorString implements Operable<String>{
    
    @Override
    public String suma(String a, String b){
        return a.concat(b);
    }
    
    @Override
    public String resta(String a, String b){
        int tamanob = b.length();
        StringBuilder sb = new StringBuilder(a);
        
       
       do{
         if (sb.indexOf(b)!=-1)sb.delete(sb.indexOf(b),sb.indexOf(b)+tamanob);
       }while(sb.indexOf(b)!=-1);
       
       
        return sb.toString();
        
    }
}

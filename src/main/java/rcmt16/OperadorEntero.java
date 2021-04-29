/*
Crea una clase (no genérica) llamada OperadorEntero que implemente la interfaz anterior 
con Integer (ya sabemos cómo es la suma y resta de enteros) 

fecha: 29/04/2021
alumno: Rafael Chamorro Maceiras
 */
package rcmt16;

/**
 *
 * @author rchamac
 */
public class OperadorEntero implements Operable<Integer>{
    
    @Override
    public Integer suma(Integer a, Integer b){
       return a + b; 
    }
    
    @Override
    public Integer resta(Integer a, Integer b){
        return a - b;
    }
    
}

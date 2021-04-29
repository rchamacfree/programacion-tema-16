/*
Crea una clase de tipo genérica (cualquier tipo que herede de Number) que describa un 
cuadrado

 */
package rcmt16;

/**
 *
 * @author rchamac
 * @since 29/04/2021
 */
public class ClaseGenerica <T extends Number> {
    /**
     * Atributo lado de tipo genérico
     */
    T lado;
    
    /**
     * Constructor
     * recibe el parametro n y lo asigna al atributo lado
     * @param n 
     */
    public ClaseGenerica(T n){
        lado = n;
    }
    
    /**
     * 
     * @return 
     */
    public Number area(){
        return lado.doubleValue() * lado.doubleValue();
    }
}

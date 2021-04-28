/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcmt16;

import java.util.ArrayList;


public class ListaPequena <T>  {
    private int tamañoMax;
    private ArrayList<T> valores;    
    
    
    //constructor
    public ListaPequena (int t){
        this.tamañoMax = t;
        this.valores = new ArrayList<T>(tamañoMax);
    }
    
    public void añadir(T param){
        if (this.valores.size()< tamañoMax) this.valores.add(param);
        else this.valores.set(tamañoMax-1, param);
    }
    
    public void clear(){
        this.valores.clear();
    }
    
    public ArrayList<T> getValores(){
        return this.valores;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoProblema;

/**
 *
 * @author User
 */
public class Pila2 {
   NodoPila2 clima;
    int tamaño;

    public Pila2() {
        clima = null;
        tamaño = 0;
    }
    
    public void push(char dato){
        NodoPila2 nuevo = new NodoPila2(dato);
        nuevo.siguiente = clima;
        clima = nuevo;
        tamaño++;
    }
    
    public char pop(){
        char aux = clima.dato;
        clima = clima.siguiente;
        tamaño--;
        return aux;
    }
    
    public char cima(){
        return clima.dato;
    }
    
    public int tamaño(){
        return tamaño;
    }
    
    public boolean estaVacia(){
     return clima==null;   
    }
    
    public void limpiar(){
        while(!estaVacia()){
            pop();
        }
    }  
}

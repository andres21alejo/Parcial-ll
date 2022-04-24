/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerProblema;

/**
 *
 * @author User
 */
public class Pila1 {
    NodoPila1 cima;
    int tamaño;

    public Pila1() {
        cima = null;
        tamaño = 0;
    }
    
    public void push(char dato){
        NodoPila1 nuevo = new NodoPila1(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }
    
    public char pop(){
        char aux = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return aux;
    }
    
    public char cima(){
        return cima.dato;
    }
    
    public int tamaño(){
        return tamaño;
    }
    
    public boolean estaVacia(){
     return cima==null;   
    }
    
    public void limpiar(){
        while(!estaVacia()){
            pop();
        }
    }

}


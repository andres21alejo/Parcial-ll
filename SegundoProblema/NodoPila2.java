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
public class NodoPila2 {
    char dato;
    NodoPila2 siguiente;

    public NodoPila2(char dato) {
        this.dato = dato;
        siguiente = null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }
    
}


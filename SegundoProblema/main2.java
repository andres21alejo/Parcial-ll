/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoProblema;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
        static Scanner sc = new Scanner(System.in);
    static Pila2 pila = new Pila2();
    static String variable, palabra;
    public static void main2(String[] args) {
        main2 pilaParcial = new main2();
        
        pilaParcial.datos();
        pilaParcial.palabra();
        pilaParcial.verificar();
    }
    
    public void datos(){
        System.out.println("Ingrese el dato");
        variable = sc.next();
        for(char c: variable.toCharArray()){
            pila.push(c);
        }
    }
    
 
    
    public void verificar(){
      if (variable.equals(palabra)){
          System.out.println("Es palindromo");
      }else{
          System.out.println("No es");
      }
    }
       public void palabra(){
    palabra = "";
        while(!pila.estaVacia()){
            palabra+=pila.pop();
        }
        System.out.println(palabra);
    }
}
    
    


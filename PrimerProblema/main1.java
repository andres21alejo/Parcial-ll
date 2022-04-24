/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerProblema;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class main1 {

    /**
     * @param args
     */
    
      static Scanner sc = new Scanner(System.in);
    static Pila1 pila = new Pila1();
    static String variable, palabra;
    public static void main1(String[] args) {        
        boolean salir = false;
        main1 primera = new main1();
        while(salir != true){
        primera.datos();
        if(pila.estaVacia()){
            System.out.println("La cadena es correcta");
        }else{
            System.out.println("Cadena incorrecta");
        }
        primera.palabra();
        
            System.out.println("¿Desea salir?\n1.Sí\n2.No");
            int eleccion = sc.nextInt();
            switch(eleccion){
                case 1: salir=true;
                break;
                case 2: salir = false;
                break;
                default: System.out.println("Se repetirá por que no selecciono una opción valida");
                break;
            }
        }
    }
    public void palabra(){
    palabra = "";
        while(!pila.estaVacia()){
            palabra+=pila.pop();
        }
        System.out.println(palabra);
        
    }
    public void datos(){
        System.out.println("Ingrese el dato");
        variable = sc.next();
        for(char c: variable.toCharArray()){
            if(c =='('){
                pila.push(c);
                if(c=='{'){
                    pila.push(c);
                    if(c=='['){
                        pila.push(c);
                    }
                }
            }else if (c == ')'){
                pila.pop();
                if(c=='}'){
                    pila.push(c);
                    if(c==']'){
                        pila.push(c);
                    }
            }
        }
    }
    
}
}  // TODO code application logic here
   


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TercerProblema;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class main3 {

    /**
     * @param args the command line arguments
     */
       static Scanner sc = new Scanner(System.in);
    static String expresiones;
    static Duplicado duplicado = new Duplicado();
    public static void main3(String[] args) {
        boolean salir=false;
        while(salir!=true){
        System.out.println("Escriba la expresión");
        expresiones = sc.next();
        
        if(duplicado.Duplicado(expresiones)){
            System.out.println("Hay parentesis repetidos");
        }else{
            System.out.println("No hay parentesis repetidos");
        }
            System.out.println("¿Desea terminar?\n1.Sí\n2.No");
            int eleccion=sc.nextInt();
            switch(eleccion){
                case 1: salir = true;
                break;
                case 2: salir = false;
                break;
                default: System.out.println("Se repetirá a falta de elección");
                break;
            }
        }
    }
    
}
    
    


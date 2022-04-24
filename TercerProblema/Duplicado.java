/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TercerProblema;

import java.util.Stack;

/**
 *
 * @author User
 */
public class Duplicado {
    public boolean Duplicado(String s){
        Stack<Character> pila = new Stack<>();
        
        char[] str = s.toCharArray();
        for(char ch : str) { 
            
            if (ch == ')'){
                char cima = pila.peek();
                pila.pop();
                
                int elementos = 0;
                
                while (cima != '('){
                    elementos++;
                    cima = pila.peek(); 
                    pila.pop(); 
                }
                if (elementos < 1){ 
                    return true; 
                }
            }else{ 
                pila.push(ch);
            }
        }
    return false;
    }
    
}


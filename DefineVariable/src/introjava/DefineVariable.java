/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introjava;

import java.util.Scanner;


/**
 *
 * @author pepevega
 */
public class DefineVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int num1, num2;
        //String si="";
        System.out.println("Ingresar Numero1: ");
        num1 = lee.nextInt();
        System.out.println("Ingresar Numero2: ");
        num2 = lee.nextInt();   
        verinfo(num1, num2);
        
    }

    public static void verinfo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El Numero: " + num2 + ", es multiplo de " + num1);
        }else 
                System.out.println("El Numero: " + num2 + ", No es multiplo de " + num1);     
               }    
}        
       

        
   
    
  
    


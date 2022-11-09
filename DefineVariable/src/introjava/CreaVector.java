/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author pepevega
 */
public class CreaVector {
    
      public static void main(String[] args) {
         //Con esta configuración de Scanner logramos trabajar con Acentos. 
         Scanner lee= new Scanner (System.in, "UTF-8");
         //Scanner lee = new Scanner(System.in);
         int n=3, i; 
         String[] Equipo = new String[n];
         System.out.println("Ingrese los nombres del Equipo de 1 en 1");
         
      for (i = 0; i < n; i++) {
          Equipo[i] = lee.nextLine();       
      }
        System.out.println("Muestre valor i: " + i);
        for (i = 0; i < n; i++) {
            System.out.println("Item: " + i + " Nombre: " + Equipo[i]);
        }
    }
}

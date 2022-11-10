

package cuadrado;

import java.util.Scanner;

//Ejercicio 13
public class Cuadrado {

    public static void main(String[] args) {
          Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos
          System.out.println("Ingrese un valor N: ");
          int N=lee.nextInt();
          String M[] []= new String[N][N];
          for (int i=0; i<=N-1; i++) {
              for(int j=0; j<=N-1; j++){
                  if (i==0 || i==N-1) {
                      M[i][j]="*";                      
                  } else if(j==0 || j==N-1) {
                            M[i][j]="*";
                  } else {                                  
                            M[i][j]=" ";    
                          }    
                      }
                  }
          for (int i=0; i<=N-1; i++) {
             for(int j=0; j<=N-1; j++){ 
                 System.out.print("["+M[i][j]+"]"+" ");
              }
              System.out.println(" ");
          }
    }    

}
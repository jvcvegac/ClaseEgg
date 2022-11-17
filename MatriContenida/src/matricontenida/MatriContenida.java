
package matricontenida;

import java.util.Arrays;
public class MatriContenida {

    public static void main(String[] args) {
       // Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos 
       int i, j, ji;
       int N=10, M=10, k=0, A=3, B=3, L=200;
       int Matri1[][]=new int [N][M]; //Matriz 10x10
       int Matri3[][]=new int [A][B];
       String val="";
       //int Fila1[]= new int [L];
       //String FilasMtr="";
       String FilasMtr="012636470506728195101112132141226720106156788790099017128767"
             + "418724569774874264353276790136056796121199135488899075124176"
             + "677887451422264256789845342332567416191824679746871367899324"
             + "21687898906712416612";
       String FilaTres="360567899075142226";
           for (i=0; i<=N-1; i++) {
               for (j=0; j<=M-1; j++) {
                   if(k<=L-1) {
                      //String val=FilasMtr.substring(k, k+2);
                      val+=FilasMtr.charAt(k); //Concatenar 
                      val+=FilasMtr.charAt(k+1); //Concatenar 
                      Matri1[i][j] = Integer.parseInt (val);
                      val="";
                      k=k+2;
                   } 
           }
       } 
       //Muestra la Matriz generada  de 10x10 
       System.out.println("Matriz de 10x10");
       for (i=0; i<=N-1; i++) {
            for(j=0; j<=M-1; j++) {
               System.out.print("["+Matri1[i][j]+"]"+" ");
            } 
            System.out.println("");
            
        }
        L=20;
        k=0;
        for (i=0; i<=A-1; i++) {
            for (j=0; j<=B-1; j++) {
                if(k<=L-1) {
                      //String val=FilasMtr.substring(k, k+2);
                      val+=FilaTres.charAt(k); //Concatenar sig
                      val+=FilaTres.charAt(k+1); //Concatenar sig
                      Matri3[i][j] = Integer.parseInt (val);
                      val="";
                      k=k+2;
                   } 
           }
       }
        System.out.println("");
       //Muestra la Matriz generada  de 3x3
       System.out.println("Matriz de 3x3");
       for (i=0; i<=A-1; i++) {
            for(j=0; j<=B-1; j++) {
               System.out.print("["+Matri3[i][j]+"]"+" ");
            } 
            System.out.println("");
            
        }
     //Compara Matrices
       System.out.println(""); 
       int opts=0, conta=0;
       k=0;
       ji=0;
       int ia=0, ja=0;
       int Matri3C[][]=new int [A][B];
       do {        
           for (i=ia; i<=A-1; i++) {
            for(j=ja; j<=B-1; j++) {
               Matri3C[k][ji]=Matri1[i][j];
               ji=++ji;
              }  
               k=k+1;
           }
            if (Arrays.deepEquals(Matri3C,  Matri3)){
                System.out.println("La Matriz 3x3 está contenida en Matriz 10x10");             
                System.out.println("Desde la posición: "+ia+","+);
              }else {
                  
              }
            } 
        }
           
       }while (opts==0);  
       
       
}
}
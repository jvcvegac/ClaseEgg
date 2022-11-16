
package cuadradomagico;

import java.util.Scanner;

public class CuadradoMagico {

    public static void main(String[] args) {
        Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos
        int i, j, N=4, M=5, conta=0;
        int sies=1, valor;
        int ingre[]=new int[N+M+1];
        int cuadrado[][]= new int [N][M];
        System.out.println("Ingrese 9 números del 1 al 9 sin repetir");
        do {           
            valor=lee.nextInt();
            if (valor >= 1 && valor <=9) {
               conta=++conta;
               ingre[conta]=valor;
           }else {
                  System.out.println("Valor Ingresado Fuera de Rango, Vuelva a intentar");
                  System.out.println("Hasta el momento ha ingresado "+conta+" valores correctamente"); 
                  //sies=0;
               }                
        } while (conta!=9);
        
        
      System.out.println("Aqui"); 
          int k=1;
          for (i=0; i<=N-2; i++) {
            for(j=0; j<=M-3; j++) {
               cuadrado[i][j]=ingre[k];
               k=++k;
               System.out.print("["+cuadrado[i][j]+"]"+" ");
            } 
            System.out.println("");
        }   
        System.out.println("Deterninar si es un cuadrado mágico"); 
        VersiesMagico(cuadrado, N, M);
        sies=cuadrado[0][M-1]; //Extrae valor de prueba para cuadrado mágico
        for (i=0; i<=N-1; i++) {
            for(j=0; j<=M-1; j++) {
               System.out.print("["+cuadrado[i][j]+"]"+" ");
            } 
            System.out.println("");
            
        }
        if (sies==0) {
                System.out.println("El Cuadrado es Mágico y versi= "+sies);
            }else {
                System.out.println("El Cuadrado No es Màgico y versi= "+sies);
            }
    }

    public static int VersiesMagico(int [][] cmagico, int N, int M) {
        int i, j, k, sumds=0, sumdp=0, versi=0;
        
        k=N-2;
        for(i=0; i<=N-2; i++){
            for(j=0; j<=M-3; j++) {
                cmagico[i][N-1]=cmagico[i][N-1]+cmagico[i][j];               
            }
            sumds=sumds+cmagico[i][k];  //Suma diagonal secundaria
        }
        for(j=0; j<=M-3; j++){
            for(i=0; i<=N-2; i++) {
                cmagico[N-1][j]=cmagico[N-1][j]+cmagico[i][j];
                if (i==j) {  
                    sumdp=sumdp+cmagico[i][j]; //Suma diagonal principal 
                    //cmagico[N-1][N-1]=cmagico[N-1][N-1]+cmagico[i][j];
                }
            }
        }
        for(j=0; j<=N-1; j++){
            k=j+1;
            if (k<N-1) {
               if((cmagico[N-1][j]!=cmagico[N-1][k]) || (cmagico[j][N-1]!=cmagico[k][N-1]) || 
                            (cmagico[N-1][j]!=sumds) || (sumdp!=sumds))  {
                versi=1;
                
            }else {
                    versi=0;    
                        } 
          }
        }
        cmagico[0][M-1]=versi;
        cmagico[1][M-1]=sumdp;    
        cmagico[2][M-1]=sumds;    
        return cmagico[N-1][N-1];
}
    
}

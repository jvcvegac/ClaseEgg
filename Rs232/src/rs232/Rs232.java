
package rs232;

import java.util.Scanner;

//Ejercicio Nº12

public class Rs232 {
 
    public static void main(String[] args) {  
       Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos
       int Canlecgood=0;
       int Canlecbad=0;
       int Canleidas=0;
       String FDE="&&&&&";
       int Final=0, i=0, j=0;
       String FDX="X";
       String FDO="O";
       String LecB[]=new String[30];
       String LecM[]=new String[30]; 
       do{ 
           System.out.println("Ingrese una variable de 5 caracteres");
           String varfija=lee.next();
           varfija=varfija.toUpperCase(); 
           int k=varfija.length();
           if(varfija.equals(FDE)) {
                Final=9;    
            }   else {
                    Canleidas++;
                    if (k==5) {                        
                       String lx=varfija.substring(0,1);
                       String lo=varfija.substring(k-1);
                       if (lx.equals(FDX) && lo.equals(FDO)) {
                          Canlecgood++; 
                          LecB[i]=varfija;
                          i++;                           
                       }else {
                          Canlecbad++;    
                          LecM[j]=varfija;                 
                          j++;
                       }
                    }else {
                         Canlecbad++;
                    }
       }
       } while (Final==0);
        System.out.println("A continuación Muestro las entradas Buenas");
        for (int ik=0; ik<i; ik++){
            System.out.print(LecB[ik]+" ");
        }
        System.out.println(Canlecgood+" Buenas");
        System.out.println("A continuación Muestro las entradas Malas");
        for (int ik=0; ik<j; ik++) {
            System.out.print(LecM[ik]+" ");
        }
        System.out.println(Canlecbad+" Malas");
        System.out.println("Total de entradas Leídas: "+Canleidas);
 }
    
}

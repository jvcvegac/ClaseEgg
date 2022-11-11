
package letras;

import java.util.Scanner;


public class Letras {
     Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos
    //Scanner lee= new Scanner (System.in, "ISO-8859-1");
    public static void main(String[] args) {

         char[] signos={',' , ';' , '.' , ':' , '¿' , '?' , '¡', '!'};
         char[] vocales={'a' , 'e', 'i', 'o', 'u', 'í', 'ó', 'ú','á','é'};
         char[] consona={'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                         'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w',
                         'x', 'y', 'z'};
         String voc="", cons="", sig="";
         int n_voc=0, n_cons=0, n_sig=0;
         
         String entrada="¡Hola! Lucía, ¿Dónde se encuentra María con José?";
         
         for (int i=0; i<entrada.length(); i++) {
             for (int j=0; j<signos.length; j++) {
                 if(entrada.charAt(i) == signos[j]) {
                     n_sig++;
                     sig+=entrada.charAt(i); //Concatenar sig
                 }
             } 
              for (int k=0; k<vocales.length; k++){
                   if(entrada.charAt(i) == vocales[k]) {
                      n_voc++;
                      voc+=entrada.charAt(i); //Concatenar voc
                 }
             }
              for (int l=0; l<consona.length; l++){
                   if(entrada.charAt(i) == consona[l]) {
                      n_cons++;
                      cons+=entrada.charAt(i); //Concatenar cons
                 }
             }
         }
               System.out.println("Cadena Original: "+entrada);
               System.out.println("Signos("+n_sig+"): "+sig);
               System.out.println("Vocales("+n_voc+"): "+voc);
               System.out.println("Consonantes("+n_cons+"): "+cons);
               
    }
}



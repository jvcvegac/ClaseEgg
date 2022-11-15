
package divisas;

import java.util.Scanner;

//Ejercicio 14
public class Divisas {

    public static void main(String[] args) {
        Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos
          int opcion;
                
    do {
        System.out.println("Ingrese un valor en Euros ");
        double valor=lee.nextDouble();
        System.out.println("_____________________");
        System.out.println("|        MENÚ       |");
        System.out.println("---------------------");
        System.out.println("|   1. Libras       |");
        System.out.println("|   2. US$          |");
        System.out.println("|   3. Yenes        |");
        System.out.println("|   4. Salir        |");
        System.out.println("---------------------");
        System.out.println("| Seleccione Moneda |");
        System.out.println("---------------------");
    double resu;
    //Configura Vectores
    String TM[]= new String [3];
    double tc[]= new double [3];
    TM[0]="Libras";
    TM[1]="US$";
    TM[2]="Yenes";
    tc[0]=0.86d;
    tc[1]=1.28611d;
    tc[2]=129.852d;
    opcion=lee.nextInt();
    switch (opcion){
     case 1 :
           
     case 2 :
         
          
     case 3 :
            double tcr=tc[opcion-1];
            resu=convierte(valor, opcion, tcr);
            System.out.println("Selección "+valor+" Euros a "+TM[opcion-1]+": "+resu+" al valor cambio: "+tcr);
            break;
     
     case 4: {
         System.out.println("¿Está seguro que desea salir del Programa(S/N)?");
         String optsn=lee.next();
         //optsn=optsn.toUpperCase();
         if (optsn.equalsIgnoreCase("S")) {
             System.out.println("Ha elegido salir del Programa, Hasta la Próxima");
             opcion=5;
             break;
         }else {
             opcion=5;
             break;
         }  }        
          default : System.out.println("Ha Elegido una Opción que no es Válida, Inténtelo de Nuevo");         
         }      
     }while (opcion<5);
 }

    static double convierte(double moneda, int opta, double TC) {
     double resu;
     if (opta==1) {
           resu=moneda * TC;
     }else if (opta ==2) {
           resu=moneda * TC;
     }else {
           resu=moneda * TC;
    }
     return resu;
    }
        
}

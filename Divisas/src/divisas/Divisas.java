
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

    opcion=lee.nextInt();
    switch (opcion){
     case 1 :
     
     case 2 :
         
     
     case 3 :
            convierte(valor, opcion);
            break;
     
     case 4: {
         System.out.println("¿Está seguro que desea salir del Programa(S/N)?");
         String optsn=lee.next();
         optsn=optsn.toUpperCase();
         if (optsn.equals("S")) {
             System.out.println("Ha elegido salir del Programa, Hasta la Próxima");
             break;
         }else {
             opcion=0;
         }  }        
          default : System.out.println("Ha Elegido una Opción que no es Válida, Inténtelo de Nuevo");         
         }      
     }while (opcion!=4);
 }

    static void convierte(double moneda, int opta) {
     double resu;
     if (opta==1) {
           resu=moneda * 0.86d;
           System.out.println("Seleccinó "+moneda+" Euros a Libra: "+resu+" TC=0.86");
     }else if (opta ==2) {
           resu=moneda * 1.28611d;
           System.out.println("Seleccinó "+moneda+" Euros a US$: "+resu+" TC=1.28611");
     }else {
           resu=moneda * 129.852d;
           System.out.println("Seleccinó "+moneda+" Euros a Yen: "+resu+" TC=129.852");
    }
    }
        
}


package caltiempo;

import java.util.Scanner;


public class Caltiempo {
    
    public static void main(String[] args) {
    Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos
        int minutos;
        System.out.println("Ingresar Cantidad de Minutos: ");
        minutos = lee.nextInt();
        CalcularDDHH(minutos);
        
        
    }
    public static void CalcularDDHH(int Minus) {
        int dias, horas, Min, restominus;
        
        if (Minus >= 1440) { 
            dias=Minus/1440;
            restominus=Minus - dias * 1440;
            if (restominus>60) {
                horas=restominus / 60;
                System.out.println("Conversión de "+Minus+" son "+dias+ " Días "+"y "+horas+" Horas");
            }else {
                System.out.println("Conversión de "+Minus+" son "+dias+ " Días");
            }
        }else {           
                horas=Minus / 60;
                System.out.println("Conversión de "+Minus+" son "+horas+" Horas");
        }
    }
    
    
}

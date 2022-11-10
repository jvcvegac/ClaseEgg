
package mayuminu;

import java.util.Scanner;

public class MayuMinu {
    public static void main(String[] args) {
      Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos

      //Ejercicio 3 Conversi�n a May�scula y Min�scula
      String Cadena="�Esta es una Reflexi�n Emp�rica!";
      String Cadena1=Cadena.toUpperCase();
      String Cadena2=Cadena.toLowerCase();
      System.out.println("Cadena Original: "+Cadena);
      System.out.println("Cadena en May�scula: "+Cadena1);
      System.out.println("Cadena en Min�scula: "+Cadena2);

      //Ejercicio 4 Convertir Grados Celsius a Grados Farenheit
      System.out.println("Ingrese Cantidad de Grados C.");
      float grc= lee.nextFloat();
      float farh=32 + 9*grc/5;
      System.out.println(""+grc+" Celsius Son: "+farh+" Fahrenheit");

      //Ejercicio 5 Mostrar el Doble, Triple y Ra�z Cuadrada
      System.out.println("Ingrese un N�mero");
      int num=lee.nextInt();
      System.out.println("Doble es: "+num*2+" Triple es: "+num*3+" Ra�z Cuadrada es: "+
                          Math.sqrt(num));

      //Ejercicio 6 Determinar si N�mero ingresado es Par o Impar
                  //Tomo como referencia el N�mero ingresado en Ejercicio 5
       if (num %2 == 0) {
           System.out.println("N�mero ingresado es Par");
       }else
            System.out.println("N�mero ingresado es Impar");

      //Ejercicio 7 Uso de funci�n equals()
      System.out.println("Ingrese una palabra");
      String frase=lee.next();
      if(frase.equals("eureka")) {
          System.out.println("Es Correcto");
    }else
          System.out.println("Es Incorrecto");

    //Ejercicio 8 Ingresar palabras de largo 8
        System.out.println("Ingrese una palabra");
        String palabra=lee.next();
        int k=palabra.length();
        if(k==8) {
            System.out.println("Es Correcto");
        }else System.out.println("Es Incorrecto");
        
    //Ejercicio 9 Validar que 1ra.Letra de frase ingresada sea una A
    //Tomo como referencia la palabra ingresada en Ejercicio 8
    palabra=palabra.toUpperCase();
    String Letra=palabra.substring(0, 1);
    if(Letra.equals("A")) {
        System.out.println("Palabra es: "+palabra+" Es Correcto");
    }else
            System.out.println("Palabra es: "+palabra+" Es Incorrecto");
    
    //Ejercicio 10 Ingresar N�mero hasta superar l�mite Inicial
        System.out.println("Ingresa L�mite Inicial");
        int limite=lee.nextInt();
        num=0;
        k=0;
        System.out.println("Ahora ingrese N�meros Hasta superar el l�mite "+limite);
        for(int i=0; num<limite; i++) {
            num=lee.nextInt();
            k++;
        }
        System.out.println("Se ingresaron "+k+" n�meros hasta ingresar el n�mero "+num+
                           " que super� al l�mite ingresado que fue "+limite);

    //Ejercicio 11 Men� de opciones
        System.out.println("Ingrese dos n�meros positivos para trabajar con el Men�");
        int num1= lee.nextInt();
        int num2= lee.nextInt();
        int opcion;
    do {
 
        System.out.println("_____________________");
        System.out.println("|        MEN�       |");
        System.out.println("---------------------");
        System.out.println("|   1. Sumar        |");
        System.out.println("|   2. Restar       |");
        System.out.println("|   3. Multiplicar  |");
        System.out.println("|   4. Dividir      |");
        System.out.println("|   5. Salir        |");
        System.out.println("---------------------");
        System.out.println("| Elija una Opci�n  |");
        System.out.println("---------------------");
 
    opcion=lee.nextInt();
    switch (opcion){
     case 1 -> sumar(num1, num2);
     case 2 -> resta(num1, num2);
     case 3 -> multi(num1, num2);
     case 4 -> divide(num1,num2);
     case 5 -> {
         System.out.println("�Est� seguro que desea salir del Programa(S/N)?");
         String optsn=lee.next();
         optsn=optsn.toUpperCase();
         if (optsn.equals("S")) {
             System.out.println("Ha elegido salir del Programa, Hasta la Pr�xima");
             break;
         }else {
             opcion=0;
         }   }
     default -> System.out.println("Ha Elegido una Opci�n que no es V�lida, Int�ntelo de Nuevo");
       }
     }while (opcion!=5);
}


    static void sumar(int n1, int n2) {
        int sum;
        sum=n1+n2;
        System.out.println("Eligi� la Opci�n Sumar "+n1+"+"+n2+" Resultado es: "+sum);
    }
    static void resta(int n1, int n2) {
        int resta;
        resta=n1-n2;
        System.out.println("Eligi� la Opci�n Restar "+n1+"-"+n2+" Resultado es: "+resta);
    }
    static void multi(int n1, int n2) {
        int produ;
        produ=n1*n2;
        System.out.println("Eligi� la Opci�n Multiplicar "+n1+"*"+n2+" Resultado es: "+produ);
    }
    static void divide(int n1, int n2) {
        int resul;
        resul=n1/n2;
        System.out.println("Eligi� la Opci�n Dividir "+n1+"/"+n2+" Resultado es: "+resul);
    }
}




package mayuminu;

import java.util.Scanner;

public class MayuMinu {
    public static void main(String[] args) {
      Scanner lee= new Scanner (System.in, "UTF-8"); //Reconoce Acentos

      //Ejercicio 3 Conversión a Mayúscula y Minúscula
      String Cadena="¡Esta es una Reflexión Empírica!";
      String Cadena1=Cadena.toUpperCase();
      String Cadena2=Cadena.toLowerCase();
      System.out.println("Cadena Original: "+Cadena);
      System.out.println("Cadena en Mayúscula: "+Cadena1);
      System.out.println("Cadena en Minúscula: "+Cadena2);

      //Ejercicio 4 Convertir Grados Celsius a Grados Farenheit
      System.out.println("Ingrese Cantidad de Grados C.");
      float grc= lee.nextFloat();
      float farh=32 + 9*grc/5;
      System.out.println(""+grc+" Celsius Son: "+farh+" Fahrenheit");

      //Ejercicio 5 Mostrar el Doble, Triple y Raíz Cuadrada
      System.out.println("Ingrese un Número");
      int num=lee.nextInt();
      System.out.println("Doble es: "+num*2+" Triple es: "+num*3+" Raíz Cuadrada es: "+
                          Math.sqrt(num));

      //Ejercicio 6 Determinar si Número ingresado es Par o Impar
                  //Tomo como referencia el Número ingresado en Ejercicio 5
       if (num %2 == 0) {
           System.out.println("Número ingresado es Par");
       }else
            System.out.println("Número ingresado es Impar");

      //Ejercicio 7 Uso de función equals()
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
    
    //Ejercicio 10 Ingresar Número hasta superar límite Inicial
        System.out.println("Ingresa Límite Inicial");
        int limite=lee.nextInt();
        num=0;
        k=0;
        System.out.println("Ahora ingrese Números Hasta superar el límite "+limite);
        for(int i=0; num<limite; i++) {
            num=lee.nextInt();
            k++;
        }
        System.out.println("Se ingresaron "+k+" números hasta ingresar el número "+num+
                           " que superó al límite ingresado que fue "+limite);

    //Ejercicio 11 Menú de opciones
        System.out.println("Ingrese dos números positivos para trabajar con el Menú");
        int num1= lee.nextInt();
        int num2= lee.nextInt();
        int opcion;
    do {
 
        System.out.println("_____________________");
        System.out.println("|        MENÚ       |");
        System.out.println("---------------------");
        System.out.println("|   1. Sumar        |");
        System.out.println("|   2. Restar       |");
        System.out.println("|   3. Multiplicar  |");
        System.out.println("|   4. Dividir      |");
        System.out.println("|   5. Salir        |");
        System.out.println("---------------------");
        System.out.println("| Elija una Opción  |");
        System.out.println("---------------------");
 
    opcion=lee.nextInt();
    switch (opcion){
     case 1 -> sumar(num1, num2);
     case 2 -> resta(num1, num2);
     case 3 -> multi(num1, num2);
     case 4 -> divide(num1,num2);
     case 5 -> {
         System.out.println("¿Está seguro que desea salir del Programa(S/N)?");
         String optsn=lee.next();
         optsn=optsn.toUpperCase();
         if (optsn.equals("S")) {
             System.out.println("Ha elegido salir del Programa, Hasta la Próxima");
             break;
         }else {
             opcion=0;
         }   }
     default -> System.out.println("Ha Elegido una Opción que no es Válida, Inténtelo de Nuevo");
       }
     }while (opcion!=5);
}


    static void sumar(int n1, int n2) {
        int sum;
        sum=n1+n2;
        System.out.println("Eligió la Opción Sumar "+n1+"+"+n2+" Resultado es: "+sum);
    }
    static void resta(int n1, int n2) {
        int resta;
        resta=n1-n2;
        System.out.println("Eligió la Opción Restar "+n1+"-"+n2+" Resultado es: "+resta);
    }
    static void multi(int n1, int n2) {
        int produ;
        produ=n1*n2;
        System.out.println("Eligió la Opción Multiplicar "+n1+"*"+n2+" Resultado es: "+produ);
    }
    static void divide(int n1, int n2) {
        int resul;
        resul=n1/n2;
        System.out.println("Eligió la Opción Dividir "+n1+"/"+n2+" Resultado es: "+resul);
    }
}



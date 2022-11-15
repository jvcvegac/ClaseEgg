
package generavecto5dg;


import java.util.Random;

public class GeneraVecto5Dg {
    //Ejercicio 17 ****

    public static void main(String[] args) {
      //Scanner lee= new Scanner (System.in, "UTF-8");
      int i;
      int N=50;
      int Vecto[]= new int [N];
      int max_val = 10050;
      int min_val=1;
      
     //Genera Número aleatorio entre 1 y 10050
     //Trabaja con biblioteca Random
      int min1=1;
      int max1=1000;
      GeneraRandom(Vecto, min1, max1, min_val, max_val, N);
      
      for (i=0; i<=N-1; i++){
          System.out.print("["+Vecto[i]+"]"+",");
      }
         System.out.println("");    
      int l;
      int Conta[]= new int[10];
      for (i=0; i<=N-1; i++) {
         
          String Numsel=String.valueOf(Vecto[i]);
          //System.out.println("Muestra Numsel: "+Numsel);
          l=Numsel.length();
          Conta[l]=Conta[l]+1;   
          System.out.println("Ele: "+l+" Vecto :"+Vecto[i]+"Contador: "+Conta[l]);
      }
        for (i=0; i<=5; i++) {
            System.out.println("Valores con: "+i+" dígitos corresponden a: "+Conta[i]);
        }
        
  }    
      public static int GeneraRandom(int[] Resuv, int min, int max, int vmin, int vmax,  int N)  {
          int i;
          //Genero números al azar importando la biblioteca Random
          Random rand=new Random();
          for( i=0; i<=N-1; i++) {                       
             if ( i%2 == 0) {
                 Resuv[i]=min + rand.nextInt((max - min) + 1);
             }else {
               //Trabaja con extensión random de Math
               double randomNum=  Math.random() * ( vmax - vmin );
               Resuv[i]=(int) randomNum;              
          }       
      }       
        return Resuv[N-1];
        
      }       
      
      
    
    
}

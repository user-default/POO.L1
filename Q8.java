import java.lang.Math;

class Q8 
{
  //Programa que sorteia 6 números entre 1 e 60.
  public static void main(String[] args) 
  {
      
      int i = 1;
      int j = 60;
      int contador = 0;
      double a = 0;

      for(; contador <= 6; contador++)
      {
         a = Math.random()*(j-i+1) +i;
         System.out.printf("%.0f\n", a); 
      }

  }
}

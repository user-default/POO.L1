import java.util.Scanner;

public class Q1 
{
  public static void main(String[] args) 
  {
    System.out.println("Calcule seu IMC!\nEntre primeiro com sua altura, em seguida com seu peso:");
    
    Scanner teclado = new Scanner(System.in);
    double altura, peso;
    
    altura = teclado.nextDouble();
    peso = teclado.nextDouble();
    teclado.close();
    double imc = peso / (altura * altura);
    calculaImc(altura, peso, imc);

  }
    public static void calculaImc(double altura, double peso, double imc)
    {
      if (imc < 18.5)
      {
        System.out.printf("Seu IMC é de %.2f, você está magro!", imc);
      }
      else if(imc <= 24.9)
      {
        System.out.printf("Seu IMC é de %.2f, seu peso está normal", imc);
      }
      else if(imc <=29.9)
      {
        System.out.printf("Seu IMC é de %.2f, você esta com sobrepeso", imc);
      }
      else if(imc <= 34.9)
      {
        System.out.printf("Seu IMC é de %.2f, você está obeso!", imc);
      }
      else
      {
        System.out.printf("Seu IMC é de %.2f, você se enquandra em obsesidade mórbida", imc);
      }
    }
  }

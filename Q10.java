import java.util.Scanner;

class Q10 //Calcula a média de 3 notas de 10 alunos.
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    for(int c = 1; c <= 10; c++)
    {
      double[] a;
      a = new double[3];
      System.out.printf("%d aluno, digite suas três notas, a entrada deve ser maior ou igual a 0 e menor ou igual a 10:\n", c);
      
      a[0] = input.nextDouble();
      a[1] = input.nextDouble();
      a[2] = input.nextDouble();

      //Evitar que na entrada seja inseridos valores negativos.
      if((a[0] >= 0 && a[0] <=10) && (a[1] >= 0 && a[1] <= 10) && (a[2] >= 0 && a[2] <= 10))
      {
        double media = (a[0] + a[1] + a[2]) / 3;
        System.out.printf("Sua média é %.1f\n", media);
      }
      else System.out.printf("Você inseriu uma ou mais notas inválidas.\n", c--); //c-- para que o haja oportunidade de ser inserido valores válidos. Enquanto estiver sendo colocado valores inválidos, o programa ficará em loop.

    }

    System.out.println("Fim de execução!\n");
  }
}

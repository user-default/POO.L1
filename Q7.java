import java.util.Scanner;
// Lê três inteiros e retorna compara se a soma dos dois primeiros é menor que a do ultimo.
class Q7 
{
  public static void main(String[] args) 
  {
    int a, b, c = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Entre com os inteiros em sequências utilizando a tecla enter:\n");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    if ((a + b) < c ) System.out.printf("%d + %d é menor que %d\n", a, b, c);
    else System.out.printf("%d é menor que %d + %d\n", c, a, b);
  }
}

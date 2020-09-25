import java.util.Scanner;

class Q4
{
  public static void main(String[] args) 
  {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre com a senha:\n");
    String senha = teclado.nextLine();

    if(senha.compareTo("123456") != 0) System.out.println("Acesso negado!\n");
    else System.out.println("Acesso liberado!\n");
  }
}

import java.util.Scanner;

class Q2
{
  public static void main(String[] args) {
    
    Scanner teclado1 = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    String senha = new String();
    String confirmaSenha = new String();
    double i, j, razao;
    System.out.println("Olá! Cadastre sua senha:");
    senha = teclado1.nextLine();
    System.out.println("Senha cadastrada!\nEntre o dois números para obter a razão do primeiro pelo segundo:");
    i = teclado2.nextDouble();
    j = teclado2.nextDouble();
    //teclado1.close(); // Enquanto ativo, apresenta erro java.lang.IllegalStateException: Scanner closed
    //teclado2.close();

    System.out.println("Valores recebidos, digite a senha cadastrada para continuar:");
    confirmaSenha = teclado1.nextLine();
    //teclado2.close();
    if (confirmaSenha.equals(senha))
    {
      razao = i/j;
      System.out.printf("Resultado da razão de %.1f por %.1f é %.1f !\n", i,j,razao);
    }
    else 
    {
      System.out.println("A senha digitada não confere com a cadastrada previamente!");
      System.exit(0);
    }
  }
}

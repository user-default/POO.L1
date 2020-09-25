import java.util.Scanner;

class Q5 
{
  public static void main(String[] args) 
  {
    
    int n_patos, treze;
    Scanner input = new Scanner(System.in);

    System.out.println("Para saber quem venceu a partida, entre com os dados solicitados:\nQuantos gols fez o Nacional de Patos?\n");
    n_patos = input.nextInt();
    System.out.println("E o Treze, quantos gols fez?\n");
    treze = input.nextInt();

    if(n_patos == treze) System.out.println("EMPATE!\n");
    else if(n_patos > treze) System.out.println("Patos venceu essa partida!\n");
    else System.out.println("A vitória foi do Treze!\n");


  }
}

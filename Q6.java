import java.util.Scanner;

class Q6 
{
  public static void main(String[] args) 
  {
    String i = "";//A princípio o tipo era int, porém estava teclando enter no Scanner e o programa apenas ficou espaçando.
    Scanner input = new Scanner(System.in);
    System.out.println("Entre com um número de 1 até 7, para saber o dia da semana correspondente.\n");
    i = input.nextLine();
 
    switch(i) //Tentei utilizar uma condição != e <=, porém apresentou erro, referente a não possibilidade de converter bool em int.
    {
      case "1": //Lembrete '' se refere a um char, "" a uma string.
        System.out.println("Domingo\n");
        break;
      case "2":          
        System.out.println("Segunda-feira\n");
        break;
      case "3":
        System.out.println("Terça-feira\n");
        break;
      case "4":
        System.out.println("Quarta-feira\n");
        break;
      case "5":
        System.out.println("Quinta-feira\n");
        break;        
      case "6":
        System.out.println("Sexta-feira\n");
        break;
      case "7":
        System.out.println("Sábado\n");
        break;
      default:
        System.out.println("Entrada incorreta!\nFim de execução.\n");
        System.exit(1);
    }   
  }
}

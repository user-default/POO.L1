class Q3 
{
  public static void main(String[] args) 
  {
    //Esse software está muito pesado, é necessário fazer algumas alterações vizando a otimização.
    String str1 = "Bosco";
    String str2 = "Aurelia";
    String str3 = "Derllane";
    String str4 = "Rogerio";
    String str5 = "Damião";
    
    if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0 && str1.compareTo(str4) < 0 && str1.compareTo(str5) < 0) System.out.println("str1 é a menor de todas.\n");

    else if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0 && str2.compareTo(str4) < 0 && str2.compareTo(str5) < 0) System.out.println("str2 é a menor de todas.\n");

    else if (str3.compareTo(str2) < 0 && str3.compareTo(str4) < 0 && str3.compareTo(str5) < 0) System.out.println("str3 é a menor de todas.\n");

    else if (str4.compareTo(str2) < 0 && str4.compareTo(str3) < 0 && str4.compareTo(str5) < 0) System.out.println("str4 é a menor de todas.\n");

   else System.out.println("str5 é a menor de todas.\n");
  }
}

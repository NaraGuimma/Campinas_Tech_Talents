import java.util.Scanner;
class Menu {
  public int MeuMenu(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Selecione uma opção:");
    System.out.println(" 1. Ver Menu \n 2. Ler o Menu \n 3. Repetir Menu \n 4. Tudo de novo \n 5. Não li, pode repetir? \n 0. Sair");
    int val = scan.nextInt();
    scan.nextLine();
    return val;
  }
}

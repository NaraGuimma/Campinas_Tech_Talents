import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int playAgain = 1;

    while (playAgain == 1){
      System.out.println("Qual linguagem você prefere? Java ou C?");
      String language = sc.nextLine();
      String upperLanguage = language.toUpperCase();

      switch (upperLanguage){
        case "JAVA":
          System.out.println("Melhor escolha!!! Esta linguagem é orientada a objetos");
          break;
        case "C":
          System.out.println("Esta linguagem éé estruturada");
          break; 
    
        default:
          System.out.println("Linguagem desconhecida");
      }
      
      System.out.println("Deseja executar novamanete? 1 para SIM");
      playAgain = sc.nextInt();
      sc.nextLine();

    }
    sc.close();
  }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos anos você tem?");
    int idade = scan.nextInt();
    if (idade >= 18){
      System.out.println("Você tem permissão para entrar. Sua idade é "+ idade+ " anos");
    } else{
      do {
        System.out.println("Você não tem permissão para entrar. Sua idade é "+ idade+ " anos");

        idade = idade + 1;
      } while(idade < 18);
      System.out.println("Você tem permissão para entrar. Sua idade é "+ idade+ " anos");
    }

    scan.close();

  }
}

import java.util.Scanner;


class Main {


  public static void main(String[] args) {
    Conta conta = new Conta();
    Scanner sc = new Scanner(System.in);
    int opcao;
    int menu = 1;

    while (menu == 1){

      System.out.println("O que você deseja fazer? 1 - depositar; 2 - sacar");
      opcao = sc.nextInt();

      switch(opcao){
        case 1:{
          System.out.println("Qual o seu saldo?");
          double saldo = sc.nextDouble();
          double valorAtual = conta.deposito(saldo);
          System.out.println("Seu saldo atual: "+valorAtual);
          break;
        }
        case 2:{
          System.out.println("Qual o seu saldo?");
          double saldo = sc.nextDouble();
          conta.sacar(saldo);
          break;
        }
        default:{
          System.out.println("Opção inválida!");
        }
        
      }
      if (!sc.hasNextLine()){
        sc.close();
      }
      System.out.println("Deseja executar novamente? 1 para sim");
      menu = sc.nextInt();
      sc.nextLine();  
    } 
  }
}

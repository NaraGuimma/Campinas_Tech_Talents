import java.util.Scanner;


class Conta {
  String titular;
  String numeroConta;
  Scanner sc = new Scanner(System.in);
  public void sacar(double saldo) {
    System.out.println("Quanto você quer sacar?");
    double valor = sc.nextDouble();

    if (saldo >= valor){
      saldo = saldo - valor;
      System.out.println("Seu saldo atual apóós o seu saque é: "+saldo );
    } else {
      System.out.println("Você não tem saldo suficiente");
    }
    

  }

  public double deposito(double saldo){
    System.out.println("Quanto você quer depositar?");
    double deposit = sc.nextDouble();
    saldo = saldo + deposit;
    return saldo;
  }

  public static void main(String[] args) {
    
  }
}

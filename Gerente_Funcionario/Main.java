import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Gerente ge = new Gerente();
    int meucargo;

    System.out.println("\nNome do funcionario");
    ge.setNome(sc.next());

    System.out.println("\nCpf do funcionario"); ge.setCpf(sc.next());

    System.out.println("\nSalario do funcionario");
    ge.setSalario(sc.nextDouble());
    
    System.out.println("\nSenha do funcionario");
    ge.setSenha(sc.nextInt());

    System.out.println("\nVocê é gerente? 1 para sim");
    meucargo = sc.nextInt();

    if (meucargo == 1) {
      System.out.println("\nSenha do gerente");
      ge.autenticar(sc.nextInt());
    }
    else {
      System.out.println("\n Sinto muito, você não tem permissão de obter esses dados. \n");

    }
    
    
  }
}

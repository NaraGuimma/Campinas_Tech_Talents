import java.util.Scanner;

class Main {
   public static void imprimir(String question){
    String answer = "";
    System.out.println(question);
    Scanner sc = new Scanner(System.in);
    answer = sc.nextLine();
    int count = 0;
    System.out.println("SUA RESPOSTA:");
    while (count <5){
      System.out.println(answer);
      count +=1;
    }

    System.out.println("FIM DA SUA RESPOSTA");
    if (!sc.hasNextLine()){
      sc.close();
    }

  }
  public static void main(String[] args) {

    imprimir("Qual o seu telefone?");
    imprimir("Digite um texto?");
    
  }
}

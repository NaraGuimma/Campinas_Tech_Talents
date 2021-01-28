import java.util.Scanner;

class Leitor {
  public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.println("Qual o seu nome?");
    String name = value.nextLine();
    System.out.println("Olá " + name + ", qual a sua idade?");
    int idade = value.nextInt();
    System.out.println("Ah! Então você tem " + idade + " "+ name + "!");
    value.close();
  }
}

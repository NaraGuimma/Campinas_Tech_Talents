import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    Convert conv = new Convert();


    System.out.println("Conversor Celsius Fahrenheit e vice versa");
    System.out.println("Você deseja converter: \n 1 - Celsius -> Fahrenheit \n 2 - Fahrenheit -> Celsius");
    int val = scan.nextInt();
    System.out.println("Qual a temperatura você deseja converter");
    double temp = scan.nextDouble();
    switch (val) {
      case 1:
        System.out.printf("Sua temperatura em Fahrenheit é %.2f" ,conv.Fahrenheit(temp));
        break;
      case 2:
        System.out.printf("Sua temperatura em Celsius é %.2f" ,conv.Celsius(temp));
        break;
      default:
        System.out.println("Valor inválido");
    }
    scan.close();
  }
}

import java.util.Scanner;

class Opcoes {
  public void Options (){
    int cont = 0;
    Scanner sc = new Scanner(System.in);
    Calculos cal = new Calculos();
    

    System.out.println("Menu de opções:\n");
    
    while (cont != 3){
      System.out.println("1 - Distância em km");
      System.out.println("2 - Distância em m");
      System.out.println("3 - Sair\n");

      cont = sc.nextInt();

      switch (cont) {
        case 1:{
          System.out.println("\nDistância percorrida em Km");
          double dist = sc.nextDouble();
          System.out.println("\nQuatidade de combustível gasta (km/L)");
          double gas = sc.nextDouble();
          System.out.printf("\nO consumo médio do seu automóvel é %.2f", cal.Calculos_KM(dist, gas));
          System.out.println("\n\nDeseja executar novamente? 3 para sair do sistema");
          cont = sc.nextInt(); 
          break;

        }
        case 2:{
          System.out.println("\nDistância percorrida em m");
          double dist = sc.nextDouble();
          System.out.println("\nQuatidade de combustível gasta (km/L)");
          double gas = sc.nextDouble();
          System.out.printf("\nO consumo médio do seu automóvel é %.2f", cal.Calculos_M(dist, gas));
          System.out.println("\n\nDeseja executar novamente? 3 para sair do sistema");
          cont = sc.nextInt();
          break;

        }
        case 3:
          break;

        default:
          System.out.println("\nOpção Inválida. Vamos tentar novamente?\n");

      }


    }

    sc.nextLine();
    sc.close();
  }
}

import java.util.*;

class TryCatchNotBoolean{

  public boolean runAgain(){
    Scanner sc = new Scanner(System.in);
    boolean rodar = true;  
    System.out.println("Deseja executar novamente? true ou false");
    try{
      rodar = sc.nextBoolean();
      sc.nextLine();
      System.out.printf("Sua resposta foi %b", rodar);

    }
    catch (InputMismatchException e2){
      System.out.println("Não é um booleano");
      rodar = false;
    }
    catch(NullPointerException e3) {
      System.out.println("Não é um booleano");
      rodar = false;
    }
    return rodar;
  }

}

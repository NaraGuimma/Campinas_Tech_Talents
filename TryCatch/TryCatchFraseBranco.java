import java.util.*;

class TryCatchFraseBranco{
  Scanner sc = new Scanner(System.in);
  TryCatchNotBoolean bool = new TryCatchNotBoolean();
  String fraseMaiuscula;
  boolean rodar = true;  
  public void fraseDigitada(){
    while (rodar){
      System.out.println("Digite uma frase\n");
      String frase = sc.nextLine();
      fraseMaiuscula = frase.toUpperCase();
      try {  
        char carac = frase.charAt(0);  
      } 
      catch(StringIndexOutOfBoundsException e1) {
        // e.printStackTrace();
        System.out.println("Frase em branco\n");
        rodar = bool.runAgain();

      }
      finally{
        System.out.println(fraseMaiuscula + "\n");
      }
    }   
  
    sc.nextLine();
    sc.close();
  }
}

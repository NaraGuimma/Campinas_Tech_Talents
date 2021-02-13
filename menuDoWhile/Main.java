import java.util.Scanner;

class Main {
  public static void main(String[] args) throws InterruptedException {
    Menu menu = new Menu();
    int val = menu.MeuMenu();
    do {
      val = menu.MeuMenu();
      Thread.sleep(1000);
    }while (val != 0);
    System.out.println("Até mais!");
  }
  
}

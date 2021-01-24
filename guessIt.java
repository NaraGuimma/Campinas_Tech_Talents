import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    int attemptNum = 0;
    int foundValue = 1;
    int max = 10;
    int min = 1;
    int chances = 1;
    Random rand = new Random();
    int number = rand.nextInt((max - min) + 1) + min;
    Scanner value = new Scanner(System.in);
   while (chances < 3 || foundValue != 0){
      System.out.println("Choose a value between 1 and 10 - change number: " + chances);
      attemptNum = value.nextInt();
      if (chances == 3){
          System.out.println("Better luck next time! Do you want to play again? 0 - no");
          foundValue = value.nextInt();
          if (foundValue != 0){
            chances = 1;
            number = rand.nextInt((max - min) + 1) + min;
          }
          
      }else {
          chances++;
        }
      if (number == attemptNum){
        System.out.println("Congratulations!!! Do you want to play again? 0 - no");
          foundValue = value.nextInt();
          if (foundValue != 0){
            chances = 1;
            number = rand.nextInt((max - min) + 1) + min;
          }
      }
      
    }
  }
}

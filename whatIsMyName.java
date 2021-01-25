import java.util.Scanner;
import java.util.Random;

class Main {

  public static char[] myGuess(String question){
    String answer = "";
    System.out.println(question);
    Scanner input = new Scanner(System.in);
    answer = input.nextLine();
    char name = answer.charAt(0);
    int arrayLength = answer.length();
    char lastChar = answer.charAt(arrayLength -1);
    char[] ar = new char[2];
    ar[0] = name;
    ar[1] =  lastChar;
    return ar;

  }
  public static void main(String[] args) {
    int min = 90;  
    int max = 100;
    char[] ar = new char[2];
    String finalResult = "";
    Random rand = new Random();
    int percentage = rand.nextInt((max - min) + 1) + min; 
    System.out.println("Hello");
    ar = myGuess("What is your favorite movie?");
    if (ar[1] == '.'){
      finalResult += ar[0];
    }
    ar = myGuess("What is your favorite color?");
    if (ar[1] == '.'){
      finalResult += ar[0];
    }
    ar = myGuess("What is your favorite season of the year?");
    if (ar[1] == '.'){
      finalResult += ar[0];
    }
    ar = myGuess("What is your favorite singer?");
    if (ar[1] == '.'){
      finalResult += ar[0];
    }
    ar = myGuess("What is your favorite place in the world?");
    if (ar[1] == '.'){
      finalResult += ar[0];  
    }
  
    System.out.println("With " + percentage + "%, your name is:");
    System.out.println(finalResult);

  }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int val;

    Scanner sc = new Scanner(System.in);
    System.out.println("Primeiro Número");
    int num1= sc.nextInt();


    System.out.println("Segundo Número");
    int num2 = sc.nextInt();

    System.out.println("Terceiro Número");
    int num3 = sc.nextInt();

    if (num1 > num2 && num1 >num3 && num2 > num3){
      if (num1 > num3){
        val = num3;
        num3 = num1;
        num1 = val;
      } 
    }
    else {
      if (num1 > num2 && num1 < num3 && num2 < num3){
        val = num2;
        num2 = num1;
        num1 = val;
      } 
      else{
        if (num1 < num2 && num1 < num3 && num2 > num3){
          val = num3;
          num3 = num2;
          num2 = val;
        } 
      }
    }
    System.out.println("\n");
    System.out.println(num1+" , "+num2 +" , "+num3);
    System.out.println("\n");
    System.out.println("Menor " + num1);
    System.out.println("\n");
    System.out.println("Maior " + num3);

    sc.close();
  }
}

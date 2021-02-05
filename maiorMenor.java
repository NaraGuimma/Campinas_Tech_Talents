import java.util.Scanner;
import java.util.Arrays;


class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int n = 3;
    int arr[] = new int[n];
    int i;

    for (i=0; i<n; i++) {
      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
      arr[i] = sc.nextInt();
    }

    int menor = arr[0]; 
    int maior = arr[0];

    for (i=0; i<n; i++) {

      if (arr[i] <= menor)
         menor = arr[i];

      if (arr[i] > maior)
         maior = arr[i];
    }


    System.out.printf("\n");
    for (i=0; i<n; i++) {
      if (arr[i] == menor)
        System.out.printf("arr[%d] = %2d <--- menor valor\n", i, arr[i]);
      else {
        if (arr[i] == maior)
          System.out.printf("arr[%d] = %2d <--- maior valor\n", i, arr[i]);
      }
    }



  }
}

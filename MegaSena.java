import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
    SortedSet<Integer> jogo = new TreeSet<Integer>();
    SortedSet<Integer> usados = new TreeSet<Integer>();
    Scanner sc = new Scanner(System.in);

    int i, j, n;

    System.out.printf("+------------------------------+\n");
    System.out.printf("|   M  E  G  A - S  E  N  A    |\n");
    System.out.printf("+------------------------------+\n");
    System.out.println("Quantos jogos você deseja realizar?");
    int jogos = sc.nextInt();
    System.out.println("Quantos números você quer jogar por jogo?");
    int numeros = sc.nextInt();
    for (i=1; i<=jogos; i++) {

      jogo.clear();
      for (j=1; j<=numeros; j++) {

        do {

          n = (int)Math.round(Math.random() * 59) + 1;
        } while (usados.contains(n));

        jogo.add(n);
        usados.add(n);
      }

      System.out.printf("| %2do. Jogo: ", i);

      for (Integer item: jogo) {
        System.out.printf("%2d ", item);
      }

      System.out.printf("|\n");
      System.out.printf("+------------------------------+\n");

    }
    sc.nextLine();
    sc.close();
  }
}

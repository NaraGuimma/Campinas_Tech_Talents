import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contin = 1;
    String arr[] = {"DE", "DOS", "DAS", "DA", "DO"};

    do{
      System.out.println("Digite o nome completo");
      String resultado = "";
      String nomeCompleto;
      String citacao;
      String resultadoFinal = "";
      String sep = ".";
      String virg = ", ";

      nomeCompleto = sc.nextLine();

      nomeCompleto = nomeCompleto.toUpperCase().trim();

      String[] textoSeparado = nomeCompleto.split(" ");


      citacao = textoSeparado[textoSeparado.length - 1];

      for (int i = 0; i < textoSeparado.length-1; i++){
        int notName = 0;
        for (int j = 0; j< arr.length; j++){
          if (textoSeparado[i].equals(arr[j])){
            notName = notName + 1;
          }
        }
        if (notName == 0){

          resultado = resultado + textoSeparado[i].substring(0,1).concat(sep);
        }

      }
      
      resultadoFinal = citacao.concat(virg).concat(resultado);
      System.out.println(resultadoFinal);

      System.out.println("Você deseja criar uma nova citação? 1 - sim");
      contin = sc.nextInt();
      sc.nextLine();

    }while (contin == 1);

 
    sc.close();

   //String resultado = nomeCompleto.substring(nomeCompleto.lastIndexOf(' ')+1, nomeCompleto.length());
    
  //  System.out.println(resultado);

  }
}

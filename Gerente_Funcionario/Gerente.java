public class Gerente extends Funcionario{


  public boolean autenticar(int senha){

    System.out.println(super.senhaRecebida);
    System.out.println(senha);

    if(super.senhaRecebida == senha){
      System.out.println("Autenticado\n");
      System.out.println("\n\n");
      System.out.println("--------------INFORMAÇÕES--------------");
      System.out.println("Nome do Funcionário " + super.nome);
      System.out.println("CPF do Funcionário: " + super.cpf);
      System.out.println("Salário do Funcionário: " + super.salario);

      return true;
    }
    else{
      System.out.println("Acesso Negado");
      return false;
    }

  }
}


class Funcionario {

  public String nome;
  public String cpf;
  public double salario;
  public int senhaRecebida;

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public double getSalario() {
    return salario;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }


  public int setSenha(int senha) {
    senhaRecebida = senha;
    return senhaRecebida;
  }
}


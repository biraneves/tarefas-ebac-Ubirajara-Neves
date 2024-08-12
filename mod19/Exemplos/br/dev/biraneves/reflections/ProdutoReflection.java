package br.dev.biraneves.reflections;

class ProdutoReflection {

  private Long codigo;
  private String nome;
  private Double valor;

  public ProdutoReflection() {
  }

  public ProdutoReflection(Long codigo) {
    this.codigo = codigo;
  }

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

}

package br.dev.biraneves.annotations;

import java.util.UUID;

@Tabela(value = "estudantes")
public class Estudante {
  UUID id;
  String nome;
  int idade;
  String curso;
}

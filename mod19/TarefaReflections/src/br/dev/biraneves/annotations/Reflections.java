package br.dev.biraneves.annotations;

import java.text.Annotation;

import br.dev.biraneves.annotations.Estudante;

class Reflections {

  public static void main(String[] args) {

    Estudante estudante = new Estudante();
    Class<?> clEstudante = estudante.getClass();

    if (clEstudante.isAnnotationPresent(Tabela.class)) {
      System.out.println(clEstudante.getAnnotation(Tabela.class).value());
    }
  }

}

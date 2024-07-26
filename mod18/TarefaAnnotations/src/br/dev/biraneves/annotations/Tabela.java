package br.dev.biraneves.annotations;

import java.util.annotations.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tabela {

  String value(); // Nome da tabela

}

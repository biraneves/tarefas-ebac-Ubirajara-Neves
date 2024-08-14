package br.dev.biraneves.anonimas;

class AnonimaTeste {

  public static void main(String[] args) {

    MyConsumer anonima = new MyConsumer() {
      @Override
      public void consumer(Object value) {
        System.out.println(value);
      }
    };
    anonima.consumer("My Consumer classic");

    // Lambda expression
    MyConsumer anonimaLambda = (Object value) -> System.out.println(value);
    anonimaLambda.consumer("My Consumer lambda");

  }

}

package br.dev.biraneves.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectionsClasses {

  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
      InvocationTargetException, IllegalAccessException, InstantiationException {

    executeClasses();
    executeConstructors();
    executeFields();
    executeMethods();

  }

  private static void executeClasses() throws ClassNotFoundException {

    System.out.println("***** Classes *****");
    Class<?> c1 = boolean.class;
    System.out.println(c1);

    Class<?> c2 = java.io.PrintStream.class;
    System.out.println(c2);

    Class<?> c3 = Class.forName("br.dev.biraneves.reflections.ReflectionsClasses");
    System.out.println(c3);

    System.out.println(ReflectionsClasses.class);
    System.out.println(ReflectionsClasses.class.getSimpleName());
    System.out.println(ReflectionsClasses.class.getName());

  }

  private static void executeConstructors()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

    System.out.println("***** Constructors *****");
    Class<?> prodC = ProdutoReflection.class;
    System.out.println(prodC);

    Constructor<?> con = prodC.getConstructor();
    System.out.println(con);

    ProdutoReflection prod = (ProdutoReflection) con.newInstance();
    System.out.println(prod);

    Constructor<?> con1 = prodC.getConstructor(Long.class);
    System.out.println(con1);
    ProdutoReflection prod1 = (ProdutoReflection) con1.newInstance(10L);
    System.out.println(prod1 + " tem código: " + prod1.getCodigo());

    Constructor<?>[] constructors = prodC.getDeclaredConstructors();
    System.out.println("Construtores declarados:");
    for (Constructor<?> cons : constructors) {
      System.out.println(cons);
    }

  }

  private static void executeFields() {

    System.out.println("***** Propriedades *****");
    ProdutoReflection prod = new ProdutoReflection();
    Field[] fields = prod.getClass().getDeclaredFields();

    for (Field field : fields) {
      System.out.println("Nome completo: " + field);
      System.out.println("Nome simples: " + field.getName());
      System.out.println("Tipo da propriedade: " + field.getType());
      System.out.println();
    }

  }

  private static void executeMethods() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    System.out.println("***** Métodos *****");
    ProdutoReflection prod = new ProdutoReflection();
    Method[] methods = prod.getClass().getDeclaredMethods();

    for (Method method : methods) {
      System.out.println("Nome completo: " + method);
      System.out.println("Nome simples: " + method.getName());
      System.out.println("Tipo de retorno: " + method.getReturnType());
      System.out.println();
    }

    Method method = prod.getClass().getMethod("getNome");
    System.out.println("Pegando método pelo nome: " + method.getName());

    Method method1 = prod.getClass().getMethod("setNome", String.class);
    System.out.println("Pegando método pelo nome: " + method1.getName());

    method1.invoke(prod, "Bira");
    System.out.println("Pegando valor do nome: " + method.invoke(prod));

  }

}

package br.dev.biraneves.mod23.tests;

import br.dev.biraneves.mod23.Pessoa;
import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void testConstructorAndGetters() {
        Pessoa pessoa = new Pessoa("João", "M");

        Assert.assertEquals("João", pessoa.getNome());
        Assert.assertEquals("M", pessoa.getSexo());
    }

    @Test
    public void testSetters() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setSexo("F");

        Assert.assertEquals("Maria", pessoa.getNome());
        Assert.assertEquals("F", pessoa.getSexo());
    }

    @Test
    public void testHashCode() {
        Pessoa pessoa1 = new Pessoa("Ana", "F");
        Pessoa pessoa2 = new Pessoa("Ana", "F");

        Assert.assertEquals(pessoa1.hashCode(), pessoa2.hashCode());
    }

    @Test
    public void testEquals() {
        Pessoa pessoa1 = new Pessoa("Carlos", "M");
        Pessoa pessoa2 = new Pessoa("Carlos", "M");
        Pessoa pessoa3 = new Pessoa("Carlos", "F");
        Pessoa pessoa4 = new Pessoa("Ana", "M");
        Pessoa pessoa5 = new Pessoa();
        Pessoa pessoa6 = new Pessoa();

        Assert.assertTrue(pessoa1.equals(pessoa2));
        Assert.assertFalse(pessoa1.equals(pessoa3));
        Assert.assertFalse(pessoa1.equals(pessoa4));
        Assert.assertFalse(pessoa1.equals(null));
        Assert.assertFalse(pessoa1.equals(new Object()));
        Assert.assertTrue(pessoa5.equals(pessoa6));
    }

    @Test
    public void testToString() {
        Pessoa pessoa = new Pessoa("Pedro", "M");
        Assert.assertEquals("Pessoa{nome = Pedro; sexo = M}", pessoa.toString());
    }

}

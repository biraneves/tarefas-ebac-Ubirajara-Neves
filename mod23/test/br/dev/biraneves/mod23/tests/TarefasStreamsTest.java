package br.dev.biraneves.mod23.tests;

import br.dev.biraneves.mod23.Pessoa;
import br.dev.biraneves.mod23.TarefaStreams;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TarefasStreamsTest {

    @Test
    public void testFiltraMulheres() {
        Pessoa pessoa1 = new Pessoa("João", "M");
        Pessoa pessoa2 = new Pessoa("Maria", "F");
        Pessoa pessoa3 = new Pessoa("Ana", "F");

        List<Pessoa> pessoas = Arrays.asList(pessoa1, pessoa2, pessoa3);
        List<Pessoa> mulheres = TarefaStreams.filtrarMulheres(pessoas);

        Assert.assertEquals(2, mulheres.size());
        Assert.assertEquals("Maria", mulheres.get(0).getNome());
        Assert.assertEquals("Ana", mulheres.get(1).getNome());
        Assert.assertEquals("F", mulheres.get(0).getSexo());
        Assert.assertEquals("F", mulheres.get(1).getSexo());
    }

}

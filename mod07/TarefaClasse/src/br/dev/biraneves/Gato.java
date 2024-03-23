package br.dev.biraneves;

/**
 * A classe Gato modela as características e comportamentos básicos de um gato.
 * Inclui atributos para o nome, idade, cor e estado de sono do gato,
 * bem como métodos para interagir com esses atributos.
 */
public class Gato {

    /** Nome do gato. */
    private String nome;

    /** Idade do gato em anos. */
    private int idade;

    /** Cor do gato. */
    private String cor;

    /** Estado de sono do gato. Verdadeiro se o gato estiver dormindo. */
    private boolean estaDormindo = false;

    /**
     * Constrói uma nova instância de Gato com os parâmetros especificados.
     * 
     * @param nome Nome do gato.
     * @param idade Idade do gato em anos.
     * @param cor Cor do gato.
     */
    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    /**
     * Faz o gato miar. Se o gato estiver dormindo, imprime uma mensagem de que está dormindo.
     */
    public void miar() {
        if (!estaDormindo) {
            System.out.println(nome + " diz: Miau!");
        } else {
            System.out.println(nome + " está dormindo, zzz...");
        }
    }

    /**
     * Coloca o gato para dormir, alterando seu estado de sono para verdadeiro.
     */
    public void dormir() {
        estaDormindo = true;
        System.out.println(nome + " agora está dormindo, zzz...");
    }

    /**
     * Acorda o gato, alterando seu estado de sono para falso.
     */
    public void acordar() {
        estaDormindo = false;
        System.out.println(nome + " acordou. Hora de atividades!");
    }

    /**
     * Exibe o humor do gato com base em seu estado de sono.
     */
    public void mostrarHumor() {
        if (estaDormindo) {
            System.out.println(nome + " está sonhando com peixes, está feliz.");
        } else {
            System.out.println(nome + " quer atenção e brincar. Parece estar de bom humor.");
        }
    }

    // Getters e setters

    /**
     * Retorna o nome do gato.
     * @return Nome do gato.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do gato.
     * @param nome Novo nome do gato.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a idade do gato.
     * @return Idade do gato em anos.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do gato.
     * @param idade Nova idade do gato em anos.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Retorna a cor do gato.
     * @return Cor do gato.
     */
    public String getCor() {
        return cor;
    }

    /**
     * Define a cor do gato.
     * @param cor Nova cor do gato.
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Verifica se o gato está dormindo.
     * @return Verdadeiro se o gato estiver dormindo, falso caso contrário.
     */
    public boolean isEstaDormindo() {
        return estaDormindo;
    }

    /**
     * Retorna uma representação em String do gato.
     * @return String contendo os detalhes do gato.
     */
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", estaDormindo=" + estaDormindo +
                '}';
    }

}

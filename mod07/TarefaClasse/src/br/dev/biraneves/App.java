package br.dev.biraneves;
public class App {
    public static void main(String[] args) {

        // Criando um novo gato chamado "Garfield", com 3 anos de idade e cor laranja.
        Gato garfield = new Gato("Garfield", 3, "laranja");

        System.out.println("Conhecendo o gato...");
        System.out.println("Nome: " + garfield.getNome());
        System.out.println("Idade: " + garfield.getIdade() + " anos");
        System.out.println("Cor: " + garfield.getCor());

        // Fazendo Garfield miar.
        System.out.println("\nPedindo para Garfield miar:");
        garfield.miar();

        // Verificando o humor de Garfield antes de dormir.
        System.out.println("\nVerificando o humor de Garfield:");
        garfield.mostrarHumor();

        // Fazendo Garfield dormir.
        System.out.println("\nÉ hora de Gardield dormir:");
        garfield.dormir();

        // Tentando fazer Garfield miar enquanto dorme.
        System.out.println("\nTentando fazer Garfield miar enquanto dorme:");
        garfield.miar();

        // Verificando o humor de Garfield enquanto dorme.
        System.out.println("\nVerificando o humor de Garfield enquanto dorme:");
        garfield.mostrarHumor();

        // Acordando Garfield.
        System.out.println("\nHora de acordar Garfield:");
        garfield.acordar();

        // Verificando o humor de Garfield depois de acordar.
        System.out.println("\nVerificando o humor de Garfield depois de acordar:");
        garfield.mostrarHumor();

        // Testando o método toString().
        System.out.println("\nTestando o método toString():");
        System.out.println(garfield);

    }
}

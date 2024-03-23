package br.dev.biraneves;

public class CalculadoraMedia {
    
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    public CalculadoraMedia(float nota1, float nota2, float nota3, float nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public float calculaMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    // Getters e setters
    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

}

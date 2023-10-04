package br.senai.sp.jandira.model;

public class Animal {
    private String nome;
    private int idade;
    private String sexo;
    private String identificacao;

    public Animal(String nome, int idade, String sexo, String identificacao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.identificacao = identificacao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
}

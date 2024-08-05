package org.Lanche.entities;

public class Lanche {
    private String nome;
    private int id;
    private String caminhoImagem;
    private double preco;

    public Lanche(String nome, int id, String caminhoImagem, double preco) {
        this.nome = nome;
        this.id = id;
        this.caminhoImagem = caminhoImagem;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



}

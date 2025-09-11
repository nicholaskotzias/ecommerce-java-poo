package com.nicholaskotzias.models;

public class Produto {
    private String nome;
    private Double preco;
    private Integer estoque;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.preco;
    }
}

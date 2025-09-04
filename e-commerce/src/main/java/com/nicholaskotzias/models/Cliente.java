package com.nicholaskotzias.models;


public class Cliente extends Usuario {

    private Carrinho carrinho;

    public Cliente(String nome, String email) {
        super(nome, email);
    }

    public void setCarrinho(Carrinho carrinho){
        this.carrinho = carrinho;
    }

    // public Boolean adicionarProdutoCarrinho(Produto newProduto) {
    // if (newProduto == null)
    // return false;

    // this.carrinho.add(newProduto);
    // return true;
    // }

}
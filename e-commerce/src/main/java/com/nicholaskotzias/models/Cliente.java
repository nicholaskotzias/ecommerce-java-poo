package com.nicholaskotzias.models;

import java.util.ArrayList;

public class Cliente extends Usuario {

    ArrayList<Produto> carrinho;

    public Cliente(String nome, String email) {
        super(nome, email);

        this.carrinho = new ArrayList<>();
    }

    public Boolean adicionarProdutoCarrinho(Produto newProduto) {
        if (newProduto == null)
            return false;

        this.carrinho.add(newProduto);
        return true;
    }                     
    
    
}
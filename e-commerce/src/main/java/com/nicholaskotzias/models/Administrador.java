package com.nicholaskotzias.models;

import com.nicholaskotzias.Main;

public class Administrador extends Usuario {
    public Administrador(String nome, String email) {
        super(nome, email);
    }

    public Boolean cadastrarProduto(Produto newProduto) {
        if (newProduto == null)
            return false;

        Main.bdProdutos.add(newProduto);
        return true;
    }
}

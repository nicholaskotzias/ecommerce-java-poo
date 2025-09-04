package com.nicholaskotzias.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;
    private Double total;
    private String descricao;
    private LocalDateTime criadoEm;
    private LocalDateTime finalizadoEm;

    public Carrinho(Double total, String descricao, LocalDateTime criadoEm,
            LocalDateTime finalizadoEm) {
        this.produtos = new ArrayList<>();
        this.total = total;
        this.descricao = descricao;
        this.criadoEm = criadoEm;
        this.finalizadoEm = finalizadoEm;
    }

    public Carrinho(LocalDateTime criadoEm){
        this.produtos = new ArrayList<>();
        this.total = 0.0;
        this.descricao = "PENDENTE";
        this.criadoEm = criadoEm;
        this.finalizadoEm = null;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public LocalDateTime getFinalizadoEm() {
        return finalizadoEm;
    }

    public void setFinalizadoEm(LocalDateTime finalizadoEm) {
        this.finalizadoEm = finalizadoEm;
    }
}  

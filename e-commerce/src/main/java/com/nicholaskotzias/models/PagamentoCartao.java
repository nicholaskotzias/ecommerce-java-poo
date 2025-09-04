package com.nicholaskotzias.models;

import com.nicholaskotzias.models.abstracts.Pagamento;

public class PagamentoCartao extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagando com cartão crédito");
    }
}

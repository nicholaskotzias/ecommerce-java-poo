package com.nicholaskotzias.models;

import com.nicholaskotzias.models.abstracts.Pagamento;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagando com boleto");
    }

}

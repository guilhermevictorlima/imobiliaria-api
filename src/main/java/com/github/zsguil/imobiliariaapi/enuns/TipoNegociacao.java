package com.github.zsguil.imobiliariaapi.enuns;

public enum TipoNegociacao {

    VENDA("Venda"),
    ALUGUEL_MENSAL("Aluguel mensal"),
    ALUGUEL_TEMPORADA("Aluguel temporada (diária)"),
    PERMUTA("Permuta"),
    ARRENDAMENTO("Arrendamento");

    private final String descricao;

    TipoNegociacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

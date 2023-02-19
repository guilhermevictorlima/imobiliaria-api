package com.github.zsguil.imobiliariaapi.enuns;

public enum TipoImovel {

    CASA("Casa"),
    APARTAMENTO("Apartamento"),
    CHACARA_SITIO("Chácara/Sítio"),
    GALPAO("Galpão"),
    SALA_COMERCIAL("Sala comercial"),
    TERRENO("Terreno");

    private final String descricao;

    TipoImovel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

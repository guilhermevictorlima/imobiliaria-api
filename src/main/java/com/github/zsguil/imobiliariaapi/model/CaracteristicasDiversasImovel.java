package com.github.zsguil.imobiliariaapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

import java.util.Objects;

@Entity
public class CaracteristicasDiversasImovel {

    @Id
    @GeneratedValue(generator = "seq_caracteristicas_diversas_imovel", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_caracteristicas_diversas_imovel", allocationSize = 1)
    private Integer caracteristicasDiversasId;

    @OneToOne(fetch = FetchType.LAZY)
    private Imovel imovel;

    private Integer ocupacaoMaxima;
    private String complemento;

    private boolean areaDeLazer;
    private boolean churrasqueira;
    private boolean elevador;
    private boolean mobiliado;
    private boolean semiMobiliado;
    private boolean salaoFestas;
    private boolean sacada;
    private boolean piscina;

    public Integer getCaracteristicasDiversasId() {
        return caracteristicasDiversasId;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Integer getOcupacaoMaxima() {
        return ocupacaoMaxima;
    }

    public void setOcupacaoMaxima(Integer ocupacaoMaxima) {
        this.ocupacaoMaxima = ocupacaoMaxima;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public boolean isAreaDeLazer() {
        return areaDeLazer;
    }

    public void setAreaDeLazer(boolean areaDeLazer) {
        this.areaDeLazer = areaDeLazer;
    }

    public boolean isChurrasqueira() {
        return churrasqueira;
    }

    public void setChurrasqueira(boolean churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    public boolean isElevador() {
        return elevador;
    }

    public void setElevador(boolean elevador) {
        this.elevador = elevador;
    }

    public boolean isMobiliado() {
        return mobiliado;
    }

    public void setMobiliado(boolean mobiliado) {
        this.mobiliado = mobiliado;
    }

    public boolean isSemiMobiliado() {
        return semiMobiliado;
    }

    public void setSemiMobiliado(boolean semiMobiliado) {
        this.semiMobiliado = semiMobiliado;
    }

    public boolean isSalaoFestas() {
        return salaoFestas;
    }

    public void setSalaoFestas(boolean salaoFestas) {
        this.salaoFestas = salaoFestas;
    }

    public boolean isSacada() {
        return sacada;
    }

    public void setSacada(boolean sacada) {
        this.sacada = sacada;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CaracteristicasDiversasImovel that = (CaracteristicasDiversasImovel) o;
        return areaDeLazer == that.areaDeLazer
                && churrasqueira == that.churrasqueira
                && elevador == that.elevador
                && mobiliado == that.mobiliado
                && semiMobiliado == that.semiMobiliado
                && salaoFestas == that.salaoFestas
                && sacada == that.sacada
                && piscina == that.piscina
                && Objects.equals(caracteristicasDiversasId, that.caracteristicasDiversasId)
                && Objects.equals(imovel, that.imovel)
                && Objects.equals(ocupacaoMaxima, that.ocupacaoMaxima)
                && Objects.equals(complemento, that.complemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caracteristicasDiversasId, imovel, ocupacaoMaxima, complemento, areaDeLazer, churrasqueira, elevador, mobiliado,
                semiMobiliado, salaoFestas, sacada, piscina);
    }
}

package com.github.zsguil.imobiliariaapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

import java.util.Objects;

@Entity
public class EnderecoImovel {

    @Id
    @GeneratedValue(generator = "seq_endereco_imovel", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_endereco_imovel", allocationSize = 1)
    private Integer enderecoImovelId;

    @OneToOne(fetch = FetchType.LAZY)
    private Imovel imovel;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private String pontoReferencia;

    private boolean divulgarSomenteBairroECidade;

    public Integer getEnderecoImovelId() {
        return enderecoImovelId;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public boolean isDivulgarSomenteBairroECidade() {
        return divulgarSomenteBairroECidade;
    }

    public void setDivulgarSomenteBairroECidade(boolean divulgarSomenteBairroECidade) {
        this.divulgarSomenteBairroECidade = divulgarSomenteBairroECidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EnderecoImovel that = (EnderecoImovel) o;

        return divulgarSomenteBairroECidade == that.divulgarSomenteBairroECidade
                && Objects.equals(enderecoImovelId, that.enderecoImovelId)
                && Objects.equals(imovel, that.imovel)
                && Objects.equals(bairro, that.bairro)
                && Objects.equals(cidade, that.cidade)
                && Objects.equals(cep, that.cep)
                && Objects.equals(rua, that.rua)
                && Objects.equals(numero, that.numero)
                && Objects.equals(complemento, that.complemento)
                && Objects.equals(pontoReferencia, that.pontoReferencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enderecoImovelId, imovel, bairro, cidade, cep, rua, numero, complemento, pontoReferencia, divulgarSomenteBairroECidade);
    }
}

package com.github.zsguil.imobiliariaapi.model;

import com.github.zsguil.imobiliariaapi.enuns.TipoImovel;
import com.github.zsguil.imobiliariaapi.enuns.TipoNegociacao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@DynamicUpdate
public class Imovel {

    @Id
    @GeneratedValue(generator = "seq_imovel", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_imovel", allocationSize = 1)
    private Integer imovelId;

    @Column(unique = true)
    private Long numeroMatriculaImovel;

    @Column(unique = true)
    private Long numeroMatriculaAgua;

    private Long numeroUnidadeEnergia;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;
    private String propostasValoresFixos;
    private String demaisTaxas;

    @Column(nullable = false)
    private BigDecimal valorVenda;

    private BigDecimal valorIptu;
    private BigDecimal valorCondominio;
    private BigDecimal valorAgua;
    private BigDecimal valorEnergia;
    private BigDecimal valorLixo;
    private BigDecimal taxaLimpeza;

    private boolean divulgarPropostasValoresFixos;
    private boolean usarValorVendaComoMinimo;

    @ColumnDefault("true")
    private boolean divulgarValorVenda;

    private boolean divulgarValoresFixos;

    @OneToOne(fetch = FetchType.LAZY)
    private EnderecoImovel enderecoImovel;

    @Enumerated(value = EnumType.STRING)
    private TipoImovel tipoImovel;

    @Enumerated(value = EnumType.STRING)
    private TipoNegociacao tipoNegociacao;


    public Integer getImovelId() {
        return imovelId;
    }

    public Long getNumeroMatriculaImovel() {
        return numeroMatriculaImovel;
    }

    public void setNumeroMatriculaImovel(Long numeroMatriculaImovel) {
        this.numeroMatriculaImovel = numeroMatriculaImovel;
    }

    public Long getNumeroMatriculaAgua() {
        return numeroMatriculaAgua;
    }

    public void setNumeroMatriculaAgua(Long numeroMatriculaAgua) {
        this.numeroMatriculaAgua = numeroMatriculaAgua;
    }

    public Long getNumeroUnidadeEnergia() {
        return numeroUnidadeEnergia;
    }

    public void setNumeroUnidadeEnergia(Long numeroUnidadeEnergia) {
        this.numeroUnidadeEnergia = numeroUnidadeEnergia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPropostasValoresFixos() {
        return propostasValoresFixos;
    }

    public void setPropostasValoresFixos(String propostasValoresFixos) {
        this.propostasValoresFixos = propostasValoresFixos;
    }

    public String getDemaisTaxas() {
        return demaisTaxas;
    }

    public void setDemaisTaxas(String demaisTaxas) {
        this.demaisTaxas = demaisTaxas;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public BigDecimal getValorIptu() {
        return valorIptu;
    }

    public void setValorIptu(BigDecimal valorIptu) {
        this.valorIptu = valorIptu;
    }

    public BigDecimal getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(BigDecimal valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public BigDecimal getValorAgua() {
        return valorAgua;
    }

    public void setValorAgua(BigDecimal valorAgua) {
        this.valorAgua = valorAgua;
    }

    public BigDecimal getValorEnergia() {
        return valorEnergia;
    }

    public void setValorEnergia(BigDecimal valorEnergia) {
        this.valorEnergia = valorEnergia;
    }

    public BigDecimal getValorLixo() {
        return valorLixo;
    }

    public void setValorLixo(BigDecimal valorLixo) {
        this.valorLixo = valorLixo;
    }

    public BigDecimal getTaxaLimpeza() {
        return taxaLimpeza;
    }

    public void setTaxaLimpeza(BigDecimal taxaLimpeza) {
        this.taxaLimpeza = taxaLimpeza;
    }

    public boolean isDivulgarPropostasValoresFixos() {
        return divulgarPropostasValoresFixos;
    }

    public void setDivulgarPropostasValoresFixos(boolean divulgarPropostasValoresFixos) {
        this.divulgarPropostasValoresFixos = divulgarPropostasValoresFixos;
    }

    public boolean isUsarValorVendaComoMinimo() {
        return usarValorVendaComoMinimo;
    }

    public void setUsarValorVendaComoMinimo(boolean usarValorVendaComoMinimo) {
        this.usarValorVendaComoMinimo = usarValorVendaComoMinimo;
    }

    public boolean isDivulgarValorVenda() {
        return divulgarValorVenda;
    }

    public void setDivulgarValorVenda(boolean divulgarValorVenda) {
        this.divulgarValorVenda = divulgarValorVenda;
    }

    public boolean isDivulgarValoresFixos() {
        return divulgarValoresFixos;
    }

    public void setDivulgarValoresFixos(boolean divulgarValoresFixos) {
        this.divulgarValoresFixos = divulgarValoresFixos;
    }

    public EnderecoImovel getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(EnderecoImovel enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public TipoNegociacao getTipoNegociacao() {
        return tipoNegociacao;
    }

    public void setTipoNegociacao(TipoNegociacao tipoNegociacao) {
        this.tipoNegociacao = tipoNegociacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Imovel imovel = (Imovel) o;
        return divulgarPropostasValoresFixos == imovel.divulgarPropostasValoresFixos
                && usarValorVendaComoMinimo == imovel.usarValorVendaComoMinimo
                && divulgarValorVenda == imovel.divulgarValorVenda
                && divulgarValoresFixos == imovel.divulgarValoresFixos
                && Objects.equals(imovelId, imovel.imovelId)
                && Objects.equals(numeroMatriculaImovel, imovel.numeroMatriculaImovel)
                && Objects.equals(numeroMatriculaAgua, imovel.numeroMatriculaAgua)
                && Objects.equals(numeroUnidadeEnergia, imovel.numeroUnidadeEnergia)
                && Objects.equals(titulo, imovel.titulo)
                && Objects.equals(descricao, imovel.descricao)
                && Objects.equals(propostasValoresFixos, imovel.propostasValoresFixos)
                && Objects.equals(demaisTaxas, imovel.demaisTaxas)
                && Objects.equals(valorVenda, imovel.valorVenda)
                && Objects.equals(valorIptu, imovel.valorIptu)
                && Objects.equals(valorCondominio, imovel.valorCondominio)
                && Objects.equals(valorAgua, imovel.valorAgua)
                && Objects.equals(valorEnergia, imovel.valorEnergia)
                && Objects.equals(valorLixo, imovel.valorLixo)
                && Objects.equals(taxaLimpeza, imovel.taxaLimpeza)
                && Objects.equals(enderecoImovel, imovel.enderecoImovel)
                && tipoImovel == imovel.tipoImovel
                && tipoNegociacao == imovel.tipoNegociacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imovelId, numeroMatriculaImovel, numeroMatriculaAgua, numeroUnidadeEnergia, titulo, descricao,
                propostasValoresFixos, demaisTaxas, valorVenda, valorIptu, valorCondominio, valorAgua, valorEnergia, valorLixo,
                taxaLimpeza, divulgarPropostasValoresFixos, usarValorVendaComoMinimo, divulgarValorVenda,
                divulgarValoresFixos, enderecoImovel, tipoImovel, tipoNegociacao);
    }
}

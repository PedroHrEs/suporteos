package com.curso.domains.enums;

import java.time.LocalDate;
import java.util.Objects;

public class Produto {
    private long idProduto;
    private String descricao;
    private double saldoEstoque;
    private double valorUnitario;
    private LocalDate dataCadastro;
    private Status status;

    public Produto() {
    }

    public Produto(long idProduto, String descricao, double saldoEstoque, double valorUnitario, LocalDate dataCadastro, Status status) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.saldoEstoque = saldoEstoque;
        this.valorUnitario = valorUnitario;
        this.dataCadastro = dataCadastro;
        this.status = status;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldoEstoque() {
        return saldoEstoque;
    }

    public void setSaldoEstoque(double saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return idProduto == produto.idProduto && Objects.equals(descricao, produto.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto, descricao);
    }
}

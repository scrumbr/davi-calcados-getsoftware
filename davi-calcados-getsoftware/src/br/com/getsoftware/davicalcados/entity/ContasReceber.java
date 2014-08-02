/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.entity;

/**
 *
 * @author Andrey Gois
 */
public class ContasReceber {

    private Long idContaReceber;
    private String descricao;
    private String dataPagamento;
    private Double valor;
    private String dataQuitado;
    private boolean status;
    private Long idVenda;

    public Long getIdContaReceber() {
        return idContaReceber;
    }

    public void setIdContaReceber(Long idContaReceber) {
        this.idContaReceber = idContaReceber;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDataQuitado() {
        return dataQuitado;
    }

    public void setDataQuitado(String dataQuitado) {
        this.dataQuitado = dataQuitado;
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }
}

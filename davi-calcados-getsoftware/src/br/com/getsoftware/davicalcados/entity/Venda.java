/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.entity;

import java.util.List;

/**
 *
 * @author Junior Oliveira
 */
public class Venda {
    private Integer idVenda;
    private Integer idFuncionario;
    private Long idCliente;
    private List<String> listaIdProduto;
    private Double valorTotal;
    private String data;
    private int parcela;

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<String> getListaIdProduto() {
        return listaIdProduto;
    }

    public void setListaIdProduto(List<String> listaIdProduto) {
        this.listaIdProduto = listaIdProduto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getData() {
        return data;
    }

    public void setData(String descricao) {
        this.data = descricao;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }
}

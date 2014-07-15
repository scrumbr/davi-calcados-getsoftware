/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.entity;

import br.com.getsoftware.davicalcados.gui.cadastro.ItensCarrinho;
import java.util.List;

/**
 *
 * @author Junior Oliveira
 */
public class Venda {

    private Long idVenda;
    private Integer idFuncionario;
    private Long idCliente;
    private List<ItensCarrinho> listaProduto;
    private Double valorTotal;
    private String data;
    private int parcela;
    private int quantidadeItens;

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
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

    public List<ItensCarrinho> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<ItensCarrinho> listaProduto) {
        this.listaProduto = listaProduto;
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

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
}

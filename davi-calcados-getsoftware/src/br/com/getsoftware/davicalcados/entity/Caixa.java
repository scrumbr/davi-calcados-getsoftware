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
public class Caixa {

    //id_caixa,id_movimentacao,movimentacao,descricao,data_hora,id_usuario,valor
    private Long idCaixa;
    private Long iDTipoMovimentacao;
    private String tipoMovimentacao;
    private String descricao;
    private String data;
    private String hora;
    private String funcionario;
    private Double valor;

    public Long getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(Long idCaixa) {
        this.idCaixa = idCaixa;
    }
    
    public Long getiDTipoMovimentacao() {
        return iDTipoMovimentacao;
    }

    public void setiDTipoMovimentacao(Long iDTipoMovimentacao) {
        this.iDTipoMovimentacao = iDTipoMovimentacao;
    }
    
    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getIdUsuario() {
        return funcionario;
    }

    public void setUsuario(String idUsuario) {
        this.funcionario = idUsuario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}

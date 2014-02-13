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
public class PlanoCompras {
    
    private Long idPlanoCompras;
    private String nome;
    private String descricaoPlano;
    private String marca;
    private String dataCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Long getIdPlanoCompras() {
        return idPlanoCompras;
    }

    public void setIdPlanoCompras(Long idPlanoCompras) {
        this.idPlanoCompras = idPlanoCompras;
    }

    public String getDescricaoPlano() {
        return descricaoPlano;
    }

    public void setDescricaoPlano(String descricaoPlano) {
        this.descricaoPlano = descricaoPlano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.PlanoCompras;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import br.com.getsoftware.davicalcados.util.TransformDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andrey Gois
 */
public class PlanoComprasDAO implements InterfaceCRUD<PlanoCompras> {
    
    private Connection conexao;

    public PlanoComprasDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    //select id_usuario, id_saida, descricao_saida, valor_saida, data_saida from saida;
    @Override
    public PlanoCompras getById(Integer id) throws SQLException {
        PlanoCompras planoCompras = null;
        String sql = "select * from plano_compras where id_plano_compras = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();

        if(res.next()){
        planoCompras = new PlanoCompras();
        planoCompras.setDataCadastro(TransformDate.transformDate(res.getString("data_cadastro")));
        planoCompras.setIdPlanoCompras(res.getLong("id_plano_compras"));
        planoCompras.setNome(res.getString("nome"));
        planoCompras.setMarca(res.getString("marca"));
        planoCompras.setDescricaoPlano(res.getString("descricao"));
        }
        res.close();
        stmt.close();

        return planoCompras;
    }
    
      @Override
    public void save(PlanoCompras planoCompras) throws SQLException {
        String sql = "insert into plano_compras(nome, marca,descricao, data_cadastro)"
                + " values (?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString (1, planoCompras.getNome());
        stmt.setString(2, planoCompras.getMarca());
        stmt.setString(3, planoCompras.getDescricaoPlano());
        stmt.setString(4, TransformDate.transformDate(planoCompras.getDataCadastro()));

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(PlanoCompras planoCompras) throws SQLException {
        String sql = "update  plano_compras set nome=?, marca=?, descricao=?, data_cadastro=?"
                + " where id_plano_compras=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

         stmt.setString (1, planoCompras.getNome());
         stmt.setString(2, planoCompras.getMarca());
         stmt.setString(3, planoCompras.getDescricaoPlano());
         stmt.setString(4, TransformDate.transformDate(planoCompras.getDataCadastro()));
         stmt.setLong(5, planoCompras.getIdPlanoCompras());

        stmt.execute();
        stmt.close();
    }
    
    @Override
    public ArrayList<PlanoCompras> listAll() throws SQLException {
        String sql = "select * from plano_compras order by data_cadastro desc";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<PlanoCompras> minhaLista = new ArrayList<>();
        while (res.next()) {
            PlanoCompras planoCompras = new PlanoCompras();

            planoCompras.setIdPlanoCompras(res.getLong("id_plano_compras"));
            planoCompras.setNome(res.getString("nome"));
            planoCompras.setMarca(res.getString("marca"));
            planoCompras.setDescricaoPlano(res.getString("descricao"));
            planoCompras.setDataCadastro(TransformDate.transformDate(res.getString("data_cadastro")));

            minhaLista.add(planoCompras);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from plano_compras where id_plano_compras=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }
    
}

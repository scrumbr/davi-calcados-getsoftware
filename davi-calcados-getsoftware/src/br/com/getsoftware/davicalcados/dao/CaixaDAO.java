/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Caixa;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import br.com.getsoftware.davicalcados.util.TransformDate;
import br.com.getsoftware.davicalcados.util.TransformMoeda;

/**
 *
 * @author JUNIOR
 */
public class CaixaDAO implements InterfaceCRUD<Caixa> {

    private Connection conexao;

    public CaixaDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    //id_usuario, id_caixa, descricao_caixa, valor_caixa, data_caixa 
    @Override
    public Caixa getById(Integer id) throws SQLException {
        Caixa caixa = null;
        String sql = "select * from caixa where id_caixa = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();

        if (res.next()) {
            caixa = new Caixa();
           caixa.setData(TransformDate.transformDate(res.getString("data")));
            caixa.setHora((res.getString("hora")));
            caixa.setDescricao(res.getString("descricao"));
            caixa.setIdCaixa(Long.valueOf(res.getString("id_caixa")));
            caixa.setUsuario((res.getString("username")));
            caixa.setTipoMovimentacao(res.getString("movimentacao"));
            caixa.setValor(Double.valueOf(res.getString("valor")));
            caixa.setiDTipoMovimentacao(Long.valueOf(res.getString("id_movimentacao")));
        }//id_caixa,id_movimentacao,movimentacao,descricao,data_hora,id_usuario,valor,

        res.close();
        stmt.close();

        return caixa;
    }

    @Override
    public void save(Caixa caixa) throws SQLException {
        String sql = "insert into caixa(movimentacao, descricao, data, hora, id_usuario, valor, id_movimentacao)"
                + " values (?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, caixa.getTipoMovimentacao());
        stmt.setString(2, caixa.getDescricao());
        stmt.setString(3, caixa.getData());
        stmt.setString(4, caixa.getHora());
        stmt.setString(5, caixa.getIdUsuario());
        stmt.setDouble(6, caixa.getValor());
        stmt.setLong(7, caixa.getiDTipoMovimentacao());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Caixa caixa) throws SQLException {
        String sql = "update caixa set movimentacao=?, descricao=?, data=?, hora=?, username=?, valor=?, id_movimentacao=? "
                + " where id_caixa=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, caixa.getTipoMovimentacao());
        stmt.setString(2, caixa.getDescricao());
        stmt.setString(3, caixa.getData());
        stmt.setString(4, caixa.getHora());
        stmt.setString(5, caixa.getIdUsuario());
        stmt.setDouble(6, caixa.getValor());
        stmt.setLong(7, caixa.getiDTipoMovimentacao());
        stmt.setLong(8, caixa.getIdCaixa());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Caixa> listAll() throws SQLException {
        String sql = "select * from caixa where data = current_date() order by hora desc";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Caixa> minhaLista = new ArrayList<>();
        while (res.next()) {
            Caixa caixa = new Caixa();

            caixa.setData(TransformDate.transformDate(res.getString("data")));
            caixa.setHora((res.getString("hora")));
            caixa.setDescricao(res.getString("descricao"));
            caixa.setIdCaixa((res.getLong("id_caixa")));
            caixa.setUsuario((res.getString("username")));
            caixa.setTipoMovimentacao(res.getString("movimentacao"));
            caixa.setValor(res.getDouble("valor"));
            caixa.setiDTipoMovimentacao(Long.valueOf(res.getString("id_movimentacao")));

            minhaLista.add(caixa);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from caixa where id_caixa=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }

}

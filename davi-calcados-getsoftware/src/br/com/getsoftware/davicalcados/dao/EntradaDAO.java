/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Entrada;
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

    
     public class EntradaDAO implements InterfaceCRUD<Entrada> {

    private Connection conexao;

    public EntradaDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    //id_usuario, id_entrada, descricao_entrada, valor_entrada, data_entrada 
    @Override
    public Entrada getById(Integer id) throws SQLException {
        Entrada entrada = null;
        String sql = "select * from entrada where id_entrada = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();
        
        if(res.next()){
            entrada = new Entrada();
        entrada.setDataEntrada(TransformDate.transformDate(res.getString("data_entrada")));
        entrada.setDescricaoEntrada(res.getString("descricao_entrada"));
        entrada.setIdEntrada(Long.valueOf(res.getString("id_entrada")));
        entrada.setIdUsuario(Long.valueOf(res.getString("id_usuario")));
        entrada.setValorEntrada(Double.valueOf(res.getString("valor_entrada")));
        }
        
        res.close();
        stmt.close();

        return entrada;
    }

    @Override
    public void save(Entrada entrada) throws SQLException {
        String sql = "insert into entrada(id_usuario, descricao_entrada, valor_entrada, data_entrada )"
                + " values (?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, entrada.getIdUsuario());
        stmt.setString(2, entrada.getDescricaoEntrada());
        stmt.setDouble(3, entrada.getValorEntrada());
        stmt.setString(4, TransformDate.transformDate(entrada.getDataEntrada()));

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Entrada entrada) throws SQLException {
        String sql = "update entrada set id_usuario, descricao_entrada, valor_entrada, data_entrada "
                + " where id_entrada=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, entrada.getIdUsuario());
        stmt.setString(2, entrada.getDescricaoEntrada());
        stmt.setDouble(3, entrada.getValorEntrada());
        stmt.setString(4, TransformDate.transformDate(entrada.getDataEntrada()));
        stmt.setLong(5, entrada.getIdEntrada());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Entrada> listAll() throws SQLException {
        String sql = "select * from entrada";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Entrada> minhaLista = new ArrayList<>();
        while (res.next()) {
            Entrada entrada = new Entrada();

            entrada.setIdUsuario(Long.valueOf(res.getString("id_usuario")));
            entrada.setDescricaoEntrada((res.getString("descricao_entrada")));
            entrada.setValorEntrada(Double.valueOf(res.getString("valor_entrada")));
            entrada.setDataEntrada((res.getString("data_entrada")));
            entrada.setIdEntrada(Long.valueOf(res.getString("id_entrada")));

            minhaLista.add(entrada);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from entrada where id_entrada=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }
}

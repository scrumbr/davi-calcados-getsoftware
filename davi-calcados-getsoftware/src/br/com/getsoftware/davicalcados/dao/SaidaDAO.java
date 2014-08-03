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
import br.com.getsoftware.davicalcados.entity.Saida;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import br.com.getsoftware.davicalcados.util.TransformDate;

/**
 *
 * @author JUNIOR
 */
public class SaidaDAO implements InterfaceCRUD<Saida> {

    private Connection conexao;

    public SaidaDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    //select id_usuario, id_saida, descricao_saida, valor_saida, data_saida from saida;
    @Override
    public Saida getById(Integer id) throws SQLException {
        Saida saida = null;
        String sql = "select * from saida where id_saida = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();

        if(res.next()){
        saida = new Saida();
        saida.setDataSaida(TransformDate.transformDate(res.getString("data_saida")));
        saida.setDescricao(res.getString("descricao_saida"));
        saida.setIdSaida(Long.valueOf(res.getString("id_saida")));
        saida.setIdUsuario(Long.valueOf(res.getString("id_usuario")));
        saida.setValorSaida(Double.valueOf(res.getString("valor_saida")));
        }
        res.close();
        stmt.close();

        return saida;
    }

    @Override
    public void save(Saida saida) throws SQLException {
        String sql = "insert into saida(id_usuario, descricao_saida, valor_saida, data_saida)"
                + " values (?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, saida.getIdUsuario());
        stmt.setString(2, saida.getDescricao());
        stmt.setDouble(3, saida.getValorSaida());
        stmt.setString(4, TransformDate.transformDate(saida.getDataSaida()));

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Saida saida) throws SQLException {
        String sql = "update  saida set id_usuario=?, descricao_saida=?, valor_saida=?, data_saida=?"
                + " where id_saida=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, saida.getIdUsuario());
        stmt.setString(2, saida.getDescricao());
        stmt.setDouble(3, saida.getValorSaida());
        stmt.setString(4, TransformDate.transformDate(saida.getDataSaida()));
        stmt.setLong(5, saida.getIdSaida());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Saida> listAll() throws SQLException {
        String sql = "select * from saida";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Saida> minhaLista = new ArrayList<>();
        while (res.next()) {
            Saida saida = new Saida();

            saida.setDataSaida(res.getString("data_saida"));
            saida.setDescricao(res.getString("descricao_saida"));
            saida.setIdSaida(Long.valueOf(res.getString("id_saida")));
            saida.setIdUsuario(Long.valueOf(res.getString("id_usuario")));
            saida.setValorSaida(Double.valueOf(res.getString("valor_saida")));

            minhaLista.add(saida);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }
    
    public ArrayList<Saida> listAllDate(String de, String ate) throws SQLException {
        String sql = "SELECT * FROM saida WHERE data_saida BETWEEN '"+de+"' AND '"+ate+"'";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Saida> minhaLista = new ArrayList<>();
        while (res.next()) {
            Saida saida = new Saida();

            saida.setIdUsuario(Long.valueOf(res.getString("id_usuario")));
            saida.setDescricao((res.getString("descricao_saida")));
            saida.setValorSaida(Double.valueOf(res.getString("valor_saida")));
            saida.setDataSaida((res.getString("data_saida")));
            saida.setIdSaida(Long.valueOf(res.getString("id_saida")));

            minhaLista.add(saida);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from saida where id_saida=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }
}

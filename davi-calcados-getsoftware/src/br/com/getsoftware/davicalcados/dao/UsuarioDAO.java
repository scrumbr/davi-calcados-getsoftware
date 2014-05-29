/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.bo.FuncionarioBO;
import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Usuario;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Junior Oliveira
 */
public class UsuarioDAO implements InterfaceCRUD<Usuario> {

    private Connection conexao;

    public UsuarioDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    @Override
    public Usuario getById(Integer id) throws SQLException {

        String sql = "select * from usuario where id_usuario = " + id;
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet res = stmt.executeQuery();

        Usuario usuario = null;
        if (res.next()) {
            usuario = new Usuario();
            usuario.setActive(res.getBoolean("ativo"));
            usuario.setIdUsuario(res.getLong("id_usuario"));
            usuario.setNivel(res.getInt("nivel"));
            usuario.setSenha(res.getString("senha"));
            usuario.setUserName(res.getString("username"));
        }
        res.close();
        stmt.close();

        return usuario;
    }

    @Override
    public void save(Usuario usuario) throws SQLException {
        String sql = "insert into usuario(senha, username, id_usuario, nivel, ativo) "
                + " values (?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, usuario.getSenha());
        stmt.setString(2, usuario.getUserName());
        stmt.setLong(3, usuario.getIdUsuario());
        stmt.setLong(4, usuario.getNivel());
        stmt.setBoolean(5, usuario.isActive());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Usuario usuario) throws SQLException {
        String sql = "update usuario set senha=?, username=?, nivel=?, ativo=? where id_usuario=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, usuario.getSenha());
        stmt.setString(2, usuario.getUserName());
        stmt.setLong(3, usuario.getNivel());
        stmt.setBoolean(4, usuario.isActive());
        stmt.setLong(5, usuario.getIdUsuario());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Usuario> listAll() throws SQLException {
        String sql = "select u.id_usuario, u.username, u.senha, u.nivel, u.ativo, f.cpf from usuario as u, funcionario as f where id_usuario = id_funcionario";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Usuario> minhaLista = new ArrayList<>();
        while (res.next()) {
            Usuario usuario = new Usuario();

            usuario.setActive(res.getBoolean("u.ativo"));
            usuario.setIdUsuario(res.getLong("u.id_usuario"));
            usuario.setNivel(res.getInt("u.nivel"));
            usuario.setSenha(res.getString("u.senha"));
            usuario.setUserName(res.getString("u.username"));
            usuario.setCpfFuncionario(res.getString("f.cpf"));

            minhaLista.add(usuario);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from usuario where id_usuario=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }
}

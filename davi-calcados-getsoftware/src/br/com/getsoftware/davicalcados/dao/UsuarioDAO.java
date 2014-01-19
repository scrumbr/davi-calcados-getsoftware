/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Endereco;
import br.com.getsoftware.davicalcados.entity.Usuario;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import br.com.getsoftware.davicalcados.util.TransformCpf;
import br.com.getsoftware.davicalcados.util.TransformDate;
import br.com.getsoftware.davicalcados.util.TransformTelefone;
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
    /*
     *id_usuario, nome,data_nascimento,cpf,rg,telefone,telefone2,
     *email,salario,contrato,recisao,ativo,rua,numero,complemento,bairro,cidade,CEP,estado
     */

    @Override
    public Usuario getById(Integer id) throws SQLException {

        String sql = "select * from usuario where id_usuario = " + id;
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet res = stmt.executeQuery();

        Usuario usuario = new Usuario();

        usuario.setActive(res.getBoolean("ativo"));
        usuario.setIdFuncionario(res.getInt("id_funcionario"));
        usuario.setNivel(res.getInt("nivel"));
        usuario.setSenha(res.getString("senha"));
        usuario.setUserName(res.getString("username "));
        usuario.setIdUsuario(res.getInt("id_usuario"));

        stmt.execute();
        stmt.close();

        return usuario;
    }

    @Override
    public void save(Usuario usuario) throws SQLException {
        String sql = "insert into usuario(nome,data_nascimento,cpf,rg,telefone,telefone2, "
                + " email,salario,contrato, recisao, ativo, rua,numero,complemento,bairro,cidade,CEP,estado) "
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, usuario.getSenha());
        stmt.setString(2, usuario.getUserName());
        stmt.setLong(3, usuario.getIdFuncionario());
        stmt.setLong(4, usuario.getNivel());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Usuario usuario) throws SQLException {
        String sql = "update usuario set nome=?,data_nascimento=?,cpf=?,rg=?,telefone=?,telefone2=?, "
                + " email=?,salario=?,contrato=?, recisao=?, ativo=?, rua=?,numero=?,complemento=?,bairro=?,cidade=?,CEP=?,estado=?"
                + " where id_usuario=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, usuario.getSenha());
        stmt.setString(2, usuario.getUserName());
        stmt.setLong(3, usuario.getIdFuncionario());
        stmt.setLong(4, usuario.getNivel());
        stmt.setLong(5, usuario.getIdUsuario());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Usuario> listAll() throws SQLException {
        String sql = "select * from usuario order by descricao";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Usuario> minhaLista = new ArrayList<>();
        while (res.next()) {
            Usuario usuario = new Usuario();

            usuario.setActive(res.getBoolean("ativo"));
            usuario.setIdFuncionario(res.getInt("id_funcionario"));
            usuario.setNivel(res.getInt("nivel"));
            usuario.setSenha(res.getString("senha"));
            usuario.setUserName(res.getString("username "));
            usuario.setIdUsuario(res.getInt("id_usuario"));

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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Endereco;
import br.com.getsoftware.davicalcados.entity.Fornecedor;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import br.com.getsoftware.davicalcados.util.TransformTelefone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andrey Gois
 */
    
public class FornecedorDAO implements InterfaceCRUD<Fornecedor> {

    private Connection conexao;

    public FornecedorDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    @Override
    public Fornecedor getById(Integer id) throws SQLException {

        String sql = "select * from fornecedor where (id_fornecedor = " + id+")";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet res = stmt.executeQuery();
        
        
        Fornecedor fornecedor = new Fornecedor();
        if(res.next()){
        Endereco end = new Endereco();
        
        fornecedor.setIdFornecedor(res.getLong("id_fornecedor"));
        fornecedor.setNome(res.getString("nome"));
        fornecedor.setFisicaJuridica(res.getString("fisica_juridica"));
        fornecedor.setTelefone(TransformTelefone.transformTelefone(res.getString("telefone")));
        fornecedor.setTelefone2(TransformTelefone.transformTelefone(res.getString("telefone2")));
        fornecedor.setEmail(res.getString("email"));
        fornecedor.setStatus(res.getBoolean("ativo"));
        fornecedor.setObservacao(res.getString("observacao"));

        end.setBairro(res.getString("bairro"));
        end.setCEP(res.getString("cep"));
        end.setCidade(res.getString("cidade"));
        end.setComplemento(res.getString("complemento"));
        end.setEstado(res.getString("estado"));
        end.setNumero(res.getInt("numero"));
        end.setRua(res.getString("rua"));
        fornecedor.setEndereco(end);
        }
        res.close();
        stmt.close();
        return fornecedor;
    }

    @Override
    public void save(Fornecedor fornecedor) throws SQLException {
        String sql = "insert into fornecedor(nome,fisica_juridica,telefone,telefone2,email,ativo,"
                + "observacao,rua,numero,complemento,bairro,cidade,CEP,estado) "
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, fornecedor.getNome());
        stmt.setString(2, fornecedor.getFisicaJuridica());
        stmt.setString(3, fornecedor.getTelefone());
        stmt.setString(4, fornecedor.getTelefone2());
        stmt.setString(5, fornecedor.getEmail());
        stmt.setBoolean(6, fornecedor.isStatus());
        stmt.setString(7,fornecedor.getObservacao());
        stmt.setString(8, fornecedor.getEndereco().getRua());
        stmt.setLong(9, fornecedor.getEndereco().getNumero());
        stmt.setString(10, fornecedor.getEndereco().getComplemento());
        stmt.setString(11, fornecedor.getEndereco().getBairro());
        stmt.setString(12, fornecedor.getEndereco().getCidade());
        stmt.setString(13, fornecedor.getEndereco().getCEP());
        stmt.setString(14, fornecedor.getEndereco().getEstado());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Fornecedor fornecedor) throws SQLException {
        String sql = "update fornecedor set nome=?,fisica_juridica=?,telefone=?,telefone2=?,email=?,ativo=?,"
                + "observacao=?, rua=?,numero=?,complemento=?,bairro=?,cidade=?,CEP=?,estado=?"
                + " where id_fornecedor=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, fornecedor.getNome());
        stmt.setString(2, fornecedor.getFisicaJuridica());
        stmt.setString(3, fornecedor.getTelefone());
        stmt.setString(4, fornecedor.getTelefone2());
        stmt.setString(5, fornecedor.getEmail());
        stmt.setBoolean(6, fornecedor.isStatus());
        stmt.setString(7,fornecedor.getObservacao());
        stmt.setString(8, fornecedor.getEndereco().getRua());
        stmt.setLong(9, fornecedor.getEndereco().getNumero());
        stmt.setString(10, fornecedor.getEndereco().getComplemento());
        stmt.setString(11, fornecedor.getEndereco().getBairro());
        stmt.setString(12, fornecedor.getEndereco().getCidade());
        stmt.setString(13, fornecedor.getEndereco().getCEP());
        stmt.setString(14, fornecedor.getEndereco().getEstado());
        stmt.setLong(15, fornecedor.getIdFornecedor());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Fornecedor> listAll() throws SQLException {
        String sql = "select * from fornecedor";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Fornecedor> minhaLista = new ArrayList<>();
        while (res.next()) {
            Fornecedor fornecedor = new Fornecedor();
            Endereco end = new Endereco();
            fornecedor.setIdFornecedor(res.getLong("id_fornecedor"));
            fornecedor.setNome(res.getString("nome"));
            fornecedor.setFisicaJuridica(res.getString("fisica_juridica"));
            fornecedor.setTelefone(TransformTelefone.transformTelefone(res.getString("telefone")));
            fornecedor.setTelefone2(TransformTelefone.transformTelefone(res.getString("telefone2")));
            fornecedor.setEmail(res.getString("email"));
            fornecedor.setStatus(res.getBoolean("ativo"));
            fornecedor.setObservacao(res.getString("observacao"));
         
            end.setBairro(res.getString("bairro"));
            end.setCEP(res.getString("cep"));
            end.setCidade(res.getString("cidade"));
            end.setComplemento(res.getString("complemento"));
            end.setEstado(res.getString("estado"));
            end.setNumero(res.getInt("numero"));
            end.setRua(res.getString("rua"));
            fornecedor.setEndereco(end);

            minhaLista.add(fornecedor);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }
     
    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from fornecedor where id_fornecedor=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }   
}

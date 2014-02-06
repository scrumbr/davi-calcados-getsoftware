/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Endereco;
import br.com.getsoftware.davicalcados.entity.Funcionario;
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
public class FuncionarioDAO implements InterfaceCRUD<Funcionario> {

    private Connection conexao;

    public FuncionarioDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }
    /*
     *id_funcionario, nome,data_nascimento,cpf,rg,telefone,telefone2,
     *email,salario,contrato,recisao,ativo,rua,numero,complemento,bairro,cidade,CEP,estado
     */

    @Override
    public Funcionario getById(Integer id) throws SQLException {

        String sql = "select * from funcionario where (id_funcionario = " + id+")";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet res = stmt.executeQuery();
        
        
        Funcionario funcionario = null;
        if(res.next()){
        funcionario = new Funcionario();
        Endereco end = new Endereco();
        funcionario.setAtivo(res.getBoolean("ativo"));
        funcionario.setSexo(res.getString("sexo"));
        funcionario.setContrato(TransformDate.transformDate(res.getString("contrato")));
        funcionario.setCpf(TransformCpf.transformCpf(res.getString("cpf")));
        funcionario.setDataNascimento(TransformDate.transformDate(res.getString("data_nascimento")));
        funcionario.setEmail(res.getString("email"));
        funcionario.setIdFuncionario(res.getLong("id_funcionario"));
        funcionario.setNome(res.getString("nome"));
        if(res.getString("recisao") != null){
        funcionario.setRecisao(TransformDate.transformDate(res.getString("recisao")));
        }
        funcionario.setRg(res.getString("rg"));
        funcionario.setSalario(res.getDouble("salario"));
        funcionario.setTelefone(TransformTelefone.transformTelefone(res.getString("telefone")));
        funcionario.setTelefone2(TransformTelefone.transformTelefone(res.getString("telefone2")));

        end.setBairro(res.getString("bairro"));
        end.setCEP(res.getString("cep"));
        end.setCidade(res.getString("cidade"));
        end.setComplemento(res.getString("complemento"));
        end.setEstado(res.getString("estado"));
        end.setNumero(res.getInt("numero"));
        end.setRua(res.getString("rua"));
        funcionario.setEndereco(end);
        }
        res.close();
        stmt.close();
        return funcionario;
    }

    @Override
    public void save(Funcionario funcionario) throws SQLException {
        String sql = "insert into funcionario(nome, sexo, data_nascimento,cpf,rg,telefone,telefone2, "
                + " email,salario,contrato, ativo, rua,numero,complemento,bairro,cidade,CEP,estado, recisao) "
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, funcionario.getNome());
        stmt.setString(2, funcionario.getSexo());
        stmt.setString(3, funcionario.getDataNascimento());
        stmt.setString(4, funcionario.getCpf());
        stmt.setString(5, funcionario.getRg());
        stmt.setString(6, funcionario.getTelefone());
        stmt.setString(7, funcionario.getTelefone2());
        stmt.setString(8, funcionario.getEmail());
        stmt.setDouble(9, funcionario.getSalario());
        stmt.setString(10, funcionario.getContrato());
        stmt.setBoolean(11, funcionario.isAtivo());
        stmt.setString(12, funcionario.getEndereco().getRua());
        stmt.setLong(13, funcionario.getEndereco().getNumero());
        stmt.setString(14, funcionario.getEndereco().getComplemento());
        stmt.setString(15, funcionario.getEndereco().getBairro());
        stmt.setString(16, funcionario.getEndereco().getCidade());
        stmt.setString(17, funcionario.getEndereco().getCEP());
        stmt.setString(18, funcionario.getEndereco().getEstado());
        stmt.setString(19, funcionario.getRecisao());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Funcionario funcionario) throws SQLException {
        String sql = "update funcionario set nome=?, sexo=?, data_nascimento=?,cpf=?,rg=?,telefone=?,telefone2=?, "
                + " email=?,salario=?,contrato=?, recisao=?, ativo=?, rua=?,numero=?,complemento=?,bairro=?,cidade=?,CEP=?,estado=?"
                + " where id_funcionario=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, funcionario.getNome());
        stmt.setString(2, funcionario.getSexo());
        stmt.setString(3, funcionario.getDataNascimento());
        stmt.setString(4, funcionario.getCpf());
        stmt.setString(5, funcionario.getRg());
        stmt.setString(6, funcionario.getTelefone());
        stmt.setString(7, funcionario.getTelefone2());
        stmt.setString(8, funcionario.getEmail());
        stmt.setDouble(9, funcionario.getSalario());
        stmt.setString(10, funcionario.getContrato());
        stmt.setString(11, funcionario.getRecisao());
        stmt.setBoolean(12, funcionario.isAtivo());
        stmt.setString(13, funcionario.getEndereco().getRua());
        stmt.setLong(14, funcionario.getEndereco().getNumero());
        stmt.setString(15, funcionario.getEndereco().getComplemento());
        stmt.setString(16, funcionario.getEndereco().getBairro());
        stmt.setString(17, funcionario.getEndereco().getCidade());
        stmt.setString(18, funcionario.getEndereco().getCEP());
        stmt.setString(19, funcionario.getEndereco().getEstado());
        stmt.setLong(20, funcionario.getIdFuncionario());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Funcionario> listAll() throws SQLException {
        String sql = "select * from funcionario";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Funcionario> minhaLista = new ArrayList<>();
        while (res.next()) {
            Funcionario funcionario = new Funcionario();
            Endereco end = new Endereco();
            funcionario.setAtivo(res.getBoolean("ativo"));
            funcionario.setContrato(TransformDate.transformDate(res.getString("contrato")));
            funcionario.setCpf(TransformCpf.transformCpf(res.getString("cpf")));
            funcionario.setDataNascimento(TransformDate.transformDate(res.getString("data_nascimento")));
            funcionario.setEmail(res.getString("email"));
            funcionario.setSexo(res.getString("sexo"));
            funcionario.setIdFuncionario(res.getLong("id_funcionario"));
            funcionario.setNome(res.getString("nome"));
            if(res.getString("recisao")!=null){
            funcionario.setRecisao(TransformDate.transformDate(res.getString("recisao")));
            }
            funcionario.setRg(res.getString("rg"));
            funcionario.setSalario(res.getDouble("salario"));
            funcionario.setTelefone(TransformTelefone.transformTelefone(res.getString("telefone")));
            funcionario.setTelefone2(TransformTelefone.transformTelefone(res.getString("telefone2")));

            end.setBairro(res.getString("bairro"));
            end.setCEP(res.getString("cep"));
            end.setCidade(res.getString("cidade"));
            end.setComplemento(res.getString("complemento"));
            end.setEstado(res.getString("estado"));
            end.setNumero(res.getInt("numero"));
            end.setRua(res.getString("rua"));
            funcionario.setEndereco(end);

            minhaLista.add(funcionario);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }
     
    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from funcionario where id_funcionario=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }
}

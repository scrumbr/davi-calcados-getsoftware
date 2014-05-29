/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Cliente;
import br.com.getsoftware.davicalcados.entity.Endereco;
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
 * @author Andrey Gois
 */

    
    public class ClienteDAO implements InterfaceCRUD<Cliente> {

    private Connection conexao;

    public ClienteDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }
    
    @Override
    public Cliente getById(Integer id) throws SQLException {

        String sql = "select * from cliente where (id_cliente = " + id+")";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet res = stmt.executeQuery();               
                
        Cliente cliente = new Cliente();        
        if(res.next()){
        Endereco end = new Endereco();
        cliente.setIdCiente(res.getLong("id_cliente"));
        cliente.setNome(res.getString("nome"));
        cliente.setProfissao(res.getString("profissao"));
        cliente.setSexo(res.getString("sexo"));
        cliente.setDataNascimento((res.getString("data_nascimento")));
        cliente.setEstadoCivil(res.getString("estado_civil"));
        cliente.setCpf(TransformCpf.transformCpf(res.getString("cpf")));
        cliente.setRg(res.getString("rg"));
        cliente.setTelefone(TransformTelefone.transformTelefone(res.getString("telefone")));
        cliente.setTelefone2(TransformTelefone.transformTelefone(res.getString("telefone2")));
        cliente.setEmail(res.getString("email"));
        cliente.setPreferencia(res.getString("preferencia"));
        cliente.setNumeroBoleto(res.getLong("numero_boleto"));
        cliente.setStatus(res.getBoolean("ativo"));
        cliente.setRenda(res.getDouble("renda"));
        cliente.setCredito(res.getDouble("credito"));
        
        end.setBairro(res.getString("bairro"));
        end.setCEP(res.getString("cep"));
        end.setCidade(res.getString("cidade"));
        end.setComplemento(res.getString("complemento"));
        end.setEstado(res.getString("estado"));
        end.setNumero(res.getString("numero"));
        end.setRua(res.getString("rua"));
        cliente.setEndereco(end);
        }
        res.close();
        stmt.close();
        return cliente;
    }

    @Override
    public void save(Cliente cliente) throws SQLException {
        String sql = "insert into cliente(nome,profissao,sexo,data_nascimento,estado_civil,cpf,"
                + " rg,telefone,telefone2, email,preferencia,"
                + "numero_boleto,ativo,rua,numero,complemento,bairro,cidade,CEP,estado,renda,credito) "
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getProfissao());
        stmt.setString(3, cliente.getSexo());
        stmt.setString(4, cliente.getDataNascimento());
        stmt.setString(5, cliente.getEstadoCivil());
        stmt.setString(6, cliente.getCpf());
        stmt.setString(7, cliente.getRg());
        stmt.setString(8, cliente.getTelefone());
        stmt.setString(9, cliente.getTelefone2());
        stmt.setString(10, cliente.getEmail());
        stmt.setString(11, cliente.getPreferencia());
        stmt.setLong(12, cliente.getNumeroBoleto());
        stmt.setBoolean(13, cliente.isStatus());
            
        stmt.setString(14, cliente.getEndereco().getRua());
        stmt.setString(15, cliente.getEndereco().getNumero());
        stmt.setString(16, cliente.getEndereco().getComplemento());
        stmt.setString(17, cliente.getEndereco().getBairro());
        stmt.setString(18, cliente.getEndereco().getCidade());
        stmt.setString(19, cliente.getEndereco().getCEP());
        stmt.setString(20, cliente.getEndereco().getEstado());
        stmt.setDouble(21, cliente.getRenda());
        stmt.setDouble(22, cliente.getCredito());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Cliente cliente) throws SQLException {
        String sql = "update cliente set nome=?,profissao=?,sexo=?,data_nascimento=?,estado_civil=?,cpf=?, "
                + "rg=?,telefone=?,telefone2=?, email=?,preferencia=?,numero_boleto=?,"
                + "ativo=?, rua=?,numero=?,complemento=?,bairro=?,cidade=?,CEP=?,estado=?,renda=?,credito=?"
                + " where id_cliente=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getProfissao());
        stmt.setString(3, cliente.getSexo());
        stmt.setString(4, cliente.getDataNascimento());
        stmt.setString(5, cliente.getEstadoCivil());
        stmt.setString(6, cliente.getCpf());
        stmt.setString(7, cliente.getRg());
        stmt.setString(8, cliente.getTelefone());
        stmt.setString(9, cliente.getTelefone2());
        stmt.setString(10, cliente.getEmail());
        stmt.setString(11, cliente.getPreferencia());
        stmt.setLong(12, cliente.getNumeroBoleto());
        stmt.setBoolean(13, cliente.isStatus());
        
        stmt.setString(14, cliente.getEndereco().getRua());
        stmt.setString(15, cliente.getEndereco().getNumero());
        stmt.setString(16, cliente.getEndereco().getComplemento());
        stmt.setString(17, cliente.getEndereco().getBairro());
        stmt.setString(18, cliente.getEndereco().getCidade());
        stmt.setString(19, cliente.getEndereco().getCEP());
        stmt.setString(20, cliente.getEndereco().getEstado());
        stmt.setDouble(21, cliente.getRenda());
        stmt.setDouble(22, cliente.getCredito());
        stmt.setLong(23, cliente.getIdCiente());


        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Cliente> listAll() throws SQLException {
        String sql = "select * from cliente where ativo = true";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Cliente> minhaLista = new ArrayList<>();
        while (res.next()) {
            Cliente cliente = new Cliente();
            Endereco end = new Endereco();
        cliente.setIdCiente(res.getLong("id_cliente"));
        cliente.setNome(res.getString("nome"));
        cliente.setProfissao(res.getString("profissao"));
        cliente.setSexo(res.getString("sexo"));
        cliente.setDataNascimento(TransformDate.transformDate(res.getString("data_nascimento")));
        cliente.setEstadoCivil(res.getString("estado_civil"));
        cliente.setCpf(TransformCpf.transformCpf(res.getString("cpf")));
        cliente.setRg(res.getString("rg"));
        cliente.setTelefone(TransformTelefone.transformTelefone(res.getString("telefone")));
        cliente.setTelefone2(TransformTelefone.transformTelefone(res.getString("telefone2")));
        cliente.setEmail(res.getString("email"));
        cliente.setPreferencia(res.getString("preferencia"));
        cliente.setNumeroBoleto(res.getLong("numero_boleto"));
        cliente.setStatus(res.getBoolean("ativo"));
        cliente.setRenda(res.getDouble("renda"));
        cliente.setCredito(res.getDouble("credito"));
        

        end.setBairro(res.getString("bairro"));
        end.setCEP(res.getString("cep"));
        end.setCidade(res.getString("cidade"));
        end.setComplemento(res.getString("complemento"));
        end.setEstado(res.getString("estado"));
        end.setNumero(res.getString("numero"));
        end.setRua(res.getString("rua"));
        cliente.setEndereco(end);

            minhaLista.add(cliente);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }
     
    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from cliente where id_cliente=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }  
    
    
    
    
    
}


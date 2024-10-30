package br.com.gerenciamentoestoque.dao;

import br.com.gerenciamentoestoque.jdbc.ConexaoBC;
import br.com.gerenciamentoestoque.model.Clientes;
import br.com.gerenciamentoestoque.model.Fornecedores;
import br.com.gerenciamentoestoque.model.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FornecedoresDAO {
    private Connection conn;
    
    public FornecedoresDAO(){
        this.conn = new ConexaoBC().pegarConexao();
    }
    public void Salvar(Fornecedores obj){
        try {
            //SALVA NO BANCO DE DADOS
            String sql = "insert into fornecedores (nome, cnpj, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
            //Conexao com o Banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getCelular());
            stmt.setString(6, obj.getCep());
            stmt.setString(7, obj.getEndereco());
            stmt.setInt(8, obj.getNumero());
            stmt.setString(9, obj.getComplemento());
            stmt.setString(10, obj.getBairro());
            stmt.setString(11, obj.getCidade());
            stmt.setString(12, obj.getEstado());

            stmt.execute();
            //finalizar conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Fornecedor Salvo Com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar o Fornecedor" +erro);
        }
    }
    
        public void Editar(Fornecedores obj){
        try {
            //Insert SQL
            String sql = "update fornecedores set nome=?,cnpj=?,email=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?";
            //Conexao com o Banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getCelular());
            stmt.setString(6, obj.getCep());
            stmt.setString(7, obj.getEndereco());
            stmt.setInt(8, obj.getNumero());
            stmt.setString(9, obj.getComplemento());
            stmt.setString(10, obj.getBairro());
            stmt.setString(11, obj.getCidade());
            stmt.setString(12, obj.getEstado());
            stmt.setInt(13, obj.getId());
            
            stmt.execute();
            //executa e finaliza
            stmt.close();
            JOptionPane.showMessageDialog(null, "Fornecedor Editado Com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao editar o Fornecedor" +erro);
        }
    }
        
        public void Excluir(Fornecedores obj){
            try {
                String sql = "delete from fornecedores where id=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, obj.getId());
                //executa e finaliza
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Fornecedor Excluido Com Sucesso");
        } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir o Fornecedor" +erro);
            }
        }
    //FUNÇÃO DA ABA DADOS DE CADASTRO - PESQUISA
    public Fornecedores BuscarFornecedor(String nome){
        try {
            String sql = "select * from fornecedores where nome =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Fornecedores obj = new Fornecedores();
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
            }
            return obj;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro ao buscar o Fornecedor "+ erro);
        }
        return null;
    }
    // LISTAR Funcionarios NO CONSULTA Funcionarios
    public List<Fornecedores>listar(){
        List<Fornecedores>lista = new ArrayList<>();
        try {
            String sql = "select * from fornecedores";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedores obj = new Fornecedores();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCnpj(rs.getString("cnpj"));
                    obj.setEmail(rs.getString("email"));
                    obj.setTelefone(rs.getString("telefone"));
                    obj.setCelular(rs.getString("celular"));
                    obj.setCep(rs.getString("cep"));
                    obj.setEndereco(rs.getString("endereco"));
                    obj.setNumero(rs.getInt("numero"));
                    obj.setComplemento(rs.getString("complemento"));
                    obj.setBairro(rs.getString("bairro"));
                    obj.setCidade(rs.getString("cidade"));
                    obj.setEstado(rs.getString("estado"));
                    lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro Ao Criar a Lista" + erro);
        }
        return null;
    }
    
        // PESQUISA Funcionarios NO BOTAO PESQUISAR
    public List<Fornecedores>filtrar(String nome){
        List<Fornecedores>lista = new ArrayList<>();
        try {
            String sql = "select * from fornecedores where nome like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedores obj = new Fornecedores();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCnpj(rs.getString("cnpj"));
                    obj.setEmail(rs.getString("email"));
                    obj.setTelefone(rs.getString("telefone"));
                    obj.setCelular(rs.getString("celular"));
                    obj.setCep(rs.getString("cep"));
                    obj.setEndereco(rs.getString("endereco"));
                    obj.setNumero(rs.getInt("numero"));
                    obj.setComplemento(rs.getString("complemento"));
                    obj.setBairro(rs.getString("bairro"));
                    obj.setCidade(rs.getString("cidade"));
                    obj.setEstado(rs.getString("estado"));
                    lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro Ao Criar a Lista" + erro);
        }
        return null;
    }
}

package br.com.gerenciamentoestoque.dao;

import br.com.gerenciamentoestoque.jdbc.ConexaoBC;
import br.com.gerenciamentoestoque.model.Clientes;
import br.com.gerenciamentoestoque.model.Funcionarios;
import br.com.gerenciamentoestoque.view.FormLogin;
import br.com.gerenciamentoestoque.view.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionariosDAO {
    private Connection conn;
    
    public FuncionariosDAO(){
        this.conn = new ConexaoBC().pegarConexao();
    }
    public void Salvar(Funcionarios obj){
        try {
            //SALVA NO BANCO DE DADOS
            String sql = "insert into funcionarios (nome, rg, cpf, email, senha, cargo, nivel, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            //Conexao com o Banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getEstado());

            stmt.execute();
            //finalizar conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionario Salvo Com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar o Funcionario" +erro);
        }
    }
    
        public void Editar(Funcionarios obj){
        try {
            //Insert SQL
            String sql = "update funcionarios set nome=?,rg=?,cpf=?,email=?,senha=?,cargo=?,nivel=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?";
            //Conexao com o Banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getEstado());
            stmt.setInt(17, obj.getId());
            
            stmt.execute();
            //executa e finaliza
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionario Editado Com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao editar o Funcionario" +erro);
        }
    }
        
        public void Excluir(Funcionarios obj){
            try {
                String sql = "delete from funcionarios where id=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, obj.getId());
                //executa e finaliza
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Funcionario Excluido Com Sucesso");
        } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir o Funcionario" +erro);
            }
        }
    //FUNÇÃO DA ABA DADOS DE CADASTRO - PESQUISA
    public Funcionarios BuscarFuncionario(String nome){
        try {
            String sql = "select * from funcionarios where nome =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Funcionarios obj = new Funcionarios();
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel(rs.getString("nivel"));
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
            JOptionPane.showMessageDialog(null, "erro ao buscar funcionario"+ erro);
        }
        return null;
    }
    // LISTAR Funcionarios NO CONSULTA Funcionarios
    public List<Funcionarios>listar(){
        List<Funcionarios>lista = new ArrayList<>();
        try {
            String sql = "select * from funcionarios";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionarios obj = new Funcionarios();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setRg(rs.getString("rg"));
                    obj.setCpf(rs.getString("cpf"));
                    obj.setEmail(rs.getString("email"));
                    obj.setSenha(rs.getString("senha"));
                    obj.setCargo(rs.getString("cargo"));
                    obj.setNivel(rs.getString("nivel"));
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
    public List<Funcionarios>filtrar(String nome){
        List<Funcionarios>lista = new ArrayList<>();
        try {
            String sql = "select * from funcionarios where nome like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionarios obj = new Funcionarios();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setRg(rs.getString("rg"));
                    obj.setCpf(rs.getString("cpf"));
                    obj.setEmail(rs.getString("email"));
                    obj.setSenha(rs.getString("senha"));
                    obj.setCargo(rs.getString("cargo"));
                    obj.setNivel(rs.getString("nivel"));
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
    public boolean efetuarLogin(String email, String senha){
        try {
            String sql = "select * from funcionarios where email=? and senha=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true; // Login bem-sucedido
            } else {
                return false; // Login inválido
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false; // Retorna false em caso de erro
        }
    }
}

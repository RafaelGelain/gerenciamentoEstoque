package br.com.gerenciamentoestoque.dao;

import br.com.gerenciamentoestoque.jdbc.ConexaoBC;
import br.com.gerenciamentoestoque.model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientesDAO {
    private Connection conn;
    
    public ClientesDAO(){
        this.conn = new ConexaoBC().pegarConexao();
    }
    public void Salvar(Clientes obj){
        try {
            //Insert SQL
            String sql = "insert into tb_clientes (nome, rg, cpf, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            //Conexao com o Banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());
            
            //EXEC
            stmt.execute();
            //finalizar conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente Salvo Com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar o cliente" +erro);
        }
    }
}

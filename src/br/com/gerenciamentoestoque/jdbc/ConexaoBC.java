package br.com.gerenciamentoestoque.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBC {
    final private String url = "jdbc:mysql://localhost/gerenciamentoestoque";
    final private String usuario = "root";
    final private String senha = "";
    
    public Connection pegarConexao(){ //FAZER CONEXÃO
        try {
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados !"+e);
        }
        return null;
    }
}
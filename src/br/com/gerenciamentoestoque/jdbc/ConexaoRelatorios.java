package br.com.gerenciamentoestoque.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConexaoRelatorios {
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/gerenciamentoestoque";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conectado(){
    boolean resultado = true;
        try {
           Class.forName(driver);
           conexao = DriverManager.getConnection(url,usuario,senha);
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver Não Encontrado"+Driver);
            resultado = false;
        }catch(SQLException fonte){
            JOptionPane.showMessageDialog(null, "Erro na fonte de dados "+fonte.getMessage());
            resultado = false;
        }
        return resultado;
    }
    public void desconectado(){
        boolean resultado = true;
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "BancoFechado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar com o banco de dados");
        }
    }
    public void executeSQL(String sql){
        try {
            statement = conexao.createStatement(resultset.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão" +e.getMessage());
        }
    }
}

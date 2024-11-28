
package br.com.gerenciamentoestoque.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class TestConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //FUNÇÃO PARA TESTAR SE A CONEXAO ESTÁ FUNCIONANDO
       try {
           new ConexaoRelatorios().conectado();
           JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso !");
       } catch (HeadlessException erro){
           JOptionPane.showMessageDialog(null, "Erro ao se conectar com o BC !"+ erro.getMessage());

       }
    }
    
}

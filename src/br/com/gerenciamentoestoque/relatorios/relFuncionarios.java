package br.com.gerenciamentoestoque.relatorios;

import br.com.gerenciamentoestoque.jdbc.ConexaoRelatorios;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class relFuncionarios {
    ConexaoRelatorios conexao = new ConexaoRelatorios();
    public relFuncionarios() {

        try {
            conexao.conectado();
            conexao.executeSQL("select * from funcionarios");
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conexao.resultset);
            JasperPrint jasperPrint = JasperFillManager.fillReport("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\gerenciamentoEstoque\\src\\br\\com\\gerenciamentoestoque\\relatorios\\relFuncionarios.jasper", new HashMap(),jrRS);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no ireport"+e.getMessage());
        }
    }
   

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
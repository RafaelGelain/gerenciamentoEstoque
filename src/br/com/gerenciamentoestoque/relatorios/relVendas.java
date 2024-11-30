package br.com.gerenciamentoestoque.relatorios;

import br.com.gerenciamentoestoque.jdbc.ConexaoRelatorios;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class relVendas {
    ConexaoRelatorios conexao = new ConexaoRelatorios();
    public relVendas() {

        try {
            conexao.conectado();
        conexao.executeSQL("SELECT \n" +
        "    i.venda_id, \n" +
        "    p.descricao, \n" +
        "    p.preco, \n" +
        "    i.qtd, \n" +
        "    i.subtotal,\n" +
        "    v.cliente_id, \n" +
        "    v.data_venda, \n" +
        "    v.total_venda, \n" +
        "    v.observacoes,\n" +
        "    c.id AS cliente_id, \n" +
        "    c.nome, \n" +
        "    c.rg, \n" +
        "    c.cpf, \n" +
        "    c.email, \n" +
        "    c.telefone, \n" +
        "    c.celular, \n" +
        "    c.cep, \n" +
        "    c.endereco, \n" +
        "    c.numero, \n" +
        "    c.complemento, \n" +
        "    c.bairro, \n" +
        "    c.cidade, \n" +
        "    c.estado\n" +
        "FROM \n" +
        "    itensvendas AS i\n" +
        "INNER JOIN \n" +
        "    produtos AS p \n" +
        "    ON i.produto_id = p.id\n" +
        "INNER JOIN \n" +
        "    vendas AS v \n" +
        "    ON i.venda_id = v.id\n" +
        "INNER JOIN \n" +
        "    clientes AS c \n" +
        "    ON v.cliente_id = c.id\n" +
        "WHERE \n" +
        "    v.id = (SELECT MAX(id) FROM vendas);");
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conexao.resultset);
            JasperPrint jasperPrint = JasperFillManager.fillReport("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\gerenciamentoEstoque\\src\\br\\com\\gerenciamentoestoque\\relatorios\\relVendas.jasper", new HashMap(),jrRS);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no ireport"+e.getMessage());
        }
    }
   

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

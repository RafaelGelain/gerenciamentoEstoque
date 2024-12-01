package br.com.gerenciamentoestoque.relatorios;

import br.com.gerenciamentoestoque.jdbc.ConexaoBC;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class relVendas2Via {
private Connection conn;

    public relVendas2Via(int id){
        this.conn = new ConexaoBC().pegarConexao();
        try {
            String jasper = "C:\\Users\\Rafael\\Documents\\NetBeansProjects\\gerenciamentoEstoque\\src\\br\\com\\gerenciamentoestoque\\relatorios\\relVendas2Via.jasper";
            Map<String,Object> param = new HashMap<>();
            param.put("id", id);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, param,conn);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint,false);
            jasperViewer.setExtendedState(JFrame.MAXIMIZED_BOTH);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {

    }
}

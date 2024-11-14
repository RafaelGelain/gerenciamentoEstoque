
package br.com.gerenciamentoestoque.dao;

import br.com.gerenciamentoestoque.jdbc.ConexaoBC;
import br.com.gerenciamentoestoque.model.ItensVendas;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ItensVendaDAO {
    private Connection conn;

    public ItensVendaDAO(){
        this.conn = new ConexaoBC().pegarConexao();
    }
    public void salvar(ItensVendas obj){
        try {
            String sql = "insert into itensvendas (venda_id,produto_id,qtd,subtotal) values(?,?,?,?)";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setInt(1, obj.getVendas().getId());
            stmt.setInt(2, obj.getProdutos().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        throw new RuntimeException("Erro ao salvar os itens da venda"+e);
        }
    }
}


package br.com.gerenciamentoestoque.dao;

import br.com.gerenciamentoestoque.jdbc.ConexaoBC;
import br.com.gerenciamentoestoque.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class VendasDAO {
    private Connection conn;

    public VendasDAO(){
        this.conn = new ConexaoBC().pegarConexao();
    }
    public void salvar(Vendas obj){
        try {
            String sql = "insert into vendas (cliente_id,data_venda,total_venda,observacoes)values(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getClientes().getId());
            stmt.setString(2, obj.getData_venda());
            stmt.setDouble(3, obj.getTotal_venda());
            stmt.setString(4, obj.getObservacoes());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso !");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao realizar a venda"+e);
        }
    }
    public int retornaUltimaVenda(){
        try {
            int ultimoid = 0;
            String sql = "select max(id) id from vendas";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Vendas v = new Vendas();
                v.setId(rs.getInt("id"));
                ultimoid = v.getId();
            }
            return ultimoid;
        } catch (Exception e) {
        throw new RuntimeException("Erro ao retornar o ultimo id da venda"+e);
        }
    }
}

package br.com.gerenciamentoestoque.dao;

import br.com.gerenciamentoestoque.jdbc.ConexaoBC;
import br.com.gerenciamentoestoque.model.Clientes;
import br.com.gerenciamentoestoque.model.Fornecedores;
import br.com.gerenciamentoestoque.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDAO {
    private Connection conn;
    
    public ProdutosDAO(){
        this.conn = new ConexaoBC().pegarConexao();
    }
    public void Salvar(Produtos obj){
        try {
            //Insert SQL
            String sql = "insert into produtos (descricao, preco, qtd_estoque, for_id)"
                    + "values(?,?,?,?)";
            //Conexao com o Banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            stmt.setInt(4, obj.getFornecedores().getId());


            stmt.execute();
            //finalizar conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto Salvo Com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar o Produto " +erro);
        }
    }
    
        public void Editar(Produtos obj){
        try {
            //Insert SQL
            String sql = "update produtos set descricao=?,preco=?,qtd_estoque=?,for_id=? where id=?";
            //Conexao com o Banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            stmt.setInt(4, obj.getFornecedores().getId());
            stmt.setInt(5, obj.getId());
            
            stmt.execute();
            //executa e finaliza
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto Editado Com Sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao editar o Produto" +erro);
        }
    }
        
        public void Excluir(Produtos obj){
            try {
                String sql = "delete from produtos where id=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, obj.getId());
                //executa e finaliza
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Produto Excluido Com Sucesso");
        } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir o produto " +erro);
            }
        }
    public Produtos BuscarProdutos(String nome){
        try {
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from produtos as p inner join fornecedores as f on(p.for_id=f.id) where p.descricao =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();
            if(rs.next()){
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setFornecedores(f);

            }
            return obj;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro ao buscar o produto "+ erro);
        }
        return null;
    }
    public List<Produtos>listar(){
        List<Produtos>lista = new ArrayList<>();
        try {
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from produtos as p inner join fornecedores as f on(p.for_id=f.id)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                    obj.setId(rs.getInt("p.id"));
                    obj.setDescricao(rs.getString("p.descricao"));
                    obj.setPreco(rs.getDouble("p.preco"));
                    obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                    f.setNome(rs.getString("f.nome"));
                    obj.setFornecedores(f);

                    lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro Ao Criar a Lista" + erro);
        }
        return null;
    }
    
        // PESQUISA CLIENTES NO BOTAO PESQUISAR
    public List<Produtos>filtrar(String nome){
        List<Produtos>lista = new ArrayList<>();
        try {
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from produtos as p inner join fornecedores as f on(p.for_id=f.id) where p.descricao like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                
                    obj.setId(rs.getInt("p.id"));
                    obj.setDescricao(rs.getString("p.descricao"));
                    obj.setPreco(rs.getDouble("p.preco"));
                    obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                    f.setNome(rs.getString("f.nome"));
                    obj.setFornecedores(f);
                    lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro Ao Criar a Lista" + erro);
        }
        return null;
    }
}

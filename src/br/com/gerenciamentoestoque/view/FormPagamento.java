
package br.com.gerenciamentoestoque.view;

import br.com.gerenciamentoestoque.dao.ItensVendaDAO;
import br.com.gerenciamentoestoque.dao.ProdutosDAO;
import br.com.gerenciamentoestoque.dao.VendasDAO;
import br.com.gerenciamentoestoque.model.Clientes;
import br.com.gerenciamentoestoque.model.ItensVendas;
import br.com.gerenciamentoestoque.model.Produtos;
import br.com.gerenciamentoestoque.model.Vendas;
import br.com.gerenciamentoestoque.relatorios.relProdutos;
import br.com.gerenciamentoestoque.relatorios.relVendas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPagamento extends javax.swing.JFrame {
    ItensVendas obj = new ItensVendas();
    Clientes clientes = new Clientes();
    DefaultTableModel meus_produtos;

    public FormPagamento() {
        initComponents();
        txtDinheiro.setText("0");
        txtCartao.setText("0");
        txtCheque.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDinheiro = new javax.swing.JTextField();
        txtCartao = new javax.swing.JTextField();
        txtCheque = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        txtObservacoes = new javax.swing.JTextField();
        txtTotalVenda = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StockManager");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(14, 66, 86));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Campo De Pagamento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dinheiro :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cartão :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cheque :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Troco :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Valor Total :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Observações :");

        txtDinheiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCartao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCheque.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTroco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTroco.setEnabled(false);

        txtTotalVenda.setEditable(false);
        txtTotalVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPagar.setText("Efetuar Pagamento");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimir.setText("teste");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(txtObservacoes)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addComponent(btnPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCheque, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCartao)
                        .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        double dinheiro, cartao, cheque, totalVenda, troco, totalPago;
        dinheiro = Double.valueOf(txtDinheiro.getText());
        cartao = Double.valueOf(txtCartao.getText());
        cheque = Double.valueOf(txtCheque.getText());
        totalVenda = Double.valueOf(txtTotalVenda.getText());
        totalPago = dinheiro+cartao+cheque;
        troco = totalPago-totalVenda;
        txtTroco.setText(String.valueOf(troco));
        
        if(totalPago>=totalVenda){
            Vendas v = new Vendas();
            v.setClientes(clientes);
            Date agora = new Date();
            SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dataMysql = dataEUA.format(agora);
            v.setData_venda(dataMysql);
            v.setTotal_venda(totalVenda);
            v.setObservacoes(txtObservacoes.getText());
            
            VendasDAO vd = new VendasDAO();
            vd.salvar(v);
            v.setId(vd.retornaUltimaVenda());
            //JOptionPane.showMessageDialog(null, "ID da ultima venda"+v.getId());
            
            for(int i=0; i<meus_produtos.getRowCount(); i++){
                int qtd_estoque,qtd_comprada,qtd_atualizada;
                Produtos p = new Produtos();
                ProdutosDAO pd = new ProdutosDAO();
                ItensVendas item = new ItensVendas();
                item.setVendas(v);
                p.setId(Integer.valueOf(meus_produtos.getValueAt(i, 0).toString()));
                item.setProdutos(p);
                item.setQtd(Integer.valueOf(meus_produtos.getValueAt(i, 2).toString()));
                item.setSubtotal(Double.valueOf(meus_produtos.getValueAt(i, 4).toString()));
                qtd_estoque = pd.retornaQtdAtualEstoque(p.getId());
                qtd_comprada = Integer.valueOf(meus_produtos.getValueAt(i, 2).toString());
                qtd_atualizada = qtd_estoque-qtd_comprada;
                pd.baixaEstoque(p.getId(), qtd_atualizada);
                ItensVendaDAO ivd = new ItensVendaDAO();
                ivd.salvar(item);
                dispose();
                FormVendas fv = new FormVendas();
                fv.setVisible(true);
                new relVendas();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Valor a ser pago não bate com o valor da venda !");
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        new relVendas();
    }//GEN-LAST:event_btnImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextField txtObservacoes;
    public javax.swing.JTextField txtTotalVenda;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}

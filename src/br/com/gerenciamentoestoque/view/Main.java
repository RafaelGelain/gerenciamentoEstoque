
package br.com.gerenciamentoestoque.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicMenuBarUI;


public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StockManager");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jMenu1.setText("Clientes  ");

        jMenuItem1.setText("Formulario de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBar.add(jMenu1);

        jMenu2.setText("Funcionarios  ");

        jMenuItem2.setText("Formulario de Funcionarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        menuBar.add(jMenu2);

        jMenu3.setText("Fornecedores  ");

        jMenuItem3.setText("Formulario de Fornecedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        menuBar.add(jMenu3);

        jMenu4.setText("Produtos  ");
        menuBar.add(jMenu4);

        jMenu5.setText("Vendas  ");
        menuBar.add(jMenu5);

        jMenu6.setText("Configurações  ");
        menuBar.add(jMenu6);

        jMenu7.setText("Sair  ");
        menuBar.add(jMenu7);

        customizeMenuBar(menuBar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setSize(1280,720);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormClientes fc = new FormClientes();
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormFuncionarios fc = new FormFuncionarios();
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FormFornecedores fc = new FormFornecedores();
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
private void customizeMenuBar(JMenuBar menuBar) {

    menuBar.setUI(new BasicMenuBarUI() {

        @Override
        public void paint(Graphics g, JComponent c) {
            g.setColor(Color.black);
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
        }

    });

    MenuElement[] menus = menuBar.getSubElements();

    for (MenuElement menuElement : menus) {

        JMenu menu = (JMenu) menuElement.getComponent();
        changeComponentColors(menu);
        menu.setOpaque(true);

        MenuElement[] menuElements = menu.getSubElements();

        for (MenuElement popupMenuElement : menuElements) {

            JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
            popupMenu.setBorder(null);

            MenuElement[] menuItens = popupMenuElement.getSubElements();

            for (MenuElement menuItemElement : menuItens) {

                JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
                changeComponentColors(menuItem);
                menuItem.setOpaque(true);

            }
        }
    }
}

private void changeComponentColors(Component comp) {
    comp.setBackground(Color.black);
    comp.setForeground(Color.white);
}

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}

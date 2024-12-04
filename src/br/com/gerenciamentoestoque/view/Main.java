
package br.com.gerenciamentoestoque.view;

import br.com.gerenciamentoestoque.relatorios.relClientes;
import br.com.gerenciamentoestoque.relatorios.relFornecedores;
import br.com.gerenciamentoestoque.relatorios.relFuncionarios;
import br.com.gerenciamentoestoque.relatorios.relProdutos;
import br.com.gerenciamentoestoque.relatorios.relVendas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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

        background = new java.awt.Panel();
        painelEsquerda = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        painelEsquerdabaixo = new java.awt.Panel();
        btnClientes = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnHistoricoVenda = new javax.swing.JButton();
        painelDireita = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        gerarRelatorioCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        gerarRelatorioFunc = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        gerarRelatorioForn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        gerarRelProd = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StockManager");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setBackground(new java.awt.Color(204, 204, 204));

        painelEsquerda.setBackground(new java.awt.Color(249, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gerenciamentoestoque/imagens/iconPrincipal-Maior.png"))); // NOI18N
        jLabel1.setText("StockManager");

        javax.swing.GroupLayout painelEsquerdaLayout = new javax.swing.GroupLayout(painelEsquerda);
        painelEsquerda.setLayout(painelEsquerdaLayout);
        painelEsquerdaLayout.setHorizontalGroup(
            painelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        painelEsquerdaLayout.setVerticalGroup(
            painelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        painelEsquerdabaixo.setBackground(new java.awt.Color(249, 255, 255));

        btnClientes.setText("Formulario de Clientes\n");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnFuncionarios.setText("Formulario de Funcionarios\n");
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnFornecedores.setText("Formulario de Fornecedores");
        btnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedoresActionPerformed(evt);
            }
        });

        btnProdutos.setText("Formulario de Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnEstoque.setText("Estoque");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnVendas.setText("Painel De Orçamentos\n");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnHistoricoVenda.setText("Historico De Vendas");
        btnHistoricoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEsquerdabaixoLayout = new javax.swing.GroupLayout(painelEsquerdabaixo);
        painelEsquerdabaixo.setLayout(painelEsquerdabaixoLayout);
        painelEsquerdabaixoLayout.setHorizontalGroup(
            painelEsquerdabaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdabaixoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(painelEsquerdabaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistoricoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        painelEsquerdabaixoLayout.setVerticalGroup(
            painelEsquerdabaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdabaixoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistoricoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        painelDireita.setBackground(new java.awt.Color(249, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Gestão de Clientes");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("Possibilidade de cadastrar novos clientes, atualizar dados existentes, consultar informações e remover registros quando necessário.\n");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("Formulário simples e intuitivo para adicionar dados como nome, endereço, telefone e CPF/CNPJ.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Gestão de Funcionários");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setText("Ferramenta prática para gerenciar o cadastro de funcionários, permitindo adicionar, atualizar, consultar ou excluir informações.");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("Campos personalizados para registrar dados como nome, cargo e formas de contato.");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel8.setText("Facilita o controle de dados como razão social, CNPJ, endereço e telefone de contato.");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel9.setText("Função dedicada para adicionar fornecedores, revisar ou atualizar informações e excluir registros obsoletos.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("Gestão de Fornecedores");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel11.setText("Consulta rápida de produtos por filtros como nome ou categoria para localizar o que você precisa.");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel12.setText("Cadastro fácil de produtos com informações completas, como nome, código, categoria, preço e quantidade.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("Gestão de Produtos e Estoque");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel14.setText("Controle de estoque integrado que atualiza automaticamente as quantidades conforme entradas e saídas.");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel15.setText("Redução automática no estoque com base nos itens vendidos.");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("Diversas opções de formas de pagamento, como dinheiro ou cartão.");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel17.setText("Processo simplificado para realizar vendas, permitindo selecionar produtos e associar a um cliente.");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel18.setText("Gestão de Vendas");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel19.setText("Features :");

        javax.swing.GroupLayout painelDireitaLayout = new javax.swing.GroupLayout(painelDireita);
        painelDireita.setLayout(painelDireitaLayout);
        painelDireitaLayout.setHorizontalGroup(
            painelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDireitaLayout.createSequentialGroup()
                .addGroup(painelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDireitaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(painelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDireitaLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(painelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)))
                    .addGroup(painelDireitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDireitaLayout.setVerticalGroup(
            painelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDireitaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelEsquerdabaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(painelEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelEsquerdabaixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(painelDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Clientes  ");

        jMenuItem1.setText("Formulario de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        gerarRelatorioCliente.setText("Relatorio de Clientes");
        gerarRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioClienteActionPerformed(evt);
            }
        });
        jMenu1.add(gerarRelatorioCliente);

        menuBar.add(jMenu1);

        jMenu2.setText("Funcionarios  ");

        jMenuItem2.setText("Formulario de Funcionarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        gerarRelatorioFunc.setText("Relatorio de Funcionarios");
        gerarRelatorioFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioFuncActionPerformed(evt);
            }
        });
        jMenu2.add(gerarRelatorioFunc);

        menuBar.add(jMenu2);

        jMenu3.setText("Fornecedores  ");

        jMenuItem3.setText("Formulario de Fornecedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        gerarRelatorioForn.setText("Relatorio de Fornecedores");
        gerarRelatorioForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioFornActionPerformed(evt);
            }
        });
        jMenu3.add(gerarRelatorioForn);

        menuBar.add(jMenu3);

        jMenu4.setText("Produtos  ");

        jMenuItem5.setText("Estoque");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem4.setText("Consultar Produto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem6.setText("Cadastro de Produtos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        gerarRelProd.setText("Relatorio de Produtos");
        gerarRelProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelProdActionPerformed(evt);
            }
        });
        jMenu4.add(gerarRelProd);

        menuBar.add(jMenu4);

        jMenu5.setText("Vendas  ");

        jMenuItem9.setText("Painel de Orçamentos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Historico de Vendas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        menuBar.add(jMenu5);

        jMenu6.setText("Configurações  ");

        jMenuItem7.setText("Trocar de Usuario");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Sair Do Sistema");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        menuBar.add(jMenu6);

        customizeMenuBar(menuBar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setSize(1280,730);
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

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FormProdutos fc = new FormProdutos();
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FormProdutos consultaProdutos = new FormProdutos();
        consultaProdutos.Tabela_Cliente.setSelectedIndex(1);
        consultaProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FormEstoque fc = new FormEstoque();
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        FormLogin login = new FormLogin();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

    int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema ?", "Confirmação", JOptionPane.YES_NO_OPTION);

    if (confirmacao == JOptionPane.YES_OPTION) {
            System.exit(0);
    } else {
        JOptionPane.showMessageDialog(null, "Ação cancelada.");
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        FormVendas fc = new FormVendas();
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FormHistoricoVendas fc = new FormHistoricoVendas();
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        FormClientes fc = new FormClientes();
        fc.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        FormFuncionarios fc = new FormFuncionarios();
        fc.setVisible(true);
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        FormFornecedores fc = new FormFornecedores();
        fc.setVisible(true);
    }//GEN-LAST:event_btnFornecedoresActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        FormProdutos fc = new FormProdutos();
        fc.setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        FormEstoque fc = new FormEstoque();
        fc.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        FormVendas fc = new FormVendas();
        fc.setVisible(true);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnHistoricoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoVendaActionPerformed
        FormHistoricoVendas fc = new FormHistoricoVendas();
        fc.setVisible(true);
    }//GEN-LAST:event_btnHistoricoVendaActionPerformed

    private void gerarRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioClienteActionPerformed
        new relClientes();
    }//GEN-LAST:event_gerarRelatorioClienteActionPerformed

    private void gerarRelatorioFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioFuncActionPerformed
        new relFuncionarios();
    }//GEN-LAST:event_gerarRelatorioFuncActionPerformed

    private void gerarRelatorioFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioFornActionPerformed
        new relFornecedores();
    }//GEN-LAST:event_gerarRelatorioFornActionPerformed

    private void gerarRelProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelProdActionPerformed
        new relProdutos();
    }//GEN-LAST:event_gerarRelProdActionPerformed

private void customizeMenuBar(JMenuBar menuBar) {
    menuBar.setUI(new BasicMenuBarUI() {
        @Override
        public void paint(Graphics g, JComponent c) {
            g.setColor(new java.awt.Color(14, 66, 86));
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
        //MUDAR DE COR MENU
    public static void alterarCorBotao(JButton botao) {
        // Cor personalizada
        Color corFundo = new Color(14, 66, 86); // Cor de fundo
        Color corTexto = Color.WHITE; // Cor do texto (branco)

        // Alterando a cor do botão
        botao.setBackground(corFundo);
        botao.setForeground(corTexto);
    }
    
private void changeComponentColors(Component comp) {
    comp.setBackground(new java.awt.Color(14, 66, 86));
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
    private java.awt.Panel background;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnHistoricoVenda;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVendas;
    private javax.swing.JMenuItem gerarRelProd;
    private javax.swing.JMenuItem gerarRelatorioCliente;
    private javax.swing.JMenuItem gerarRelatorioForn;
    private javax.swing.JMenuItem gerarRelatorioFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private java.awt.Panel painelDireita;
    private java.awt.Panel painelEsquerda;
    private java.awt.Panel painelEsquerdabaixo;
    // End of variables declaration//GEN-END:variables
}

package br.com.gerenciamentoestoque.view;

import br.com.gerenciamentoestoque.dao.ClientesDAO;
import br.com.gerenciamentoestoque.dao.FornecedoresDAO;
import br.com.gerenciamentoestoque.dao.ProdutosDAO;
import br.com.gerenciamentoestoque.model.Clientes;
import br.com.gerenciamentoestoque.model.Fornecedores;
import br.com.gerenciamentoestoque.model.Produtos;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormVendas extends javax.swing.JFrame {
        public void listar(){
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tabelaProduto.getModel();
            dados.setNumRows(0);
            for(Produtos p : lista){
                dados.addRow(new Object[]{
                  p.getId(),
                  p.getDescricao(),
                  p.getPreco(),
                  p.getQtd_estoque(),
                  p.getFornecedores().getNome()
                });
            }
    }

    Clientes obj = new Clientes();
    double preco,subtotal,total;
    int qtd;
    DefaultTableModel meus_produtos;
    public FormVendas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabelaSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TabelaMeio2 = new javax.swing.JScrollPane();
        TabelaMeio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        btnPesquisarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPesquisarProduto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCodCliente = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQtdEstoque = new javax.swing.JTextField();
        txtDesconto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        TabelaInferior1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalVenda = new javax.swing.JTextField();
        btnPagamento = new javax.swing.JButton();
        TabelaInferior = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        carrinho = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StockManager");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TabelaSuperior.setBackground(new java.awt.Color(14, 66, 86));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario De Vendas");

        javax.swing.GroupLayout TabelaSuperiorLayout = new javax.swing.GroupLayout(TabelaSuperior);
        TabelaSuperior.setLayout(TabelaSuperiorLayout);
        TabelaSuperiorLayout.setHorizontalGroup(
            TabelaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TabelaSuperiorLayout.setVerticalGroup(
            TabelaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        TabelaMeio2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        TabelaMeio2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TabelaMeio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CPF :");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Codigo:");

        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Data :");

        txtData.setEditable(false);
        txtData.setEnabled(false);
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Preço", "Quantidade", "Fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        tabelaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaProdutoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Codigo Prod :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Produto :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Preço :");

        btnPesquisarProduto.setText("Pesquisar");
        btnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProdutoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Qnt Estoque :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Desconto :");

        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        txtCodCliente.setEditable(false);
        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });

        txtPreco.setEnabled(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        txtQtdEstoque.setEnabled(false);
        txtQtdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdEstoqueActionPerformed(evt);
            }
        });

        txtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescontoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("RG:");

        txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Email :");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("CEP :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Telefone :");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-#### ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Celular:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-#### ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Endereço :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Bairro :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Cidade :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Complemento :");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Quantidade :");

        txtQtd.setText("1");
        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar Item");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabelaMeioLayout = new javax.swing.GroupLayout(TabelaMeio);
        TabelaMeio.setLayout(TabelaMeioLayout);
        TabelaMeioLayout.setHorizontalGroup(
            TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaMeioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtEmail))
                                        .addGap(18, 18, 18)
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TabelaMeioLayout.createSequentialGroup()
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(txtCep))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19))))))
                        .addGap(442, 442, 442))
                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel20)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(TabelaMeioLayout.createSequentialGroup()
                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23)))
                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        TabelaMeioLayout.setVerticalGroup(
            TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaMeioLayout.createSequentialGroup()
                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesquisarCliente)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel15))
                                .addGap(4, 4, 4)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TabelaMeioLayout.createSequentialGroup()
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TabelaMeioLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20))
                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabelaMeioLayout.createSequentialGroup()
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPesquisarProduto)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabelaMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabelaMeioLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(49, 49, 49)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TabelaMeio2.setViewportView(TabelaMeio);

        TabelaInferior1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Preço Total :");

        txtTotalVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalVenda.setEnabled(false);
        txtTotalVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVendaActionPerformed(evt);
            }
        });

        btnPagamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPagamento.setText("Efetuar Pagamento");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        TabelaInferior.setBackground(new java.awt.Color(255, 255, 255));
        TabelaInferior.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORÇAMENTO :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Produto ", "Quantidade", "Preço", "Total", "Desconto"
            }
        ));
        jScrollPane2.setViewportView(carrinho);

        javax.swing.GroupLayout TabelaInferiorLayout = new javax.swing.GroupLayout(TabelaInferior);
        TabelaInferior.setLayout(TabelaInferiorLayout);
        TabelaInferiorLayout.setHorizontalGroup(
            TabelaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
        );
        TabelaInferiorLayout.setVerticalGroup(
            TabelaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout TabelaInferior1Layout = new javax.swing.GroupLayout(TabelaInferior1);
        TabelaInferior1.setLayout(TabelaInferior1Layout);
        TabelaInferior1Layout.setHorizontalGroup(
            TabelaInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaInferior1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabelaInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(TabelaInferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TabelaInferior1Layout.setVerticalGroup(
            TabelaInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaInferior1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabelaInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabelaInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TabelaInferior1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabelaSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TabelaMeio2, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addComponent(TabelaInferior1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabelaSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabelaMeio2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabelaInferior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        //IMPLEMENTAR DOUBLE CLICK
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void tabelaProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaProdutoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            txtCodigo.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 0).toString());
            txtDescricao.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 1).toString());
            txtPreco.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 2).toString());
            txtQtdEstoque.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 3).toString());

        }
    }//GEN-LAST:event_tabelaProdutoKeyPressed

    private void txtTotalVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVendaActionPerformed

    }//GEN-LAST:event_txtTotalVendaActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        String nome = txtNome.getText();
        String CPF = txtCPF.getText();
        obj = new Clientes();
        ClientesDAO daoc = new ClientesDAO();
        obj = daoc.BuscarCliente(nome);
        if (obj.getNome()!=null){
            FormPagamento telaPagamento = new FormPagamento();
            telaPagamento.clientes = obj;
            telaPagamento.meus_produtos = meus_produtos;
            telaPagamento.txtTotalVenda.setText(String.valueOf(total));
            telaPagamento.setVisible(true);;
            this.dispose();
        }else{
        JOptionPane.showMessageDialog(null, "Dados invalidos !");
        }
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtQtdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdEstoqueActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
    if(evt.getKeyCode()== KeyEvent.VK_ENTER){   
        String nome = txtNome.getText();
        
        ClientesDAO dao = new ClientesDAO();

        obj = dao.BuscarCliente(nome);
        if(obj.getNome() != null){
            txtCodCliente.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            txtRG.setText(obj.getRg());
            txtCPF.setText(obj.getCpf());
            txtEmail.setText(obj.getEmail());
            txtTelefone.setText(obj.getTelefone());
            txtCelular.setText(obj.getCelular());
            txtCep.setText(obj.getCep());
            txtEndereco.setText(obj.getEndereco());
            txtComplemento.setText(obj.getComplemento());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            
        }else{
            JOptionPane.showMessageDialog(null, "Cliente Não Encontrado");
        }
    }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        ClientesDAO dao = new ClientesDAO();
        String nome = txtNome.getText();

        obj = dao.BuscarCliente(nome);
        if(obj.getNome() != null){
            txtCodCliente.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            txtRG.setText(obj.getRg());
            txtCPF.setText(obj.getCpf());
            txtEmail.setText(obj.getEmail());
            txtTelefone.setText(obj.getTelefone());
            txtCelular.setText(obj.getCelular());
            txtCep.setText(obj.getCep());
            txtEndereco.setText(obj.getEndereco());
            txtComplemento.setText(obj.getComplemento());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            
        }else{
            JOptionPane.showMessageDialog(null, "Cliente Não Encontrado");
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        Date agora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy | HH:mm:ss");
        String dataFormatada = formato.format(agora);
        txtData.setText(String.valueOf(dataFormatada));
    }//GEN-LAST:event_formWindowActivated

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){

        String nome = txtDescricao.getText();
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();

        obj = dao.BuscarProdutos(nome);
        if(obj.getDescricao()!= null){
            txtCodigo.setText(String.valueOf(obj.getId()));
            txtDescricao.setText(obj.getDescricao());
            
            txtPreco.setText(String.valueOf(obj.getPreco()));
            txtQtdEstoque.setText(String.valueOf(obj.getQtd_estoque()));
            
        }else{
            JOptionPane.showMessageDialog(null, "Produto Não Encontrado");
        }
        }
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed
        String nome = txtDescricao.getText();
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();

        obj = dao.BuscarProdutos(nome);
        if(obj.getDescricao()!= null){
            txtCodigo.setText(String.valueOf(obj.getId()));
            txtDescricao.setText(obj.getDescricao());
            
            txtPreco.setText(String.valueOf(obj.getPreco()));
            txtQtdEstoque.setText(String.valueOf(obj.getQtd_estoque()));
            
        }else{
            JOptionPane.showMessageDialog(null, "Produto Não Encontrado");
        }
    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String nome = txtDescricao.getText();
        Produtos obj = new Produtos();
        ProdutosDAO daop = new ProdutosDAO();
        obj = daop.BuscarProdutos(nome);
        
        if(obj.getDescricao() !=null){
            int estoque = Integer.valueOf(txtQtdEstoque.getText());
            int quantidade = Integer.valueOf(txtQtd.getText());
            preco = Double.valueOf(txtPreco.getText());
            qtd = Integer.valueOf(txtQtd.getText());
            
            // Verificar se há desconto
            double descontoPercentual = 0.0;
            if (!txtDesconto.getText().isEmpty()) {
                descontoPercentual = Double.valueOf(txtDesconto.getText()); // Desconto em porcentagem
                // Validar se o desconto está entre 0 e 100%
                if (descontoPercentual < 0 || descontoPercentual > 40) {
                    JOptionPane.showMessageDialog(null, "Desconto inválido! Informe um valor entre 0 e 40.");
                    return; // Interrompe o fluxo caso o desconto seja inválido
                }
            }            
            
            double valorDesconto = preco * (descontoPercentual / 100);
            subtotal = (preco - valorDesconto) * qtd;
            total += subtotal;
            if(estoque>=quantidade){
                txtTotalVenda.setText(String.valueOf(total));
                meus_produtos = (DefaultTableModel)carrinho.getModel();
                meus_produtos.addRow(new Object[]{
                    txtCodigo.getText(),
                    txtDescricao.getText(),
                    txtQtd.getText(),
                    txtPreco.getText(),
                    subtotal,
                    descontoPercentual + "%", // Mostra o desconto em porcentagem
                });
            }
            else{
                JOptionPane.showMessageDialog(null, "Quantidade de produto insuficiente no estoque !");
            }
        }        else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos com as informações !");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescontoActionPerformed

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
            java.util.logging.Logger.getLogger(FormVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabelaInferior;
    private javax.swing.JPanel TabelaInferior1;
    private javax.swing.JPanel TabelaMeio;
    private javax.swing.JScrollPane TabelaMeio2;
    private javax.swing.JPanel TabelaSuperior;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JTable carrinho;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtQtdEstoque;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtTotalVenda;
    // End of variables declaration//GEN-END:variables
}

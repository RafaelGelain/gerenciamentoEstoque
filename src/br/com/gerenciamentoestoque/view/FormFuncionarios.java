package br.com.gerenciamentoestoque.view;

import br.com.gerenciamentoestoque.dao.ClientesDAO;
import br.com.gerenciamentoestoque.dao.FuncionariosDAO;
import br.com.gerenciamentoestoque.func.Utilitarios;
import br.com.gerenciamentoestoque.model.Clientes;
import br.com.gerenciamentoestoque.model.Funcionarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.*;

public class FormFuncionarios extends javax.swing.JFrame {
    public void listar(){
        FuncionariosDAO dao = new FuncionariosDAO();
        List<Funcionarios> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
            dados.setNumRows(0);
            for(Funcionarios c : lista){
                dados.addRow(new Object[]{
                  c.getId(),
                  c.getNome(),
                  c.getRg(),
                  c.getCpf(),
                  c.getEmail(),
                  c.getSenha(),
                  c.getCargo(),
                  c.getNivel(),
                  c.getTelefone(),
                  c.getCelular(),
                  c.getCep(),
                  c.getEndereco(),
                  c.getNumero(),
                  c.getComplemento(),
                  c.getBairro(),
                  c.getCidade(),
                  c.getEstado()
                });
            }
    }
    
    public FormFuncionarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tabela_Cliente = new javax.swing.JTabbedPane();
        tabela_consulta = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPesquisaNome = new javax.swing.JTextField();
        btnPesquisaNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        tabela_dadosclientes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        cbUF = new javax.swing.JComboBox<>();
        txtSenha = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbNivel = new javax.swing.JComboBox<>();
        txtCidade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StockManager");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(14, 66, 86));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro De Funcionarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabela_Cliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Nome");

        txtPesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaNomeKeyPressed(evt);
            }
        });

        btnPesquisaNome.setText("Pesquisar");
        btnPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "RG", "CPF", "Email", "Senha", "Cargo", "Nivel", "Telefone", "Celular", "CEP", "Endereco", "Numero", "Complemento", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout tabela_consultaLayout = new javax.swing.GroupLayout(tabela_consulta);
        tabela_consulta.setLayout(tabela_consultaLayout);
        tabela_consultaLayout.setHorizontalGroup(
            tabela_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabela_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabela_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabela_consultaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisaNome)
                        .addGap(0, 723, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        tabela_consultaLayout.setVerticalGroup(
            tabela_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabela_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabela_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabela_Cliente.addTab("Consulta De Funcionarios", tabela_consulta);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Codigo :");

        txtCodCliente.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome :");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefone :");

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

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Endereço :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Bairro :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Complemento :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Cidade :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Cep:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nº :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("CPF :");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("RG :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Celular:");

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

        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RS", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RR", "SC", "SP", "SE", "TO" }));

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Senha:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Cargo:");

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabela_dadosclientesLayout = new javax.swing.GroupLayout(tabela_dadosclientes);
        tabela_dadosclientes.setLayout(tabela_dadosclientesLayout);
        tabela_dadosclientesLayout.setHorizontalGroup(
            tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addGap(18, 18, 18)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbNivel, 0, 1, Short.MAX_VALUE))
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel15))
                            .addComponent(jLabel5)
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        tabela_dadosclientesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnExcluir, btnSalvar});

        tabela_dadosclientesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCelular, txtTelefone});

        tabela_dadosclientesLayout.setVerticalGroup(
            tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPesquisar)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabela_dadosclientesLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabela_dadosclientesLayout.createSequentialGroup()
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabela_dadosclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        Tabela_Cliente.addTab("Dados do Cadastro", tabela_dadosclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tabela_Cliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabela_Cliente)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed

    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed

    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //FUNÇÃO DA ABA DADOS DE CADASTRO - PESQUISAR
        String nome = txtNome.getText();
        Funcionarios obj = new Funcionarios();
        FuncionariosDAO dao = new FuncionariosDAO();

        obj = dao.BuscarFuncionario(nome);
        if(obj.getNome() != null){
            txtCodCliente.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            txtRG.setText(obj.getRg());
            txtCPF.setText(obj.getCpf());
            txtEmail.setText(obj.getEmail());
            txtSenha.setText(obj.getSenha());
            txtCargo.setText(obj.getCargo());
            cbNivel.setSelectedItem(obj.getNivel());
            txtTelefone.setText(obj.getTelefone());
            txtCelular.setText(obj.getCelular());
            txtCep.setText(obj.getCep());
            txtEndereco.setText(obj.getEndereco());
            txtNumero.setText(String.valueOf(obj.getNumero()));
            txtComplemento.setText(obj.getComplemento());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            cbUF.setSelectedItem(obj.getEstado());
        }else{
            JOptionPane.showMessageDialog(null, "Funcionario Não Encontrado");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
        //BOTAO PESQUISAR NO CONSULTAR CLIENTES
        String nome = "%"+txtPesquisaNome.getText()+"%";
        FuncionariosDAO dao = new FuncionariosDAO();
        List<Funcionarios> lista = dao.filtrar(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
            dados.setNumRows(0);
            for(Funcionarios c : lista){
                dados.addRow(new Object[]{
                  c.getId(),
                  c.getNome(),
                  c.getRg(),
                  c.getCpf(),
                  c.getEmail(),
                  c.getSenha(),
                  c.getCargo(),
                  c.getNivel(),
                  c.getTelefone(),
                  c.getCelular(),
                  c.getCep(),
                  c.getEndereco(),
                  c.getNumero(),
                  c.getComplemento(),
                  c.getBairro(),
                  c.getCidade(),
                  c.getEstado()
                });
            }
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        String nome = txtNome.getText();
        Funcionarios obj = new Funcionarios();
        FuncionariosDAO dao = new FuncionariosDAO();

        obj = dao.BuscarFuncionario(nome);
        if(obj.getNome() != null){
            txtCodCliente.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            txtRG.setText(obj.getRg());
            txtCPF.setText(obj.getCpf());
            txtEmail.setText(obj.getEmail());
            txtSenha.setText(obj.getSenha());
            txtCargo.setText(obj.getCargo());
            cbNivel.setSelectedItem(obj.getNivel());
            txtTelefone.setText(obj.getTelefone());
            txtCelular.setText(obj.getCelular());
            txtCep.setText(obj.getCep());
            txtEndereco.setText(obj.getEndereco());
            txtNumero.setText(String.valueOf(obj.getNumero()));
            txtComplemento.setText(obj.getComplemento());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            cbUF.setSelectedItem(obj.getEstado());
        }else{
            JOptionPane.showMessageDialog(null, "Funcionario Não Encontrado");
        }
        }
    }//GEN-LAST:event_txtNomeKeyPressed
    
    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
           //IMPLEMENTAR DOUBLE CLICK
    }//GEN-LAST:event_tabelaMouseClicked
    //EDITAR
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Funcionarios obj = new Funcionarios();
        obj.setNome(txtNome.getText());
        obj.setRg(txtRG.getText());
        obj.setCpf(txtCPF.getText());
        obj.setEmail(txtEmail.getText());
        obj.setSenha(txtSenha.getText());
        obj.setCargo(txtCargo.getText());
        obj.setNivel(cbNivel.getSelectedItem().toString());
        obj.setTelefone(txtTelefone.getText());
        obj.setCelular(txtCelular.getText());
        obj.setCep(txtCep.getText());
        obj.setEndereco(txtEndereco.getText());
        obj.setNumero(Integer.valueOf(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCargo.getText());
        obj.setEstado(cbUF.getSelectedItem().toString());
        obj.setId(Integer.valueOf(txtCodCliente.getText()));
        
        FuncionariosDAO dao = new FuncionariosDAO();
        dao.Editar(obj);
        Utilitarios utili = new Utilitarios();
        utili.LimparTela(tabela_dadosclientes);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    // Exibe uma caixa de diálogo de confirmação
    int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
    // Se o usuário clicar em "Sim", prossegue com a exclusão
    if (confirmacao == JOptionPane.YES_OPTION) {
        Funcionarios obj = new Funcionarios();
        obj.setId(Integer.valueOf(txtCodCliente.getText()));
        
        FuncionariosDAO dao = new FuncionariosDAO();
        dao.Excluir(obj);
        
        Utilitarios utili = new Utilitarios();
        utili.LimparTela(tabela_dadosclientes);
    } else {
        // Caso o usuário clique em "Não", a exclusão é cancelada
        JOptionPane.showMessageDialog(null, "A exclusão foi cancelada.");
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
        // Quando for detectado o duplo clique, muda a aba para o cadastro do cliente
        Tabela_Cliente.setSelectedIndex(1);
        // Preenche os campos com os dados do cliente selecionado na tabela
        txtCodCliente.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtRG.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        txtCPF.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        txtEmail.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        txtSenha.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
        txtCargo.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        cbNivel.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
        txtTelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
        txtCelular.setText(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
        txtCep.setText(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
        txtEndereco.setText(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());
        txtNumero.setText(tabela.getValueAt(tabela.getSelectedRow(), 12).toString());
        txtComplemento.setText(tabela.getValueAt(tabela.getSelectedRow(), 13).toString());
        txtBairro.setText(tabela.getValueAt(tabela.getSelectedRow(), 14).toString());
        txtCidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 15).toString());
        cbUF.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 16).toString());
        }
    }//GEN-LAST:event_tabelaKeyPressed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtPesquisaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaNomeKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        String nome = "%"+txtPesquisaNome.getText()+"%";
        FuncionariosDAO dao = new FuncionariosDAO();
        List<Funcionarios> lista = dao.filtrar(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
            dados.setNumRows(0);
            for(Funcionarios c : lista){
                dados.addRow(new Object[]{
                  c.getId(),
                  c.getNome(),
                  c.getRg(),
                  c.getCpf(),
                  c.getEmail(),
                  c.getSenha(),
                  c.getCargo(),
                  c.getNivel(),
                  c.getTelefone(),
                  c.getCelular(),
                  c.getCep(),
                  c.getEndereco(),
                  c.getNumero(),
                  c.getComplemento(),
                  c.getBairro(),
                  c.getCidade(),
                  c.getEstado()
                });
            }
        }
    }//GEN-LAST:event_txtPesquisaNomeKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Funcionarios obj = new Funcionarios();
        obj.setNome(txtNome.getText());
        obj.setRg(txtRG.getText());
        obj.setCpf(txtCPF.getText());
        obj.setEmail(txtEmail.getText());
        obj.setSenha(txtSenha.getText());
        obj.setCargo(txtCargo.getText());
        obj.setNivel(cbNivel.getSelectedItem().toString());
        obj.setTelefone(txtTelefone.getText());
        obj.setCelular(txtCelular.getText());
        obj.setCep(txtCep.getText());
        obj.setEndereco(txtEndereco.getText());
        obj.setNumero(Integer.valueOf(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCargo.getText());
        obj.setEstado(cbUF.getSelectedItem().toString());
        
        FuncionariosDAO dao = new FuncionariosDAO();
        dao.Salvar(obj);
        Utilitarios utili = new Utilitarios();
        utili.LimparTela(tabela_dadosclientes);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

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
            java.util.logging.Logger.getLogger(FormFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabela_Cliente;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JPanel tabela_consulta;
    private javax.swing.JPanel tabela_dadosclientes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JTextField txtRG;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

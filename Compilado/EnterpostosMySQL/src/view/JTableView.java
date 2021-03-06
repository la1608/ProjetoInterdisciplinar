/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import mode.bean.Produtos;
import model.dao.ProdutosDAO;

/**
 *
 * @author serpa
 */
public class JTableView extends javax.swing.JFrame {

    /**
     * Creates new form JTableView
     */
    public JTableView() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        jTProdutos.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        ProdutosDAO pdao = new ProdutosDAO();
        
        for (Produtos p: pdao.read()){
            
            modelo.addRow(new Object[]{
                p.getCodigo(),
                p.getNome(),
                p.getNomeReduzido(),
                p.getFabricante(),
                p.getFamilia(),
                p.getClassABC(),
                p.getTipo(),
                p.getSituacao(),
                p.getDesconto(),
                p.getCodigoBarras(),
                p.getReferencia(),
                p.getReferenciaOriginal(),
                p.getTipoProducao()
            });
        }
    }
    
    public void readJTableForName(String name){
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        ProdutosDAO pdao = new ProdutosDAO();
        
        for (Produtos p: pdao.readForName(name)){
            
            modelo.addRow(new Object[]{
                p.getCodigo(),
                p.getNome(),
                p.getNomeReduzido(),
                p.getFabricante(),
                p.getFamilia(),
                p.getClassABC(),
                p.getTipo(),
                p.getSituacao(),
                p.getDesconto(),
                p.getCodigoBarras(),
                p.getReferencia(),
                p.getReferenciaOriginal(),
                p.getTipoProducao()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtNomeRed = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFamilia = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        cbSituacao = new javax.swing.JComboBox();
        cbDesconto = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigoBarras = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtReferenciaOriginal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbTipoProducao = new javax.swing.JComboBox();
        btnCadastrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtBuscarNome = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        jLabel1.setText("Código");

        jLabel2.setText("Fabricante");

        jLabel3.setText("Nome");

        jLabel4.setText("Nome reduzido");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificação"));

        jLabel5.setText("Familia");

        jLabel6.setText("Tipo");

        jLabel7.setText("Situação");

        jLabel8.setText("Class ABC");

        jLabel9.setText("Permite desconto");

        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Normal", "Suspensa" }));

        cbDesconto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sim", "Não" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(89, 89, 89))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtFamilia)
                                    .addGap(21, 21, 21)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Classificação"));

        jLabel10.setText("Código de barras");

        jLabel11.setText("Referência");

        jLabel12.setText("Referência original");

        jLabel13.setText("Tipo de produção");

        cbTipoProducao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Própria", "Tercerizada" }));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtReferenciaOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cbTipoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(btnCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAlterar))
                                    .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel12)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReferenciaOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeRed, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Nome reduzido", "Fabricante", "Familia", "Class ABC", "Tipo", "Situação", "Permite desconto", "Código de barras", "Referência", "Referência original", "Tipo de produção"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.png"))); // NOI18N
        jMenu1.setText("Arquivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door_out.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        p.setNome(txtNome.getText());
        p.setNomeReduzido(txtNomeRed.getText());
        p.setFabricante(txtFabricante.getText());
        p.setFamilia(txtFamilia.getText());
        p.setClassABC(txtClass.getText());
        p.setTipo(txtTipo.getText());
        p.setSituacao(cbSituacao.getSelectedItem().toString());
        p.setDesconto(cbDesconto.getSelectedItem().toString());
        p.setCodigoBarras(txtCodigoBarras.getText());
        p.setReferencia(txtReferencia.getText());
        p.setReferenciaOriginal(txtReferenciaOriginal.getText());
        p.setTipoProducao(cbTipoProducao.getSelectedItem().toString());
        dao.create(p);
        
        txtNome.setText("");
        txtNomeRed.setText("");
        txtFabricante.setText("");
        txtFamilia.setText("");
        txtClass.setText("");
        txtTipo.setText("");
        cbSituacao.setSelectedIndex(0);
        cbDesconto.setSelectedIndex(0);
        txtCodigoBarras.setText("");
        txtReferencia.setText("");
        txtReferenciaOriginal.setText("");
        cbTipoProducao.setSelectedIndex(0);
        
        
        
        readJTable();
        
        //DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutos.getModel();
        //Object[] dados = {txtCodigo.getText(),txtNome.getText(),txtNomeRed.getText(),txtFabricante.getText(),txtFamilia.getText(),txtClass.getText(),txtTipo.getText(),cbSituacao.getSelectedItem(),cbDesconto.getSelectedItem(),txtCodigoBarras.getText(),txtReferencia.getText(),txtReferenciaOriginal.getText(),cbTipoProducao.getSelectedItem()};
        //dtmProdutos.addRow(dados);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jTProdutos.getSelectedRow() != -1){
         Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        p.setCodigo((int) jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0));
        dao.delete(p);
        
        txtNome.setText("");
        txtNomeRed.setText("");
        txtFabricante.setText("");
        txtFamilia.setText("");
        txtClass.setText("");
        txtTipo.setText("");
        cbSituacao.setSelectedIndex(0);
        cbDesconto.setSelectedIndex(0);
        txtCodigoBarras.setText("");
        txtReferencia.setText("");
        txtReferenciaOriginal.setText("");
        cbTipoProducao.setSelectedIndex(0);
        
        
        
        readJTable();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        
        if(jTProdutos.getSelectedRow() != -1){
            txtCodigo.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0).toString());
            txtNome.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());
            txtNomeRed.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 2).toString());
            txtFabricante.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 3).toString());
            txtFamilia.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 4).toString());
            txtClass.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 5).toString());
            txtTipo.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 6).toString());
            cbSituacao.setSelectedItem(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 7).toString());
            cbDesconto.setSelectedItem(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 8).toString());
            txtCodigoBarras.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 9).toString());
            txtReferencia.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 10).toString());
            txtReferenciaOriginal.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 11).toString());
            cbTipoProducao.setSelectedItem(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 12).toString());
        }
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        if(jTProdutos.getSelectedRow() != -1){
            
            Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        p.setNome(txtNome.getText());
        p.setNomeReduzido(txtNomeRed.getText());
        p.setFabricante(txtFabricante.getText());
        p.setFamilia(txtFamilia.getText());
        p.setClassABC(txtClass.getText());
        p.setTipo(txtTipo.getText());
        p.setSituacao(cbSituacao.getSelectedItem().toString());
        p.setDesconto(cbDesconto.getSelectedItem().toString());
        p.setCodigoBarras(txtCodigoBarras.getText());
        p.setReferencia(txtReferencia.getText());
        p.setReferenciaOriginal(txtReferenciaOriginal.getText());
        p.setTipoProducao(cbTipoProducao.getSelectedItem().toString());
        p.setCodigo((int) jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0));
        dao.update(p);
        
        txtNome.setText("");
        txtNomeRed.setText("");
        txtFabricante.setText("");
        txtFamilia.setText("");
        txtClass.setText("");
        txtTipo.setText("");
        cbSituacao.setSelectedIndex(0);
        cbDesconto.setSelectedIndex(0);
        txtCodigoBarras.setText("");
        txtReferencia.setText("");
        txtReferenciaOriginal.setText("");
        cbTipoProducao.setSelectedIndex(0);
        
        
        
        readJTable();
            
            
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        readJTableForName(txtBuscarNome.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox cbDesconto;
    private javax.swing.JComboBox cbSituacao;
    private javax.swing.JComboBox cbTipoProducao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField txtBuscarNome;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeRed;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtReferenciaOriginal;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

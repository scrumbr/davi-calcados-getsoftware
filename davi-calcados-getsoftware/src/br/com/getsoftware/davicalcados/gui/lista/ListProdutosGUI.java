/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.gui.lista;

import br.com.getsoftware.davicalcados.bo.ProdutoBO;
import br.com.getsoftware.davicalcados.entity.Produto;
import br.com.getsoftware.davicalcados.gui.acesso.TelaMenuGUI;
import br.com.getsoftware.davicalcados.gui.cadastro.CadProdutoGUI;
import br.com.getsoftware.davicalcados.gui.cadastro.CadVendaGUI;
import br.com.getsoftware.davicalcados.gui.edit.EditProdutoGUI;
import br.com.getsoftware.davicalcados.gui.view.ViewProdutoGUI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrey Gois
 */
public class ListProdutosGUI extends javax.swing.JFrame {

    private TelaMenuGUI telamenu;
    private int linhaSelecionada = 0;
    private ArrayList<Produto> listPro;
    
    public ListProdutosGUI() throws SQLException {
        initComponents();
        dadosTabela();
        jTable1.setAutoCreateRowSorter(true);
        atualizaLinhaSelecionada();
    }
    
    public ListProdutosGUI(TelaMenuGUI telamenu) throws SQLException{
        this();
        this.telamenu = telamenu;        
    }
    private CadVendaGUI venda;
    public ListProdutosGUI(CadVendaGUI venda) throws SQLException{
        this();
        this.venda = venda;        
    }

      public void atualizaLinhaSelecionada() {
        linhaSelecionada = 0;
        jTable1.getSelectionModel().setSelectionInterval(linhaSelecionada, linhaSelecionada);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTpesquisa3 = new javax.swing.JTextField();
        jRcpf3 = new javax.swing.JRadioButton();
        jRid3 = new javax.swing.JRadioButton();
        jRnome3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jBCadProduto = new javax.swing.JButton();
        jBVisualiar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Start-Menu-Search-icon.png"))); // NOI18N
        jLabel5.setText("Pesquisar");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTpesquisa3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTpesquisa3FocusLost(evt);
            }
        });
        jTpesquisa3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTpesquisa3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTpesquisa3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTpesquisa3KeyTyped(evt);
            }
        });

        buttonGroup1.add(jRcpf3);
        jRcpf3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRcpf3.setText("CPF");
        jRcpf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRcpf3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRid3);
        jRid3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRid3.setText("Identificador");
        jRid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRid3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRnome3);
        jRnome3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRnome3.setSelected(true);
        jRnome3.setText("Nome");
        jRnome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRnome3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTpesquisa3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRnome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRid3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRcpf3)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTpesquisa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRcpf3)
                    .addComponent(jRid3)
                    .addComponent(jRnome3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Fornecedor", "Nome", "Quantidade", "Valor Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jBCadProduto.setText("Cad Produtos");
        jBCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadProdutoActionPerformed(evt);
            }
        });

        jBVisualiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/visualizar_cliente-24.png"))); // NOI18N
        jBVisualiar.setText("Visualizar");
        jBVisualiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualiarActionPerformed(evt);
            }
        });

        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Document-Delete-icon.png"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Text-Edit-icon.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-preferences-web-browser-adblock-icon.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadProduto)
                .addGap(18, 18, 18)
                .addComponent(jBVisualiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCancelar)
                .addGap(34, 34, 34))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBEditar)
                    .addComponent(jBVisualiar)
                    .addComponent(jBCadProduto)
                    .addComponent(jBExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(950, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(telamenu != null){      
            telamenu.setEnabled(true);
        }else if(venda != null){
            venda.setEnabled(true);
        }     
              
              dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jTpesquisa3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTpesquisa3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesquisa3FocusLost

    private void jTpesquisa3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisa3KeyPressed
        //        dadosPesquisa();
    }//GEN-LAST:event_jTpesquisa3KeyPressed

    private void jTpesquisa3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisa3KeyReleased
        //filter();
    }//GEN-LAST:event_jTpesquisa3KeyReleased

    private void jTpesquisa3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisa3KeyTyped

    }//GEN-LAST:event_jTpesquisa3KeyTyped

    private void jRcpf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRcpf3ActionPerformed
       // filter();
    }//GEN-LAST:event_jRcpf3ActionPerformed

    private void jRid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRid3ActionPerformed
        //filter();
    }//GEN-LAST:event_jRid3ActionPerformed

    private void jRnome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRnome3ActionPerformed
       // filter();
    }//GEN-LAST:event_jRnome3ActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
         telamenu.setEnabled(true);
         dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadProdutoActionPerformed
        try {
            this.setEnabled(false);
            new CadProdutoGUI(this).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de cadastro de Clientes!", "Erro", 0);
        }
    }//GEN-LAST:event_jBCadProdutoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       linhaSelecionada = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        Produto produto;
        this.setEnabled(false);
        try {
            produto = ProdutoBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
            new EditProdutoGUI(this, produto).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de edição!", "Erro", 0);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBVisualiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualiarActionPerformed
         this.setEnabled(false);
        try {
            Produto cliente = ProdutoBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
            new ViewProdutoGUI(this, cliente).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível selecionar o funcionário", "Erro", 0);
        }
    }//GEN-LAST:event_jBVisualiarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza ue deseja excluir o produto " + jTable1.getValueAt(linhaSelecionada, 1) + " ?", "Excluir Registro", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            try {
                ProdutoBO.delete(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!", "Sucesso", 1);
                dadosTabela();
                atualizaLinhaSelecionada();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o funcionário", "Erro", 0);
            }
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListProdutosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListProdutosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListProdutosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListProdutosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListProdutosGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ListProdutosGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCadProduto;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBVisualiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRcpf3;
    private javax.swing.JRadioButton jRid3;
    private javax.swing.JRadioButton jRnome3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTpesquisa3;
    // End of variables declaration//GEN-END:variables

public void filter() {
        if (jRnome3.isSelected()) {
            //dadosPesquisaPorNome();
        } else if (jRid3.isSelected()) {
           // dadosPesquisaPorID();
        } else if (jRcpf3.isSelected()) {
           // dadosPesquisaPorCPF();
        }
        atualizaLinhaSelecionada();
    }
 public void dadosTabela() throws SQLException {

        listPro = ProdutoBO.listAll();

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listPro.size(); i++) {
            modelo.addRow(new Object[]{
                listPro.get(i).getIdProduto(),
                listPro.get(i).getIdFornecedor(),
                listPro.get(i).getNome(),
                listPro.get(i).getQuantidade(),
                listPro.get(i).getValorVenda()
            });
   }

//public void dadosPesquisaPorNome() {
//        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
//        modelo.setNumRows(0);
//
//        for (int i = 0; i < listPro.size(); i++) {
//            if (listPro.get(i).getNome().toLowerCase().startsWith(jTpesquisa.getText())
//                    || listPro.get(i).getNome().toUpperCase().startsWith(jTpesquisa.getText())) {
//                modelo.addRow(new Object[]{
//                    listPro.get(i).getIdCiente(),
//                    listPro.get(i).getNome(),
//                    listPro.get(i).getCpf(),
//                    listPro.get(i).getRg(),
//                    listPro.get(i).getTelefone(),
//                    listPro.get(i).getTelefone2(),
//                    listPro.get(i).getEmail()
//                });
//            }
//
//        }
//    }
//
//    public void dadosPesquisaPorID() {
//        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
//        modelo.setNumRows(0);
//
//        for (int i = 0; i < listPro.size(); i++) {
//            if (listPro.get(i).getIdCiente().toString().startsWith(jTpesquisa.getText())) {
//                modelo.addRow(new Object[]{
//                    listPro.get(i).getIdCiente(),
//                    listPro.get(i).getNome(),
//                    listPro.get(i).getCpf(),
//                    listPro.get(i).getRg(),
//                    listPro.get(i).getTelefone(),
//                    listPro.get(i).getTelefone2(),
//                    listPro.get(i).getEmail()
//                });
//            }
//
//        }
//    }
//
//    public void dadosPesquisaPorCPF() {
//        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
//        modelo.setNumRows(0);
//
//        for (int i = 0; i < listPro.size(); i++) {
//            if (listPro.get(i).getCpf().replace(".", "").startsWith(jTpesquisa.getText())
//                    || listPro.get(i).getCpf().startsWith(jTpesquisa.getText())) {
//                modelo.addRow(new Object[]{
//                    listPro.get(i).getIdCiente(),
//                    listPro.get(i).getNome(),
//                    listPro.get(i).getCpf(),
//                    listPro.get(i).getRg(),
//                    listPro.get(i).getTelefone(),
//                    listPro.get(i).getTelefone2(),
//                    listPro.get(i).getEmail()
//                });
//            }
//
//        }
    }







}

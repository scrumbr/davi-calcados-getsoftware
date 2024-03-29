/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.gui.view;

import br.com.getsoftware.davicalcados.bo.ProdutoBO;
import br.com.getsoftware.davicalcados.entity.Produto;
import br.com.getsoftware.davicalcados.gui.edit.EditProdutoGUI;
import br.com.getsoftware.davicalcados.gui.lista.ListProdutosGUI;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gois
 */
public class ViewProdutoGUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewClienteGUi
     */
    public ViewProdutoGUI() {
        initComponents();
    }

    private ListProdutosGUI listPro;
    private Produto produto;
    
    public ViewProdutoGUI(ListProdutosGUI listPro, Produto produto){
        this();
        this.listPro = listPro;
        this.produto = produto;
        refreshCampos();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLeditar = new javax.swing.JLabel();
        jLclose = new javax.swing.JLabel();
        jLexcluir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLQunatidade = new javax.swing.JLabel();
        jLQtdMinima = new javax.swing.JLabel();
        jLFornecedor = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLValorUnitario = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLValorVenda = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLPreferencias = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLAumento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dados do produto");

        jLeditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLeditar.setForeground(new java.awt.Color(255, 255, 255));
        jLeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/icone_view_edit.png"))); // NOI18N
        jLeditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLeditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLeditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLeditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLeditarMousePressed(evt);
            }
        });

        jLclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/close.png"))); // NOI18N
        jLclose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLcloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLcloseMousePressed(evt);
            }
        });

        jLexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/icone_view_delete.png"))); // NOI18N
        jLexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLexcluirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLexcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLexcluirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLexcluir)
                .addGap(18, 18, 18)
                .addComponent(jLeditar)
                .addGap(26, 26, 26)
                .addComponent(jLclose)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLexcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Identificador");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Fornecedor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Quantidade Minima");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Valor Unitario");

        jLQunatidade.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLQunatidade.setText("xxxxxxxxxxx");

        jLQtdMinima.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLQtdMinima.setText("xxxxxxxxxxx");

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLFornecedor.setText("GOIS Distribuidora");

        jLnome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLnome.setText("Carlos Andrey Gois de Oliveira");

        jLid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLid.setText("12321");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Quantidade");

        jLValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLValorUnitario.setText("xxxxxxxxxxx");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Valor Venda");

        jLValorVenda.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLValorVenda.setText("xxxxxxxxxxx");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Preferências");

        jLPreferencias.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLPreferencias.setText("nao sei o que ele vai colocar aqui......");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("% Aumento");

        jLAumento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLAumento.setText("xxxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLAumento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLid))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLQunatidade))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLValorUnitario)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLnome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLQtdMinima))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLValorVenda)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLid)
                    .addComponent(jLabel3)
                    .addComponent(jLnome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jLAumento))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLFornecedor)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLQunatidade)
                    .addComponent(jLabel5)
                    .addComponent(jLQtdMinima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLValorUnitario)
                    .addComponent(jLabel20)
                    .addComponent(jLValorVenda))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLPreferencias))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(570, 295));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLeditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLeditarMouseClicked
        
        this.setEnabled(false);
        try {
            new EditProdutoGUI(listPro, produto).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ViewProdutoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
       
    }//GEN-LAST:event_jLeditarMouseClicked

    private void jLeditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLeditarMouseEntered
        ImageIcon icon = new ImageIcon("src\\br\\com\\getsoftware\\davicalcados\\icons\\icone_view_edit_enter.png");
        jLeditar.setIcon(icon);
    }//GEN-LAST:event_jLeditarMouseEntered

    private void jLeditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLeditarMouseExited
        ImageIcon icon = new ImageIcon("src\\br\\com\\getsoftware\\davicalcados\\icons\\icone_view_edit.png");
        jLeditar.setIcon(icon);
    }//GEN-LAST:event_jLeditarMouseExited

    private void jLeditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLeditarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLeditarMousePressed

    private void jLcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcloseMouseClicked
        listPro .setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jLcloseMouseClicked

    private void jLcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcloseMouseEntered
        ImageIcon icon = new ImageIcon("src\\br\\com\\getsoftware\\davicalcados\\icons\\close_enter.png");
        jLclose.setIcon(icon);
    }//GEN-LAST:event_jLcloseMouseEntered

    private void jLcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcloseMouseExited
        ImageIcon icon = new ImageIcon("src\\br\\com\\getsoftware\\davicalcados\\icons\\close.png");
        jLclose.setIcon(icon);
    }//GEN-LAST:event_jLcloseMouseExited

    private void jLcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcloseMousePressed

    }//GEN-LAST:event_jLcloseMousePressed

    private void jLexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexcluirMouseClicked
        int opt = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o registro ?", "Excluir",JOptionPane.YES_NO_OPTION);
        if(opt == JOptionPane.YES_OPTION){
            try {
              //  ProdutoBO.delete(produto.getIdProduto());
                produto.setStatus(false);
                ProdutoBO.update(produto);
                listPro.setEnabled(true);
                listPro.dadosTabela();
                listPro.atualizaLinhaSelecionada();
                listPro.tabelaVazia();
                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!", "Sucesso", 1);
                       this.dispose();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro!", "Erro", 0);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jLexcluirMouseClicked

    private void jLexcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexcluirMouseEntered
        ImageIcon icon = new ImageIcon("src\\br\\com\\getsoftware\\davicalcados\\icons\\icone_view_delete_enter.png");
        jLexcluir.setIcon(icon);
    }//GEN-LAST:event_jLexcluirMouseEntered

    private void jLexcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexcluirMouseExited
        ImageIcon icon = new ImageIcon("src\\br\\com\\getsoftware\\davicalcados\\icons\\icone_view_delete.png");
        jLexcluir.setIcon(icon);
    }//GEN-LAST:event_jLexcluirMouseExited

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
            java.util.logging.Logger.getLogger(ViewProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProdutoGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLAumento;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLPreferencias;
    private javax.swing.JLabel jLQtdMinima;
    private javax.swing.JLabel jLQunatidade;
    private javax.swing.JLabel jLValorUnitario;
    private javax.swing.JLabel jLValorVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLclose;
    private javax.swing.JLabel jLeditar;
    private javax.swing.JLabel jLexcluir;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

public void refreshCampos() {          
        jLid.setText(produto.getIdProduto());
        jLnome.setText(produto.getNome());
        jLFornecedor.setText(""+produto.getFornecedor().getNome());
        jLQunatidade.setText(""+produto.getQuantidade());
        jLQtdMinima.setText(""+produto.getQuantidadeMinima());
        jLValorUnitario.setText(""+produto.getValorUnitario());
        jLValorVenda.setText(""+produto.getValorVenda());
        jLAumento.setText(""+produto.getQtdAumento());
        jLPreferencias.setText(produto.getDescricao());
    }







}

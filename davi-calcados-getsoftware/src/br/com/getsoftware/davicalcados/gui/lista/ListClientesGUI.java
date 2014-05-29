/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.gui.lista;

import br.com.getsoftware.davicalcados.bo.ClienteBO;
import br.com.getsoftware.davicalcados.entity.Cliente;
import br.com.getsoftware.davicalcados.exception.FormatoSQLException;
import br.com.getsoftware.davicalcados.gui.acesso.TelaMenuGUI;
import br.com.getsoftware.davicalcados.gui.cadastro.CadClienteGUI;
import br.com.getsoftware.davicalcados.gui.cadastro.CadVendaGUI;
import br.com.getsoftware.davicalcados.gui.edit.EditClienteGUI;
import br.com.getsoftware.davicalcados.gui.view.ViewClienteGUI;
import br.com.getsoftware.davicalcados.relatorio.GenericReport;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Andrey Gois
 */
public class ListClientesGUI extends javax.swing.JFrame {

    private ArrayList<Cliente> listClientes;
    private int linhaSelecionada = 0;
    private TelaMenuGUI telaMenu;
    
    public ListClientesGUI() throws SQLException {
        initComponents();
        dadosTabela();
        jTable1.setAutoCreateRowSorter(true);
        atualizaLinhaSelecionada();
        tabelaVazia();
        jBescolher.setVisible(false);
        jTable1.setSelectionBackground(Color.red); //fundo da linha  
               
    }
     public ListClientesGUI(TelaMenuGUI telaMenu) throws SQLException{
      this();
      this.telaMenu = telaMenu;
      jBescolher.setVisible(false);
      jBCadCliente2.setVisible(false);
    }
     
     private CadVendaGUI cadVenda;
     public ListClientesGUI(CadVendaGUI cadVenda) throws SQLException{
      this();
      this.cadVenda = cadVenda;
      jBeditar.setVisible(false);
      jBexcluir.setVisible(false);
      jButton1.setVisible(false);
      jBvisualizar.setVisible(false);
      jBGerarRelatorio.setVisible(false);
      jBescolher.setVisible(true);
      jBCadCliente2.setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTpesquisa = new javax.swing.JTextField();
        jRnome = new javax.swing.JRadioButton();
        jRid = new javax.swing.JRadioButton();
        jRcpf = new javax.swing.JRadioButton();
        jBGerarRelatorio = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jBvisualizar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jBescolher = new javax.swing.JButton();
        jBCadCliente2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel1)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Start-Menu-Search-icon.png"))); // NOI18N
        jLabel2.setText("Pesquisar");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTpesquisa.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpesquisaActionPerformed(evt);
            }
        });
        jTpesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTpesquisaFocusLost(evt);
            }
        });
        jTpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTpesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTpesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTpesquisaKeyTyped(evt);
            }
        });

        buttonGroup1.add(jRnome);
        jRnome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRnome.setSelected(true);
        jRnome.setText("Nome");
        jRnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRnomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRid);
        jRid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRid.setText("Identificador");
        jRid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRidActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRcpf);
        jRcpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRcpf.setText("CPF");
        jRcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRcpfActionPerformed(evt);
            }
        });

        jBGerarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/pdf-24.png"))); // NOI18N
        jBGerarRelatorio.setText("Gerer Relatorio");
        jBGerarRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerarRelatorioActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Telefone");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Filtrar por:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTpesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRcpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addGap(44, 44, 44)
                .addComponent(jBGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRcpf)
                    .addComponent(jRid)
                    .addComponent(jRnome)
                    .addComponent(jBGerarRelatorio)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "RG", "Telefone 1", "Telefone 2", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-system-users-icon.png"))); // NOI18N
        jButton1.setText("Cad Cliente");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBvisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/visualizar_cliente-24.png"))); // NOI18N
        jBvisualizar.setText("Visualizar");
        jBvisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBvisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvisualizarActionPerformed(evt);
            }
        });

        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Document-Delete-icon.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Text-Edit-icon.png"))); // NOI18N
        jBeditar.setText("Editar");
        jBeditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-preferences-web-browser-adblock-icon.png"))); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jBescolher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Arrow-icon.png"))); // NOI18N
        jBescolher.setText("Escolher");
        jBescolher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBescolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBescolherActionPerformed(evt);
            }
        });

        jBCadCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-system-users-icon.png"))); // NOI18N
        jBCadCliente2.setText("Cad Cliente");
        jBCadCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCadCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadCliente2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBescolher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCadCliente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBvisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBexcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBeditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBcancelar)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBcancelar, jBeditar, jBescolher, jBexcluir, jButton1, jBvisualizar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcancelar)
                    .addComponent(jBeditar)
                    .addComponent(jBexcluir)
                    .addComponent(jBvisualizar)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBescolher)
                    .addComponent(jBCadCliente2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBcancelar, jBeditar, jBescolher, jBexcluir, jButton1, jBvisualizar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1004, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTpesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTpesquisaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesquisaFocusLost

    private void jTpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisaKeyPressed
        //        dadosPesquisa();
    }//GEN-LAST:event_jTpesquisaKeyPressed

    private void jTpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisaKeyReleased
        filter();
    }//GEN-LAST:event_jTpesquisaKeyReleased

    private void jTpesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisaKeyTyped

    }//GEN-LAST:event_jTpesquisaKeyTyped

    private void jRnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRnomeActionPerformed
        filter();
    }//GEN-LAST:event_jRnomeActionPerformed

    private void jRidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRidActionPerformed
        filter();
    }//GEN-LAST:event_jRidActionPerformed

    private void jRcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRcpfActionPerformed
        filter();
    }//GEN-LAST:event_jRcpfActionPerformed

    private void jBvisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvisualizarActionPerformed
        this.setEnabled(false);
        try {
            Cliente cliente = ClienteBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
            new ViewClienteGUI(this, cliente).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível selecionar o funcionário", "Erro", 0);
        }
    }//GEN-LAST:event_jBvisualizarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
             
        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza ue deseja excluir o cliente " + jTable1.getValueAt(linhaSelecionada, 1) + " ?", "Excluir Registro", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            try {
                //ClienteBO.delete(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
                 Cliente cliente = ClienteBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
                 cliente.setStatus(false);
                 ClienteBO.update(cliente);
                dadosTabela();
                atualizaLinhaSelecionada();
                tabelaVazia();
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Sucesso", 1);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o cliente", "Erro", 0);
            } catch (Exception ex) {
                Logger.getLogger(ListClientesGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        Cliente cliente;
        this.setEnabled(false);
        try {
            cliente = ClienteBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
            new EditClienteGUI(this, cliente).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de edição!", "Erro", 0);
        }
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        if(telaMenu != null){
            telaMenu.setEnabled(true);
        }
        else if(cadVenda != null){
            cadVenda.setEnabled(true);
        }
        
        dispose();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       linhaSelecionada = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         if(telaMenu != null){
            telaMenu.setEnabled(true);
        }
        else if(cadVenda != null){
            cadVenda.setEnabled(true);
        }        
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.setEnabled(false);
            new CadClienteGUI(this).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de cadastro de Clientes!", "Erro", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBescolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBescolherActionPerformed
        try {
            Cliente cliente = ClienteBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
            cadVenda.setCliente(cliente);
            cadVenda.setarValoresClient();
            cadVenda.setEnabled(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível selecionar cliente", "Erro", 0);
            this.dispose();
            cadVenda.setEnabled(true);
        }
    }//GEN-LAST:event_jBescolherActionPerformed

    private void jBCadCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadCliente2ActionPerformed
       try {
            this.setEnabled(false);
            new CadClienteGUI(this).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de cadastro de Clientes!", "Erro", 0);
        }
    }//GEN-LAST:event_jBCadCliente2ActionPerformed

    private void jBGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarRelatorioActionPerformed
       String consulta = "";
       if(jRnome.isSelected()){
           consulta = "select * from cliente where nome like";
       }else if(jRid.isSelected()){
           consulta = "select * from cliente where id_cliente like";
       }else if(jRcpf.isSelected()){
           consulta = "select * from cliente where cpf like";
       }else if(jRadioButton1.isSelected()){
            consulta = "select * from cliente where telefone like";
       }        
        try {
            GenericReport c = new GenericReport(consulta + "'" +jTpesquisa.getText() + "%' and ativo = true;","ClienteTesteReport.jasper");
        } catch (FormatoSQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatorio!", "ERRO", 1);
        }
    }//GEN-LAST:event_jBGerarRelatorioActionPerformed

    private void jTpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesquisaActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
filter();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListClientesGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ListClientesGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCadCliente2;
    private javax.swing.JButton jBGerarRelatorio;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBescolher;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jBvisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRcpf;
    private javax.swing.JRadioButton jRid;
    private javax.swing.JRadioButton jRnome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTpesquisa;
    // End of variables declaration//GEN-END:variables

public void filter() {
        if (jRnome.isSelected()) {
            dadosPesquisaPorNome();
        } else if (jRid.isSelected()) {
            dadosPesquisaPorID();
        } else if (jRcpf.isSelected()) {
            dadosPesquisaPorCPF();
        } else if (jRadioButton1.isSelected()){
           dadosPesquisaPorTelefone();
}     
        tabelaVazia();
        atualizaLinhaSelecionada();
    }

public void tabelaVazia(){
       
        if(jTable1.getRowCount() ==0){
             System.out.print("Ok");
             jBeditar.setEnabled(false);
            jBexcluir.setEnabled(false);
            jBvisualizar.setEnabled(false);
            jBGerarRelatorio.setEnabled(false);
        }else{
            jBeditar.setEnabled(true);
            jBexcluir.setEnabled(true);
            jBvisualizar.setEnabled(true); 
            jBGerarRelatorio.setEnabled(true);
        }
    }
 public void dadosTabela() throws SQLException {

        listClientes = ClienteBO.listAll();
        tabelaVazia();
         
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listClientes.size(); i++) {
            modelo.addRow(new Object[]{
                listClientes.get(i).getIdCiente(),
                listClientes.get(i).getNome(),
                listClientes.get(i).getCpf(),
                listClientes.get(i).getRg(),
                listClientes.get(i).getTelefone(),
                listClientes.get(i).getTelefone2(),
                listClientes.get(i).getEmail()
            });
        }
         }
    

public void dadosPesquisaPorNome() {
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listClientes.size(); i++) {
            if (listClientes.get(i).getNome().toLowerCase().startsWith(jTpesquisa.getText())
                    || listClientes.get(i).getNome().toUpperCase().startsWith(jTpesquisa.getText())) {
                modelo.addRow(new Object[]{
                    listClientes.get(i).getIdCiente(),
                    listClientes.get(i).getNome(),
                    listClientes.get(i).getCpf(),
                    listClientes.get(i).getRg(),
                    listClientes.get(i).getTelefone(),
                    listClientes.get(i).getTelefone2(),
                    listClientes.get(i).getEmail()
                });
            }

        }
    }

    public void dadosPesquisaPorID() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listClientes.size(); i++) {
            if (listClientes.get(i).getIdCiente().toString().startsWith(jTpesquisa.getText())) {
                modelo.addRow(new Object[]{
                    listClientes.get(i).getIdCiente(),
                    listClientes.get(i).getNome(),
                    listClientes.get(i).getCpf(),
                    listClientes.get(i).getRg(),
                    listClientes.get(i).getTelefone(),
                    listClientes.get(i).getTelefone2(),
                    listClientes.get(i).getEmail()
                });
            }

        }
    }

    public void dadosPesquisaPorCPF() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listClientes.size(); i++) {
            if (listClientes.get(i).getCpf().replace(".", "").startsWith(jTpesquisa.getText())
                    || listClientes.get(i).getCpf().startsWith(jTpesquisa.getText())) {
                modelo.addRow(new Object[]{
                    listClientes.get(i).getIdCiente(),
                    listClientes.get(i).getNome(),
                    listClientes.get(i).getCpf(),
                    listClientes.get(i).getRg(),
                    listClientes.get(i).getTelefone(),
                    listClientes.get(i).getTelefone2(),
                    listClientes.get(i).getEmail()
                });
            }

        }
    }
    
     public void dadosPesquisaPorTelefone() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listClientes.size(); i++) {
            if (listClientes.get(i).getTelefone().replace("(", "").replace(")", "").replace("-", "").startsWith(jTpesquisa.getText())
                    || listClientes.get(i).getTelefone().startsWith(jTpesquisa.getText())) {
                modelo.addRow(new Object[]{
                    listClientes.get(i).getIdCiente(),
                    listClientes.get(i).getNome(),
                    listClientes.get(i).getCpf(),
                    listClientes.get(i).getRg(),
                    listClientes.get(i).getTelefone(),
                    listClientes.get(i).getTelefone2(),
                    listClientes.get(i).getEmail()
                });
            }

        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.gui.lista;

import br.com.getsoftware.davicalcados.bo.FuncionarioBO;
import br.com.getsoftware.davicalcados.bo.UsuarioBO;
import br.com.getsoftware.davicalcados.entity.Funcionario;
import br.com.getsoftware.davicalcados.entity.Usuario;
import br.com.getsoftware.davicalcados.gui.acesso.TelaMenuGUI;
import br.com.getsoftware.davicalcados.gui.cadastro.CadFuncionarioGUI;
import br.com.getsoftware.davicalcados.gui.cadastro.CadUsuarioGUI;
import br.com.getsoftware.davicalcados.gui.edit.EditFuncionarioGUI;
import br.com.getsoftware.davicalcados.gui.view.ViewFuncionarioGUI;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Junior Oliveira
 */
public class ListFuncionariosGUI extends javax.swing.JFrame {

    /**
     * Creates new form ListFuncionariosGUI
     */
    private ArrayList<Funcionario> listFuncionarios;
    private int linhaSelecionada = 0;
    private TelaMenuGUI telaMenu;
    
    public ListFuncionariosGUI() throws SQLException {
        initComponents();
        dadosTabela();
        jTable1.setAutoCreateRowSorter(true);
        atualizaLinhaSelecionada();
    }
      public ListFuncionariosGUI(TelaMenuGUI telaMenu) throws SQLException{
      this();
      this.telaMenu = telaMenu;
    }

    public void atualizaLinhaSelecionada() {
        linhaSelecionada = 0;
        jTable1.getSelectionModel().setSelectionInterval(linhaSelecionada, linhaSelecionada);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTpesquisa = new javax.swing.JTextField();
        jRcpf = new javax.swing.JRadioButton();
        jRid = new javax.swing.JRadioButton();
        jRnome = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBcancelar = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBvisualizar = new javax.swing.JButton();
        jBcadUser = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Start-Menu-Search-icon.png"))); // NOI18N
        jLabel1.setText("Pesquisar");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

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

        buttonGroup1.add(jRcpf);
        jRcpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRcpf.setText("CPF");
        jRcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRcpfActionPerformed(evt);
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

        buttonGroup1.add(jRnome);
        jRnome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRnome.setSelected(true);
        jRnome.setText("Nome");
        jRnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRnomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRcpf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRcpf)
                    .addComponent(jRid)
                    .addComponent(jRnome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
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
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
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
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-preferences-web-browser-adblock-icon.png"))); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jBeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Text-Edit-icon.png"))); // NOI18N
        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Document-Delete-icon.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBvisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/visualizar_cliente-24.png"))); // NOI18N
        jBvisualizar.setText("Visualizar");
        jBvisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvisualizarActionPerformed(evt);
            }
        });

        jBcadUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-preferences-contact-list-icon.png"))); // NOI18N
        jBcadUser.setText("Cad Usuário");
        jBcadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadUserActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-system-users-icon.png"))); // NOI18N
        jButton1.setText("Cad Funcionário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBcadUser)
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

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBcadUser, jBcancelar, jBeditar, jBexcluir, jBvisualizar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBcancelar)
                        .addComponent(jBeditar)
                        .addComponent(jBexcluir)
                        .addComponent(jBvisualizar)
                        .addComponent(jBcadUser))
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de funcionários");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(950, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBcadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadUserActionPerformed
        try {
            Usuario user = UsuarioBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
            if (user == null) {
                Funcionario funcionario;
                try {
                    funcionario = FuncionarioBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
                    new CadUsuarioGUI(this, funcionario).setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível selecionar o funcionário", "Erro", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "funcionário já possui usuário", "Atenção", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível verificar se o funcionário já possui um login", "Erro", 0);
        }
    }//GEN-LAST:event_jBcadUserActionPerformed

    private void jBvisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvisualizarActionPerformed
        this.setEnabled(false);
        try {
            Funcionario funcionario = FuncionarioBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
            new ViewFuncionarioGUI(this, funcionario).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível selecionar o funcionário", "Erro", 0);
          }
    }//GEN-LAST:event_jBvisualizarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza ue deseja excluir o Funcionário " + jTable1.getValueAt(linhaSelecionada, 1) + " ?", "Excluir Registro", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            try {
                FuncionarioBO.delete(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
                JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso!", "Sucesso", 1);
                dadosTabela();
                atualizaLinhaSelecionada();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o funcionário", "Erro", 0);
            }
        }
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
       
        Funcionario funcionario;  
         this.setEnabled(false);
        try {
            funcionario = FuncionarioBO.getById(Integer.valueOf(jTable1.getValueAt(linhaSelecionada, 0).toString()));
            new EditFuncionarioGUI(this, funcionario).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de edição!", "Erro", 0);
        }
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        telaMenu.setEnabled(true);
        dispose();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jTpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisaKeyPressed
//        dadosPesquisa();
    }//GEN-LAST:event_jTpesquisaKeyPressed

    public void dadosPesquisaPorNome() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listFuncionarios.size(); i++) {
            if (listFuncionarios.get(i).getNome().toLowerCase().startsWith(jTpesquisa.getText())
                    || listFuncionarios.get(i).getNome().toUpperCase().startsWith(jTpesquisa.getText())) {
                modelo.addRow(new Object[]{
                    listFuncionarios.get(i).getIdFuncionario(),
                    listFuncionarios.get(i).getNome(),
                    listFuncionarios.get(i).getCpf(),
                    listFuncionarios.get(i).getRg(),
                    listFuncionarios.get(i).getTelefone(),
                    listFuncionarios.get(i).getTelefone2(),
                    listFuncionarios.get(i).getEmail()
                });
            }

        }
    }

    public void dadosPesquisaPorID() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listFuncionarios.size(); i++) {
            if (listFuncionarios.get(i).getIdFuncionario().toString().startsWith(jTpesquisa.getText())) {
                modelo.addRow(new Object[]{
                    listFuncionarios.get(i).getIdFuncionario(),
                    listFuncionarios.get(i).getNome(),
                    listFuncionarios.get(i).getCpf(),
                    listFuncionarios.get(i).getRg(),
                    listFuncionarios.get(i).getTelefone(),
                    listFuncionarios.get(i).getTelefone2(),
                    listFuncionarios.get(i).getEmail()
                });
            }

        }
    }

    public void dadosPesquisaPorCPF() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listFuncionarios.size(); i++) {
            if (listFuncionarios.get(i).getCpf().replace(".", "").startsWith(jTpesquisa.getText())
                    || listFuncionarios.get(i).getCpf().startsWith(jTpesquisa.getText())) {
                modelo.addRow(new Object[]{
                    listFuncionarios.get(i).getIdFuncionario(),
                    listFuncionarios.get(i).getNome(),
                    listFuncionarios.get(i).getCpf(),
                    listFuncionarios.get(i).getRg(),
                    listFuncionarios.get(i).getTelefone(),
                    listFuncionarios.get(i).getTelefone2(),
                    listFuncionarios.get(i).getEmail()
                });
            }

        }
    }

    private void jTpesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTpesquisaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesquisaFocusLost

    private void jTpesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisaKeyTyped

    }//GEN-LAST:event_jTpesquisaKeyTyped

    private void jTpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesquisaKeyReleased
        filter();
    }//GEN-LAST:event_jTpesquisaKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        linhaSelecionada = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRnomeActionPerformed
        filter();
    }//GEN-LAST:event_jRnomeActionPerformed

    private void jRidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRidActionPerformed
        filter();
    }//GEN-LAST:event_jRidActionPerformed

    private void jRcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRcpfActionPerformed
        filter();
    }//GEN-LAST:event_jRcpfActionPerformed

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost

    }//GEN-LAST:event_jTable1FocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        telaMenu.setEnabled(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            this.setEnabled(false);
            new CadFuncionarioGUI(this).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de cadastro de funcionários!", "Erro", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListFuncionariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListFuncionariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListFuncionariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListFuncionariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListFuncionariosGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ListFuncionariosGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBcadUser;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jBvisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
        }
        atualizaLinhaSelecionada();
    }

    public void dadosTabela() throws SQLException {

        listFuncionarios = FuncionarioBO.listAll();

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listFuncionarios.size(); i++) {
            modelo.addRow(new Object[]{
                listFuncionarios.get(i).getIdFuncionario(),
                listFuncionarios.get(i).getNome(),
                listFuncionarios.get(i).getCpf(),
                listFuncionarios.get(i).getRg(),
                listFuncionarios.get(i).getTelefone(),
                listFuncionarios.get(i).getTelefone2(),
                listFuncionarios.get(i).getEmail()
            });
        }
    }

}

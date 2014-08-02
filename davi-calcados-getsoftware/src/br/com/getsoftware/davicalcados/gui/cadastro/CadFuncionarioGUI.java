/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.gui.cadastro;

import br.com.getsoftware.davicalcados.bo.FuncionarioBO;
import br.com.getsoftware.davicalcados.entity.Endereco;
import br.com.getsoftware.davicalcados.entity.Funcionario;
import br.com.getsoftware.davicalcados.gui.acesso.TelaMenuGUI;
import br.com.getsoftware.davicalcados.gui.lista.ListFuncionariosGUI;
import br.com.getsoftware.davicalcados.util.LastID;
import br.com.getsoftware.davicalcados.util.MyDate;
import br.com.getsoftware.davicalcados.util.TransformCpf;
import br.com.getsoftware.davicalcados.util.TransformDate;
import br.com.getsoftware.davicalcados.util.TransformTelefone;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class CadFuncionarioGUI extends javax.swing.JFrame {

    private TelaMenuGUI telaMenu;
    private String sexo = "";   
    private Boolean status =  true;
    
    public CadFuncionarioGUI() throws SQLException {
        initComponents();
        jTid.setText(""+LastID.proximoId("id_funcionario", "funcionario"));        
        LimpaMascaras();
             
    }
     public CadFuncionarioGUI(TelaMenuGUI telaMenu) throws SQLException{
         this();
         this.telaMenu = telaMenu;  
         jFcpf.requestFocus();

     }
     private ListFuncionariosGUI listFunc;
     public CadFuncionarioGUI(ListFuncionariosGUI listFunc) throws SQLException{
          this();
         this.listFunc = listFunc;            
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTrg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTsalario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFtel1 = new javax.swing.JFormattedTextField();
        jFtel2 = new javax.swing.JFormattedTextField();
        jFcpf = new javax.swing.JFormattedTextField();
        jFcontrato = new javax.swing.JFormattedTextField();
        jFrecisao = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jTidade = new javax.swing.JTextField();
        jFdataNascimento = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jRmasc = new javax.swing.JRadioButton();
        jRfem = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTcidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTrua = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTbairro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jFcep = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jCestado = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jTnumero = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTcomplemento = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBcancel = new javax.swing.JButton();
        jBsalvar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Dados Pessoais"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Identificador");

        jTid.setEditable(false);
        jTid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome");

        jTnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTnome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTnome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTnome.setName(""); // NOI18N
        jTnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnomeFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CPF");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("RG");

        jTrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTrg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTrg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTrgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTrgFocusLost(evt);
            }
        });
        jTrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTrgKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Salário");

        jTsalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTsalario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTsalario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTsalarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTsalarioFocusLost(evt);
            }
        });
        jTsalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTsalarioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Telefone 1");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Telefone 2");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Recisão");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Contrato");

        jFtel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFtel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFtel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFtel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFtel1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFtel1FocusLost(evt);
            }
        });

        jFtel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFtel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFtel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFtel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFtel2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFtel2FocusLost(evt);
            }
        });

        jFcpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFcpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFcpf.setPreferredSize(new java.awt.Dimension(2, 18));
        jFcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFcpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFcpfFocusLost(evt);
            }
        });

        jFcontrato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFcontrato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFcontrato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFcontrato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFcontratoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFcontratoFocusLost(evt);
            }
        });

        jFrecisao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFrecisao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFrecisao.setEnabled(false);
        jFrecisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Idade");

        jTidade.setEditable(false);
        jTidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jFdataNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFdataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFdataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFdataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFdataNascimentoActionPerformed(evt);
            }
        });
        jFdataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFdataNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFdataNascimentoFocusLost(evt);
            }
        });
        jFdataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFdataNascimentoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Data de nascimento");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("E-mail");

        jTemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTemailFocusLost(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Sexo");

        buttonGroup2.add(jRmasc);
        jRmasc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRmasc.setText("Masculino");
        jRmasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRmascActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRfem);
        jRfem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRfem.setText("Feminino");
        jRfem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRfemActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("*");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 0, 0));
        jLabel27.setText("*");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 0, 0));
        jLabel28.setText("*");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 0, 0));
        jLabel29.setText("*");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 0, 0));
        jLabel30.setText("*");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("*");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 0, 0));
        jLabel32.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30))
                            .addComponent(jFcontrato, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTidade))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFtel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFrecisao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFtel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel31)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRmasc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRfem))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel32)))
                                        .addGap(34, 34, 34))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel26))
                            .addComponent(jLabel3)
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel27))
                            .addComponent(jFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTrg, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28))
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTnome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTemail))
                                .addContainerGap())))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFcpf, jFrecisao, jFtel1, jFtel2, jTrg, jTsalario});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFdataNascimento, jTid});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFcontrato, jTidade});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel27))
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jFcpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jFtel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFtel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFrecisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRmasc)
                            .addComponent(jRfem))))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jFcontrato, jFcpf, jFdataNascimento, jFrecisao, jFtel1, jFtel2, jTemail, jTid, jTidade, jTnome, jTrg, jTsalario});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Endereço"));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Cidade");

        jTcidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTcidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTcidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTcidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTcidadeFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Rua");

        jTrua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTrua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTrua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTruaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTruaFocusLost(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Bairro");

        jTbairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTbairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTbairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTbairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTbairroFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("CEP");

        jFcep.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFcep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFcep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFcepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFcepFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Estado");

        jCestado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Estado--", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "SP", "TO" }));
        jCestado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCestadoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("N°");

        jTnumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTnumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTnumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnumeroFocusLost(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Complemento");

        jTcomplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTcomplemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTcomplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTcomplementoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTcomplementoFocusLost(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 0, 0));
        jLabel33.setText("*");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 0, 0));
        jLabel34.setText("*");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 0, 0));
        jLabel35.setText("*");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 0, 0));
        jLabel36.setText("*");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 0, 0));
        jLabel37.setText("*");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 0, 0));
        jLabel38.setText("*");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 0, 0));
        jLabel39.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33))
                            .addComponent(jTcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35))
                            .addComponent(jTbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37))
                            .addComponent(jCestado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jFcep, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTrua, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTcomplemento))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel33)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTbairro)
                            .addComponent(jTcidade)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel37))
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel39))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jFcep, jTbairro, jTcidade, jTcomplemento, jTnumero, jTrua});

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBcancel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-preferences-web-browser-adblock-icon.png"))); // NOI18N
        jBcancel.setText("Cancelar");
        jBcancel.setToolTipText("Cancelar cadastramento de funcionario");
        jBcancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelActionPerformed(evt);
            }
        });

        jBsalvar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Actions-document-save-icon.png"))); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.setToolTipText("Salvar funcionario");
        jBsalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jBsalvar)
                .addGap(18, 18, 18)
                .addComponent(jBcancel)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancel))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(513, 35));
        jPanel4.setRequestFocusEnabled(false);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cadastro de Funcionário");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(513, 35));
        jPanel5.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(762, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFdataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFdataNascimentoFocusLost
        jFdataNascimento.setBackground(Color.white);
        jFdataNascimento.setFocusLostBehavior(JFormattedTextField.COMMIT);     
        if(jFdataNascimento.getText().equals("  /  /    ")){    
        }else{
        int ano = Integer.valueOf(jFdataNascimento.getText().substring(jFdataNascimento.getText().length()-4, jFdataNascimento.getText().length()));
        jTidade.setText(""+(MyDate.getAno()-ano));  
        }
        jTrg.requestFocus();
    }//GEN-LAST:event_jFdataNascimentoFocusLost

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
         if (verificarCampos()) {
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "DADOS NÂO SALVOS", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                if (telaMenu != null) {
                    telaMenu.setEnabled(true);
                } else if (listFunc != null) {
                    listFunc.setEnabled(true);
                }
                this.dispose();
            }
        } else {
            if (telaMenu != null) {
                telaMenu.setEnabled(true);
            } else if (listFunc != null) {
                listFunc.setEnabled(true);
            }
            this.dispose();
        } 
    }//GEN-LAST:event_jBcancelActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        //cpf, nome, data nasc, rg, email, tel1, tel2,sexo , contrato, recisão, salario , ativo, 
        //cidde, bairro, estado, cep, rua, numero, complermento 
        
        if (jFcpf.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Campo 'CPF' está vazio!", "Atenção", 2);
            jFcpf.requestFocus();
        } else if (jTnome.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'NOME' está vazio!", "Atenção", 2);
            jTnome.requestFocus();
       } else if (jFtel1.getText().equals("(  )    -    ")) {
             JOptionPane.showMessageDialog(null, "Campo 'TELEFONE 1' está vazio!", "Atenção", 2);
            jFtel1.requestFocus();
        } else if (!jRmasc.isSelected() && !jRfem.isSelected()) {
             JOptionPane.showMessageDialog(null, "Campo 'SEXO' está vazio!", "Atenção", 2);
        }else if (jFcontrato.getText().equals("  /  /    ")) {
             JOptionPane.showMessageDialog(null, "Campo 'CONTRATO' está vazio!", "Atenção", 2);
            jFcontrato.requestFocus();
        }else if (jTsalario.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'SALÁRIO' está vazio!", "Atenção", 2);
            jTsalario.requestFocus();
        } else if (jTcidade.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'CIDADE' está vazio!", "Atenção", 2);
            jTcidade.requestFocus();
        } else if (jTbairro.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'BAIRRO' está vazio!", "Atenção", 2);
            jTbairro.requestFocus();
        } else if (jCestado.getSelectedIndex() == 0) {
             JOptionPane.showMessageDialog(null, "Campo 'ESTADO' está vazio!", "Atenção", 2);
            jCestado.requestFocus();
        } else if (jFcep.getText().equals("")) {
             JOptionPane.showMessageDialog(null, "Campo 'CEP' está vazio!", "Atenção", 2);
            jFcep.requestFocus();
        } else if (jTrua.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'RUA' está vazio!", "Atenção", 2);
            jTrua.requestFocus();
        } else if (jTnumero.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'NÚMERO' está vazio!", "Atenção", 2);
            jTnumero.requestFocus();
        } else if (jTcomplemento.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'COMPLEMENTO' está vazio!", "Atenção", 2);
            jTcomplemento.requestFocus();
        } else {

        Funcionario funcionario = new Funcionario();
        Endereco end = new Endereco();
        funcionario.setAtivo(status);
        funcionario.setContrato(TransformDate.transformDate(jFcontrato.getText()));
        funcionario.setCpf(TransformCpf.transformCpf(jFcpf.getText()));
        funcionario.setDataNascimento(TransformDate.transformDate(jFdataNascimento.getText()));
        funcionario.setEmail(jTemail.getText());
        funcionario.setSexo(sexo);
        funcionario.setNome(jTnome.getText());
        funcionario.setRecisao(null);
        funcionario.setRg(jTrg.getText());
        funcionario.setSalario(Double.valueOf(jTsalario.getText()));
        funcionario.setTelefone(TransformTelefone.transformTelefone(jFtel1.getText()));
        funcionario.setTelefone2(TransformTelefone.transformTelefone(jFtel2.getText()));
        
        end.setBairro(jTbairro.getText());
        end.setCEP(jFcep.getText());
        end.setCidade(jTcidade.getText());
        end.setComplemento(jTcomplemento.getText());
        end.setEstado(jCestado.getSelectedItem().toString());
        end.setNumero(jTnumero.getText());
        end.setRua(jTrua.getText());
        funcionario.setEndereco(end);
        try {
            FuncionarioBO.save(funcionario);
            if(listFunc != null){
             listFunc.dadosTabela();
             listFunc.atualizaLinhaSelecionada();
             listFunc.tabelaVazia();
            } 
            JOptionPane.showMessageDialog(null, "Sucesso ao salvar o registro\n", "Salvo com sucesso", 1);

             int escolha = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo funcionario ?", "Novo funcionario", JOptionPane.YES_NO_OPTION);
                if(escolha == 0) {
                    limpaCampos();
                   jTid.setText(""+LastID.proximoId("id_funcionario", "funcionario"));
                } else {
                    if(telaMenu != null){
                        telaMenu.setEnabled(true);
                    }else  if(listFunc != null) {
                        listFunc.setEnabled(true);
                       
                    }
                     this.dispose();
                }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar o Funcionário","Erro",0);
           
        } catch (Exception ex) {
            Logger.getLogger(CadFuncionarioGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (verificarCampos()) {
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "DADOS NÂO SALVOS", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                if (telaMenu != null) {
                    telaMenu.setEnabled(true);
                } else if (listFunc != null) {
                    listFunc.setEnabled(true);
                }
                this.dispose();
            }
        } else {
            if (telaMenu != null) {
                telaMenu.setEnabled(true);
            } else if (listFunc != null) {
                listFunc.setEnabled(true);
            }
            this.dispose();
        }        
    }//GEN-LAST:event_formWindowClosing

    private void jCestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCestadoActionPerformed

    private void jRmascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRmascActionPerformed
       sexo = "M";
    }//GEN-LAST:event_jRmascActionPerformed

    private void jRfemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRfemActionPerformed
        sexo = "F";
    }//GEN-LAST:event_jRfemActionPerformed

    private void jFdataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFdataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFdataNascimentoActionPerformed

    private void jFdataNascimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFdataNascimentoKeyReleased
      if(jFdataNascimento.getText().equals("  /  /    ")){
          jTidade.setText("");
      } 
    }//GEN-LAST:event_jFdataNascimentoKeyReleased

    private void jTrgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTrgKeyTyped
        String caracteres="0987654321";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
       }
    }//GEN-LAST:event_jTrgKeyTyped

    private void jTsalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTsalarioKeyTyped
         String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
       }
    }//GEN-LAST:event_jTsalarioKeyTyped

    private void jFcpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFcpfFocusGained
         jFcpf.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFcpfFocusGained

    private void jFcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFcpfFocusLost
        jFcpf.setBackground(Color.white);
        
    }//GEN-LAST:event_jFcpfFocusLost

    private void jTnomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnomeFocusGained
         jTnome.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTnomeFocusGained

    private void jTnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnomeFocusLost
        jTnome.setBackground(Color.white);
        
    }//GEN-LAST:event_jTnomeFocusLost

    private void jFdataNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFdataNascimentoFocusGained
         jFdataNascimento.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFdataNascimentoFocusGained

    private void jTrgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTrgFocusGained
         jTrg.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTrgFocusGained

    private void jTrgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTrgFocusLost
       jTrg.setBackground(Color.white);
       
    }//GEN-LAST:event_jTrgFocusLost

    private void jTemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTemailFocusGained
         jTemail.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTemailFocusGained

    private void jTemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTemailFocusLost
       jTemail.setBackground(Color.white);
       
    }//GEN-LAST:event_jTemailFocusLost

    private void jFtel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFtel1FocusGained
         jFtel1.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFtel1FocusGained

    private void jFtel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFtel1FocusLost
        jFtel1.setBackground(Color.white);
      
    }//GEN-LAST:event_jFtel1FocusLost

    private void jFtel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFtel2FocusGained
         jFtel2.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFtel2FocusGained

    private void jFtel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFtel2FocusLost
          jFtel2.setBackground(Color.white);
    }//GEN-LAST:event_jFtel2FocusLost

    private void jFcontratoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFcontratoFocusGained
         jFcontrato.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFcontratoFocusGained

    private void jFcontratoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFcontratoFocusLost
        jFcontrato.setBackground(Color.white);
    }//GEN-LAST:event_jFcontratoFocusLost

    private void jTsalarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTsalarioFocusGained
         jTsalario.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTsalarioFocusGained

    private void jTsalarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTsalarioFocusLost
            jTsalario.setBackground(Color.white);
    }//GEN-LAST:event_jTsalarioFocusLost

    private void jTcidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcidadeFocusGained
         jTcidade.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTcidadeFocusGained

    private void jTcidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcidadeFocusLost
            jTcidade.setBackground(Color.white);
    }//GEN-LAST:event_jTcidadeFocusLost

    private void jTbairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTbairroFocusGained
         jTbairro.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTbairroFocusGained

    private void jTbairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTbairroFocusLost
            jTbairro.setBackground(Color.white);
    }//GEN-LAST:event_jTbairroFocusLost

    private void jFcepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFcepFocusGained
         jFcep.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFcepFocusGained

    private void jFcepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFcepFocusLost
            jFcep.setBackground(Color.white);
    }//GEN-LAST:event_jFcepFocusLost

    private void jTruaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTruaFocusGained
         jTrua.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTruaFocusGained

    private void jTruaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTruaFocusLost
            jTrua.setBackground(Color.white);
    }//GEN-LAST:event_jTruaFocusLost

    private void jTnumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumeroFocusGained
         jTnumero.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTnumeroFocusGained

    private void jTnumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumeroFocusLost
            jTnumero.setBackground(Color.white);
    }//GEN-LAST:event_jTnumeroFocusLost

    private void jTcomplementoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcomplementoFocusGained
         jTcomplemento.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTcomplementoFocusGained

    private void jTcomplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcomplementoFocusLost
            jTcomplemento.setBackground(Color.white);
    }//GEN-LAST:event_jTcomplementoFocusLost

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
            java.util.logging.Logger.getLogger(CadFuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadFuncionarioGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadFuncionarioGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBcancel;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JComboBox jCestado;
    private javax.swing.JFormattedTextField jFcep;
    private javax.swing.JFormattedTextField jFcontrato;
    private javax.swing.JFormattedTextField jFcpf;
    private javax.swing.JFormattedTextField jFdataNascimento;
    private javax.swing.JFormattedTextField jFrecisao;
    private javax.swing.JFormattedTextField jFtel1;
    private javax.swing.JFormattedTextField jFtel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRfem;
    private javax.swing.JRadioButton jRmasc;
    private javax.swing.JTextField jTbairro;
    private javax.swing.JTextField jTcidade;
    private javax.swing.JTextField jTcomplemento;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTidade;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTnumero;
    private javax.swing.JTextField jTrg;
    private javax.swing.JTextField jTrua;
    private javax.swing.JTextField jTsalario;
    // End of variables declaration//GEN-END:variables
 
        public void LimpaMascaras(){
        jFcpf.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFcontrato.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFtel1.setFocusLostBehavior(JFormattedTextField.COMMIT); 
        jFtel2.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFrecisao.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFcep.setFocusLostBehavior(JFormattedTextField.COMMIT);
        }
    
    
    public void limpaCampos(){
        jFcpf.setText(null);
        jTnome.setText(null);
        jFdataNascimento.setText(null);
        jTrg.setText(null);
        jTemail.setText(null);
        jTidade.setText(null);
        jFtel1.setText(null);
        jFtel2.setText(null);
        jFcontrato.setText(null);
        jFrecisao.setText(null);
        jTsalario.setText(null);
       // jRativo.setSelected(true);
        jTcidade.setText(null);
        jTbairro.setText(null);
        jCestado.setSelectedIndex(0);
        jFcep.setText(null);
        jTrua.setText(null);
        jTnumero.setText(null);
        jTcomplemento.setText(null);  
        jRmasc.setSelected(false);
        jRfem.setSelected(false);
    }   
    
//    public boolean status() {
//        if (jRativo.isSelected()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
     public boolean verificarCampos() {
        if(!jFcpf.getText().equals("   .   .   -  ") || !jTnome.getText().isEmpty() || !jFdataNascimento.getText().equals("  /  /    ") 
                || !jTemail.getText().isEmpty() ||  !jFtel1.getText().equals("(  )    -    ") || !jFtel2.getText().equals("(  )    -    ") || !jFcontrato.getText().equals("  /  /    ") || !jTsalario.getText().isEmpty()
                || !jTcidade.getText().isEmpty() || !jTbairro.getText().isEmpty() || !jFcep.getText().equals("     -   ") || jCestado.getSelectedIndex() != 0
                || !jTrua.getText().isEmpty() || !jTnumero.getText().isEmpty() || !jTcomplemento.getText().isEmpty())
                {

            return true;
        } else {
            return false;
        }
     }   
    
    
}

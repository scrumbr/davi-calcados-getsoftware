/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.gui.cadastro;

import br.com.getsoftware.davicalcados.bo.FornecedorBO;
import br.com.getsoftware.davicalcados.entity.Endereco;
import br.com.getsoftware.davicalcados.entity.Fornecedor;
import br.com.getsoftware.davicalcados.gui.acesso.TelaMenuGUI;
import br.com.getsoftware.davicalcados.gui.edit.EditProdutoGUI;
import br.com.getsoftware.davicalcados.gui.lista.ListFornecedorGUI;
import br.com.getsoftware.davicalcados.util.LastID;
import br.com.getsoftware.davicalcados.util.TransformCnpj;
import br.com.getsoftware.davicalcados.util.TransformCpf;
import br.com.getsoftware.davicalcados.util.TransformTelefone;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gois
 */
public class CadFornecedorGUI extends javax.swing.JFrame {

    private TelaMenuGUI telaMenu;
    
    public CadFornecedorGUI() throws SQLException {
        initComponents();
       jTextField1.setText(""+LastID.atualizaId("id_fornecedor", "fornecedor"));
       jFCnpj.setEditable(false);
       LimpaMascaras();
    }

    public CadFornecedorGUI(TelaMenuGUI telaMenu) throws SQLException{
        this();
        this.telaMenu = telaMenu;
    }
     private ListFornecedorGUI listForn;
     public CadFornecedorGUI(ListFornecedorGUI listForn) throws SQLException{
         this();
         this.listForn = listForn;            
     }
     
     private CadProdutoGUI cadPro;
     public CadFornecedorGUI(CadProdutoGUI cadPro) throws SQLException{
         this();
         this.cadPro = cadPro;
     }
     private EditProdutoGUI editPro;
     public CadFornecedorGUI(EditProdutoGUI editPro) throws SQLException{
         this();
         this.editPro = editPro;
     }
     
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTCidade = new javax.swing.JTextField();
        jTBairro = new javax.swing.JTextField();
        jTComplemento = new javax.swing.JTextField();
        jTRua = new javax.swing.JTextField();
        jFCep = new javax.swing.JFormattedTextField();
        jTNumero = new javax.swing.JTextField();
        jCEstado = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jRCpf = new javax.swing.JRadioButton();
        jFCpf = new javax.swing.JFormattedTextField();
        jRCnpj = new javax.swing.JRadioButton();
        jFCnpj = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFTelefone = new javax.swing.JFormattedTextField();
        jFTelefone2 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jRAtivo = new javax.swing.JRadioButton();
        jRInativo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTObservacao = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 35));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Endereço"));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Cidade");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Bairro");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Rua");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("N°");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Estado");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("CEP");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Complemento");

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCidadeFocusLost(evt);
            }
        });

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTBairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBairroFocusLost(evt);
            }
        });

        jTComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTComplemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTComplementoActionPerformed(evt);
            }
        });
        jTComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTComplementoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTComplementoFocusLost(evt);
            }
        });

        jTRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTRua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTRuaFocusLost(evt);
            }
        });

        jFCep.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFCepFocusLost(evt);
            }
        });

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNumeroFocusLost(evt);
            }
        });

        jCEstado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Estado--", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "SP", "TO" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTNumero)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(91, 91, 91))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTNumero)
                    .addComponent(jTComplemento))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCEstado, jFCep, jTBairro, jTCidade, jTRua});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Dados Fornecedor"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Identificador");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomeFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Email");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEmailFocusLost(evt);
            }
        });

        buttonGroup2.add(jRCpf);
        jRCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRCpf.setSelected(true);
        jRCpf.setText("Física - CPF");
        jRCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCpfActionPerformed(evt);
            }
        });

        jFCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFCpfFocusLost(evt);
            }
        });

        buttonGroup2.add(jRCnpj);
        jRCnpj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRCnpj.setText("Juridica - CNPJ");
        jRCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCnpjActionPerformed(evt);
            }
        });

        jFCnpj.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFCnpjFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFCnpjFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefone 2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Telefone ");

        jFTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTelefoneFocusLost(evt);
            }
        });

        jFTelefone2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFTelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFTelefone2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFTelefone2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTelefone2FocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Status");

        buttonGroup1.add(jRAtivo);
        jRAtivo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jRAtivo.setSelected(true);
        jRAtivo.setText("Ativo");

        buttonGroup1.add(jRInativo);
        jRInativo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jRInativo.setText("Inativo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Observação");

        jTObservacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTObservacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTObservacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTObservacaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTObservacaoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jRCnpj)
                            .addGap(28, 28, 28))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jFCpf, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRCpf))
                        .addGap(1, 1, 1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jFTelefone2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(jFTelefone)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTObservacao)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRInativo)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTEmail))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRAtivo)
                        .addComponent(jRInativo))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jFCnpj, jFCpf, jFTelefone, jFTelefone2, jTEmail, jTNome, jTObservacao, jTextField1});

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jBSalvar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Actions-document-save-icon.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-preferences-web-browser-adblock-icon.png"))); // NOI18N
        jBCancelar.setText("Sair");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalvar)
                .addGap(35, 35, 35)
                .addComponent(jBCancelar)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSalvar))
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBCancelar, jBSalvar});

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(480, 35));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(657, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (verificarCampos()) {
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "DADOS NÂO SALVOS", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                if (telaMenu != null) {
                    telaMenu.setEnabled(true);
                } else if (listForn != null) {
                    listForn.setEnabled(true);
                } else if (cadPro != null) {
                    cadPro.setEnabled(true);
                } else if (editPro != null) {
                    editPro.setEnabled(true);
                }
                this.dispose();
            }
        } else {

            if (telaMenu != null) {
                telaMenu.setEnabled(true);
            } else if (listForn != null) {
                listForn.setEnabled(true);
            } else if (cadPro != null) {
                cadPro.setEnabled(true);
            } else if (editPro != null) {
                editPro.setEnabled(true);
            }
            this.dispose();
        }

    }//GEN-LAST:event_formWindowClosing

    private void jTComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTComplementoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
     
        if (verificarCampos()) {
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "DADOS NÂO SALVOS", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                if (telaMenu != null) {
                    telaMenu.setEnabled(true);
                } else if (listForn != null) {
                    listForn.setEnabled(true);
                } else if (cadPro != null) {
                    cadPro.setEnabled(true);
                } else if (editPro != null) {
                    editPro.setEnabled(true);
                }
                this.dispose();
            }
        } else {

            if (telaMenu != null) {
                telaMenu.setEnabled(true);
            } else if (listForn != null) {
                listForn.setEnabled(true);
            } else if (cadPro != null) {
                cadPro.setEnabled(true);
            } else if (editPro != null) {
                editPro.setEnabled(true);
            }
            this.dispose();
        }

        
        
       
       
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jRCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCpfActionPerformed
      if(jRCpf.isSelected()){
          jFCpf.setEditable(true);
          jFCnpj.setEditable(false);
          jFCnpj.setText(null);
      }
    }//GEN-LAST:event_jRCpfActionPerformed

    private void jRCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCnpjActionPerformed
        if(jRCnpj.isSelected()){
            jFCnpj.setEditable(true);
            jFCpf.setEditable(false);
            jFCpf.setText(null);
        }
    }//GEN-LAST:event_jRCnpjActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
      
        if (jTNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo 'NOME' está vazio!", "Atenção", 2);
            jTNome.requestFocus();
        } else if (jTEmail.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'E-MAIL' está vazio!", "Atenção", 2);
            jTEmail.requestFocus();
        } else if (jRCpf.isSelected() && jFCpf.getText().equals("   .   .   -  ")) {
             JOptionPane.showMessageDialog(null, "Campo 'CPF' está vazio!", "Atenção", 2);
            jFCpf.requestFocus();
        } else if (jRCnpj.isSelected() && jFCnpj.getText().equals("  .   .   /    -  ")) {
             JOptionPane.showMessageDialog(null, "Campo 'CNPJ' está vazio!", "Atenção", 2);
            jFCnpj.requestFocus();
        } else if (jFTelefone.getText().equals("(  )    -    ")) {
             JOptionPane.showMessageDialog(null, "Campo 'TELEFONE' está vazio!", "Atenção", 2);
            jFTelefone.requestFocus();
        } else if (jFTelefone2.getText().equals("(  )    -    ")) {
             JOptionPane.showMessageDialog(null, "Campo 'TELEFONE 2' está vazio!", "Atenção", 2);
            jFTelefone2.requestFocus();
        } else if (jTObservacao.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'OBSERVAÇÃO' está vazio!", "Atenção", 2);
             jTObservacao.requestFocus();
        } else if (jTCidade.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'CIDADE' está vazio!", "Atenção", 2);
            jTCidade.requestFocus();
        } else if (jTBairro.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'BAIRRO' está vazio!", "Atenção", 2);
            jTBairro.requestFocus();
        } else if (jCEstado.getSelectedIndex() == 0) {
             JOptionPane.showMessageDialog(null, "Campo 'ESTADO' está vazio!", "Atenção", 2);
            jCEstado.requestFocus();
        } else if (jFCep.getText().equals("     -   ")) {
             JOptionPane.showMessageDialog(null, "Campo 'CEP' está vazio!", "Atenção", 2);
            jFCep.requestFocus();
        } else if (jTRua.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'RUA' está vazio!", "Atenção", 2);
            jTRua.requestFocus();
        } else if (jTNumero.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'NÚMERO' está vazio!", "Atenção", 2);
            jTNumero.requestFocus();
        } else if (jTComplemento.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Campo 'COMPLEMENTO' está vazio!", "Atenção", 2);
            jTComplemento.requestFocus();
        } else {       
        Fornecedor fornecedor = new Fornecedor();
        Endereco end = new Endereco();

            fornecedor.setNome(jTNome.getText());
            if (jRCpf.isSelected()) {
                fornecedor.setFisicaJuridica(TransformCpf.transformCpf(jFCpf.getText()));
            } else if (jRCnpj.isSelected()) {
                fornecedor.setFisicaJuridica(TransformCnpj.transformCnpj(jFCnpj.getText()));
            }
            fornecedor.setTelefone(TransformTelefone.transformTelefone(jFTelefone.getText()));
            fornecedor.setTelefone2(TransformTelefone.transformTelefone(jFTelefone2.getText()));
            fornecedor.setEmail(jTEmail.getText());
            fornecedor.setStatus(status());
            fornecedor.setObservacao(jTObservacao.getText());

            end.setRua(jTRua.getText());
            end.setNumero(Integer.valueOf(jTNumero.getText()));
            end.setComplemento(jTComplemento.getText());
            end.setBairro(jTBairro.getText());
            end.setCidade(jTCidade.getText());
            end.setCEP(jFCep.getText());
            end.setEstado(jCEstado.getSelectedItem().toString());
            fornecedor.setEndereco(end);

        try {
            FornecedorBO.save(fornecedor);
            if(listForn != null){
             listForn.dadosTabela();
             listForn.atualizaLinhaSelecionada();    
             listForn.tabelaVazia();
            }
            JOptionPane.showMessageDialog(null, "Sucesso ao salvar o registro\n", "Salvo com sucesso", 1);

                int escolha = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo fornecedor ?", "Novo fornecedor", JOptionPane.YES_NO_OPTION);
                if (escolha == 0) {
                    limpaCampos();
                    jTextField1.setText("" + LastID.atualizaId("id_fornecedor", "fornecedor"));
                } else {
                    if (telaMenu != null) {
                        telaMenu.setEnabled(true);
                    } else if (listForn != null) {
                        listForn.setEnabled(true);
                    } else if (cadPro != null) {
                        cadPro.setEnabled(true);
                    } else if (editPro != null) {
                        editPro.setEnabled(true);
                    }
                    this.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar salvar o Funcionário", "Erro", 0);

            } catch (Exception ex) {
                Logger.getLogger(CadFuncionarioGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomeFocusGained
         jTNome.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTNomeFocusGained

    private void jTNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomeFocusLost
         jTNome.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTNomeFocusLost

    private void jTEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEmailFocusGained
         jTEmail.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTEmailFocusGained

    private void jTEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEmailFocusLost
        jTEmail.setBackground(Color.white);
    }//GEN-LAST:event_jTEmailFocusLost

    private void jFCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCpfFocusGained
         jFCpf.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFCpfFocusGained

    private void jFCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCpfFocusLost
        jFCpf.setBackground(Color.white);
    }//GEN-LAST:event_jFCpfFocusLost

    private void jFTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTelefoneFocusGained
         jFTelefone.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFTelefoneFocusGained

    private void jFTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTelefoneFocusLost
         jFTelefone.setBackground(Color.white);
    }//GEN-LAST:event_jFTelefoneFocusLost

    private void jTObservacaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTObservacaoFocusGained
         jTObservacao.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTObservacaoFocusGained

    private void jTObservacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTObservacaoFocusLost
          jTObservacao.setBackground(Color.white);
    }//GEN-LAST:event_jTObservacaoFocusLost

    private void jFCnpjFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCnpjFocusGained
         jFCnpj.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFCnpjFocusGained

    private void jFCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCnpjFocusLost
          jFCnpj.setBackground(Color.white);
    }//GEN-LAST:event_jFCnpjFocusLost

    private void jFTelefone2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTelefone2FocusGained
         jFTelefone2.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFTelefone2FocusGained

    private void jFTelefone2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTelefone2FocusLost
          jFTelefone2.setBackground(Color.white);
    }//GEN-LAST:event_jFTelefone2FocusLost

    private void jTCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCidadeFocusGained
         jTCidade.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTCidadeFocusGained

    private void jTCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCidadeFocusLost
          jTCidade.setBackground(Color.white);
    }//GEN-LAST:event_jTCidadeFocusLost

    private void jTBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBairroFocusGained
         jTBairro.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTBairroFocusGained

    private void jTBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBairroFocusLost
          jTBairro.setBackground(Color.white);
    }//GEN-LAST:event_jTBairroFocusLost

    private void jFCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCepFocusGained
         jFCep.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFCepFocusGained

    private void jFCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCepFocusLost
          jFCep.setBackground(Color.white);
    }//GEN-LAST:event_jFCepFocusLost

    private void jTRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRuaFocusGained
         jTRua.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTRuaFocusGained

    private void jTRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRuaFocusLost
          jTRua.setBackground(Color.white);
    }//GEN-LAST:event_jTRuaFocusLost

    private void jTNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNumeroFocusGained
         jTNumero.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTNumeroFocusGained

    private void jTNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNumeroFocusLost
          jTNumero.setBackground(Color.white);
    }//GEN-LAST:event_jTNumeroFocusLost

    private void jTComplementoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTComplementoFocusGained
         jTComplemento.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTComplementoFocusGained

    private void jTComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTComplementoFocusLost
          jTComplemento.setBackground(Color.white);
    }//GEN-LAST:event_jTComplementoFocusLost

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
            java.util.logging.Logger.getLogger(CadFornecedorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFornecedorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFornecedorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFornecedorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadFornecedorGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadFornecedorGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox jCEstado;
    private javax.swing.JFormattedTextField jFCep;
    private javax.swing.JFormattedTextField jFCnpj;
    private javax.swing.JFormattedTextField jFCpf;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JFormattedTextField jFTelefone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRAtivo;
    private javax.swing.JRadioButton jRCnpj;
    private javax.swing.JRadioButton jRCpf;
    private javax.swing.JRadioButton jRInativo;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTObservacao;
    private javax.swing.JTextField jTRua;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void LimpaMascaras(){
        jFCpf.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFCnpj.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFTelefone.setFocusLostBehavior(JFormattedTextField.COMMIT); 
        jFTelefone2.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFCep.setFocusLostBehavior(JFormattedTextField.COMMIT);       
    }

public void limpaCampos(){
    jTNome.setText(null);
    jTEmail.setText(null);
    jFCpf.setText(null);
    jFCnpj.setText(null);
    jFTelefone.setText(null);
    jFTelefone2.setText(null);
    jTObservacao.setText(null);
    jTCidade.setText(null);
    jTBairro.setText(null);
    jCEstado.setSelectedIndex(0);
    jFCep.setText(null);
    jTRua.setText(null);
    jTNumero.setText(null);
    jTComplemento.setText(null);
}



 public boolean status() {
        if (jRAtivo.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

 public boolean verificarCampos() {
        if(!jTNome.getText().isEmpty() || !jTEmail.getText().isEmpty() || !jFCpf.getText().equals("   .   .   -  ")
                || !jFCnpj.getText().equals("  .   .   /    -  ") || !jFTelefone.getText().equals("(  )    -    ") 
                || !jFTelefone2.getText().equals("(  )    -    ") || !jTObservacao.getText().isEmpty()
                || !jTCidade.getText().isEmpty() || !jTBairro.getText().isEmpty() || !jFCep.getText().equals("     -   ") || jCEstado.getSelectedIndex() != 0
                || !jTRua.getText().isEmpty() || !jTNumero.getText().isEmpty() || !jTComplemento.getText().isEmpty()) {

            return true;
        } else {
            return false;
        }
    }
 
 
 
 
}

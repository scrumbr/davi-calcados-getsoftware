
package br.com.getsoftware.davicalcados.gui.cadastro;

import br.com.getsoftware.davicalcados.bo.ClienteBO;
import br.com.getsoftware.davicalcados.entity.Cliente;
import br.com.getsoftware.davicalcados.entity.Endereco;
import br.com.getsoftware.davicalcados.gui.acesso.TelaMenuGUI;
import br.com.getsoftware.davicalcados.gui.lista.ListClientesGUI;
import br.com.getsoftware.davicalcados.util.LastID;
import br.com.getsoftware.davicalcados.util.MyDate;
import br.com.getsoftware.davicalcados.util.TransformCpf;
import br.com.getsoftware.davicalcados.util.TransformDate;
import br.com.getsoftware.davicalcados.util.TransformTelefone;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gois
 */
public class CadClienteGUI extends javax.swing.JFrame {

    private TelaMenuGUI telaMenu;
    private String sexo = "";   

     public CadClienteGUI() throws SQLException {
        initComponents();
        jTid.setText(""+LastID.atualizaId("id_cliente", "cliente"));
        LimpaMascaras();
    }
    
    public CadClienteGUI(TelaMenuGUI telaMenu) throws SQLException{
      this();
      this.telaMenu = telaMenu;
    }
     private ListClientesGUI listCli;
     public CadClienteGUI(ListClientesGUI listCli) throws SQLException{
         this();
         this.listCli = listCli;            
     }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jFTelefone2 = new javax.swing.JFormattedTextField();
        jFtelefone = new javax.swing.JFormattedTextField();
        jTid = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jTprofissao = new javax.swing.JTextField();
        jTBoleto = new javax.swing.JTextField();
        jTPreferencias = new javax.swing.JTextField();
        jFDataNascimento = new javax.swing.JFormattedTextField();
        jTIdade = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTRg = new javax.swing.JTextField();
        jRM = new javax.swing.JRadioButton();
        jRF = new javax.swing.JRadioButton();
        jCEstadoCivil = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jTRenda = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTCredito = new javax.swing.JTextField();
        jFCpf = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
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
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jToolBar1.setRollover(true);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 0, 0));
        jLabel28.setText("*");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(445, 35));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Dados Pessoais"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Identificador");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Profissão");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sexo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Data Nascimento");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Estado Civil");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Telefone");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Telefone 2");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("E-mail");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Idade");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Preferências");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("N° Boleto");

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

        jFtelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFtelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFtelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFtelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFtelefoneFocusLost(evt);
            }
        });

        jTid.setEditable(false);
        jTid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTid.setEnabled(false);

        jTnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTnome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnomeFocusLost(evt);
            }
        });

        jTprofissao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTprofissao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTprofissao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTprofissaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTprofissaoFocusLost(evt);
            }
        });

        jTBoleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTBoleto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTBoleto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBoletoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBoletoFocusLost(evt);
            }
        });
        jTBoleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTBoletoKeyTyped(evt);
            }
        });

        jTPreferencias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTPreferencias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTPreferencias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPreferenciasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPreferenciasFocusLost(evt);
            }
        });

        jFDataNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFDataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFDataNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFDataNascimentoFocusLost(evt);
            }
        });
        jFDataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFDataNascimentoKeyReleased(evt);
            }
        });

        jTIdade.setEditable(false);
        jTIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTIdade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("RG");

        jTRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTRg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTRg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTRgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTRgFocusLost(evt);
            }
        });
        jTRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTRgKeyTyped(evt);
            }
        });

        buttonGroup2.add(jRM);
        jRM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRM.setText("Masculino");
        jRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRF);
        jRF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRF.setText("Feminino");
        jRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRFActionPerformed(evt);
            }
        });

        jCEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Estado Civil", "Casada", "Solteira", "Viúva", "Divorciada" }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Renda/Mensal");

        jTRenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTRenda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTRenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRendaActionPerformed(evt);
            }
        });
        jTRenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTRendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTRendaFocusLost(evt);
            }
        });
        jTRenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTRendaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTRendaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTRendaKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Crédito");

        jTCredito.setEditable(false);
        jTCredito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTCredito.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCreditoActionPerformed(evt);
            }
        });

        jFCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCpf.setToolTipText("Digite o CPF");
        jFCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCpfActionPerformed(evt);
            }
        });
        jFCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFCpfFocusLost(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("*");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 0, 0));
        jLabel27.setText("*");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 0, 0));
        jLabel29.setText("*");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTBoleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jTIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(jTPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFtelefone)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel31)))
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel23)
                                    .addComponent(jTRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29))
                            .addComponent(jTnome, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jTprofissao)
                            .addComponent(jTemail)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jTCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRF)))
                                .addGap(12, 12, 12)))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFCpf, jFDataNascimento, jFTelefone2, jTIdade, jTRg});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTemail, jTnome, jTprofissao});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTCredito, jTRenda});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCEstadoCivil)
                    .addComponent(jTRg)
                    .addComponent(jTprofissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel31))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRM)
                    .addComponent(jRF))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCEstadoCivil, jTid});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jFCpf, jFDataNascimento, jFTelefone2, jFtelefone, jTBoleto, jTCredito, jTIdade, jTPreferencias, jTRenda, jTemail, jTnome});

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

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 0, 0));
        jLabel32.setText("*");

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
                                .addComponent(jLabel12)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel32))
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34))
                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel33))
                            .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTComplemento)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFCep, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel17)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jLabel34)
                        .addComponent(jLabel35)
                        .addComponent(jLabel36))
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCEstado, jFCep, jTBairro, jTCidade, jTComplemento, jTNumero, jTRua});

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jBSalvar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Actions-document-save-icon.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.setToolTipText("Salvar Cliente");
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
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jBSalvar)
                .addGap(18, 18, 18)
                .addComponent(jBCancelar)
                .addGap(20, 20, 20))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCancelar, jBSalvar});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(445, 35));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel3, jPanel4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(686, 627));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         if (verificarCampos()) {
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "DADOS NÂO SALVOS", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                if (telaMenu != null) {
                    telaMenu.setEnabled(true);
                } else if (listCli != null) {
                    listCli.setEnabled(true);
                }
                this.dispose();
            }           
        } else {
            if (telaMenu != null) {
                telaMenu.setEnabled(true);
            } else if (listCli != null) {
                listCli.setEnabled(true);
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
                } else if (listCli != null) {
                    listCli.setEnabled(true);
                }
                this.dispose();
            }            
        } else {
            if (telaMenu != null) {
                telaMenu.setEnabled(true);
            } else if (listCli != null) {
                listCli.setEnabled(true);
            }
            this.dispose();
        }

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
                   
         if (jFCpf.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Campo 'CPF' está vazio!", "Atenção", 2);
            jFCpf.requestFocus();
         } else if (jTnome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo 'NOME' está vazio!", "Atenção", 2);
            jTnome.requestFocus();
         } else if (jTRg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo 'RG' está vazio!", "Atenção", 2);
            jTRg.requestFocus();
         } else if (jTprofissao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo 'PROSISSÃO' está vazio!", "Atenção", 2);
            jTprofissao.requestFocus();
         } else if (jFtelefone.getText().equals("(  )    -    ")) {
            JOptionPane.showMessageDialog(null, "Campo 'TELEFONE' está vazio!", "Atenção", 2);
            jFtelefone.requestFocus();
         }else if (jTRenda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo 'RENDA' está vazio!", "Atenção", 2);
            jTRenda.requestFocus();
         } 
         else if (jTCredito.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo 'CRÉDITO' está vazio!", "Atenção", 2);
            jTCredito.requestFocus();
         } 
         else if (jFDataNascimento.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(null, "Campo 'DATA NASCIMENTO' está vazio!", "Atenção", 2);
            jFDataNascimento.requestFocus();
         }else if(!jRM.isSelected() && !jRF.isSelected()){
              JOptionPane.showMessageDialog(null, "Campo 'SEXO' está vazio!", "Atenção", 2);
         } else if(jTBoleto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo 'BOLETO' está vazio!", "Atenção", 2);
            jTBoleto.requestFocus();
        } else if(jTPreferencias.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Campo 'PREFERÊNCIAS' está vazio!", "Atenção", 2);
            jTPreferencias.requestFocus();            
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

            Cliente cliente = new Cliente();
            Endereco end = new Endereco();

            cliente.setCpf(TransformCpf.transformCpf(jFCpf.getText()));
            cliente.setNome(jTnome.getText());
            cliente.setSexo(sexo);
            cliente.setProfissao(jTprofissao.getText());
            cliente.setEstadoCivil(jCEstadoCivil.getSelectedItem().toString());
            cliente.setDataNascimento(TransformDate.transformDate(jFDataNascimento.getText()));           
            cliente.setTelefone(TransformTelefone.transformTelefone(jFtelefone.getText()));
            cliente.setTelefone2(TransformTelefone.transformTelefone(jFTelefone2.getText()));
            cliente.setEmail(jTemail.getText());
            cliente.setPreferencia(jTPreferencias.getText());
            cliente.setNumeroBoleto(Long.valueOf(jTBoleto.getText()));
            cliente.setRg(jTRg.getText());
            //cliente.setStatus(status());
            cliente.setRenda(Double.valueOf((jTRenda.getText().replace(",", "."))));
            cliente.setCredito(Double.valueOf((jTCredito.getText())));
            
            end.setBairro(jTBairro.getText());
            end.setCEP(jFCep.getText());
            end.setCidade(jTCidade.getText());
            end.setComplemento(jTComplemento.getText());
            end.setEstado(jCEstado.getSelectedItem().toString());
            end.setNumero(jTNumero.getText());
            end.setRua(jTRua.getText());
            cliente.setEndereco(end);
            try {
                 ClienteBO.save(cliente);
                 if(listCli!=null){
                 listCli.dadosTabela();
                 listCli.atualizaLinhaSelecionada();
                 listCli.tabelaVazia();
                 }
                JOptionPane.showMessageDialog(null, "Sucesso ao salvar o registro\n", "Salvo com sucesso", 1);

                int escolha = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo cliente ?", "Novo cliente", JOptionPane.YES_NO_OPTION);
                if (escolha == 0) {
                    LimpaCampos();
                    jTid.setText("" + LastID.atualizaId("id_cliente", "cliente"));
                } else {
                    if(telaMenu != null){
                    telaMenu.setEnabled(true);
                    }else  if(listCli != null){
                    listCli.setEnabled(true);
                   
                }  
                this.dispose();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar salvar o Cliente", "Erro", 0);
            } catch (Exception ex) {
                Logger.getLogger(CadFuncionarioGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jFDataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFDataNascimentoFocusLost
        jFDataNascimento.setBackground(Color.white);
        jFDataNascimento.setFocusLostBehavior(JFormattedTextField.COMMIT); 
        if(jFDataNascimento.getText().equals("  /  /    ")){          
        }else{
             int ano = Integer.valueOf(jFDataNascimento.getText().substring(jFDataNascimento.getText().length()-4, jFDataNascimento.getText().length()));
             jTIdade.setText(""+(MyDate.getAno()-ano));
        }
    }//GEN-LAST:event_jFDataNascimentoFocusLost

    private void jRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMActionPerformed
      sexo = "M";
    }//GEN-LAST:event_jRMActionPerformed

    private void jRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRFActionPerformed
      sexo = "F";
    }//GEN-LAST:event_jRFActionPerformed

    private void jTRendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRendaFocusLost
        jTRenda.setBackground(Color.WHITE);
        if(jTRenda.getText().isEmpty() || jTRenda.getText() == null){
          jTRenda.setText(null);
        }else{
        jTRenda.setText((jTRenda.getText()));
        
        }
    }//GEN-LAST:event_jTRendaFocusLost

    private void jTRendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRendaActionPerformed
        
    }//GEN-LAST:event_jTRendaActionPerformed

    private void jTRendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRendaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRendaKeyPressed

    private void jTRendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRendaKeyReleased
        
        if(jTRenda.getText().isEmpty() || jTRenda.getText() == null){
          jTCredito.setText(null);
        }else{
            
           double credito = 0.60 * (Double.valueOf(jTRenda.getText().replace(",",".")));
           BigDecimal bd = new BigDecimal(credito).setScale(2, RoundingMode.HALF_EVEN);
         
         jTCredito.setText((""+bd.doubleValue()));
        // jTCredito.setText(""+bd.doubleValue());
        //  jTCredito.setText(""+credito);
       }
    }//GEN-LAST:event_jTRendaKeyReleased

    private void jFDataNascimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFDataNascimentoKeyReleased
         if(jFDataNascimento.getText().equals("  /  /    ")){
          jTIdade.setText("");
      }
    }//GEN-LAST:event_jFDataNascimentoKeyReleased

    private void jTnomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnomeFocusGained
         jTnome.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTnomeFocusGained

    private void jTnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnomeFocusLost
      jTnome.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTnomeFocusLost

    private void jFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFCpfActionPerformed

    private void jTCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCreditoActionPerformed

    private void jTRendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRendaKeyTyped
        String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
       }
    }//GEN-LAST:event_jTRendaKeyTyped

    private void jTRgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRgKeyTyped
      String caracteres="0987654321";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
       }
    }//GEN-LAST:event_jTRgKeyTyped

    private void jTBoletoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBoletoKeyTyped
        String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
       }
    }//GEN-LAST:event_jTBoletoKeyTyped

    private void jFCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCpfFocusGained
        jFCpf.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFCpfFocusGained

    private void jFCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCpfFocusLost
        jFCpf.setBackground(Color.WHITE);
    }//GEN-LAST:event_jFCpfFocusLost

    private void jTRgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRgFocusGained
        jTRg.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTRgFocusGained

    private void jTRgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRgFocusLost
        jTRg.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTRgFocusLost

    private void jTprofissaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTprofissaoFocusGained
        jTprofissao.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTprofissaoFocusGained

    private void jTprofissaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTprofissaoFocusLost
        jTprofissao.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTprofissaoFocusLost

    private void jFtelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFtelefoneFocusGained
        jFtelefone.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFtelefoneFocusGained

    private void jFtelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFtelefoneFocusLost
        jFtelefone.setBackground(Color.WHITE);
    }//GEN-LAST:event_jFtelefoneFocusLost

    private void jFTelefone2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTelefone2FocusGained
        jFTelefone2.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFTelefone2FocusGained

    private void jFTelefone2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTelefone2FocusLost
        jFTelefone2.setBackground(Color.WHITE);
    }//GEN-LAST:event_jFTelefone2FocusLost

    private void jTemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTemailFocusGained
        jTemail.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTemailFocusGained

    private void jTemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTemailFocusLost
       jTemail.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTemailFocusLost

    private void jFDataNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFDataNascimentoFocusGained
                jFDataNascimento.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFDataNascimentoFocusGained

    private void jTRendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRendaFocusGained
                jTRenda.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTRendaFocusGained

    private void jTBoletoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBoletoFocusGained
                jTBoleto.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTBoletoFocusGained

    private void jTBoletoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBoletoFocusLost
           jTBoleto.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTBoletoFocusLost

    private void jTPreferenciasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPreferenciasFocusGained
                jTPreferencias.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTPreferenciasFocusGained

    private void jTPreferenciasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPreferenciasFocusLost
           jTPreferencias.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTPreferenciasFocusLost

    private void jTCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCidadeFocusGained
                jTCidade.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTCidadeFocusGained

    private void jTCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCidadeFocusLost
                jTCidade.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTCidadeFocusLost

    private void jTBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBairroFocusGained
                jTBairro.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTBairroFocusGained

    private void jTBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBairroFocusLost
                jTBairro.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTBairroFocusLost

    private void jFCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCepFocusGained
                jFCep.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jFCepFocusGained

    private void jFCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFCepFocusLost
                jFCep.setBackground(Color.WHITE);
    }//GEN-LAST:event_jFCepFocusLost

    private void jTRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRuaFocusGained
                jTRua.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTRuaFocusGained

    private void jTRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRuaFocusLost
                jTRua.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTRuaFocusLost

    private void jTNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNumeroFocusGained
                jTNumero.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTNumeroFocusGained

    private void jTNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNumeroFocusLost
                jTNumero.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTNumeroFocusLost

    private void jTComplementoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTComplementoFocusGained
                jTComplemento.setBackground(Color.getHSBColor(220,110, 204));
    }//GEN-LAST:event_jTComplementoFocusGained

    private void jTComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTComplementoFocusLost
                jTComplemento.setBackground(Color.getHSBColor(220,110, 204));
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
            java.util.logging.Logger.getLogger(CadClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadClienteGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox jCEstadoCivil;
    private javax.swing.JFormattedTextField jFCep;
    private javax.swing.JFormattedTextField jFCpf;
    private javax.swing.JFormattedTextField jFDataNascimento;
    private javax.swing.JFormattedTextField jFTelefone2;
    private javax.swing.JFormattedTextField jFtelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JRadioButton jRF;
    private javax.swing.JRadioButton jRM;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTBoleto;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTCredito;
    private javax.swing.JTextField jTIdade;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTPreferencias;
    private javax.swing.JTextField jTRenda;
    private javax.swing.JTextField jTRg;
    private javax.swing.JTextField jTRua;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnome;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField jTprofissao;
    // End of variables declaration//GEN-END:variables

public void DesbloqueiaCampos(){
    jFCpf.setEnabled(true);
    jCEstadoCivil.setEnabled(true);
    jTemail.setEnabled(true);
    jFTelefone2.setEnabled(true);
    jFtelefone.setEnabled(true);
    jTid.setEnabled(true);
    jTnome.setEnabled(true);
    jTprofissao.setEnabled(true);
    jTCidade.setEnabled(true);
    jTBairro.setEnabled(true);
    jCEstado.setEnabled(true);
    jFCep.setEnabled(true);
    jTRua.setEnabled(true);
    jTNumero.setEnabled(true);
    jTComplemento.setEnabled(true);
//    jRStatusAtivo.setEnabled(true);
//    jRStatusInativo.setEnabled(true);
    jFDataNascimento.setEnabled(true);
    //jTextField1.setEnabled(true);
};

public void LimpaCampos(){
    jFCpf.setText(null);
    jCEstadoCivil.setSelectedIndex(0);
    jTemail.setText(null);
    jFTelefone2.setText(null);
    jFtelefone.setText(null);
    jTid.setText(null);
    jTnome.setText(null);
    jTprofissao.setText(null);
    jTCidade.setText(null);
    jTBairro.setText(null);
    jCEstado.setSelectedIndex(0);
    jFCep.setText(null);
    jTRua.setText(null);
    jTNumero.setText(null);
    jTComplemento.setText(null);
    jTPreferencias.setText(null);
    jFDataNascimento.setText(null);
    jTBoleto.setText(null);
    jRM.setSelected(false);
    jRF.setSelected(false);
    jTRg.setText(null);
    jTIdade.setText(null);
    jTRenda.setText(null);
    jTCredito.setText(null);
    jRM.setSelected(false);
    jRF.setSelected(false);
}

// public boolean status() {
//        if (jRStatusAtivo.isSelected()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
 
 
 public void LimpaMascaras(){
        jFCpf.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFCep.setFocusLostBehavior(JFormattedTextField.COMMIT);
        jFtelefone.setFocusLostBehavior(JFormattedTextField.COMMIT); 
        jFTelefone2.setFocusLostBehavior(JFormattedTextField.COMMIT);
 }
    public boolean verificarCampos() {
        if (!jFCpf.getText().equals("   .   .   -  ") || !jTnome.getText().isEmpty() || jCEstadoCivil.getSelectedIndex() != 0 || !jTRg.getText().isEmpty()
                || !jTprofissao.getText().isEmpty() || !jFtelefone.getText().equals("(  )    -    ") || !jFTelefone2.getText().equals("(  )    -    ") || !jTemail.getText().isEmpty()
                || !jFDataNascimento.getText().equals("  /  /    ") || !jTRenda.getText().isEmpty() || !jTBoleto.getText().isEmpty() || !jTPreferencias.getText().isEmpty()
                || !jTCidade.getText().isEmpty() || !jTBairro.getText().isEmpty() || !jFCep.getText().equals("     -   ") || jCEstado.getSelectedIndex() != 0
                || !jTRua.getText().isEmpty() || !jTNumero.getText().isEmpty() || !jTComplemento.getText().isEmpty()) {

            return true;
        } else {
            return false;
        }
    }
}

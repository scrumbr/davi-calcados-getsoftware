package br.com.getsoftware.davicalcados.gui.edit;

import br.com.getsoftware.davicalcados.gui.cadastro.*;
import br.com.getsoftware.davicalcados.bo.FornecedorBO;
import br.com.getsoftware.davicalcados.bo.ProdutoBO;
import br.com.getsoftware.davicalcados.entity.Fornecedor;
import br.com.getsoftware.davicalcados.entity.Produto;
import br.com.getsoftware.davicalcados.gui.lista.ListProdutosGUI;
import br.com.getsoftware.davicalcados.util.LastID;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class EditProdutoGUI extends javax.swing.JFrame {

    private Produto produto;
    private ListProdutosGUI listPro;
    private ArrayList<Long> fornecedores;

    public EditProdutoGUI() throws SQLException {
        initComponents();        
        jTDescricao.setLineWrap(true);
        fornecedores = new ArrayList<>();
        jTAumento.setEditable(true);
    }
    public void atualizaIdFonecedor() throws SQLException{
        ArrayList<Fornecedor> forn = FornecedorBO.listAll();
        for (int i = 0; i < forn.size(); i++) {
            jCFornecedor.addItem(forn.get(i).getNome());
            this.fornecedores.add(forn.get(i).getIdFornecedor());
        }
    }
    
    public EditProdutoGUI(ListProdutosGUI listPro, Produto produto) throws SQLException {
        this();
        this.listPro = listPro;
        this.produto = produto;
         refreshCampos();
         System.err.println(produto.getNome());
    }

    public EditProdutoGUI(Produto produto) throws SQLException {
        this();
        this.produto = produto;
         refreshCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jBSair = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTQuantidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTQuantidadeMinima = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTValorUnitario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTValorVenda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTAumento = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCFornecedor = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDescricao = new javax.swing.JTextArea();
        jTId = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Editar Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBSair.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Apps-preferences-web-browser-adblock-icon.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBSalvar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Actions-document-save-icon.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSalvar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Admin-icon-24.png"))); // NOI18N
        jButton1.setText("Cad.Forn.");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jBSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBSair, jBSalvar, jButton1});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalvar)
                .addGap(18, 18, 18)
                .addComponent(jBSair)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBSair, jBSalvar, jButton1});

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Dados Produto"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Quantidade");

        jTQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTQuantidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTQuantidadeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTQuantidadeKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Quantidade Minima");

        jTQuantidadeMinima.setEditable(false);
        jTQuantidadeMinima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTQuantidadeMinima.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTQuantidadeMinima.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTQuantidadeMinimaFocusLost(evt);
            }
        });
        jTQuantidadeMinima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTQuantidadeMinimaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTQuantidadeMinimaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Valor Unitário");

        jTValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTValorUnitario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTValorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTValorUnitarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTValorUnitarioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Valor de Venda");

        jTValorVenda.setEditable(false);
        jTValorVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTValorVenda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("% Aumento");

        jTAumento.setEditable(false);
        jTAumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTAumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTAumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTAumentoFocusLost(evt);
            }
        });
        jTAumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAumentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTAumentoKeyTyped(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 0, 0));
        jLabel42.setText("*");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 0, 0));
        jLabel43.setText("*");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 0, 0));
        jLabel44.setText("*");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 0, 0));
        jLabel45.setText("*");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 0, 0));
        jLabel46.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTAumento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43))
                    .addComponent(jTQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46))
                    .addComponent(jTValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44))
                    .addComponent(jTValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTAumento, jTQuantidade, jTQuantidadeMinima, jTValorUnitario, jTValorVenda});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(11, 11, 11)))
                .addComponent(jTAumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTAumento, jTQuantidade, jTQuantidadeMinima, jTValorUnitario, jTValorVenda});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Dados Produto"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Identificador");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Fornecedor");

        jCFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha o Fornecedor" }));
        jCFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCFornecedorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nome");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Descrição");

        jTDescricao.setColumns(20);
        jTDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTDescricao.setRows(5);
        jTDescricao.setWrapStyleWord(true);
        jTDescricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTDescricao);

        jTId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 0, 0));
        jLabel39.setText("*");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 0, 0));
        jLabel40.setText("*");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 0, 0));
        jLabel41.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCFornecedor, 0, 191, Short.MAX_VALUE))
                    .addComponent(jTNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41))
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(671, 429));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        listPro.setEnabled(true);    
        dispose();
      
           
    }//GEN-LAST:event_formWindowClosing

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
         if (jTId.getText() == null || jTId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo 'CÓDIGO' está vazio!", "Atenção", 2);
            jTId.requestFocus();
        }else if (jCFornecedor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione o FORNECEDOR!", "Atenção", 2);
            jCFornecedor.requestFocus();
        } else if (jTNome.getText().isEmpty() || jTNome.getText() == null) {
            JOptionPane.showMessageDialog(null, "Campo 'NOME' está vazio!", "Atenção", 2);
            jTNome.requestFocus();
        } else if (jTQuantidade.getText().isEmpty() || jTQuantidade.getText() == null) {
            JOptionPane.showMessageDialog(null, "Campo 'QUANTIDADE' está vazio!", "Atenção", 2);
            jTQuantidade.requestFocus();
        } else if (jTQuantidadeMinima.getText().isEmpty() || jTQuantidadeMinima.getText() == null) {
            JOptionPane.showMessageDialog(null, "Campo 'QUANTIDADE MÍNIMA' está vazio!", "Atenção", 2);
            jTQuantidadeMinima.requestFocus();
        } else if (jTValorUnitario.getText().isEmpty() || jTValorUnitario.getText() == null) {
            JOptionPane.showMessageDialog(null, "Campo 'VALOR UNITÁRIO' está vazio!", "Atenção", 2);
            jTValorUnitario.requestFocus();
        } else if (jTAumento.getText().isEmpty() || jTAumento.getText() == null) {
            JOptionPane.showMessageDialog(null, "Campo '% DE AUMENTO' está vazio!", "Atenção", 2);
            jTValorVenda.requestFocus();
        } else if (jTValorVenda.getText().isEmpty() || jTValorVenda.getText() == null) {
            JOptionPane.showMessageDialog(null, "Campo 'VALOR DE VENDA' está vazio!", "Atenção", 2);
            jTValorVenda.requestFocus();
        } else {
            try {
                refreshProduto();
                ProdutoBO.update(produto);
                listPro.setEnabled(true);
                this.dispose();
                listPro.dadosTabela();
                listPro.atualizaLinhaSelecionada();
                JOptionPane.showMessageDialog(null, "Sucesso ao atualizar o registro\n", "Sucesso", 1);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar editar o produto", "Erro", 0);
            } catch (Exception ex) {
                Logger.getLogger(CadFuncionarioGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        listPro.setEnabled(true);
        dispose();
        
    }//GEN-LAST:event_jBSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setEnabled(false);
        try {
            new CadFornecedorGUI(this).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(EditProdutoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQuantidadeKeyReleased
        if(jTQuantidade.getText().isEmpty() || jTQuantidade.getText() == null){
            jTQuantidadeMinima.setEditable(false);
        }else{
            jTQuantidadeMinima.setEditable(true);
        }
    }//GEN-LAST:event_jTQuantidadeKeyReleased

    private void jTQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQuantidadeKeyTyped
        String caracteres="0987654321.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTQuantidadeKeyTyped

    private void jTQuantidadeMinimaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTQuantidadeMinimaFocusLost
        if(jTQuantidadeMinima.getText().isEmpty() || jTQuantidadeMinima.getText() == (null) ) {
            jTQuantidadeMinima.setText(null);
        }else if((Double.valueOf(jTQuantidadeMinima.getText()) > Double.valueOf(jTQuantidade.getText()))){
            JOptionPane.showMessageDialog(null, "Quantidade Minima maior que Quantidade", "Atenção", 2);
            jTQuantidadeMinima.setText(null);
            jTQuantidadeMinima.requestFocus();
        }
    }//GEN-LAST:event_jTQuantidadeMinimaFocusLost

    private void jTQuantidadeMinimaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQuantidadeMinimaKeyReleased

    }//GEN-LAST:event_jTQuantidadeMinimaKeyReleased

    private void jTQuantidadeMinimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQuantidadeMinimaKeyTyped
        String caracteres="0987654321.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTQuantidadeMinimaKeyTyped

    private void jTValorUnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorUnitarioKeyReleased
        if(jTValorUnitario.getText().isEmpty() || jTValorUnitario.getText() == null){
            jTAumento.setText(null);
            jTValorVenda.setText(null);
            jTAumento.setEditable(false);
        }else{
            jTAumento.setEditable(true);
        }
    }//GEN-LAST:event_jTValorUnitarioKeyReleased

    private void jTValorUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorUnitarioKeyTyped
        String caracteres="0987654321.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTValorUnitarioKeyTyped

    private void jTAumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAumentoFocusLost
        if (!jTAumento.getText().isEmpty() && jTAumento.getText() != (null)) {
            double valorAumento = ((Double.valueOf(jTAumento.getText().replace(",", ".")) / 100) * Double.valueOf(jTValorUnitario.getText().replace(",", "."))) + Double.valueOf(jTValorUnitario.getText().replace(",", "."));
            BigDecimal bd = new BigDecimal(valorAumento).setScale(2, RoundingMode.HALF_EVEN);
            jTValorVenda.setText("" + bd.doubleValue());
        }
    }//GEN-LAST:event_jTAumentoFocusLost

    private void jTAumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAumentoKeyReleased
        if(jTAumento.getText().isEmpty() || jTAumento.getText() == null){
            jTValorVenda.setText(null);
        }
    }//GEN-LAST:event_jTAumentoKeyReleased

    private void jTAumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAumentoKeyTyped
        String caracteres="0987654321.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTAumentoKeyTyped

    private void jCFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCFornecedorActionPerformed

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed
        jTNome.requestFocus();
    }//GEN-LAST:event_jTIdActionPerformed

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
            java.util.logging.Logger.getLogger(CadProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadProdutoGUI().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de cadastro de produtos", "Erro", 0);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAumento;
    private javax.swing.JTextArea jTDescricao;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTQuantidade;
    private javax.swing.JTextField jTQuantidadeMinima;
    private javax.swing.JTextField jTValorUnitario;
    private javax.swing.JTextField jTValorVenda;
    // End of variables declaration//GEN-END:variables

    public void refreshProduto() {
//        produto.setIdProduto(Long.valueOf(jTId.getText()));
        
        produto.setNome(jTNome.getText());
        //ATENÇÃO ---------------------------------------------------------
        Fornecedor f = new Fornecedor();
        produto.setFornecedor(f);
         System.out.println(jCFornecedor.getItemCount());
        produto.getFornecedor().setIdFornecedor(Long.valueOf(fornecedores.get(jCFornecedor.getSelectedIndex()-1)));
        //---------------------------------------------------------------
        produto.setDescricao(jTDescricao.getText());
        produto.setQuantidade(Integer.valueOf(jTQuantidade.getText()));
        produto.setQuantidadeMinima(Integer.valueOf(jTQuantidadeMinima.getText()));
        produto.setValorUnitario(Double.valueOf(jTValorUnitario.getText().replace(",", ".")));
        produto.setValorVenda(Double.valueOf(jTValorVenda.getText()));
        produto.setQtdAumento(Double.valueOf(jTAumento.getText().replace(",", ".")));
    }

    public void refreshCampos() throws SQLException {
        jTId.setText(produto.getIdProduto());
        jTNome.setText(produto.getNome());
        jTDescricao.setText(produto.getDescricao());
        jTQuantidade.setText(""+produto.getQuantidade());
        jTQuantidadeMinima.setText(""+produto.getQuantidadeMinima());
        jTValorUnitario.setText(""+produto.getValorUnitario());
        jTValorVenda.setText(""+produto.getValorVenda());
        atualizaIdFonecedor();
        jCFornecedor.setSelectedItem(produto.getFornecedor().getNome()); 
        jTAumento.setText(""+produto.getQtdAumento());
    }
}

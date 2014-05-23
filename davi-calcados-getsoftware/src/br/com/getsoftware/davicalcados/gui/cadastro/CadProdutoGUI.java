package br.com.getsoftware.davicalcados.gui.cadastro;

import br.com.getsoftware.davicalcados.bo.FornecedorBO;
import br.com.getsoftware.davicalcados.bo.ProdutoBO;
import br.com.getsoftware.davicalcados.entity.Fornecedor;
import br.com.getsoftware.davicalcados.entity.Produto;
import br.com.getsoftware.davicalcados.gui.acesso.TelaMenuGUI;
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
public class CadProdutoGUI extends javax.swing.JFrame {

    private TelaMenuGUI telaMenu;
    private ArrayList<Long> fornecedores;
    public CadProdutoGUI() throws SQLException {
        initComponents();
//        jTId.setText(""+LastID.atualizaId("id_produto", "produto"));
        jTId.requestFocus();
        jTDescricao.setLineWrap(true);
        fornecedores = new ArrayList<>();
        atualizaCombo();
    }
    
    public void atualizaCombo(){
        ArrayList<Fornecedor> forn;
        jCFornecedor.removeAllItems();
        fornecedores = new ArrayList<>();
        jCFornecedor.addItem("Escolha o fornecedor");
        try {
            forn = FornecedorBO.listAll();
            for(int i = 0; i < forn.size(); i++){
            jCFornecedor.addItem(forn.get(i).getNome());
            this.fornecedores.add(forn.get(i).getIdFornecedor());
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Não foi possível atualizar os fornecedores!", "Erro", 0);
            this.dispose();
        }
    }

    public CadProdutoGUI(TelaMenuGUI telaMenu) throws SQLException {
        this();
        this.telaMenu = telaMenu;
        jTId.requestFocus();
    }
    
     private ListProdutosGUI listPro;
     public CadProdutoGUI(ListProdutosGUI listPro) throws SQLException{
         this();
         this.listPro = listPro;            
         jTId.requestFocus();
     }
     
     private CadVendaGUI cadVenda;
     public CadProdutoGUI(CadVendaGUI cadVenda) throws SQLException{
         this();
         this.cadVenda = cadVenda;         
         jTId.requestFocus();
     }
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Dados Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Dados Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jTQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTAumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTAumento, jTQuantidade, jTQuantidadeMinima, jTValorUnitario, jTValorVenda});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(jTAumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTAumento, jTQuantidadeMinima, jTValorUnitario, jTValorVenda});

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Admin-icon-24.png"))); // NOI18N
        jButton1.setText("Cad.Forn.");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBSalvar, jButton1});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jBSalvar)
                .addGap(18, 18, 18)
                .addComponent(jBSair)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, jPanel5});

        setSize(new java.awt.Dimension(684, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (verificarCampos()) {
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "DADOS NÂO SALVOS", JOptionPane.YES_NO_OPTION);
            if (escolha == JOptionPane.YES_OPTION) {
                if (telaMenu != null) {
                    telaMenu.setEnabled(true);
                } else if (listPro != null) {
                    listPro.setEnabled(true);
                } else if (cadVenda != null) {
                    cadVenda.setEnabled(true);
                }
                this.dispose();
            }
        } else {

            if (telaMenu != null) {
                telaMenu.setEnabled(true);
            } else if (listPro != null) {
                listPro.setEnabled(true);
            } else if (cadVenda != null) {
                cadVenda.setEnabled(true);
            }
            this.dispose();
        } 
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
        } else if (jTValorVenda.getText().isEmpty() || jTValorVenda.getText() == null) {
            JOptionPane.showMessageDialog(null, "Campo 'VALOR DE VENDA' está vazio!", "Atenção", 2);
            jTValorVenda.requestFocus();
        } else {
            Produto produto = new Produto();
            produto.setDescricao(jTDescricao.getText());
            produto.setIdProduto(jTId.getText());
            Fornecedor f = new Fornecedor();
            produto.setFornecedor(f);
            produto.getFornecedor().setIdFornecedor(Long.valueOf(fornecedores.get(jCFornecedor.getSelectedIndex()-1)));
            
            produto.setQuantidadeMinima(Integer.valueOf(jTQuantidadeMinima.getText().replace(".", "").replace(",", ".")));
            produto.setQuantidade(Integer.valueOf(jTQuantidade.getText().replace(".", "").replace(",", ".")));
            produto.setValorUnitario(Double.valueOf(jTValorUnitario.getText().replace(",", ".")));
            produto.setValorVenda(Double.valueOf(jTValorVenda.getText()));
            produto.setNome(jTNome.getText());
            produto.setQtdAumento(Double.valueOf(jTAumento.getText().replace(",", ".")));
            try {
                ProdutoBO.save(produto); 
                if(listPro != null){
                listPro.dadosTabela();
                listPro.atualizaLinhaSelecionada();    
                listPro.tabelaVazia();
                }
                JOptionPane.showMessageDialog(null, "Sucesso ao salvar o registro\n", "Salvo com sucesso", 1);
                 
                int escolha = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo produto ?", "Novo produto", JOptionPane.YES_NO_OPTION);
                if (escolha == 0) {                    
                    limpaCampos();
//                    jTId.setText("" + LastID.atualizaId("id_produto", "produto"));
                    jTId.requestFocus();
                } else {
                    if (telaMenu != null) {
                        telaMenu.setEnabled(true);
                    } else if (listPro != null) {
                        listPro.setEnabled(true);
                    } else if (cadVenda != null) {
                        cadVenda.setEnabled(true);
                        cadVenda.jFidActionPerformed();
                    }
                    this.dispose();
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar o produto "+produto.getNome(), "Erro", 0);
            }
            
        }

    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
          if (verificarCampos()) {
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "DADOS NÂO SALVOS", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                if (telaMenu != null) {
                    telaMenu.setEnabled(true);
                } else if (listPro != null) {
                    listPro.setEnabled(true);
                }else if (cadVenda != null) {
                    cadVenda.setEnabled(true);
                }
                this.dispose();
            }
        } else {

            if (telaMenu != null) {
                telaMenu.setEnabled(true);
            } else if (listPro != null) {
                listPro.setEnabled(true);
            }else if (cadVenda != null) {
                    cadVenda.setEnabled(true);
                }
            this.dispose();
        } 
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTValorUnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorUnitarioKeyReleased
        if(jTValorUnitario.getText().isEmpty() || jTValorUnitario.getText() == null){
            jTAumento.setText(null);
            jTValorVenda.setText(null);
            jTAumento.setEditable(false);
        }else{
            jTAumento.setEditable(true);
        }
    }//GEN-LAST:event_jTValorUnitarioKeyReleased

    private void jTAumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAumentoKeyReleased
         if(jTAumento.getText().isEmpty() || jTAumento.getText() == null){
             jTValorVenda.setText(null);
        }
    }//GEN-LAST:event_jTAumentoKeyReleased

    private void jTAumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAumentoFocusLost
        if (!jTAumento.getText().isEmpty() && jTAumento.getText() != (null)) {
            double valorAumento = ((Double.valueOf(jTAumento.getText().replace(",", ".")) / 100) * Double.valueOf(jTValorUnitario.getText().replace(",", "."))) + Double.valueOf(jTValorUnitario.getText().replace(",", "."));
            BigDecimal bd = new BigDecimal(valorAumento).setScale(2, RoundingMode.HALF_EVEN);
            jTValorVenda.setText("" + bd.doubleValue());
        }
    }//GEN-LAST:event_jTAumentoFocusLost

    private void jTQuantidadeMinimaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTQuantidadeMinimaFocusLost
        if(jTQuantidadeMinima.getText().isEmpty() || jTQuantidadeMinima.getText() == (null) ) {
            jTQuantidadeMinima.setText(null);
        }else if((Double.valueOf(jTQuantidadeMinima.getText()) > Double.valueOf(jTQuantidade.getText()))){
           JOptionPane.showMessageDialog(null, "Quantidade Minima maior que Quantidade", "Atenção", 2);
           jTQuantidadeMinima.setText(null);
           jTQuantidadeMinima.requestFocus();
       }
    }//GEN-LAST:event_jTQuantidadeMinimaFocusLost

    private void jTQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQuantidadeKeyTyped
       String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
       }
    }//GEN-LAST:event_jTQuantidadeKeyTyped

    private void jTQuantidadeMinimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQuantidadeMinimaKeyTyped
         String caracteres="0987654321.";
         if(!caracteres.contains(evt.getKeyChar()+"")){
         evt.consume();
         }
    }//GEN-LAST:event_jTQuantidadeMinimaKeyTyped

    private void jTValorUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorUnitarioKeyTyped
        String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
       }
    }//GEN-LAST:event_jTValorUnitarioKeyTyped

    private void jTAumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAumentoKeyTyped
       String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
       }
    }//GEN-LAST:event_jTAumentoKeyTyped

    private void jTQuantidadeMinimaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQuantidadeMinimaKeyReleased
       
    }//GEN-LAST:event_jTQuantidadeMinimaKeyReleased

    private void jTQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQuantidadeKeyReleased
       if(jTQuantidade.getText().isEmpty() || jTQuantidade.getText() == null){
           jTQuantidadeMinima.setEditable(false);
        }else{
            jTQuantidadeMinima.setEditable(true);
        }
    }//GEN-LAST:event_jTQuantidadeKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setEnabled(false);
        try {
            new CadFornecedorGUI(this).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CadProdutoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed
        jTNome.requestFocus();
    }//GEN-LAST:event_jTIdActionPerformed

    private void jCFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCFornecedorActionPerformed

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

    public void limpaCampos() {
        jTId.setText(null);
        jCFornecedor.setSelectedIndex(0);
        jTNome.setText(null);
        jTDescricao.setText(null);
        jTQuantidade.setText(null);
        jTQuantidadeMinima.setText(null);
        jTValorUnitario.setText(null);
        jTValorVenda.setText(null);
        jTAumento.setText(null);
        jTAumento.setEditable(false);
    }

    public boolean verificarCampos() {
        if(!jTNome.getText().isEmpty() || !jTDescricao.getText().isEmpty() || !jTQuantidade.getText().isEmpty() || !jTQuantidadeMinima.getText().isEmpty()
                || !jTValorUnitario.getText().isEmpty() || !jTAumento.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
     }
}

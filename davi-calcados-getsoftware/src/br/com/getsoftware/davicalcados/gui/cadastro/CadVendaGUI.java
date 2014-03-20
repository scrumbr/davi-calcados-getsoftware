/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.gui.cadastro;

import br.com.getsoftware.davicalcados.bo.ProdutoBO;
import br.com.getsoftware.davicalcados.entity.Cliente;
import br.com.getsoftware.davicalcados.entity.Produto;
import br.com.getsoftware.davicalcados.entity.Venda;
import br.com.getsoftware.davicalcados.gui.lista.ListClientesGUI;
import br.com.getsoftware.davicalcados.gui.lista.ListProdutosGUI;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Junior Oliveira
 */
public class CadVendaGUI extends javax.swing.JFrame {

    /**
     * Creates new form CadVendaGUI1
     */
    private final ArrayList<ItensCarrinho> itensCarrinho = new ArrayList<>();
    
    public CadVendaGUI() {
        initComponents();
        atualizaLinhaSelecionada();
//        jFid.requestFocus();

    }
    
    private Produto produto;
    public Produto getProduto() {
        return produto;
        
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public CadVendaGUI(Produto produto) {
        this();
        initComponents();
        this.produto = produto;
         setarValoresProduto();
         atualizaLinhaSelecionada();
//         jFid.requestFocus();
         
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CaixaGUI getCaixa() {
        return caixa;
    }

    public void setCaixa(CaixaGUI caixa) {
        this.caixa = caixa;
    }
    public void setarValoresProduto(){
        jFproduto.setText(produto.getNome());
        jFid.setText(""+produto.getIdProduto());
        jFvalor.setText("" + produto.getValorVenda());
        jFestoque.setText("" + produto.getQuantidade());
        jFquantidade.requestFocus();

    }
     
    private Cliente cliente;
    public CadVendaGUI(Cliente cliente) {
        this();
        initComponents();
        this.cliente = cliente;
        jFcliente.setText(cliente.getNome());
        atualizaLinhaSelecionada();
//        jFid.requestFocus();

    }
    public void setarValoresClient(){
         jFcliente.setText(cliente.getNome());
    }
    private CaixaGUI caixa;
    public CadVendaGUI(CaixaGUI caixa) {
        this();
        this.caixa = caixa;
//        jFid.requestFocus();
    }

    private int linhaSelecionada;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFcliente = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jBremover = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jBinserir = new javax.swing.JButton();
        jBaddProduto = new javax.swing.JButton();
        jFvalor = new javax.swing.JFormattedTextField();
        jFid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFproduto = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTobs = new javax.swing.JTextArea();
        jFestoque = new javax.swing.JFormattedTextField();
        jFquantidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBaddProduto1 = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBfinalizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLtotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de venda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cliente");

        jFcliente.setEditable(false);
        jFcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFcliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Quantidade em estoque");

        jBremover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/shop-cart-exclude-icon.png"))); // NOI18N
        jBremover.setText("remover");
        jBremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBremoverActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("ID do Produto");

        jBinserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/shop-cart-add-icon.png"))); // NOI18N
        jBinserir.setText("inserir");
        jBinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinserirActionPerformed(evt);
            }
        });

        jBaddProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Start-Menu-Search-icon.png"))); // NOI18N
        jBaddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddProdutoActionPerformed(evt);
            }
        });

        jFvalor.setEditable(false);
        jFvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFvalor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFvalorActionPerformed(evt);
            }
        });

        jFid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFidActionPerformed(evt);
            }
        });
        jFid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFidFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Valor");

        jFproduto.setEditable(false);
        jFproduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFproduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Observação");

        jTobs.setColumns(20);
        jTobs.setLineWrap(true);
        jTobs.setRows(5);
        jScrollPane2.setViewportView(jTobs);

        jFestoque.setEditable(false);
        jFestoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFestoque.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jFestoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFestoqueActionPerformed(evt);
            }
        });

        jFquantidade.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jFquantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFquantidadeKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Quantidade no carrinho");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Produto");

        jBaddProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/Start-Menu-Search-icon.png"))); // NOI18N
        jBaddProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddProduto1ActionPerformed(evt);
            }
        });

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/cancelar-32.png"))); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jFestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(292, 292, 292))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFcliente)
                                    .addComponent(jFproduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBaddProduto)
                                    .addComponent(jBaddProduto1))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFid, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jBinserir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBremover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBcancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBcancelar, jBinserir, jBremover});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBaddProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBaddProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBinserir, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jBremover, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBcancelar, jBinserir, jBremover});

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "PRODUTO", "QUANTIDADE", "PREÇO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

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
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jBfinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/getsoftware/davicalcados/icons/App-Catalog-icon.png"))); // NOI18N
        jBfinalizar.setText("FINALIZAR VENDA");
        jBfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Total Geral");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("R$");

        jLtotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLtotal.setText("00,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLtotal))
                    .addComponent(jBfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        setSize(new java.awt.Dimension(960, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBremoverActionPerformed
        removerCarrinho();
        mostraItensCarrinho();
        atualizaLinhaSelecionada();
        jFquantidade.setText(null);
    }//GEN-LAST:event_jBremoverActionPerformed

    private void jBinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinserirActionPerformed
        if(jFid.getText() == null || jFid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo 'ID do Produto' está vazio!", "Atenção!", 2);
            jFid.requestFocus();
        }else if(jFquantidade.getText() == null || jFquantidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo 'Quantidade no carrinho' está vazio!", "Atenção!", 2);
            jFquantidade.requestFocus();
        }
        else{
        inserirCarrinho();
        mostraItensCarrinho();
        atualizaLinhaSelecionada();
        limparCapos();
        }
    }//GEN-LAST:event_jBinserirActionPerformed

    private void jBaddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddProdutoActionPerformed
        try {
            new ListProdutosGUI(this).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os produtos", "Erro", 0);
            this.dispose();
        }
    }//GEN-LAST:event_jBaddProdutoActionPerformed

    private void jFvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFvalorActionPerformed

    private void jFestoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFestoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFestoqueActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        linhaSelecionada = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizarActionPerformed
        Venda venda = new Venda();
        venda.setDescricao(jTobs.getText());
        venda.setIdCliente(cliente.getIdCiente());
        venda.setIdFuncionario(linhaSelecionada);
//        venda.setIdVenda();
        ArrayList<String> listIdProdutos = new ArrayList();
        for (int i = 0; i < itensCarrinho.size(); i++) {
            listIdProdutos.add(itensCarrinho.get(i).getIdProduto());
        }
        venda.setListaIdProduto(listIdProdutos);
        //venda.setValorTotal(Double.valueOf(jLtotal.getText()));
        this.setEnabled(false);
        new FormaDePagamento(venda, this).setVisible(true);
        
    }//GEN-LAST:event_jBfinalizarActionPerformed

    private void jFquantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFquantidadeKeyReleased
         
    }//GEN-LAST:event_jFquantidadeKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        caixa.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void jBaddProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddProduto1ActionPerformed
        try {
            new ListClientesGUI(this).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os clientes", "Erro", 0);
            this.dispose();
        }
    }//GEN-LAST:event_jBaddProduto1ActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        this.dispose();
        caixa.setEnabled(true);
    }//GEN-LAST:event_jBcancelarActionPerformed

    public void jFidActionPerformed(){
        jFidActionPerformed(null);
    }
    
    private void jFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFidActionPerformed
        String cod = (jFid.getText());
        try {
            produto = ProdutoBO.getById(cod);
            if(produto == null){
                 int opc = JOptionPane.showConfirmDialog(null, "Produto não encontrado!\n\nDeseja cadastrá-lo gora ?","Atenção",JOptionPane.YES_NO_OPTION);
                 if(opc == JOptionPane.YES_OPTION){
                     this.setEnabled(false);
                     new CadProdutoGUI(this).setVisible(true);
                 }else{
                     limparCapos();
                 }
            }else{
                setarValoresProduto();
//                jFquantidade.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o produto","Erro",0);
            this.dispose();
        }
    }//GEN-LAST:event_jFidActionPerformed

    private void jFidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFidFocusGained
        if(jFid.getText() == null || jFid.getText().isEmpty()){
            limparCapos();
        }
    }//GEN-LAST:event_jFidFocusGained

    private void jFidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFidFocusLost
        if(jFid.getText() == null || jFid.getText().isEmpty()){
            limparCapos();
        }
    }//GEN-LAST:event_jFidFocusLost

    public void limparCapos(){
        jFquantidade.setText(null);
        jFproduto.setText(null);
        jFid.setText(null);
        jFvalor.setText(null);
        jFestoque.setText(null);
        jFid.requestFocus();
    }
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
            java.util.logging.Logger.getLogger(CadVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadVendaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaddProduto;
    private javax.swing.JButton jBaddProduto1;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBfinalizar;
    private javax.swing.JButton jBinserir;
    private javax.swing.JButton jBremover;
    private javax.swing.JFormattedTextField jFcliente;
    private javax.swing.JFormattedTextField jFestoque;
    private javax.swing.JTextField jFid;
    private javax.swing.JFormattedTextField jFproduto;
    private javax.swing.JTextField jFquantidade;
    private javax.swing.JFormattedTextField jFvalor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLtotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTobs;
    // End of variables declaration//GEN-END:variables

    public void inserirCarrinho() {
        ItensCarrinho itens = new ItensCarrinho();
        itens.setIdProduto(produto.getIdProduto());
        itens.setNome(produto.getNome());
        itens.setQuantidade(Integer.valueOf(jFquantidade.getText()));
        itens.setValorVenda(produto.getValorVenda());

        for (int i = 0; i < itensCarrinho.size(); i++) {
            if (itensCarrinho.get(i).equals(itens)) {
                itensCarrinho.get(i).setQuantidade(itensCarrinho.get(i).getQuantidade() + itens.getQuantidade());
                break;
            }
        }

        if (!itensCarrinho.contains(itens)) {
            itensCarrinho.add(itens);
        }

    }

      public void removerCarrinho() {
        ItensCarrinho itens = new ItensCarrinho();
        itens.setIdProduto((jTable1.getValueAt(linhaSelecionada, 0).toString()));
        itens.setNome(jTable1.getValueAt(linhaSelecionada, 1).toString());
        itens.setQuantidade(Integer.valueOf(jFquantidade.getText()));
        itens.setValorVenda(Double.valueOf(jTable1.getValueAt(linhaSelecionada, 3).toString()));

        for (int i = 0; i < itensCarrinho.size(); i++) {
             if (itensCarrinho.get(i).equals(itens)) {
                itensCarrinho.get(i).setQuantidade(itensCarrinho.get(i).getQuantidade() - itens.getQuantidade());
                break;
            }
        }

    }

      
    public void mostraItensCarrinho(){
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < itensCarrinho.size(); i++) {
            modelo.addRow(new Object[]{
                itensCarrinho.get(i).getIdProduto(),
                itensCarrinho.get(i).getNome(),
                itensCarrinho.get(i).getQuantidade(),
                itensCarrinho.get(i).getValorVenda(),
                itensCarrinho.get(i).getTotal()
            });
        }
    }
    
}

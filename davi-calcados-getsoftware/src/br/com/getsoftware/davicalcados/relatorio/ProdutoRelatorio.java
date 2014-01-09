/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.relatorio;

//import TIBD.gerenciadorDeAcademia.bo.GenericSQLBO;
//import java.util.HashMap;
//import javax.swing.JOptionPane;
//import net.sf.jasperreports.engine.JRResultSetDataSource;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author JUNIOR
 */
public class ProdutoRelatorio {

//    public ProdutoRelatorio() {
//        try {
//            
//            GenericSQLBO.genericQuery("select p.id_produto, f.NOME_FORNECEDOR, p.DESCRICAO_PRODUTO, "
//                    + " p.VALOR_PRODUTO, p.QUANTIDADE_MINIMA, p.ESTOQUE, p.data, p.status "
//                    + " from produto as p, fornecedor as f where f.id_fornecedor = p.id_fornecedor ");
//
//            JRResultSetDataSource jrRS = new JRResultSetDataSource( GenericSQLBO.genericResultSet());
//            
//            JasperPrint jasperPrint = JasperFillManager.fillReport(
//                    "src/TIBD/gerenciadorDeAcademia/relatorio/"
//                            + "produtos1.jasper", new HashMap(), jrRS);
//            
//            JasperViewer.viewReport(jasperPrint, false);
//
//        } catch (Exception erro) {
//
//            JOptionPane.showMessageDialog(null, "Erro ao carregar o relatório!\n" + erro,"Erro",0);
//        }
//
//    }
}

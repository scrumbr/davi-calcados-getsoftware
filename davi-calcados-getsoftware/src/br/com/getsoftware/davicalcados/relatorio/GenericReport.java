/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.relatorio;

import br.com.getsoftware.davicalcados.bo.GenericSQLBO;
import br.com.getsoftware.davicalcados.exception.FormatoSQLException;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Andrey Gois
 */
public class GenericReport {
    
     public GenericReport(String sql, String jasper) throws FormatoSQLException {
        try {
            GenericSQLBO.genericQuery(sql);
            JRResultSetDataSource jrRS = new JRResultSetDataSource( GenericSQLBO.genericResultSet());
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "src/br/com/getsoftware/davicalcados/relatorio/arquivosjasper/"
                            + jasper, new HashMap(), jrRS);
            
             JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            jasperViewer.setVisible(true);
        } catch (SQLException | JRException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o relatório!\n" + erro,"Erro",0);
        }
    }
}

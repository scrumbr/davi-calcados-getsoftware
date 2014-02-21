/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Junior Oliveira
 */
public class MeuRenderer extends JTable implements TableCellRenderer {  
  
  public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();  
  
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value,  
      boolean isSelected, boolean hasFocus, int row, int column) {  
  
    Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(  
        table, value, isSelected, hasFocus, row, column);  
   
    Color foreground, background;  
  
      if (table.getValueAt(row, 1).toString().equals("Entrada")) {  
        foreground = Color.black;  
        float[] x ={1,2,3};
    background = Color.getHSBColor(10, 255, 255);   
      } else {  
        foreground = Color.black;  
        background = Color.getHSBColor(10, 50, 255);  
  
      }  
  
    renderer.setForeground(foreground);  
    renderer.setBackground(background);  
    return renderer;  
  }  
} 

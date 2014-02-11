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
public class MeuRenderer implements TableCellRenderer {  
  
  public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();  
  
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value,  
      boolean isSelected, boolean hasFocus, int row, int column) {  
  
    Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(  
        table, value, isSelected, hasFocus, row, column);  
  
    ((JLabel) renderer).setOpaque(true);  
  
    Color foreground, background;  
  
      if (row % 2 == 0) {  
        foreground = Color.black;  
        background = Color.white;  
  
      } else {  
        foreground = Color.black;  
        background = Color.getHSBColor(10, 50, 255);  
  
      }  
  
    renderer.setForeground(foreground);  
    renderer.setBackground(background);  
    return renderer;  
  
  }  
} 

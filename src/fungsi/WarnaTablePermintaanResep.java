/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Owner
 */
public class WarnaTablePermintaanResep extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row % 2 == 1){
            component.setBackground(new Color(255,244,244));
            component.setForeground(new Color(50,50,50));
        }else{
            component.setBackground(new Color(255,255,255));
            component.setForeground(new Color(50,50,50));
        } 
        if(table.getValueAt(row,7).toString().equals("Sudah Terlayani")){
            component.setBackground(new Color(195, 235, 178));
            component.setForeground(new Color(50,50,50));
        }else if(table.getValueAt(row,7).toString().equals("Belum Terlayani")){
            component.setBackground(new Color(255,255,255));
            component.setForeground(new Color(50,50,50));
        }
        return component;
    }

}

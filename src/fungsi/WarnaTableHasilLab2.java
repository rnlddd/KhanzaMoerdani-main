package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class WarnaTableHasilLab2 extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Warna default berdasarkan baris ganjil/genap
        if (row % 2 == 1) {
            component.setBackground(new Color(255, 255, 255)); // Warna merah muda pucat untuk baris ganjil
            component.setForeground(new Color(50, 50, 50));   // Warna teks abu-abu gelap
        } else {
            component.setBackground(new Color(255, 255, 255)); // Warna putih untuk baris genap
            component.setForeground(new Color(50, 50, 50));   // Warna teks abu-abu gelap
        }
        
        // Pengecekan kolom Dokter/Paramedis (kolom ke-25, index 24)
        if (table.getColumnCount() > 6) {
            Object nilai_kritis = table.getValueAt(row, 6); // Kolom "Dokter/Paramedis" ada di index 24
            
            if (nilai_kritis != null) {
                String Pewarnaan_nilai_kritis = nilai_kritis.toString().toLowerCase();
                
                // Pengecekan apakah kolom tersebut mengandung "dr"
                if (Pewarnaan_nilai_kritis.equals("h")) {
                    component.setBackground(new Color(255, 0, 0)); // Warna latar hijau untuk "dr"
                    component.setForeground(new Color(255, 255, 255)); // Warna teks hitam
                }else if (Pewarnaan_nilai_kritis.equals("l")) {
                    component.setBackground(new Color(255, 0, 0)); // Warna latar merah untuk yang bukan "dr"
                    component.setForeground(new Color(255, 255, 255)); // Warna teks Hitam agar kontras
                }else{
                    if (row % 2 == 1) {
            component.setBackground(new Color(255, 244, 244)); // Warna merah muda pucat untuk baris ganjil
            component.setForeground(new Color(50, 50, 50));   // Warna teks abu-abu gelap
                } else {
            component.setBackground(new Color(255, 255, 255)); // Warna putih untuk baris genap
            component.setForeground(new Color(50, 50, 50));   // Warna teks abu-abu gelap
                     }
                }
            }
        }

        // Penanganan jika baris sedang dipilih
        if (isSelected) {
            component.setBackground(new Color(244, 244, 244)); // Warna biru untuk baris yang dipilih
            component.setForeground(Color.BLACK);           // Warna teks putih agar kontras
        }
        
        return component;
    }
}

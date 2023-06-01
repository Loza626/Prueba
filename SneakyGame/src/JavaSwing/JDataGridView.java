package JavaSwing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class JDataGridView extends JTable {

    
    public JDataGridView() {
        getTableHeader().setDefaultRenderer(new TableHeaderColor());
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, new TableCellColor());
    }

    public void FixTable(JScrollPane scroll){
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    }
    
    private class TableHeaderColor extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            
            //HeaderDesign
            com.setBackground(Color.BLUE);
            com.setForeground(Color.WHITE);
            com.setFont(new Font("Arial Black", Font.ITALIC, 14));
            return com;
        }
    }

    private class TableCellColor extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            
            //CellDesign
            setBorder(new EmptyBorder(0,5,0,5));
            com.setForeground(Color.white);
            com.setFont(new Font("Arial Black", Font.ITALIC, 12));
            if (isCellSelected(row, column)) {
                com.setBackground(Color.white);
                com.setForeground(Color.BLACK);
            } else {
                if (row % 2 == 0) {
                    com.setBackground(Color.gray);
                } else {
                    com.setBackground(Color.black);
                }
            }
            return com;
        }

    }

}

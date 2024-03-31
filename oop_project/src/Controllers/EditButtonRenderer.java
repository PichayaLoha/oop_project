package Controllers;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class EditButtonRenderer extends JButton implements TableCellRenderer {
    public EditButtonRenderer() {
        setOpaque(true);
        
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        System.out.println("yo");
        setText("Edit");
        return this;
    }
}

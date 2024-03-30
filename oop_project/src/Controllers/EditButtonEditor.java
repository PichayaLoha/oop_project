package Controllers;

import View.BillEditForm;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class EditButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
    private JButton button;
    private String value;
    private JTable table;

    public EditButtonEditor(JTable table) {
        this.table = table;
        button = new JButton("Edit");
        button.addActionListener(this);
    }

    @Override
    public Object getCellEditorValue() {
        return value;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.value = "Edit";
        button.setText(this.value);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
        new BillEditForm();
    }
}

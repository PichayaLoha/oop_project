package Controllers;
import java.awt.Component;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditButtonEditor extends DefaultCellEditor implements ActionListener {
    private JButton button;
    private String value;
    private JTable table;
    private int pay_id;

    public EditButtonEditor() {
        super(new JTextField());
        button = new JButton("Edit");
        button.addActionListener(this);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
    }

    // Implement actionPerformed method to handle button click event
    @Override
    public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
        // Perform actions when button is clicked
        // For example, you can access pay_id using this.pay_id
        System.out.println("Edit button clicked for pay_id: " + pay_id);
    }

    // Override getTableCellEditorComponent method to return button
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.table = table;
        this.value = (String) value;
        this.pay_id = Integer.parseInt(table.getValueAt(row, column).toString());
        return button;
    }

    // Override getCellEditorValue method
    @Override
    public Object getCellEditorValue() {
        return value;
    }
}

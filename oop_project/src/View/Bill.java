package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class Bill implements ActionListener {
    private JInternalFrame inFrame;
    private JPanel borderPanel, flowPanel;
    private JTable billTable;
    private JScrollPane scrollPane;
    private JComboBox<String> monthComboBox;
    private String[] months = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
    private String[][] data;
    private String[] columns = {"room number", "Status room", "water meter", "Amount-Water[Baht]", 
                                "Electricity meter", "Amount-Elec[Baht]", "Total amount", "Common fee", 
                                "Rent", "Total cost", "Status", "Edit"};
    private JComboBox<String> statusComboBox;
    private String[] statusList = {"Paid", "Not yet paid", "No status"};
    private int currentFloor = 1;
    private JButton nextPage, previousPage;
    private JLabel page;
    
    public Bill() {
        inFrame = new JInternalFrame();
        borderPanel = new JPanel(new BorderLayout());
        flowPanel = new JPanel(new FlowLayout());
        monthComboBox = new JComboBox<>(months);
        billTable = new JTable();
        scrollPane = new JScrollPane(billTable);
        nextPage = new JButton(">>>");
        previousPage = new JButton("<<<");
        page = new JLabel("Floor" + currentFloor);
        statusComboBox = new JComboBox<>(statusList);
        
        monthComboBox.addActionListener(this);
        previousPage.addActionListener(this);
        nextPage.addActionListener(this);
        
        flowPanel.add(previousPage);
        flowPanel.add(page);
        flowPanel.add(nextPage);
        monthComboBox.add(statusComboBox);
        borderPanel.add(monthComboBox, BorderLayout.NORTH);
        borderPanel.add(scrollPane, BorderLayout.CENTER);
        borderPanel.add(flowPanel, BorderLayout.SOUTH);
        inFrame.add(borderPanel);
        inFrame.setPreferredSize(new Dimension(970, 650));
        inFrame.setVisible(true);
        inFrame.pack();

        inFrame.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) inFrame.getUI();
        ui.setNorthPane(null);
    }
    
    public JInternalFrame getInternalFrame() {
        return inFrame;
    }

    public void updateTable(int monthIndesx) {
        TableColumn statusColumn = billTable.getColumnModel().getColumn(10);
        statusColumn.setCellEditor(new DefaultCellEditor(statusComboBox));
        DefaultTableModel model = new DefaultTableModel(data, columns);
        billTable.setModel(model);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(monthComboBox)) {
            updateTable(monthComboBox.getSelectedIndex());
        }else if (source.equals(previousPage)) {
            if (currentFloor > 1) {
                currentFloor --;
                page.removeAll();
                page.setText("Floor" + currentFloor);
            }
            
        }else if (source.equals(nextPage)) {
            currentFloor ++;
            page.removeAll();
            page.setText("Floor" + currentFloor);
        }
    }

    
    
}

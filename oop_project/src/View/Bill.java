package View;

import Models.DataBill;
//import Controllers.DataBill;
import Controllers.EditButtonEditor;
import Controllers.EditButtonRenderer;
import Controllers.UpdateTable;
import Models.BillModel;
import Models.DataInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
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
                                "Total cost", "Status", "Edit"};
    private JComboBox<String> statusComboBox;
    private String[] statusList = {"Paid", "Not yet paid", "No status"};
    private int currentFloor = 1;
    private JButton nextPage, previousPage;
    private JLabel page;
    
    public Bill() {
//        JFrame fr = new JFrame();
//        JDesktopPane ds = new JDesktopPane();
        
        inFrame = new JInternalFrame();
        borderPanel = new JPanel(new BorderLayout());
        flowPanel = new JPanel(new FlowLayout());
        monthComboBox = new JComboBox<>(months);
        billTable = new JTable();
        scrollPane = new JScrollPane(billTable);
        nextPage = new JButton(">>>");
        previousPage = new JButton("<<<");
        page = new JLabel("Floor" + currentFloor);
        
        monthComboBox.addActionListener(this);
        previousPage.addActionListener(this);
        nextPage.addActionListener(this);
        
        flowPanel.add(previousPage);
        flowPanel.add(page);
        flowPanel.add(nextPage);
        borderPanel.add(monthComboBox, BorderLayout.NORTH);
        borderPanel.add(scrollPane, BorderLayout.CENTER);
        borderPanel.add(flowPanel, BorderLayout.SOUTH);
        inFrame.add(borderPanel);
        inFrame.setPreferredSize(new Dimension(970, 607));
        inFrame.setVisible(true);
        inFrame.pack();
        
//        ds.add(inFrame);
//        fr.add(ds);
//        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        fr.setPreferredSize(new Dimension(1280, 720));
//        fr.pack();
//        fr.setVisible(true);
        
        inFrame.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) inFrame.getUI();
        ui.setNorthPane(null);
    }
    
    public JInternalFrame getInternalFrame() {
        return inFrame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(monthComboBox)) {
            BillModel databill = new BillModel(monthComboBox.getSelectedIndex() + 1);
            ArrayList<DataInfo> datalist = databill.getDataList();

            DefaultTableModel model = new DefaultTableModel(columns, 0);

            for (int i = 0; i < datalist.size(); i++) {
                DataInfo data = datalist.get(i);
                Object[] row = new Object[11];
                row[0] = data.getroom_number();
                row[1] = data.getroom_status();
                row[2] = data.getw_meter();
                row[3] = data.getpay_water_cost();
                row[4] = data.gete_meter();
                row[5] = data.getpay_elec_cost();
                row[6] = data.getpay_room_cost();
                row[7] = data.getcommon_fee();
                row[8] = data.getpay_total_cost();
                row[9] = data.getpay_status();
                row[10] = data.getbtn();
                model.addRow(row);
            }
            billTable.setModel(model);
            int columnIndexOfButton = columns.length - 1;
            for (int row = 0; row < billTable.getRowCount(); row++) {
                System.out.println(billTable.getValueAt(row, columnIndexOfButton));
                if (billTable.getValueAt(row, columnIndexOfButton) == null) {
                    System.out.println("okkk");
                    billTable.getColumnModel().getColumn(columnIndexOfButton).setCellRenderer(new EditButtonRenderer());
                    billTable.getColumnModel().getColumn(columnIndexOfButton).setCellEditor(new EditButtonEditor(billTable));
                }
            }
            

            
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
    
//    public static void main(String[] args) {
//        new Bill();
//    }
 
    
}

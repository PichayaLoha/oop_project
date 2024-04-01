package View;

import Models.BillModel;
import Models.DataInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Bill implements ActionListener, MouseListener {
    private JInternalFrame inFrame;
    private JPanel topPanel, downPanel, mainPanel;
    private JTable billTable;
    private JScrollPane scrollPane;
    private JComboBox<String> monthComboBox;
    private String[] months = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
    private String[][] data;
    private String[] columns = {"room number", "Status room", "water meter", "Amount-Water[Baht]", 
                                "Electricity meter", "Amount-Elec[Baht]", "Total amount", "Common fee", 
                                "Total cost", "Status", "ID"};
    private JButton update;
    private JLabel page, img1;
    private int id;
    private BillModel bb;
    
    public Bill() {
        inFrame = new JInternalFrame();
        topPanel = new JPanel(new BorderLayout());
        mainPanel = new JPanel(new BorderLayout());
        downPanel = new JPanel(new FlowLayout());
        downPanel.setBackground(new Color(255, 204, 255));
        monthComboBox = new JComboBox<>(months);
        billTable = new JTable();
        billTable.setBackground(new Color(204, 204, 255));
        billTable.setGridColor(new Color(204, 204, 255));
        billTable.setRowHeight(25);
        scrollPane = new JScrollPane(billTable);
        update = new JButton("Update");
        
        monthComboBox.addActionListener(this);
        update.addActionListener(this);

        topPanel.add(monthComboBox, BorderLayout.NORTH);
        topPanel.add(scrollPane, BorderLayout.CENTER);
        topPanel.add(downPanel, BorderLayout.SOUTH);
        downPanel.add(update);
        mainPanel.add(topPanel, BorderLayout.CENTER);
        
        inFrame.add(topPanel);
        inFrame.setPreferredSize(new Dimension(970, 607));
        inFrame.setVisible(true);
        inFrame.pack();
        
        billTable.addMouseListener(this);
        
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
            BillModel databill = new BillModel();
            databill.BillModel_Month(monthComboBox.getSelectedIndex() + 1);
            ArrayList<DataInfo> datalist = databill.getDataList();

        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
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
                row[10] = data.getpay_id();
                model.addRow(row);
            }
        billTable.setModel(model);
        }else if (source.equals(update)) {
            BillModel databill = new BillModel();
            databill.BillModel_Month(monthComboBox.getSelectedIndex() + 1);
            ArrayList<DataInfo> datalist = databill.getDataList();

            DefaultTableModel model = new DefaultTableModel(columns, 0);
            for (DataInfo data : datalist) {
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
                row[10] = data.getpay_id();
                model.addRow(row);
                System.out.println(1);
            }
        billTable.setModel(model);
        }
    }
    
    public static void main(String[] args) {
        new Bill();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) {
            JTable target = (JTable) e.getSource();
            int row = target.getSelectedRow();
            int id = (int) target.getValueAt(row, columns.length - 1);
            new BillEditForm().setBillEditForm(id);
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
 
    
}

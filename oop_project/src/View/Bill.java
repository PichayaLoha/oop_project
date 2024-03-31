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
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Bill implements ActionListener, MouseListener {
    private JInternalFrame inFrame;
    private JPanel topPanel, westPanel, mainPanel, eastPanel;
    private JTable billTable;
    private JScrollPane scrollPane;
    private JComboBox<String> monthComboBox;
    private String[] months = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
    private String[][] data;
    private String[] columns = {"room number", "Status room", "water meter", "Amount-Water[Baht]", 
                                "Electricity meter", "Amount-Elec[Baht]", "Total amount", "Common fee", 
                                "Total cost", "Status", "ID"};
    private JComboBox<String> statusComboBox;
    private String[] statusList = {"Paid", "Not yet paid", "No status"};
    private int currentFloor = 1;
    private JButton nextPage, previousPage;
    private JLabel page, img1;
    private int id;
    private BillEditForm billEditForm;
    
    public Bill() {
        JFrame fr = new JFrame();
        JDesktopPane ds = new JDesktopPane();

        inFrame = new JInternalFrame();
        topPanel = new JPanel(new BorderLayout());
        mainPanel = new JPanel(new BorderLayout());
        westPanel = new JPanel();
        eastPanel = new JPanel(new GridLayout());
        monthComboBox = new JComboBox<>(months);
        billTable = new JTable();
        scrollPane = new JScrollPane(billTable);
        previousPage = new JButton("<<<");

        
        monthComboBox.addActionListener(this);
        previousPage.addActionListener(this);

        topPanel.add(monthComboBox, BorderLayout.NORTH);
        topPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(topPanel, BorderLayout.NORTH);
        inFrame.add(topPanel);
        inFrame.setPreferredSize(new Dimension(970, 607));
        inFrame.setVisible(true);
        inFrame.pack();
        
        ds.add(inFrame);
        fr.add(ds);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setPreferredSize(new Dimension(1280, 720));
        fr.pack();
        fr.setVisible(true);
        
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
            databill.setBill_m(monthComboBox.getSelectedIndex() + 1);
            ArrayList<DataInfo> datalist = databill.getDataList();

        DefaultTableModel model = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {
                return column == 2 || column == 4;
            }
        };
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
            System.out.println(id);
            billEditForm.setBillEditForm(id);
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

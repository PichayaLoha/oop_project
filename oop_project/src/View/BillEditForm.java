package View;

import Models.BillModel;
import Models.BillModel;
import Models.Cal_Eleccost;
import Models.Cal_Watercost;
import Models.DataInfo;
import Models.DataInfo;
import Models.TotalCost;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class BillEditForm  {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JTextField tfrn, tfs, tfw, tfwa, tfe, tfea, tfc, tfr, tft, tfta;
    private JLabel lbed, lbrn, lbs, lbw, lbwa, lbe, lbea, lbc, lbr, lbt, lbta, lbsp;
    private JComboBox cb;
    private DataInfo data;
    private int id;
    private ArrayList<DataInfo> arr = new BillModel().getDataList();

    public BillEditForm() {
        fr = new JFrame("Edit Bill");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        lbed = new JLabel("Edit");
        lbrn = new JLabel("Room number");
        lbs = new JLabel("Room status");
        lbw = new JLabel("Water meter");
        lbwa = new JLabel("Water cost");
        lbe = new JLabel("Electric meter");
        lbea = new JLabel("Electric cost");
        lbc = new JLabel("Common");
        lbr = new JLabel("Rent");
        lbta = new JLabel("Total cost");
        lbsp = new JLabel("Status pay");
        tfrn = new JTextField(); //room num
        tfrn.setEditable(false);
        tfs = new JTextField(); //room sta
        tfs.setEditable(false);
        tfw = new JTextField(); //w m
        tfwa = new JTextField(); //wa
        tfwa.setEditable(false);
        tfe = new JTextField(); //e m
        tfea = new JTextField(); // ea
        tfea.setEditable(false);
        tfc = new JTextField(); //common
        tfc.setEditable(false);
        tfr = new JTextField(); // rent
        tfr.setEditable(false);
        tfta = new JTextField(); // tt c
        tfta.setEditable(false);

        cb = new JComboBox(); //sta pay

        
        fr.setLayout(new BorderLayout());
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setPreferredSize(new Dimension(500, 250));
        fr.add(p1, BorderLayout.NORTH);
        p1.add(lbed);
        
        fr.add(p2, BorderLayout.CENTER);
        p2.setLayout(new GridLayout(5, 2));
        p2.add(lbrn);
        p2.add(tfrn);
        p2.add(lbs);
        p2.add(tfs);
        p2.add(lbw);
        p2.add(tfw);
        p2.add(lbwa);
        p2.add(tfwa);
        p2.add(lbe);
        p2.add(tfe);
        p2.add(lbea);
        p2.add(tfea);
        p2.add(lbc);
        p2.add(tfc);
        p2.add(lbr);
        p2.add(tfr);
        p2.add(lbsp);
        p2.add(cb);
        p2.add(lbta);
        p2.add(tfta);
        
        fr.add(p3, BorderLayout.SOUTH);
        fr.setLocation(500, 340);
        fr.pack();
        fr.setVisible(true);
    }
    
    public void setBillEditForm(int id) {
        this.id = id;
        BillModel databill = new BillModel();
        databill.setBillModel_id(id);
        data = databill.getData();
        tfrn.setText(data.getroom_number());
        tfs.setText(data.getroom_status());
        if (data.getroom_status().equals("Inactive") && data.getpay_status().equals("paid")) {     
            cb.addItem("paid");
        }else if ((data.getroom_status().equals("Inactive")) && (data.getpay_status().equals("notpaid"))) {
            cb.addItem("notpaid");
            cb.addItem("paid");
        }else if ((data.getroom_status().equals("active"))) {
            cb.addItem("notpaid");
        }
        tfw.setText(String.valueOf(data.getw_meter()));
        tfwa.setText(String.valueOf(data.getpay_water_cost()));
        tfe.setText(String.valueOf(data.gete_meter()));
        tfea.setText(String.valueOf(data.getpay_elec_cost()));
        tfc.setText(String.valueOf(data.getcommon_fee()));
        tfr.setText(String.valueOf(data.getpay_room_cost()));
        cb.setSelectedItem(data.getpay_status());
        tfta.setText(String.valueOf(data.getpay_total_cost())); 
        
        String check = (String) cb.getSelectedItem();
        if (check.equals("paid")) {
            tfw.setEditable(false);
            tfe.setEditable(false);
            cb.setEditable(false);
        }else {
            JButton ok = new JButton("UPDATE");
            p3.add(ok);
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Object source = e.getSource();
                    if (source.equals(ok)) {
                        if (tfw.getText().isEmpty() || tfe.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please fill in information!", "", JOptionPane.ERROR_MESSAGE);
                        } else {
                            try {
                                int water_meter = (int) Double.parseDouble(tfw.getText());
                                int elec_meter = (int) Double.parseDouble(tfe.getText());
                                int roomcost = (int) Double.parseDouble(tfr.getText());
                                int common = (int) Double.parseDouble(tfc.getText());
                                
                                Cal_Watercost wcost = new Cal_Watercost(water_meter);
                                int waterCost = wcost.CalculateCost();
                                Cal_Eleccost ecost = new Cal_Eleccost(elec_meter);
                                int elecCost = ecost.CalculateCost();

                                TotalCost total = new TotalCost(water_meter, elec_meter, common, roomcost);
                                int totalCost = total.CalculateCost();

                                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to edit the information?", "Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                if (confirm == JOptionPane.YES_OPTION) {
                                    int pay_id = id;
                                    String room_number = tfrn.getText();
                                    String room_status = tfs.getText();
                                    int wmeter = (int) Double.parseDouble(tfw.getText());
                                    int emeter = (int) Double.parseDouble(tfe.getText());
                                    int rentc = (int) Double.parseDouble(tfr.getText());
                                    int comm = (int) Double.parseDouble(tfc.getText());
                                    String stastusc = (String) cb.getSelectedItem();
                                    new BillModel().updateBillModel(pay_id, room_number, room_status, wmeter, waterCost, emeter, elecCost, rentc, comm, totalCost, stastusc);

                                    JOptionPane.showMessageDialog(null, "Data update successfully.");
                                    tfwa.setText(String.valueOf(waterCost));
                                    tfea.setText(String.valueOf(elecCost));
                                    cb.setSelectedItem(source);
                                    tfta.setText(String.valueOf(totalCost));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Failed to update data.", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }

                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Please enter numerical information!", "", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });
        }
    }
}


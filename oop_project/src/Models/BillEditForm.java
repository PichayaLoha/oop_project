package Models;

import Models.BillModel;
import Models.DataInfo;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class BillEditForm implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JTextField tfrn, tfs, tfw, tfwa, tfe, tfea, tfc, tfr, tft, tfta;
    private JLabel lbed, lbrn, lbs, lbw, lbwa, lbe, lbea, lbc, lbr, lbt, lbta, lbsp;
    private JComboBox cb;
    private JButton ok, cancel;
    private DataInfo data;

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
//        tfrn.setText(String.valueOf(id));
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
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        cb = new JComboBox(); //sta pay
        cb.addItem("paid");
        cb.addItem("notpaid");
        cb.addItem("nostatus");
        
        fr.setLayout(new BorderLayout());
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
        p3.add(ok); p3.add(cancel);

        fr.pack();
        fr.setVisible(true);
        
        cancel.addActionListener(this);  
    }
    
    public void setBillEditForm(int id) {
        BillModel databill = new BillModel();
        databill.setBillModel_id(id);
        data = databill.getData();
        tfrn.setText(data.getroom_number());
        tfs.setText(data.getroom_status());
        tfw.setText(String.valueOf(data.getw_meter()));
        tfwa.setText(String.valueOf(data.getpay_water_cost()));
        tfe.setText(String.valueOf(data.gete_meter()));
        tfea.setText(String.valueOf(data.getpay_elec_cost()));
        tfc.setText(String.valueOf(data.getcommon_fee()));
        tfr.setText(String.valueOf(data.getpay_room_cost()));
        cb.setSelectedItem(data.getpay_status());
        tfta.setText(String.valueOf(data.getpay_total_cost()));
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(ok)) {
            if (tfw.getText().isEmpty() || tfe.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in information!", "", JOptionPane.ERROR_MESSAGE);
            }else {
                try {
                    double water_meter = Double.parseDouble(tfw.getText());
                    double elec_meter = Double.parseDouble(tfe.getText());
                    double roomcost = Double.parseDouble(tfr.getText());
                    double common = Double.parseDouble(tfc.getText());
                    
                    Cal_Watercost c = new Cal_Watercost(water_meter);
                    
                    System.out.println();
                    
//                    tfwa.setText(t);
//                    tfea.setText(t);
//                    tfta.setText(t);
                    
                    
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter numerical information!", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if (source.equals(cancel)) {
            fr.dispose();
        }
    }
}
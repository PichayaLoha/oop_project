package View;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BillEditForm implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JTextField tfrn, tfs, tfw, tfwa, tfe, tfea, tfc, tfr, tft, tfta;
    private JLabel lbed, lbrn, lbs, lbw, lbwa, lbe, lbea, lbc, lbr, lbt, lbta, lbsp;
    private JComboBox cb;
    private JButton ok, cancel;

    public BillEditForm() {
        fr = new JFrame("Edit Bill");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        lbed = new JLabel("Edit");
        lbrn = new JLabel("Room number");
        lbs = new JLabel("Room status");
        lbw = new JLabel("Water meter");
        lbwa = new JLabel("Water amount");
        lbe = new JLabel("Electric meter");
        lbea = new JLabel("Electric amount");
        lbc = new JLabel("Common");
        lbr = new JLabel("Rent");
        lbt = new JLabel("Total w+e");
        lbta = new JLabel("Total amount");
        lbsp = new JLabel("Status pay");
        tfrn = new JTextField();
        tfrn.setEditable(false);
        tfs = new JTextField();
        tfs.setEditable(false);
        tfw = new JTextField();
        tfwa = new JTextField();
        tfwa.setEditable(false);
        tfe = new JTextField();
        tfea = new JTextField();
        tfea.setEditable(false);
        tfc = new JTextField();
        tfc.setEditable(false);
        tfr = new JTextField();
        tfr.setEditable(false);
        tft = new JTextField();
        tft.setEditable(false);
        tfta = new JTextField();
        tfta.setEditable(false);
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        cb = new JComboBox();
        cb.addItem("Paid");
        cb.addItem("Not yet paid");
        cb.addItem("No status");
        
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
        p2.add(lbt);
        p2.add(tft);
        p2.add(lbta);
        p2.add(tfta);

        fr.add(p3, BorderLayout.SOUTH);
        p3.add(lbsp); p3.add(cb);
        p3.add(ok); p3.add(cancel);

        fr.pack();
        fr.setVisible(true);
        
        cancel.addActionListener(this);
    }
    public static void main(String[] args) {
        new BillEditForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(ok)) {
            
        }else if (source.equals(cancel)) {
            fr.dispose();
        }
    }
}
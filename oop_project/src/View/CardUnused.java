package View;

import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CardUnused extends javax.swing.JPanel {

    public CardUnused() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lb_roomnum = new javax.swing.JLabel();
        lb_phonenum = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        tf_phonenum = new javax.swing.JTextField();
        tf_date = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        btn_detail = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 242, 255));
        setForeground(new java.awt.Color(255, 241, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(395, 163));


        lb_roomnum.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_roomnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/RedStatusDot.png"))); // NOI18N
        lb_roomnum.setText("1-101");

        lb_phonenum.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lb_phonenum.setText("เบอร์โทรศัพท์:");

        lb_date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lb_date.setText("เข้าพักเมื่อ :");

        tf_phonenum.setEditable(false);
        tf_phonenum.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_phonenum.setText("");
        tf_phonenum.setToolTipText("");
        tf_phonenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phonenumActionPerformed(evt);
            }
        });

        tf_date.setEditable(false);
        tf_date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_date.setText("");

        tf_name.setEditable(false);
        tf_name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tf_name.setForeground(new java.awt.Color(78, 0, 151));
        tf_name.setText("name : สมชาย เทพซ่า");
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

         btn_detail.setBackground(new java.awt.Color(56, 53, 151));
        btn_detail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_detail.setForeground(new java.awt.Color(240, 224, 255));
        btn_detail.setText("Detail");
        
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lb_roomnum))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_phonenum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_phonenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(btn_detail)))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lb_roomnum)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_phonenum)
                    .addComponent(tf_phonenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_date)
                    .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_detail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void tf_phonenumActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {                                           
            detail dt = new detail();
            dt.setVisible(true);
    }                                          

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       


    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_detail;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_phonenum;
    private javax.swing.JLabel lb_roomnum;
    private javax.swing.JTextField tf_date;

    public JButton getBtn_detail() {
        return btn_detail;
    }

    public void setBtn_detail(JButton btn_detail) {
        this.btn_detail = btn_detail;
    }

    public JLabel getLb_date() {
        return lb_date;
    }

    public void setLb_date(JLabel lb_date) {
        this.lb_date = lb_date;
    }

    public JLabel getLb_phonenum() {
        return lb_phonenum;
    }

    public void setLb_phonenum(JLabel lb_phonenum) {
        this.lb_phonenum = lb_phonenum;
    }

    public JLabel getLb_roomnum() {
        return lb_roomnum;
    }

    public void setLb_roomnum(JLabel lb_roomnum) {
        this.lb_roomnum = lb_roomnum;
    }

    public JTextField getTf_date() {
        return tf_date;
    }

    public void setTf_date(JTextField tf_date) {
        this.tf_date = tf_date;
    }

    public JTextField getTf_name() {
        return tf_name;
    }

    public void setTf_name(JTextField tf_name) {
        this.tf_name = tf_name;
    }

    public JTextField getTf_phonenum() {
        return tf_phonenum;
    }

    public void setTf_phonenum(JTextField tf_phonenum) {
        this.tf_phonenum = tf_phonenum;
    }
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phonenum;
    // End of variables declaration                   
}

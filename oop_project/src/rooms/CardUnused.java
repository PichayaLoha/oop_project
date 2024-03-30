package rooms;

import java.awt.Graphics;

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_roomnum = new javax.swing.JLabel();
        lb_phonenum = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        tf_phonenum = new javax.swing.JTextField();
        tf_date = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        btn_detail = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setOpaque(false);

        lb_roomnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_roomnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/RedStatusDot.png"))); // NOI18N
        lb_roomnum.setText("1-101");

        lb_phonenum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_phonenum.setText("เบอร์โทรศัพท์");

        lb_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_date.setText("เข้าพักเมื่อ :");

        tf_phonenum.setEditable(false);
        tf_phonenum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_phonenum.setText("000-000-0000");
        tf_phonenum.setToolTipText("");
        tf_phonenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phonenumActionPerformed(evt);
            }
        });

        tf_date.setEditable(false);
        tf_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_date.setText("0/0/00");

        tf_name.setEditable(false);
        tf_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_name.setForeground(new java.awt.Color(78, 0, 151));
        tf_name.setText("name : สมชาย เทพซ่า");
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        btn_detail.setBackground(new java.awt.Color(56, 53, 151));
        btn_detail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
    }// </editor-fold>//GEN-END:initComponents

    private void tf_phonenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phonenumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phonenumActionPerformed

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailActionPerformed
            detail dt = new detail();
            dt.setVisible(true);
    }//GEN-LAST:event_btn_detailActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_detail;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_phonenum;
    private javax.swing.JLabel lb_roomnum;
    private javax.swing.JTextField tf_date;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phonenum;
    // End of variables declaration//GEN-END:variables
}

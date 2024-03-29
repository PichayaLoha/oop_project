package rooms;

import java.awt.Graphics;

public class card_room_empty extends javax.swing.JPanel {

    public card_room_empty() {
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
        tf_name = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(395, 163));

        lb_roomnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_roomnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/GreenStatusDot.png"))); // NOI18N
        lb_roomnum.setText("1-102");

        tf_name.setEditable(false);
        tf_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_name.setForeground(new java.awt.Color(78, 0, 151));
        tf_name.setText("name : empty");
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(56, 53, 151));
        btn_add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(240, 224, 255));
        btn_add.setText("+ Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_roomnum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(btn_add)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lb_roomnum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
            detail dt = new detail();
            dt.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel lb_roomnum;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables
}

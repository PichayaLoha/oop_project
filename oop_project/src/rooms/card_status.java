package rooms;

import java.awt.Graphics;

public class card_status extends javax.swing.JPanel {

    public card_status() {
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

        lbText = new javax.swing.JLabel();
        lbNum = new javax.swing.JLabel();

        setBackground(new java.awt.Color(187, 123, 203));
        setForeground(new java.awt.Color(196, 154, 236));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(100, 50));

        lbText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbText.setText("Room...");

        lbNum.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbNum.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(lbNum)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbText)
                    .addComponent(lbNum))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbText;
    // End of variables declaration//GEN-END:variables
}

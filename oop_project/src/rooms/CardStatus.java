package rooms;

import java.awt.Graphics;

public class CardStatus extends javax.swing.JPanel {

    public CardStatus() {
        initComponents();
        setOpaque(false);
    }
    
    public void setData(ModelStatus data){
        lbText.setText(data.getLbText());
        lbNum.setText(String.valueOf(data.getLbNum()));
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
        setPreferredSize(new java.awt.Dimension(200, 150));

        lbText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbText.setText("ห้อง");

        lbNum.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbNum.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNum)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbText)
                    .addComponent(lbNum))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbText;
    // End of variables declaration//GEN-END:variables
}

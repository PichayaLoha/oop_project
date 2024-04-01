package View;

import Models.UserModel;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CardRoomEmpty extends javax.swing.JPanel {

    public CardRoomEmpty() {
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
        btn_add = new javax.swing.JButton();
        lb_phonenum = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        lb_phonenum1 = new javax.swing.JLabel();
        lb_date1 = new javax.swing.JLabel();
        lb_date2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 242, 255));
        setForeground(new java.awt.Color(255, 241, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(460, 163));

        lb_roomnum.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lb_roomnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/GreenStatusDot.png"))); // NOI18N
        lb_roomnum.setText("1-101");

        btn_add.setBackground(new java.awt.Color(56, 53, 151));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(240, 224, 255));
        btn_add.setText("ADD");
        
       
        
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        lb_phonenum.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lb_phonenum.setText("Phone number :");

        lb_date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lb_date.setText("Check_in date :");

        lb_phonenum1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lb_phonenum1.setText("-");

        lb_date1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lb_date1.setText("-");

        lb_date2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lb_date2.setText("Vacant room");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_add)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lb_roomnum))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_phonenum, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_phonenum1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_date1))
                            .addComponent(lb_date2))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lb_roomnum)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_phonenum)
                    .addComponent(lb_phonenum1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_date)
                    .addComponent(lb_date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(lb_date2))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>                        

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {    
         UserModel model = new UserModel();
        String txt = lb_roomnum.getText();
        String roomnum = txt.substring(txt.indexOf("-") + 1);
       model.loadUserDetail1(roomnum);
      
            
    }                                       


    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_date1;
    private javax.swing.JLabel lb_date2;

    public JLabel getLb_date2() {
        return lb_date2;
    }

    public void setLb_date2(JLabel lb_date2) {
        this.lb_date2 = lb_date2;
    }
    private javax.swing.JLabel lb_phonenum;
    private javax.swing.JLabel lb_phonenum1;
    private javax.swing.JLabel lb_roomnum;
    // End of variables declaration                   

    public JButton getBtn_add() {
        return btn_add;
    }

    public void setBtn_add(JButton btn_add) {
        this.btn_add = btn_add;
    }

    public JLabel getLb_date() {
        return lb_date;
    }

    public void setLb_date(JLabel lb_date) {
        this.lb_date = lb_date;
    }

    public JLabel getLb_date1() {
        return lb_date1;
    }

    public void setLb_date1(JLabel lb_date1) {
        this.lb_date1 = lb_date1;
    }

    public JLabel getLb_phonenum() {
        return lb_phonenum;
    }

    public void setLb_phonenum(JLabel lb_phonenum) {
        this.lb_phonenum = lb_phonenum;
    }

    public JLabel getLb_phonenum1() {
        return lb_phonenum1;
    }

    public void setLb_phonenum1(JLabel lb_phonenum1) {
        this.lb_phonenum1 = lb_phonenum1;
    }

    public JLabel getLb_roomnum() {
        return lb_roomnum;
    }

    public void setLb_roomnum(JLabel lb_roomnum) {
        this.lb_roomnum = lb_roomnum;
    }
}

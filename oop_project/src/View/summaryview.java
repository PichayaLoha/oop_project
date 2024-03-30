
package View;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.css.RGBColor;


public class summaryview extends javax.swing.JInternalFrame {

    
    public summaryview() {
        initComponents();
        addRowToMonthTable();
        
    }
   
    
    private String month;
    int waterminus;
    int elecminus;
    int commonminus;
    int commonplus;
    int waterplus;
    int elecplus;
    int roomplus;
    int summ;

    
    public summaryview( int waterminus, int elecminus , int commonminus, int commonplus, int waterplus, int elecplus, int roomplus){
        this.waterminus = waterminus;
        this.elecminus = elecminus;
        this.commonminus = commonminus;
        this.commonplus = commonplus;
        this.waterplus = waterplus;
        this.elecplus = elecplus;
        this.roomplus = roomplus;
        this.summ = ( this.commonplus+this.waterplus+this.elecplus+this.roomplus-this.waterminus-this.elecminus-this.commonminus);
        
    }
    
    //public ArrayList ListMonth(){
     //   ArrayList<String> monthlist = new ArrayList<>();
     //  monthlist.add("January");monthlist.add("February");monthlist.add("March");monthlist.add("April");monthlist.add("May");monthlist.add("June");
    //  monthlist.add("July");monthlist.add("August");monthlist.add("September");monthlist.add("October");monthlist.add("November");monthlist.add("December");
     //   return monthlist;     
  //  }
   
     public ArrayList ListUsers(){//ADD Data to arraylist
        ArrayList<summaryview>list = new ArrayList<summaryview>();
        summaryview s1 = new summaryview( 4, 5, 7, 88, 88, 55, 22);
        summaryview s2 = new summaryview( 555, 5, 7, 88, 88, 55, 22);
        list.add(s1);
        list.add(s2);
        return list;
    }
     
    public void addRowToMonthTable(){
        DefaultTableModel tablemon = (DefaultTableModel) monthtable.getModel();
        ArrayList<summaryview> listmon = ListUsers();
        Object rowData[] = new Object[9];
        for (int i = 0; i < listmon.size(); i++) {
           // rowData[0] = listmon.get(i).waterminus; ไว้ใส่เดือนหรือถ้าไม่ใส่ก้ตัดออก
            rowData[1] = listmon.get(i).waterminus;
            rowData[2] = listmon.get(i).elecminus;
            rowData[3] = listmon.get(i).commonminus;
            rowData[4] = listmon.get(i).commonplus;
            rowData[5] = listmon.get(i).waterplus;
            rowData[6] = listmon.get(i).elecplus;
            rowData[7] = listmon.get(i).roomplus;
            rowData[8] = listmon.get(i).summ;
            tablemon.addRow(rowData);
        }
        
        
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        monthtable = new javax.swing.JTable();
        sssss = new javax.swing.JButton();
        outttt = new javax.swing.JTextField();
        elexc = new javax.swing.JButton();
        waaa = new javax.swing.JButton();
        outttt1 = new javax.swing.JTextField();
        outttt2 = new javax.swing.JTextField();
        rooom = new javax.swing.JButton();
        common = new javax.swing.JButton();
        outttt3 = new javax.swing.JTextField();
        outttt4 = new javax.swing.JTextField();
        revenue = new javax.swing.JButton();
        outtttree = new javax.swing.JTextField();
        expenses = new javax.swing.JButton();
        outtttexx = new javax.swing.JTextField();

        monthtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "month", "Govt Electric(baht)", "Govt Water(baht)", "Pay Common Area(baht)", "Dorm Electric(baht)", "Dorm Water(baht)", "Collect Common Area(baht)", "Room Charge(baht)", "Net Income(baht)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        monthtable.setShowGrid(true);
        jScrollPane1.setViewportView(monthtable);

        sssss.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sssss.setText("Income Statement");
        sssss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sssssActionPerformed(evt);
            }
        });

        outttt.setForeground(new java.awt.Color(51, 51, 51));
        outttt.setText("Income Statement");
        outttt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outtttActionPerformed(evt);
            }
        });

        elexc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        elexc.setText("Electric Bill");
        elexc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elexcActionPerformed(evt);
            }
        });

        waaa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        waaa.setText("Water Bill");
        waaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waaaActionPerformed(evt);
            }
        });

        outttt1.setForeground(new java.awt.Color(51, 51, 51));
        outttt1.setText("Electric Bill");
        outttt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outttt1ActionPerformed(evt);
            }
        });

        outttt2.setForeground(new java.awt.Color(51, 51, 51));
        outttt2.setText("Water Bill");
        outttt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outttt2ActionPerformed(evt);
            }
        });

        rooom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rooom.setText("Room Charge");
        rooom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rooomActionPerformed(evt);
            }
        });

        common.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        common.setText("Utility Bill");
        common.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commonActionPerformed(evt);
            }
        });

        outttt3.setForeground(new java.awt.Color(51, 51, 51));
        outttt3.setText("Utility Bill");
        outttt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outttt3ActionPerformed(evt);
            }
        });

        outttt4.setForeground(new java.awt.Color(51, 51, 51));
        outttt4.setText("Room Charge");
        outttt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outttt4ActionPerformed(evt);
            }
        });

        revenue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        revenue.setText("Income");
        revenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenueActionPerformed(evt);
            }
        });

        outtttree.setForeground(new java.awt.Color(51, 51, 51));
        outtttree.setText("Income");
        outtttree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outtttreeActionPerformed(evt);
            }
        });

        expenses.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        expenses.setText("expenses");
        expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expensesActionPerformed(evt);
            }
        });

        outtttexx.setForeground(new java.awt.Color(51, 51, 51));
        outtttexx.setText("expenses");
        outtttexx.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        outtttexx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outtttexxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(sssss, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(outttt, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elexc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waaa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(revenue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outttt1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outttt2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outtttree, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(outtttexx, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rooom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(outttt4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(common, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(outttt3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outttt1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elexc)
                    .addComponent(rooom)
                    .addComponent(outttt4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outttt3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waaa)
                    .addComponent(outttt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(common))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(revenue)
                    .addComponent(outtttree, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expenses)
                    .addComponent(outtttexx, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sssss)
                    .addComponent(outttt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sssssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sssssActionPerformed
        //summary
        if (evt.getSource().equals(sssss)) {
            int year = 0;

            for (int i = 0; i < monthtable.getRowCount(); i++) {
                year = year + Integer.parseInt(monthtable.getValueAt(i, 8).toString());
            }
            outttt.setText(Integer.toString(year)+" Baht");

       }
    }//GEN-LAST:event_sssssActionPerformed

    private void elexcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elexcActionPerformed
        
        //elecsum
        if (evt.getSource().equals(elexc)) {
            int elec = 0;

            for (int i = 0; i < monthtable.getRowCount(); i++) {
                elec = elec - Integer.parseInt(monthtable.getValueAt(i, 1).toString());
                elec = elec + Integer.parseInt(monthtable.getValueAt(i, 4).toString());
            }
            outttt1.setText(Integer.toString(elec)+" Baht");

       }
    }//GEN-LAST:event_elexcActionPerformed

    private void waaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waaaActionPerformed
       //watersum
        if (evt.getSource().equals(waaa)) {
            int waaaa = 0;

            for (int i = 0; i < monthtable.getRowCount(); i++) {
                waaaa = waaaa - Integer.parseInt(monthtable.getValueAt(i, 2).toString());
                waaaa = waaaa + Integer.parseInt(monthtable.getValueAt(i, 5).toString());
            }
            outttt2.setText(Integer.toString(waaaa)+" Baht");

       }
    }//GEN-LAST:event_waaaActionPerformed

    private void outttt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outttt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outttt1ActionPerformed

    private void outttt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outttt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outttt2ActionPerformed

    private void outtttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outtttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outtttActionPerformed

    private void rooomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rooomActionPerformed
          //roomsum
        if (evt.getSource().equals(rooom)) {
            int room = 0;

            for (int i = 0; i < monthtable.getRowCount(); i++) {
                room = room + Integer.parseInt(monthtable.getValueAt(i, 8).toString());
            }
            outttt4.setText(Integer.toString(room)+" Baht");

       }
    }//GEN-LAST:event_rooomActionPerformed

    private void commonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commonActionPerformed
       //commonsum
        if (evt.getSource().equals(common)) {
            int commm = 0;

            for (int i = 0; i < monthtable.getRowCount(); i++) {
                commm = commm - Integer.parseInt(monthtable.getValueAt(i, 2).toString());
                commm = commm + Integer.parseInt(monthtable.getValueAt(i, 5).toString());
            }
            outttt3.setText(Integer.toString(commm)+" Baht");

       }
    }//GEN-LAST:event_commonActionPerformed

    private void outttt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outttt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outttt4ActionPerformed

    private void revenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenueActionPerformed
         if (evt.getSource().equals(revenue)) {
            int revenue = 0;

            for (int i = 0; i < monthtable.getRowCount(); i++) {
                revenue = revenue + Integer.parseInt(monthtable.getValueAt(i, 4).toString());
                revenue = revenue + Integer.parseInt(monthtable.getValueAt(i, 5).toString());
                revenue = revenue + Integer.parseInt(monthtable.getValueAt(i, 6).toString());
                revenue = revenue + Integer.parseInt(monthtable.getValueAt(i, 7).toString());
            }
            outtttree.setText(Integer.toString(revenue)+" Baht");

       }
    }//GEN-LAST:event_revenueActionPerformed

    private void outtttreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outtttreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outtttreeActionPerformed

    private void expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expensesActionPerformed
        if (evt.getSource().equals(expenses)) {
            int expen = 0;

            for (int i = 0; i < monthtable.getRowCount(); i++) {
                expen = expen + Integer.parseInt(monthtable.getValueAt(i, 1).toString());
                expen = expen + Integer.parseInt(monthtable.getValueAt(i, 2).toString());
                expen = expen + Integer.parseInt(monthtable.getValueAt(i, 3).toString());  
            }
            outtttexx.setText(Integer.toString(expen)+" Baht");

       }
    }//GEN-LAST:event_expensesActionPerformed

    private void outtttexxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outtttexxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outtttexxActionPerformed

    private void outttt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outttt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outttt3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton common;
    private javax.swing.JButton elexc;
    private javax.swing.JButton expenses;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable monthtable;
    private javax.swing.JTextField outttt;
    private javax.swing.JTextField outttt1;
    private javax.swing.JTextField outttt2;
    private javax.swing.JTextField outttt3;
    private javax.swing.JTextField outttt4;
    private javax.swing.JTextField outtttexx;
    private javax.swing.JTextField outtttree;
    private javax.swing.JButton revenue;
    private javax.swing.JButton rooom;
    private javax.swing.JButton sssss;
    private javax.swing.JButton waaa;
    // End of variables declaration//GEN-END:variables
}
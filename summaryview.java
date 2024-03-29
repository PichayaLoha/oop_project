/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package test;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author kritsada
 */
public class summaryview extends javax.swing.JInternalFrame {

    /**
     * Creates new form summaryview
     */
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
    
    public ArrayList ListMonth(){
        ArrayList<String> monthlist = new ArrayList<>();
       monthlist.add("January");monthlist.add("February");monthlist.add("March");monthlist.add("April");monthlist.add("May");monthlist.add("June");
       monthlist.add("July");monthlist.add("August");monthlist.add("September");monthlist.add("October");monthlist.add("November");monthlist.add("December");
        return monthlist;     
    }
   
     public ArrayList ListUsers(){
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
           // rowData[0] = listmon.get(i).waterminus;
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

        monthtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "month", "minus elec cost", "minus water cost", "minus common cost", "plus elec cost", "plus water cost", "plus common cost", "plus room cost", "summary"
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
        sssss.setText("sum");
        sssss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sssssActionPerformed(evt);
            }
        });

        outttt.setText("summary");
        outttt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outtttActionPerformed(evt);
            }
        });

        elexc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        elexc.setText("electricity");
        elexc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elexcActionPerformed(evt);
            }
        });

        waaa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        waaa.setText("water");
        waaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waaaActionPerformed(evt);
            }
        });

        outttt1.setText("eleccost");
        outttt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outttt1ActionPerformed(evt);
            }
        });

        outttt2.setText("watercost");
        outttt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outttt2ActionPerformed(evt);
            }
        });

        rooom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rooom.setText("room");
        rooom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rooomActionPerformed(evt);
            }
        });

        common.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        common.setText("common");
        common.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commonActionPerformed(evt);
            }
        });

        outttt3.setText("commoncost");
        outttt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outttt3ActionPerformed(evt);
            }
        });

        outttt4.setText("roomcost");
        outttt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outttt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(sssss, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(outttt, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elexc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waaa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outttt1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outttt2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(common, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(outttt3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rooom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(outttt4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(elexc)
                    .addComponent(outttt1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rooom)
                    .addComponent(outttt4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(waaa)
                            .addComponent(outttt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(common))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sssss)
                            .addComponent(outttt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(outttt3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
            outttt.setText(Integer.toString(year));

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
            outttt1.setText(Integer.toString(elec));

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
            outttt2.setText(Integer.toString(waaaa));

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
            outttt4.setText(Integer.toString(room));

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
            outttt3.setText(Integer.toString(commm));

       }
    }//GEN-LAST:event_commonActionPerformed

    private void outttt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outttt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outttt3ActionPerformed

    private void outttt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outttt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outttt4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton common;
    private javax.swing.JButton elexc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable monthtable;
    private javax.swing.JTextField outttt;
    private javax.swing.JTextField outttt1;
    private javax.swing.JTextField outttt2;
    private javax.swing.JTextField outttt3;
    private javax.swing.JTextField outttt4;
    private javax.swing.JButton rooom;
    private javax.swing.JButton sssss;
    private javax.swing.JButton waaa;
    // End of variables declaration//GEN-END:variables
}

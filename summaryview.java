
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author kritsada
 */
public class summaryview extends javax.swing.JInternalFrame{

    /**
     * Creates new form summary
     */
    public summaryview() {
        initComponents();
        addRowToTable();
    }
    

    public int id, room_id, pay_room_cost, pay_water_cost, pay_elec_cost, pay_total_cost;
    public boolean pay_status;
    
    public summaryview(int id, int room_id, boolean pay_status, int pay_room_cost, int pay_water_cost, int pay_elec_cost, int pay_total_cost){
        this.id = id;
        this.room_id = room_id;
        this.pay_status = pay_status;
        this.pay_room_cost = pay_room_cost;
        this.pay_water_cost = pay_water_cost;
        this.pay_elec_cost = pay_elec_cost;
        this.pay_total_cost = pay_total_cost;
        
    }
     public ArrayList ListUsers(){
        ArrayList<summaryview>list = new ArrayList<summaryview>();
        summaryview s1 = new summaryview(4,223,true,33334,4434,5555,6666);
        summaryview s2 = new summaryview(4,223,true,33334,4434,5555,6666);
        summaryview s3 = new summaryview(4,223,true,33334,4434,5555,6666);
        summaryview s4 = new summaryview(4,223,true,33334,4434,5555,6666);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        return list;     
    }
    public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        ArrayList<summaryview> list = ListUsers();
        Object rowData[] = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).id;
            rowData[1] = list.get(i).room_id;
            rowData[2] = list.get(i).pay_room_cost;
            rowData[3] = list.get(i).pay_water_cost;
            rowData[4] = list.get(i).pay_elec_cost;
            rowData[5] = list.get(i).pay_total_cost;
            rowData[6] = list.get(i).pay_status;
            model.addRow(rowData);
        }
            //rowData[0] = list.get(j).id;
    }
     
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pay_id", "Room_id", "Pay_Status", "Pay_Room_Cost", "Pay_Water_Cost", "Pay_Elec_Cost", "Pay_Total_Cost", "Pay_Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pay_ID", "Room_ID", "Pay_Status", "Pay_Room_Cost", "Pay_Water_Cost", "Pay_Elec_Cost", "Pay_Total_Cost", "Pay_Date"
            }
        ));
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

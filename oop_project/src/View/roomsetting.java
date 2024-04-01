package View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

import java.util.concurrent.TimeUnit;
import java.sql.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Computer
 */
public class roomsetting extends javax.swing.JInternalFrame {

    private static final String DB_URL = "jdbc:mysql://localhost/oop";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    /**
     * Creates new form roomsettin
     */
    public roomsetting() {
        initComponents();
        displayRoomNumbers();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

    }

    private void displayRoomNumbers() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/oop", "root", ""); 
                Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery("SELECT room_number, user_firstname, user_lastname FROM rooms LEFT JOIN users ON rooms.user_id = users.user_id")) {

            
            while (rs.next()) {
                String roomNumber = rs.getString("room_number");
                String firstName = rs.getString("user_firstname");
                String lastName = rs.getString("user_lastname");
                switch (roomNumber) {
                    case "101":
                        unavaibleroom1.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom1.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom1.setEmptyRoom();
                        }
                        break;
                    case "102":
                        unavaibleroom2.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom2.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom2.setEmptyRoom();
                        }
                        break;
                    case "103":
                        unavaibleroom3.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom3.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom3.setEmptyRoom();
                        }
                        break;
                    case "201":
                        unavaibleroom4.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom4.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom4.setEmptyRoom();
                        }
                        break;
                    case "202":
                        unavaibleroom5.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom5.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom5.setEmptyRoom();
                        }
                        break;
                    case "203":
                        unavaibleroom6.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom6.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom6.setEmptyRoom();
                        }
                        break;
                    case "301":
                        unavaibleroom7.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom7.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom7.setEmptyRoom();
                        }
                        break;
                    case "302":
                        unavaibleroom8.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom8.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom8.setEmptyRoom();
                        }
                        break;
                    case "303":
                        unavaibleroom9.setRoomNumber(roomNumber);
                        if (firstName != null && lastName != null) {
                            unavaibleroom9.setUserNames(firstName, lastName);
                        } else {
                            unavaibleroom9.setEmptyRoom();
                        }
                        break;
                default:
                    break;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        unavaibleroom1 = new unavaibleroom();
        unavaibleroom2 = new unavaibleroom();
        unavaibleroom3 = new unavaibleroom();
        unavaibleroom4 = new unavaibleroom();
        unavaibleroom5 = new unavaibleroom();
        unavaibleroom6 = new unavaibleroom();
        unavaibleroom7 = new unavaibleroom();
        unavaibleroom8 = new unavaibleroom();
        unavaibleroom9 = new unavaibleroom();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBorder(null);
        setForeground(java.awt.Color.white);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(970, 607));
        setVisible(true);

        jScrollPane1.setBackground(new java.awt.Color(100, 80, 153));

        jPanel1.setBackground(new java.awt.Color(100, 80, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(660, 710));

        jPanel2.setBackground(new java.awt.Color(100, 80, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel2.add(unavaibleroom1);
        jPanel2.add(unavaibleroom2);
        jPanel2.add(unavaibleroom3);
        jPanel2.add(unavaibleroom4);
        jPanel2.add(unavaibleroom5);
        jPanel2.add(unavaibleroom6);
        jPanel2.add(unavaibleroom7);
        jPanel2.add(unavaibleroom8);
        jPanel2.add(unavaibleroom9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 666, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private unavaibleroom unavaibleroom1;
    private unavaibleroom unavaibleroom2;
    private unavaibleroom unavaibleroom3;
    private unavaibleroom unavaibleroom4;
    private unavaibleroom unavaibleroom5;
    private unavaibleroom unavaibleroom6;
    private unavaibleroom unavaibleroom7;
    private unavaibleroom unavaibleroom8;
    private unavaibleroom unavaibleroom9;
    // End of variables declaration//GEN-END:variables

    int floor_count = 1;

    public static void main(String[] args) {
        new roomsetting();
    }
}

package View;


import Models.data;
import View.Login;
import View.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Sidebar extends JInternalFrame implements ActionListener {
    private Dashboard dashboard;
    private test testFile;
    private Bill billFile;
    private Cleaning serviceFile;
    private summaryview summaryFile;
    private MainRooms roomsFile;
    private Employee employFile;
    
    public Sidebar() {
        initComponents();
//        this.ds = ds;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        logout.addActionListener(this);
        rooms.addActionListener(this);
        summary.addActionListener(this);
        service.addActionListener(this);
        bill.addActionListener(this);
        employee.addActionListener(this);
        setting.addActionListener(this);
    }
//    public Sidebar(JDesktopPane jDesktopPane1) {
//        this.jDesktopPane1 = jDesktopPane1;
//        initComponents();
//        // Create instances for billFile here
//        billFile = new Bill();
//        // Other initialization code...
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        label_Search = new javax.swing.JLabel();
        logout1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        topic = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        rooms = new javax.swing.JButton();
        summary = new javax.swing.JButton();
        service = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        setting = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        bg_side = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 720));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setPreferredSize(new java.awt.Dimension(970, 70));

        txtSearch.setBackground(new java.awt.Color(204, 204, 255));
        txtSearch.setText("Search");
        txtSearch.setBorder(null);
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Admin1");

        label_Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Search.setText("Search :");

        logout1.setBackground(new java.awt.Color(204, 102, 255));
        logout1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout1.setForeground(new java.awt.Color(255, 255, 255));
        logout1.setText("Log out");
        logout1.setBorder(null);
        logout1.setBorderPainted(false);
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(204, 102, 255));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(null);
        logout.setBorderPainted(false);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(label_Search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(832, 832, 832)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Search)))
                .addGap(22, 22, 22)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(970, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Welcome To Dormmanagetory");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePanel.setBackground(new java.awt.Color(255, 255, 255));
        sidePanel.setPreferredSize(new java.awt.Dimension(290, 720));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topic.setBackground(new java.awt.Color(0, 0, 0));
        topic.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        topic.setForeground(new java.awt.Color(255, 255, 255));
        topic.setText("Dormmanagetory");
        sidePanel.add(topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, 50));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/building.png"))); // NOI18N
        sidePanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        rooms.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        rooms.setForeground(new java.awt.Color(255, 255, 255));
        rooms.setText("Rooms");
        rooms.setToolTipText("");
        rooms.setBorderPainted(false);
        rooms.setContentAreaFilled(false);
        sidePanel.add(rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 270, 50));

        summary.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        summary.setForeground(new java.awt.Color(255, 255, 255));
        summary.setText("Summary");
        summary.setToolTipText("");
        summary.setBorderPainted(false);
        summary.setContentAreaFilled(false);
        summary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryActionPerformed(evt);
            }
        });
        sidePanel.add(summary, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 270, 50));

        service.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        service.setForeground(new java.awt.Color(255, 255, 255));
        service.setText("Service");
        service.setToolTipText("");
        service.setBorderPainted(false);
        service.setContentAreaFilled(false);
        sidePanel.add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 270, 50));

        bill.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bill.setForeground(new java.awt.Color(255, 255, 255));
        bill.setText("Bill");
        bill.setToolTipText("");
        bill.setBorderPainted(false);
        bill.setContentAreaFilled(false);
        sidePanel.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 270, 50));

        setting.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        setting.setForeground(new java.awt.Color(255, 255, 255));
        setting.setText("Room Setting");
        setting.setToolTipText("");
        setting.setBorderPainted(false);
        setting.setContentAreaFilled(false);
        sidePanel.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 270, 50));

        employee.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        employee.setForeground(new java.awt.Color(255, 255, 255));
        employee.setText("Employee");
        employee.setToolTipText("");
        employee.setBorderPainted(false);
        employee.setContentAreaFilled(false);
        sidePanel.add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 270, 50));

        bg_side.setBackground(new java.awt.Color(0, 0, 0));
        bg_side.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.png"))); // NOI18N
        bg_side.setPreferredSize(new java.awt.Dimension(290, 720));
        sidePanel.add(bg_side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void summaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_summaryActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_side;
    private javax.swing.JButton bill;
    private javax.swing.JButton employee;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Search;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout1;
    private javax.swing.JButton rooms;
    private javax.swing.JButton service;
    private javax.swing.JButton setting;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton summary;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel topic;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton[] buttons = {rooms, summary, service, bill, employee, setting};
        if (source.equals(logout)) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Logout Confirmation",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE);
            if (confirm ==  JOptionPane.YES_OPTION) {
                //
                new Login();
            }else if (confirm == JOptionPane.NO_OPTION) {
              
            }
        }else if (source.equals(rooms)) {
            for (JButton button : buttons) {
                button.setContentAreaFilled(button.equals(source));
                button.setBackground(button.equals(source) ? Color.WHITE : null);
                button.setForeground(button.equals(source) ? Color.BLACK : Color.WHITE);
            }
            roomsFile = new MainRooms();
            jDesktopPane1.removeAll();
            jDesktopPane1.add(roomsFile).setVisible(true);
        
        }else if (source.equals(summary)) {
            for (JButton button : buttons) {
                button.setContentAreaFilled(button.equals(source));
                button.setBackground(button.equals(source) ? Color.WHITE : null);
                button.setForeground(button.equals(source) ? Color.BLACK : Color.WHITE);
            }
            summaryFile = new summaryview();
            jDesktopPane1.removeAll();
            jDesktopPane1.add(summaryFile).setVisible(true);
            
        }else if (source.equals(service)) {
            for (JButton button : buttons) {
                button.setContentAreaFilled(button.equals(source));
                button.setBackground(button.equals(source) ? Color.WHITE : null);
                button.setForeground(button.equals(source) ? Color.BLACK : Color.WHITE);
            }
            serviceFile = new Cleaning();
            jDesktopPane1.removeAll();
            jDesktopPane1.add(serviceFile).setVisible(true); 
            
        }else if (source.equals(bill)) {
            for (JButton button : buttons) {
                button.setContentAreaFilled(button.equals(source));
                button.setBackground(button.equals(source) ? Color.WHITE : null);
                button.setForeground(button.equals(source) ? Color.BLACK : Color.WHITE);
            }
            billFile = new Bill();
            jDesktopPane1.removeAll();
            jDesktopPane1.add(billFile.getInternalFrame()).setVisible(true); 
            
        }else if (source.equals(employee)) {
            for (JButton button : buttons) {
                button.setContentAreaFilled(button.equals(source));
                button.setBackground(button.equals(source) ? Color.WHITE : null);
                button.setForeground(button.equals(source) ? Color.BLACK : Color.WHITE);
            }
            employFile = new Employee();
            jDesktopPane1.removeAll();
            jDesktopPane1.add(employFile.getInternalFrame()).setVisible(true);
            
        }else if (source.equals(setting)) {
            for (JButton button : buttons) {
                button.setContentAreaFilled(button.equals(source));
                button.setBackground(button.equals(source) ? Color.WHITE : null);
                button.setForeground(button.equals(source) ? Color.BLACK : Color.WHITE);
            }
            testFile = new test();
            jDesktopPane1.removeAll();
            jDesktopPane1.add(testFile).setVisible(true); 
        }
    }
}

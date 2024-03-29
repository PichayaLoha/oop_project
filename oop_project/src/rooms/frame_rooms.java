package rooms;

public class frame_rooms extends javax.swing.JInternalFrame {

    public frame_rooms() {
        initComponents();
        setSize(970, 607);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnRooms = new javax.swing.JPanel();
        pnCard = new javax.swing.JPanel();
        layerPane = new javax.swing.JLayeredPane();
        card_status1 = new rooms.card_status();
        card_status2 = new rooms.card_status();
        card_status3 = new rooms.card_status();
        card_status4 = new rooms.card_status();
        pnRoom = new javax.swing.JPanel();
        card_room_booked1 = new rooms.card_room_booked();
        card_room_empty1 = new rooms.card_room_empty();

        setPreferredSize(new java.awt.Dimension(970, 607));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(970, 607));

        pnRooms.setPreferredSize(new java.awt.Dimension(970, 607));
        pnRooms.setLayout(new java.awt.BorderLayout());

        pnCard.setPreferredSize(new java.awt.Dimension(970, 150));

        layerPane.setPreferredSize(new java.awt.Dimension(900, 130));
        layerPane.setLayout(new java.awt.GridLayout(1, 0, 20, 0));
        layerPane.add(card_status1);
        layerPane.add(card_status2);
        layerPane.add(card_status3);
        layerPane.add(card_status4);

        javax.swing.GroupLayout pnCardLayout = new javax.swing.GroupLayout(pnCard);
        pnCard.setLayout(pnCardLayout);
        pnCardLayout.setHorizontalGroup(
            pnCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(layerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnCardLayout.setVerticalGroup(
            pnCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(layerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnRooms.add(pnCard, java.awt.BorderLayout.PAGE_START);

        pnRoom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 20));
        pnRoom.add(card_room_booked1);
        pnRoom.add(card_room_empty1);

        pnRooms.add(pnRoom, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(pnRooms);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rooms.card_room_booked card_room_booked1;
    private rooms.card_room_empty card_room_empty1;
    private rooms.card_status card_status1;
    private rooms.card_status card_status2;
    private rooms.card_status card_status3;
    private rooms.card_status card_status4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane layerPane;
    private javax.swing.JPanel pnCard;
    private javax.swing.JPanel pnRoom;
    private javax.swing.JPanel pnRooms;
    // End of variables declaration//GEN-END:variables
}

package View;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MainRooms extends javax.swing.JInternalFrame {

    public MainRooms() {
        initComponents();
        setSize(970, 607);
        cardStatus1.setData(new ModelStatus("ห้องทั้งหมด", 9));
        cardStatus2.setData(new ModelStatus("ห้องมีผู้เช่า", 0));
        cardStatus3.setData(new ModelStatus("ห้องว่าง", 9));
        cardStatus4.setData(new ModelStatus("อัตราการเข้าพัก", 0));
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnRooms = new javax.swing.JPanel();
        pnCard = new javax.swing.JPanel();
        layerPane = new javax.swing.JLayeredPane();
        cardStatus4 = new View.CardStatus();
        cardStatus3 = new View.CardStatus();
        cardStatus2 = new View.CardStatus();
        cardStatus1 = new View.CardStatus();
        pnRoom = new javax.swing.JPanel();
        card_room_empty1 = new View.CardRoomEmpty();
        card_room_empty2 = new View.CardRoomEmpty();
        card_room_empty3 = new View.CardRoomEmpty();
        card_room_empty4 = new View.CardRoomEmpty();
        card_room_empty5 = new View.CardRoomEmpty();
        card_room_empty6 = new View.CardRoomEmpty();
        card_room_empty7 = new View.CardRoomEmpty();
        card_room_empty8 = new View.CardRoomEmpty();
        card_room_empty9 = new View.CardRoomEmpty();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(970, 1080));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(970, 1080));

        pnRooms.setBackground(new java.awt.Color(255, 255, 255));
        pnRooms.setOpaque(false);
        pnRooms.setPreferredSize(new java.awt.Dimension(970, 1080));
        pnRooms.setLayout(new java.awt.BorderLayout());

        pnCard.setBackground(new java.awt.Color(255, 255, 255));
        pnCard.setPreferredSize(new java.awt.Dimension(970, 150));

        layerPane.setPreferredSize(new java.awt.Dimension(900, 130));
        layerPane.setLayout(new java.awt.GridLayout(1, 0, 20, 0));
        layerPane.add(cardStatus4);

        cardStatus3.setForeground(new java.awt.Color(203, 155, 203));
        layerPane.add(cardStatus3);
        layerPane.add(cardStatus2);

        cardStatus1.setForeground(new java.awt.Color(203, 155, 203));
        layerPane.add(cardStatus1);

        javax.swing.GroupLayout pnCardLayout = new javax.swing.GroupLayout(pnCard);
        pnCard.setLayout(pnCardLayout);
        pnCardLayout.setHorizontalGroup(
            pnCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(layerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        pnCardLayout.setVerticalGroup(
            pnCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(layerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnRooms.add(pnCard, java.awt.BorderLayout.PAGE_START);

        pnRoom.setBackground(new java.awt.Color(255, 255, 255));
        pnRoom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 20));
        pnRoom.add(card_room_empty1);
        pnRoom.add(card_room_empty2);
        pnRoom.add(card_room_empty3);
        pnRoom.add(card_room_empty4);
        pnRoom.add(card_room_empty5);
        pnRoom.add(card_room_empty6);
        pnRoom.add(card_room_empty7);
        pnRoom.add(card_room_empty8);
        pnRoom.add(card_room_empty9);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    
    // Variables declaration - do not modify                     
    private View.CardStatus cardStatus1;
    private View.CardStatus cardStatus2;
    private View.CardStatus cardStatus3;
    private View.CardStatus cardStatus4;
    private View.CardRoomEmpty card_room_empty1;
    private View.CardRoomEmpty card_room_empty2;
    private View.CardRoomEmpty card_room_empty3;
    private View.CardRoomEmpty card_room_empty4;
    private View.CardRoomEmpty card_room_empty5;
    private View.CardRoomEmpty card_room_empty6;
    private View.CardRoomEmpty card_room_empty7;
    private View.CardRoomEmpty card_room_empty8;
    private View.CardRoomEmpty card_room_empty9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane layerPane;
    private javax.swing.JPanel pnCard;
    private javax.swing.JPanel pnRoom;
    private javax.swing.JPanel pnRooms;
    // End of variables declaration                   
}

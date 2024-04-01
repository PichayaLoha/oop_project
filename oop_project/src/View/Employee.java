package View;

import Models.empModel;
import Models.data;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.net.URL;
import java.io.*;
import java.sql.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Employee implements ActionListener {

//    public JFrame fr;
//    public JDesktopPane dp;
    public JInternalFrame inter;
    public JPanel pn1, pn2Container, pn3, pn4, pn5, pn6;
    public JButton add;
    public account ac;
    public ArrayList<data> acData;
    public int kha = 242;
    public int count = 0;
    private empModel model;
    


    public Employee() {
        model = new empModel();
         
//        fr = new JFrame();
//        dp = new JDesktopPane();
        inter = new JInternalFrame();
        pn1 = new JPanel();
        pn2Container = new JPanel();
        pn2Container.setBackground(new Color(36, 29, 44));
        pn2Container.setPreferredSize(new Dimension(970, kha));
        pn1.add(pn2Container, BorderLayout.CENTER);
       
       
        acData = new ArrayList<>();
        ac = new account();
        pn3 = new JPanel();
        add = new JButton();
        
        model.loadEmployee(this);

        pn1.setBackground(new Color(36, 29, 44));
        JScrollPane scrollPane = new JScrollPane(pn2Container);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setPreferredSize(inter.getSize());
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);
        pn1.setLayout(new BorderLayout());
        pn1.add(scrollPane, BorderLayout.CENTER);
        pn1.add(pn3, BorderLayout.SOUTH);

        pn2Container.setBackground(new Color(36, 29, 44));
        pn2Container.setPreferredSize(new Dimension(970, kha));
      

        pn3.setOpaque(false);
        pn3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pn3.add(add);

        URL imageURL = Employee.class.getResource("/icon/plus.png");
        ImageIcon icon = new ImageIcon(imageURL);
        add.setIcon(icon);
        add.setPreferredSize(new Dimension(50, 50));
        add.setOpaque(false);
        add.setContentAreaFilled(false);
        add.setBorderPainted(false);

        inter.add(pn1);
       
        add.addActionListener(this);

        inter.setPreferredSize(new Dimension(970, 607));
        inter.setVisible(true);
        inter.pack();

        inter.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) inter.getUI();
        ui.setNorthPane(null);
//        dp.add(inter);
//        fr.add(dp);
//        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        fr.setSize(1280,720);
//        fr.setLocationRelativeTo(null);
//        fr.setVisible(true);
    }

    public void refreshInternalFrame() {
        inter.revalidate();
        inter.repaint();
    }

    public JInternalFrame getInternalFrame() {
        return inter;
    }
//    public static void main(String[] args) {
////        JPanel pn2 = new JPanel();
////        ArrayList<data> acData = new ArrayList<>();
//        new Employee();
//    }



    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(add)) {
           
            new popUp();
            
            refreshInternalFrame();
        }
    }

    public int getCount() {
        return count;
    }

//    public JFrame getFr() {
//        return fr;
//    }
//
//    public void setFr(JFrame fr) {
//        this.fr = fr;
//    }
//
//    public JDesktopPane getDp() {
//        return dp;
//    }
//
//    public void setDp(JDesktopPane dp) {
//        this.dp = dp;
//    }

    public JInternalFrame getInter() {
        return inter;
    }

    public void setInter(JInternalFrame inter) {
        this.inter = inter;
    }

    public JPanel getPn1() {
        return pn1;
    }

    public void setPn1(JPanel pn1) {
        this.pn1 = pn1;
    }

    public JPanel getPn2Container() {
        return pn2Container;
    }

    public void setPn2Container(JPanel pn2Container) {
        this.pn2Container = pn2Container;
    }

    public JPanel getPn3() {
        return pn3;
    }

    public void setPn3(JPanel pn3) {
        this.pn3 = pn3;
    }

    public JPanel getPn4() {
        return pn4;
    }

    public void setPn4(JPanel pn4) {
        this.pn4 = pn4;
    }

    public JPanel getPn5() {
        return pn5;
    }

    public void setPn5(JPanel pn5) {
        this.pn5 = pn5;
    }

    public JPanel getPn6() {
        return pn6;
    }

    public void setPn6(JPanel pn6) {
        this.pn6 = pn6;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public account getAc() {
        return ac;
    }

    public void setAc(account ac) {
        this.ac = ac;
    }

    public ArrayList<data> getAcData() {
        return acData;
    }

    public void setAcData(ArrayList<data> acData) {
        this.acData = acData;
    }

    public int getKha() {
        return kha;
    }

    public void setKha(int kha) {
        this.kha = kha;
    }
    
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.net.URL;
import java.io.*;
public class Employee implements ActionListener{
    
    public JFrame fr;
    public JDesktopPane dp;
    public JInternalFrame inter;
    public JPanel pn1, pn2Container, pn3, pn4, pn5, pn6;
    public JButton add;
    public account ac;
    public ArrayList<data> acData;
    public int kha = 242;
    public int count = 0;
    public Employee(){
        fr = new JFrame();
        dp = new JDesktopPane();
        inter = new JInternalFrame();
        pn1 = new JPanel();
        pn2Container = new JPanel();
        pn3 = new JPanel();
        add = new JButton();
        
        pn1.setBackground(new Color(36, 29, 44));
        JScrollPane scrollPane = new JScrollPane(pn2Container);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setPreferredSize(fr.getSize());
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);
        pn1.setLayout(new BorderLayout());
        pn1.add(scrollPane, BorderLayout.CENTER);
        pn1.add(pn3, BorderLayout.SOUTH);
        
        pn2Container.setBackground(new Color(36, 29, 44));
        pn2Container.setPreferredSize(new Dimension(970,kha));
        
        pn3.setOpaque(false);
        pn3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pn3.add(add);
        
        URL imageURL = Employee.class.getResource("plus.png");
        ImageIcon icon = new ImageIcon(imageURL);
        add.setIcon(icon);
        add.setPreferredSize(new Dimension(50,50));
        add.setOpaque(false);
        add.setContentAreaFilled(false);
        add.setBorderPainted(false);
        
        inter.add(pn1);
        add.addActionListener(this);
        
        inter.setVisible(true);
        inter.setLocation(300,95);
        
        inter.setSize(970, 594);
        dp.add(inter);
        fr.add(dp);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280,720);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    public void refreshInternalFrame() {
        inter.revalidate();
        inter.repaint();
    }
    public static void main(String[] args) {
//        JPanel pn2 = new JPanel();
//        ArrayList<data> acData = new ArrayList<>();
        new Employee();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(add)){
            new popUp();

            refreshInternalFrame();
        }
    }
    public int getCount() {
        return count;
    }
}

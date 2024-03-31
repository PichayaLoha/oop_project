package View;

import Models.data;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.border.*;
public class account implements ActionListener{
    public JPanel pn1, pn2, pn3, pn4;
    public JLabel posi, pic;
    public JButton name;
    public popUp pop; 
    public data accountData;
    public ArrayList<data> acData;
    public Employee em;
    private int index;

    public account(){
        pn1 = new RoundFillPanel(new Color(100,80,153), 190, 242, 20);
        pn1.setOpaque(false);
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        name = new JButton("Null"); name.setContentAreaFilled(false); name.setBorderPainted(false);
        posi = new JLabel("Null");
        pic = new JLabel("PIcture");

        pn1.setLayout(new BorderLayout());
            pn1.add(pn2, BorderLayout.NORTH);
            pn1.add(pn4, BorderLayout.CENTER);
            pn1.add(pn3, BorderLayout.SOUTH);

            pn2.add(pic);
            pn2.setOpaque(false);
            pic.setForeground(Color.WHITE);
            pic.setFont(new Font("Mitr Light", Font.BOLD, 14));
            pn2.setOpaque(false);
            
            pn3.add(name);
            pn3.setOpaque(false);
            name.setForeground(Color.WHITE);
            name.setFont(new Font("Mitr Light", Font.BOLD, 14));
            pn3.setOpaque(false);
            
            pn4.add(posi);
            pn4.setOpaque(false);
            posi.setForeground(Color.WHITE);
            posi.setFont(new Font("Mitr Light", Font.BOLD, 14));
            pn4.setOpaque(false);
            name.addActionListener(this);
        }
    
    public JPanel getPanel(){
        return pn1;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {if (e.getSource().equals(name)){
//            pop.getFrame().setVisible(true);
        }
    }

    static class RoundFillPanel extends JPanel {
        private Color bgColor;
        private int width, height, radius;

        public RoundFillPanel(Color bgColor, int width, int height, int radius) {
            this.bgColor = bgColor;
            this.width = width;
            this.height = height;
            this.radius = radius;
            setPreferredSize(new Dimension(width, height));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(bgColor);
            g.fillRoundRect(0, 0, width - 1, height - 1, radius, radius);
        }
    }
}

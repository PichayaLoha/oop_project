package View;

import Models.data;
import Models.empModel;
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
        name = new JButton("Null");
        posi = new JLabel("Null");
        
        URL imageURL = account.class.getResource("Kon na lak.png");
        ImageIcon imageIcon = new ImageIcon(imageURL);
        pic = new JLabel(imageIcon);

        pn1.setLayout(new BorderLayout());
            pn1.add(pn2, BorderLayout.NORTH);
            pn1.add(pn4, BorderLayout.CENTER);
            pn1.add(pn3, BorderLayout.SOUTH);

            pn2.add(pic);
            pn2.setOpaque(false);
            pic.setForeground(Color.WHITE);
            pic.setFont(new Font("Mitr Light", Font.BOLD, 14));
            
            pn3.add(name);
            pn3.setOpaque(false);
            name.setForeground(Color.WHITE);
            name.setContentAreaFilled(false);
            name.setBorderPainted(false);
            name.setFont(new Font("Mitr Light", Font.BOLD, 14));

            
            pn4.add(posi);
            pn4.setOpaque(false);
            posi.setForeground(Color.WHITE);
            posi.setFont(new Font("Mitr Light", Font.BOLD, 14));
            pn4.setOpaque(false);
            
            name.addActionListener(this);
        }
    
    public void setData(data accountData){
        this.accountData = accountData;
//        pic.setText(accountData.getImageProfile());
        name.setText(accountData.getName());
        posi.setText(accountData.getPosi()); 
    }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource().equals(name));
        if (e.getSource().equals(name)){
           empModel model = new empModel();
     
        String name1 = name.getText();
      model.loadEmployeeAll(name1);
        System.out.println( name1);
        
          
        }
    }
    
    
    public JPanel getPanel(){
        return pn1;
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

    public JPanel getPn1() {
        return pn1;
    }

    public void setPn1(JPanel pn1) {
        this.pn1 = pn1;
    }

    public JPanel getPn2() {
        return pn2;
    }

    public void setPn2(JPanel pn2) {
        this.pn2 = pn2;
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

    public JLabel getPosi() {
        return posi;
    }

    public void setPosi(JLabel posi) {
        this.posi = posi;
    }

    public JLabel getPic() {
        return pic;
    }

    public void setPic(JLabel pic) {
        this.pic = pic;
    }

    public JButton getName() {
        return name;
    }

    public void setName(JButton name) {
        this.name = name;
    }

    public popUp getPop() {
        return pop;
    }

    public void setPop(popUp pop) {
        this.pop = pop;
    }

    public data getAccountData() {
        return accountData;
    }

    public void setAccountData(data accountData) {
        this.accountData = accountData;
    }

    public ArrayList<data> getAcData() {
        return acData;
    }

    public void setAcData(ArrayList<data> acData) {
        this.acData = acData;
    }

    public Employee getEm() {
        return em;
    }

    public void setEm(Employee em) {
        this.em = em;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
}

package View;

import View.Dashboard;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
import java.sql.*;
import Model.AdminRefInterface;

public class Login implements AdminRefInterface{

    private JFrame fr;
    private JPanel mainPanel, borderPanel;
    private JTextField userName;
    private JLabel image, laName, laPass, laTop, laTop_1, descrpt, topic;
    private JButton login;
    private JPasswordField password;

    

    public Login() {
        fr = new JFrame("Login");
        borderPanel = new JPanel(new BorderLayout());
        topic = new JLabel("Dormmanagetory");

        ImageIcon icon = null;
        URL imageURL = Login.class.getResource("/img/Dorm.png");
        if (imageURL != null) {
            ImageIcon img1 = new ImageIcon(imageURL);
            Image originalImage = img1.getImage();
            Image scaled = originalImage.getScaledInstance(560, 720, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaled);
        }
        image = new JLabel(icon);

        laTop = new JLabel("Welcome to Dormmanagetory");
        laTop_1 = new JLabel("welcome to Dormmanagetory");
        laName = new JLabel("Username :");
        laPass = new JLabel("Password :");
        userName = new JTextField();
        password = new JPasswordField();
        login = new JButton("Login");
        login.setBackground(new Color(204, 102, 255));
        descrpt = new JLabel("<html><u>If you forget your password, lease inform the staff.</u></html>");

        topic.setFont(new Font("Arial Rounded MT Bold", 1, 25));
        topic.setBounds(230, 50, 400, 30);

        laTop.setFont(new Font("Arial Rounded MT Bold", 1, 25));
        laTop_1.setFont(new Font("Arial Rounded MT Bold", 0, 14));
        laName.setFont(new Font("Arial Rounded MT Bold", 0, 16));
        laPass.setFont(new Font("Arial Rounded MT Bold", 0, 16));
        descrpt.setFont(new Font("Arial Rounded MT Bold", 0, 12));
        descrpt.setForeground(Color.LIGHT_GRAY);
        login.setFont(new Font("Arial Rounded MT Bold", 1, 15));

        mainPanel = new JPanel(null) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(50, 100, 600, 500);

                laTop.setBounds(100, 150, 400, 30);
                laTop_1.setBounds(100, 175, 310, 30);
                laName.setBounds(125, 250, 200, 30);
                laPass.setBounds(125, 350, 200, 30);
                userName.setBounds(125, 290, 400, 35);
                password.setBounds(125, 390, 400, 35);
                login.setBounds(200, 490, 240, 40);
                descrpt.setBounds(175, 529, 310, 35);
            }
        };
        mainPanel.setBackground(new Color(228, 212, 233));
        mainPanel.add(topic);
        mainPanel.add(laTop);
        mainPanel.add(laTop_1);
        mainPanel.add(laName);
        mainPanel.add(laPass);
        mainPanel.add(userName);
        mainPanel.add(password);
        mainPanel.add(login);
        mainPanel.add(descrpt);

        borderPanel.add(image, BorderLayout.EAST);
        borderPanel.add(mainPanel);
        fr.add(borderPanel);

//        login.addActionListener(this);

        fr.setResizable(false);
//        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setPreferredSize(new Dimension(1280, 720));
        fr.pack();
        fr.setVisible(true);
    }
   
   public void setLogin(JButton login) {     
       this.login = login;
     
   }
    
   public String getUserName() {   
       return userName.getText();  
   }
   public String getPassword() {   
       return password.getText();  
   }
   public JButton getLogin() {     
       return login ;
   }
      public JFrame getFr() {     
       return fr ;
   }
    public void setAdmin(String user){
        
    }
 
}


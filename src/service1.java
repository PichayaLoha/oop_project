
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class service1{
    private JInternalFrame f1;
    private JPanel pn, pn1, pn2, pn3;
    private JLabel lb, lb1, lb2, lim1, lim2;
    private JButton b1, b2;
    
    public service1(){
        //Annouce Section
        Font font = new Font("FC Iconic", Font.BOLD, 42);
        Font fp = new Font("FC Iconic", Font.PLAIN, 24);
        f1 = new JInternalFrame("Cleaning", true, true ,true, true);
        pn = new JPanel();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        
        //Set Image
        ImageIcon im = null;
        ImageIcon im2 = null;
        ImageIcon im3 = null;
        URL imageURL = service1.class.getResource("/icon/floppamaidinroom.png");
        URL imageURL2 = service1.class.getResource("/icon/ichiji 1.png");
        URL imURL3 = service1.class.getResource("/icon/floppalaundry.png");
        if ((imageURL != null)|| (imageURL2 != null)){
            im = new ImageIcon(imageURL);
            im = new ImageIcon(im.getImage().getScaledInstance(330, 150, Image.SCALE_SMOOTH));
            im2 = new ImageIcon(imageURL2);
            im3 = new ImageIcon(imURL3);
            im3 = new ImageIcon(im3.getImage().getScaledInstance(330, 150, Image.SCALE_SMOOTH));
        }
        
        //annouce & set Label
        lb = new JLabel("<html><u> บริการทำความสะอาด </u></html>");
        lb.setFont(font);
        
        lb1 = new JLabel(" บริการแนะนำ");
        lb1.setFont(new Font("FC Iconic", Font.BOLD, 26));
        
        lim1 = new JLabel();
        lim1.setIcon(im);
        lim1.setHorizontalAlignment(SwingConstants.CENTER); // Change this to LEFT, RIGHT, etc.
        lim1.setVerticalAlignment(SwingConstants.TOP); // Change this to TOP, BOTTOM, etc.
        
        lim2 = new JLabel();
        lim2.setIcon(im3);
        lim1.setHorizontalAlignment(SwingConstants.CENTER); // Change this to LEFT, RIGHT, etc.
        lim1.setVerticalAlignment(SwingConstants.TOP); 
        
        lb2 = new JLabel("");
        lb2.setFont(fp);
        lb2.setHorizontalAlignment(SwingConstants.CENTER);
        lb2.setVerticalAlignment(SwingConstants.CENTER);

        //Annouce and Setting Button
        b1 = new JButton("บริการทำความสะอาดทั่วไป");
        b1.setFont(fp);
        
        b2 = new JButton("บริการซักรีด");
        b2.setFont(fp);
        
        //set Panel
        pn.setLayout(new BorderLayout()); // บริการทำความสะอาด Heding
        pn.setBackground(null);
        pn.add(lb, BorderLayout.NORTH);
        pn.setBounds(35, 15, 285, 40);
        
        pn1.setLayout(new BorderLayout()); // บริการแนะนำ
        pn1.setBackground(null);
        pn1.setBounds(30, 80, 130, 30);
        pn1.add(lb1);
        
        pn2.setLayout(new FlowLayout()); // บริการทำความสะอาดทั่วไป
        pn2.setBackground(null);
        pn2.setBounds(30, 115, 300, 200);
        pn2.add(lim1);
        pn2.add(b1);
        
        pn3.setLayout(new FlowLayout()); // บริการซักรีด
        pn3.setBackground(null);
        pn3.setBounds(350, 115, 300, 200);
        pn3.add(lim2);
        pn3.add(b2);
        
        //Internalframe Section
        Container content = f1.getContentPane();
        f1.setLayout(new BorderLayout());
//        f1.setBackground(new Color(223, 215, 231));
        f1.setBackground(Color.WHITE);
        f1.setFont(font);
        f1.setFrameIcon(im2);
        
        f1.add(pn);
        f1.add(pn1);
        f1.add(pn2);
        f1.add(pn3);
        
//        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(1265, 665);
        f1.setLayout(new BorderLayout());
        f1.setVisible(true);
    }
    
    public JInternalFrame getInternalFrame() {
        return f1;
    }
}
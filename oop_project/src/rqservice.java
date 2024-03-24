import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.net.URL;

public class rqservice{
    private JInternalFrame fi1;
    private JPanel pn1, pn2;
    private JLabel lb1;
    private JDateChooser date;
    
    public rqservice(){
        //Initialize Component
        Font fb = new Font("FC Iconic", Font.BOLD, 42);
        Font fp = new Font("FC Iconic", Font.PLAIN, 24);
        fi1 = new JInternalFrame("Cleaning Reqeust", true, true ,true, true);
        pn1 = new JPanel();
        pn2 = new JPanel();
        date = new JDateChooser();
        
        //Initialize Label
        lb1.setFont(fb);
        lb1 = new JLabel("บริการทำความสะอาด");
        lb1.setBounds(0, 0, 50, 50);
        
        
        
//        pn1.setBounds(15, 50, 5, 3);
//        pn1.add(date);
//        JScrollPane sp = new JScrollPane(pn2);
        
        
        Container content = fi1.getContentPane();
        content.add(pn1, BorderLayout.WEST);
//        content.add(sp);
        content.add(lb1);


        fi1.setBackground(Color.red);
        fi1.setFont(fb);
        fi1.setVisible(true);
        fi1.setSize(500, 600);
        
    }
    
    public JInternalFrame getInternalFrame(){
        return fi1;
    }
    
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        JDesktopPane dp = new JDesktopPane();
        
        rqservice rq = new rqservice();
        dp.add(rq.getInternalFrame());
        fr.add(dp);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 720);
        fr.setVisible(true);
        
    }
}

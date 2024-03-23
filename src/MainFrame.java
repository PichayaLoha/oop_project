import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class MainFrame extends JFrame{
    private JDesktopPane dp;
    private JMenuBar mb;
    private JMenu s1, s2, s3;
    private JPanel pn;
    private JMenuItem i1, i2;
    private Font font;
    private JLabel lb;
    
    public MainFrame(){
        //set Look and Feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ImageIcon im = null;
        URL imageURL = MainFrame.class.getResource("/icon/nanami 1.png");
        if (imageURL != null){
            im = new ImageIcon(imageURL);
        }
        
        dp = new JDesktopPane();
        mb = new JMenuBar();
        s1 = new JMenu("Service");
        s2 = new JMenu("Report");
        s3 = new JMenu("Exit");
        pn = new JPanel();
        i1 = new JMenuItem("Cleaning");
        i2 = new JMenuItem("Repair");
        font = new Font("FC Iconic", Font.PLAIN, 16);
        lb = new JLabel("Hello Test 1 2 3 4...", im, JLabel.CENTER);
        
        //Annouce Celaning Service
        service1 service = new service1(); // Assuming Service1 is the class where you define your internal frame
        Container cleaning = service.getInternalFrame(); // Assuming getInternalFrame() returns a Container
        //End task
        
        s1.add(i1);
        s1.add(i2);
        mb.add(s1);
        mb.add(s2);
        mb.add(s3);
        
        //Cleaning Service Add on DesktopPane
        cleaning.setLocation(0, -5);
        dp.add(cleaning);
        cleaning.setVisible(true);
        //End task
        dp.setBackground(new Color(223, 215, 231));
        dp.add(lb);
        dp.setFont(font);
        
        this.setJMenuBar(mb);

        this.setTitle("Dormmanagetory");
        this.setIconImage(im.getImage());
        getContentPane().setFont(font);
        add(dp, BorderLayout.CENTER);
        setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { MainFrame frame = new MainFrame(); });
    }
}
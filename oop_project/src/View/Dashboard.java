package View;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Dashboard {
    private JFrame fr;
    private JDesktopPane ds;
    private Sidebar sidebar;

    public Dashboard(String username) {
        fr = new JFrame();
        ds = new JDesktopPane();

        sidebar = new Sidebar(username);
        ds.add(sidebar);
        sidebar.setVisible(true);
        
        fr.setResizable(false);
        fr.setPreferredSize(new Dimension(1280, 720)); 
        fr.add(ds);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setVisible(true);
        
    }

}

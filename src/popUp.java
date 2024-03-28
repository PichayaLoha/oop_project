import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class popUp implements ActionListener{
    public JFrame fr;
    public JPanel pn1, pn2,pn3;
    public JTextField name, posi, pic;
    public JButton save;
    public Employee em;
    public data acData;
    public ArrayList<data> dt;
//    private int index;
    public JMenuBar mb;
    
    public popUp(){
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        mb = new JMenuBar();
        mu1 = new JMenu();
        save = new JButton("SAVE");
        mb.add();
        
        save.addActionListener(this);
        
        fr.setJMenuBar(mb);
        fr.setSize(860,528);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//    public JFrame getFrame(){
//        return fr;
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource().equals(save)){
//            if (!em.acData.isEmpty() && index >= 0 && index < em.acData.size()) {
//            em.acData.get(index).setName(name.getText());
//            em.acData.get(index).setPosi(posi.getText());
//            em.refreshInternalFrame();
//        }
//        }
    }
    public static void main(String[] args) {
        new popUp();
    }
}

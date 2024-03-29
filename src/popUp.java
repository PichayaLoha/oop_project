import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
public class popUp implements ActionListener,MouseListener{
    public JFrame fr;
    public JPanel pn1, pn2,pn3,pn4,pm1,pm2,pm3,pm4,pm5,pm6,pm7,pm8,pm9,pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9,pp10,p1,p2,p3,p4,p5,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,b1,b2,b3,b4,b5,b6,b7,b8,b9,c1,c2,c3,c4;
    public JPanel e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,y1,y2;
    public JTextField name,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
    public JMenu mu1,mu2,mu3;
    public JButton save, edit;
    public JTextArea ta1, ta2;
    public information inf;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,lb1,lb2,t1,t2,t4,pic,posi,t5,t6,t7,t8,t9,t10,u1,u2,u3,u4,u5,u6,u7,u8,t3,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
//    public Employee em;
    public JMenuBar mb;
    public Rights rig;
//    public data acData;
//    public ArrayList<data> dt;
//    private int index;
    
    public popUp(){
        fr = new JFrame();
        pn1 = new JPanel(); 
        pn2 = new JPanel(); pn2.setOpaque(false);
        pn3 = new JPanel(); pn3.setOpaque(false);
        pn4 = new RoundFillPanel(new Color(243,234,252), 218, 418, 20);  pn4.setOpaque(false);
        pm1 = new JPanel(); pm1.setOpaque(false);
        pm2 = new JPanel(); pm2.setOpaque(false);
        pm3 = new JPanel(); pm3.setOpaque(false);
        pm4 = new JPanel(); pm4.setOpaque(false);
        pm5 = new JPanel(); pm5.setOpaque(false);
        pm6 = new JPanel(); pm6.setOpaque(false);
        pm7 = new JPanel(); pm7.setOpaque(false);
        pm8 = new JPanel(); pm8.setOpaque(false);
        pm9 = new JPanel(); pm9.setOpaque(false);
        pp1 = new JPanel(); pp1.setOpaque(false);
        pp2 = new JPanel(); pp2.setOpaque(false);
        pp3 = new JPanel(); pp3.setOpaque(false);
        pp4 = new JPanel(); pp4.setOpaque(false);
        pp5 = new JPanel(); pp5.setOpaque(false);
        pp6 = new JPanel(); pp6.setOpaque(false);
        pp7 = new JPanel(); pp7.setOpaque(false);
        pp8 = new JPanel(); pp8.setOpaque(false);
        pp9 = new JPanel(); pp9.setOpaque(false);
        pp10 = new JPanel(); pp10.setOpaque(false);
        p1 = new JPanel(); p1.setOpaque(false);
        p2 = new JPanel(); p2.setOpaque(false);
        p3 = new JPanel(); p3.setOpaque(false);
        p4 = new JPanel(); p4.setOpaque(false);
        p5 = new JPanel(); p5.setOpaque(false);
        n1 = new JPanel(); n1.setOpaque(false);
        n2 = new JPanel(); n2.setOpaque(false);
        n3 = new JPanel(); n3.setOpaque(false);
        n4 = new JPanel(); n4.setOpaque(false);
        n5 = new JPanel(); n5.setOpaque(false);
        n6 = new JPanel(); n6.setOpaque(false);
        n7 = new JPanel(); n7.setOpaque(false);
        n8 = new JPanel(); n8.setOpaque(false);
        n9 = new JPanel(); n9.setOpaque(false);
        n10 = new JPanel(); n10.setOpaque(false);
        n11 = new JPanel(); n11.setOpaque(false);
        n12 = new JPanel(); n12.setOpaque(false);
        n13 = new JPanel(); n13.setOpaque(false);
        n14 = new JPanel(); n14.setOpaque(false);
        lb1 = new JLabel("Kg"); lb1.setForeground(new Color(100,80,153)); lb1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        lb2 = new JLabel("cm"); lb2.setForeground(new Color(100,80,153)); lb2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        l1 = new JLabel("ชื่อ"); l1.setForeground(new Color(100,80,153)); l1.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l2 = new JLabel("นามสกุล"); l2.setForeground(new Color(100,80,153)); l2.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l3 = new JLabel("เพศ"); l3.setForeground(new Color(100,80,153)); l3.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l4 = new JLabel("ตำแหน่ง"); l4.setForeground(new Color(100,80,153)); l4.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l5 = new JLabel("หมายเลขบัตรประชาชน"); l5.setForeground(new Color(100,80,153)); l5.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l6 = new JLabel("สัญชาติ"); l6.setForeground(new Color(100,80,153)); l6.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l7 = new JLabel("เชื้อชาติ"); l7.setForeground(new Color(100,80,153)); l7.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l9 = new JLabel("DD/MM/YY"); l9.setForeground(new Color(100,80,153)); l9.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l10 = new JLabel("น้ำหนัก"); l10.setForeground(new Color(100,80,153)); l10.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l11 = new JLabel("ส่วนสูง"); l11.setForeground(new Color(100,80,153)); l11.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l12 = new JLabel("กรุ๊ปเลือด"); l12.setForeground(new Color(100,80,153)); l12.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l13 = new JLabel("ที่อยู่"); l13.setForeground(new Color(100,80,153)); l13.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l14 = new JLabel("โรคประจำตัว"); l14.setForeground(new Color(100,80,153)); l14.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l8 = new JLabel("ศาสนา"); l8.setForeground(new Color(100,80,153)); l8.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        f1 = new JTextField(13); f1.setForeground(new Color(56,53,120)); f1.setCaretColor(new Color(247,203,45)); f1.setBackground(new Color(250,244,255)); f1.setSelectedTextColor(new Color(190,18,233)); f1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f2 = new JTextField(13); f2.setForeground(new Color(56,53,120)); f2.setCaretColor(new Color(247,203,45)); f2.setBackground(new Color(250,244,255)); f2.setSelectedTextColor(new Color(190,18,233)); f2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f3 = new JTextField(8); f3.setForeground(new Color(56,53,120)); f3.setCaretColor(new Color(247,203,45)); f3.setBackground(new Color(250,244,255)); f3.setSelectedTextColor(new Color(190,18,233)); f3.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f4 = new JTextField(13); f4.setForeground(new Color(56,53,120)); f4.setCaretColor(new Color(247,203,45)); f4.setBackground(new Color(250,244,255)); f4.setSelectedTextColor(new Color(190,18,233)); f4.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f5 = new JTextField(13); f5.setForeground(new Color(56,53,120)); f5.setCaretColor(new Color(247,203,45)); f5.setBackground(new Color(250,244,255)); f5.setSelectedTextColor(new Color(190,18,233)); f5.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f6 = new JTextField(8); f6.setForeground(new Color(56,53,120)); f6.setCaretColor(new Color(247,203,45)); f6.setBackground(new Color(250,244,255)); f6.setSelectedTextColor(new Color(190,18,233)); f6.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f7 = new JTextField(8); f7.setForeground(new Color(56,53,120)); f7.setCaretColor(new Color(247,203,45)); f7.setBackground(new Color(250,244,255)); f7.setSelectedTextColor(new Color(190,18,233)); f7.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f8 = new JTextField(8); f8.setForeground(new Color(56,53,120)); f8.setCaretColor(new Color(247,203,45)); f8.setBackground(new Color(250,244,255)); f8.setSelectedTextColor(new Color(190,18,233)); f8.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f9 = new JTextField(2); f9.setForeground(new Color(56,53,120)); f9.setCaretColor(new Color(247,203,45)); f9.setBackground(new Color(250,244,255)); f9.setSelectedTextColor(new Color(190,18,233)); f9.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f10 = new JTextField(7); f10.setForeground(new Color(56,53,120)); f10.setCaretColor(new Color(247,203,45)); f10.setBackground(new Color(250,244,255)); f10.setSelectedTextColor(new Color(190,18,233)); f10.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f11 = new JTextField(2); f11.setForeground(new Color(56,53,120)); f11.setCaretColor(new Color(247,203,45)); f11.setBackground(new Color(250,244,255)); f11.setSelectedTextColor(new Color(190,18,233)); f11.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f12 = new JTextField(5); f12.setForeground(new Color(56,53,120)); f12.setCaretColor(new Color(247,203,45)); f12.setBackground(new Color(250,244,255)); f12.setSelectedTextColor(new Color(190,18,233)); f12.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f13 = new JTextField(5); f13.setForeground(new Color(56,53,120)); f13.setCaretColor(new Color(247,203,45)); f13.setBackground(new Color(250,244,255)); f13.setSelectedTextColor(new Color(190,18,233)); f13.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f14 = new JTextField(5); f14.setForeground(new Color(56,53,120)); f14.setCaretColor(new Color(247,203,45)); f14.setBackground(new Color(250,244,255)); f14.setSelectedTextColor(new Color(190,18,233)); f14.setFont(new Font("Mitr Light", Font.BOLD, 12));
        ta1 = new JTextArea(10,25); ta1.setForeground(new Color(56,53,120)); ta1.setCaretColor(new Color(247,203,45)); ta1.setBackground(new Color(250,244,255)); ta1.setSelectedTextColor(new Color(190,18,233)); ta1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        ta2 = new JTextArea(10,25); ta2.setForeground(new Color(56,53,120)); ta2.setCaretColor(new Color(247,203,45)); ta2.setBackground(new Color(250,244,255)); ta2.setSelectedTextColor(new Color(190,18,233)); ta2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        
        t5 = new JLabel("ชื่อ"); t5.setForeground(new Color(100,80,153)); t5.setFont(new Font("Mitr Light", Font.BOLD, 12));
        t6 = new JLabel("เพศ"); t6.setForeground(new Color(100,80,153)); t6.setFont(new Font("Mitr Light", Font.BOLD, 12));
        t7 = new JLabel("อายุ"); t7.setForeground(new Color(100,80,153)); t7.setFont(new Font("Mitr Light", Font.BOLD, 12));
        t8 = new JLabel("เชื้อชาติ"); t8.setForeground(new Color(100,80,153)); t8.setFont(new Font("Mitr Light", Font.BOLD, 12));
        t9 = new JLabel("สัญชาติ"); t9.setForeground(new Color(100,80,153)); t9.setFont(new Font("Mitr Light", Font.BOLD, 12));
        t10 = new JLabel("ศาสนา"); t10.setForeground(new Color(100,80,153)); t10.setFont(new Font("Mitr Light", Font.BOLD, 12));
        u1 = new JLabel("คนน่ารัก"); u1.setForeground(new Color(100,80,153)); u1.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u2 = new JLabel("น่ารักมาก"); u2.setForeground(new Color(100,80,153)); u2.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u3 = new JLabel("ชาย"); u3.setForeground(new Color(100,80,153)); u3.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u4 = new JLabel("4"); u4.setForeground(new Color(100,80,153)); u4.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u5 = new JLabel("เกาหลี"); u5.setForeground(new Color(100,80,153)); u5.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u6 = new JLabel("เกาหลี"); u6.setForeground(new Color(100,80,153)); u6.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u7 = new JLabel("พุทธ"); u7.setForeground(new Color(100,80,153)); u7.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u8 = new JLabel("ปี"); u8.setForeground(new Color(100,80,153)); u8.setFont(new Font("Mitr Light", Font.BOLD, 12));
        
        b1 = new JPanel(); b1.setOpaque(false);
        b2 = new JPanel(); b2.setOpaque(false);
        b3 = new JPanel(); b3.setOpaque(false);
        b4 = new JPanel(); b4.setOpaque(false);
        b5 = new JPanel(); b5.setOpaque(false);
        b6 = new JPanel(); b6.setOpaque(false);
        b7 = new JPanel(); b7.setOpaque(false);
        b8 = new JPanel(); b8.setOpaque(false);
        b9 = new JPanel(); b9.setOpaque(false);
        c1 = new JPanel(); c1.setOpaque(false);
        c2 = new JPanel(); c2.setOpaque(false);
        c3 = new JPanel(); c3.setOpaque(false);
        c4 = new JPanel(); c4.setOpaque(false);
        
        e1 = new JPanel(); e1.setOpaque(false);
        e2 = new JPanel(); e2.setOpaque(false);
        e3 = new JPanel(); e3.setOpaque(false);
        e4 = new JPanel(); e4.setOpaque(false);
        e5 = new JPanel(); e5.setOpaque(false);
        e6 = new JPanel(); e6.setOpaque(false);
        e7 = new JPanel(); e7.setOpaque(false);
        e8 = new JPanel(); e8.setOpaque(false);
        e9 = new JPanel(); e9.setOpaque(false);
        e10 = new JPanel(); e10.setOpaque(false);
        e11 = new JPanel(); e11.setOpaque(false);
        e12 = new JPanel(); e12.setOpaque(false);
        e13 = new JPanel(); e13.setOpaque(false);
        e14 = new JPanel(); e14.setOpaque(false);
        e15 = new JPanel(); e15.setOpaque(false);
        e16 = new JPanel(); e16.setOpaque(false);
        e17 = new JPanel(); e17.setOpaque(false);
        e18 = new JPanel(); e18.setOpaque(false);
        e19 = new JPanel(); e19.setOpaque(false);
        e20 = new JPanel(); e20.setOpaque(false);
        e21 = new JPanel(); e21.setOpaque(false);
        
        y1 = new JPanel(); y1.setOpaque(false);
        y2 = new JPanel(); y2.setOpaque(false);
        t1 = new JLabel("    ");
        t2 = new JLabel("   ");
        t3 = new JLabel("   ");
        t4 = new JLabel("   ");
        s1 = new JLabel("  ");
        s2 = new JLabel(" ");
        s3 = new JLabel(" ");
        s4 = new JLabel(" ");
        s5 = new JLabel(" ");
        s6 = new JLabel(" ");
        s7 = new JLabel(" ");
        s8 = new JLabel(" ");
        s9 = new JLabel(" ");
        s10 = new JLabel(" ");
        s11 = new JLabel(" ");
        s12 = new JLabel("       ");
        s13 = new JLabel(" ");
        inf = new information();
        rig = new Rights();
         
        mb = new JMenuBar();
        name = new JTextField("name");
        pic = new JLabel();

        posi = new JLabel("position"); posi.setForeground(new Color(100,80,153)); posi.setFont(new Font("Mitr Light", Font.BOLD, 12));
        mu1 = new JMenu("ข้อมูลพนักงาน"); mu1.setForeground(new Color(100,80,153)); mu1.setFont(new Font("Mitr Light", Font.BOLD, 12)); 
        mu2 = new JMenu("ประวัติส่วนตัว"); mu2.setForeground(new Color(100,80,153)); mu2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        mu3 = new JMenu("การจัดการสิทธิ"); mu3.setForeground(new Color(100,80,153)); mu3.setFont(new Font("Mitr Light", Font.BOLD, 12));
        
        edit = new JButton("Edit Picture"); edit.setContentAreaFilled(false); edit.setBorderPainted(false); edit.setForeground(new Color(100,80,153)); edit.setFont(new Font("Mitr Light", Font.BOLD, 12));
        edit.addActionListener(this);
        
        save = new JButton("Save"); save.setContentAreaFilled(false); save.setBorderPainted(false); save.setForeground(new Color(100,80,153)); save.setFont(new Font("Mitr Light", Font.BOLD, 12));
        save.addActionListener(this);
        
        pn1.setLayout(new BorderLayout());
        pn1.setBackground(Color.white);
        pn1.add(e1, BorderLayout.WEST);
        pn1.add(pp8, BorderLayout.CENTER);
        
        pp8.setLayout(new BorderLayout());
        pp8.add(pn3, BorderLayout.CENTER);
        pp8.add(p1, BorderLayout.NORTH);
        pp8.add(p2, BorderLayout.SOUTH);
        pp8.add(p3, BorderLayout.EAST);
        pp8.add(p4, BorderLayout.WEST);
        p1.setSize(5,20);
        p1.add(b3);
        p2.add(b4);
        p3.add(b5);
        p4.add(b6);
        b3.setSize(10,10);
        b4.setSize(10,10);
        b5.setSize(10,10);
        b6.setSize(10,10);

        pp8.setSize(200, 458);
        
        pn2.add(pn4);
        pn2.setPreferredSize(new Dimension(233,400));
        
        e1.setLayout(new BorderLayout());
        e1.add(pn4, BorderLayout.CENTER);
        e1.add(e2, BorderLayout.NORTH);
        e1.add(e3, BorderLayout.WEST);
        e2.add(t1);
        e3.add(t2);
        e4.add(t4);
        
        pn4.setLayout(new BorderLayout());
        pn4.add(e6, BorderLayout.NORTH);
        
        e6.add(e9);
        e6.setPreferredSize(new Dimension(157,210));
        e9.add(e10);
        e10.setLayout(new BorderLayout());
        e10.add(e11, BorderLayout.CENTER);
        e11.add(e12);
        e12.setPreferredSize(new Dimension(157,159));
        e12.add(pic);
        e10.add(e13, BorderLayout.SOUTH);
        e13.add(edit);
        
        pn4.add(e8, BorderLayout.CENTER);
        e8.add(e16);
        e16.setLayout(new BorderLayout());
        
        e16.add(e17, BorderLayout.CENTER);
        e16.setPreferredSize(new Dimension(157,199));
        e17.add(e19);
        e19.setLayout(new FlowLayout(FlowLayout.LEADING));
        e19.setPreferredSize(new Dimension(150,150));
        e19.add(e15);
        e15.setPreferredSize(new Dimension(130,25));
        e15.add(posi);
        e19.add(t5); e19.add(s1); e19.add(u1); e19.add(s2); e19.add(u2);
        e19.add(t6); e19.add(s3); e19.add(u3); e19.add(s4); e19.add(t7); e19.add(s8); e19.add(u4); e19.add(s9); e19.add(u8);
        e19.add(t9); e19.add(s10); e19.add(u6);  e19.add(s12);
        e19.add(t10); e19.add(s11); e19.add(u7);
        
        e16.add(e18, BorderLayout.SOUTH);
        e18.add(e20);
        e20.setLayout(new FlowLayout(FlowLayout.RIGHT));
        e20.add(save);
        
        pn3.setLayout(new BorderLayout());
        pn3.add(b8, BorderLayout.CENTER);
        pn3.add(pm2, BorderLayout.SOUTH);
        
        b8.setLayout(new BorderLayout());
        b9.add(c1);
        c1.setSize(10,10);
        b8.add(b9, BorderLayout.NORTH);
        b8.add(pm1,BorderLayout.CENTER);
        pm1.setLayout(new GridLayout(3,4));
        pm1.add(n1); pm1.add(n2); pm1.add(n3); pm1.add(n4);
        pm1.add(n5); pm1.add(n6); pm1.add(n7); pm1.add(n8);
        pm1.add(n9); pm1.add(n10); pm1.add(n11); pm1.add(n12);
        
        n1.add(pm4);
        n1.setLayout(new FlowLayout(FlowLayout.LEFT));
        pm4.setLayout(new BorderLayout());
        pm4.add(l1, BorderLayout.CENTER);
        pm4.add(f1, BorderLayout.SOUTH);
        
        n2.add(pm5);
        n2.setLayout(new FlowLayout(FlowLayout.LEFT));
        pm5.setLayout(new BorderLayout());
        pm5.add(l2, BorderLayout.CENTER);
        pm5.add(f2, BorderLayout.SOUTH);
        
        n3.add(pm6);
        pm6.setLayout(new BorderLayout());
        pm6.add(l3, BorderLayout.CENTER);
        pm6.add(f3, BorderLayout.SOUTH);
        
        n4.add(pm7);
        n4.setLayout(new FlowLayout(FlowLayout.LEFT));
        pm7.setLayout(new BorderLayout());
        pm7.add(l4, BorderLayout.CENTER);
        pm7.add(f4, BorderLayout.SOUTH);
        
        n5.add(pm8);
        n5.setLayout(new FlowLayout(FlowLayout.LEFT));
        pm8.setLayout(new BorderLayout());
        pm8.add(l5, BorderLayout.CENTER);
        pm8.add(f5, BorderLayout.SOUTH);
        
        n6.add(pm9);
        n6.setLayout(new FlowLayout(FlowLayout.LEFT));
        pm9.setLayout(new BorderLayout());
        pm9.add(l6, BorderLayout.CENTER);
        pm9.add(f6, BorderLayout.SOUTH);
        
        n7.add(pp1);
        n7.setLayout(new FlowLayout(FlowLayout.LEFT));
        pp1.setLayout(new BorderLayout());
        pp1.add(l7, BorderLayout.CENTER);
        pp1.add(f7, BorderLayout.SOUTH);
        
        n8.add(pp2);
        n8.setLayout(new FlowLayout(FlowLayout.LEFT));
        pp2.setLayout(new BorderLayout());
        pp2.add(l8, BorderLayout.CENTER);
        pp2.add(f8, BorderLayout.SOUTH);
        
        n9.add(pp3);
        n9.setLayout(new FlowLayout(FlowLayout.LEFT));
        pp3.setLayout(new BorderLayout());
        pp3.add(l9, BorderLayout.CENTER);
        pp3.add(p5, BorderLayout.SOUTH);
        p5.add(f9); p5.add(f10); p5.add(f11);
        
        n10.add(pp4);
        pp4.setLayout(new BorderLayout());
        pp4.add(l10, BorderLayout.CENTER);
        pp4.add(c3, BorderLayout.SOUTH);
        c3.add(f12); c3.add(lb1);
        
        n11.add(pp5);
        n11.setLayout(new FlowLayout(FlowLayout.LEFT));
        pp5.setLayout(new BorderLayout());
        pp5.add(l11, BorderLayout.NORTH);
        pp5.add(c4, BorderLayout.SOUTH);
        c4.setLayout(new FlowLayout(FlowLayout.LEFT));
        c4.add(f13); c4.add(lb2);
        
        n12.add(pp10);
        n12.setLayout(new FlowLayout(FlowLayout.LEFT));
        pp10.setLayout(new BorderLayout());
        pp10.add(l12, BorderLayout.NORTH);
        pp10.add(f14, BorderLayout.SOUTH);
        
        pm2.setLayout(new BorderLayout());
        
        pm2.add(pm3, BorderLayout.CENTER);
        pm2.add(pp9,BorderLayout.EAST);
        
        pm3.setLayout(new GridLayout(1,2));
        pm3.add(b1); pm3.add(b7);
        b1.add(pp6);
        pp6.setLayout(new BorderLayout());
        pp6.add(l13, BorderLayout.NORTH);
        pp6.add(ta1, BorderLayout.CENTER);
        pp6.add(b2, BorderLayout.SOUTH);
        
        b7.add(pp7);
        pp7.setLayout(new BorderLayout());
        pp7.add(l14, BorderLayout.NORTH);
        pp7.add(ta2, BorderLayout.CENTER);
        pp7.add(b2, BorderLayout.SOUTH);
        
        mb.add(mu1);
        mb.add(mu2);
        mb.add(mu3);
        
        mu1.addMouseListener(this);
        mu2.addMouseListener(this);
        mu3.addMouseListener(this);
        
        fr.setJMenuBar(mb);
        fr.add(pn1);
        fr.setSize(860,528);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public JFrame getFrame(){
        return fr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(edit)) {
        edit.setForeground(new Color(190, 18, 233));

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose Image");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog(fr);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon newIcon = new ImageIcon(selectedFile.getAbsolutePath());
            pic.setIcon(newIcon);
        }
        }
        if (e.getSource().equals(save)){
            System.out.println("SAVEEEEEEEEEEE");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JMenu press = (JMenu) e.getComponent();
        if (press.equals(mu1)){ 
            pn1.removeAll();
            pn1.setLayout(new BorderLayout());
            pn1.setBackground(Color.white);
            pn1.add(e1, BorderLayout.WEST);
            pn1.add(pp8, BorderLayout.CENTER);
            
            System.out.println("1");
            refreshFrame();
        }
        else if (press.equals(mu2)){
//            fr.getContentPane().removeAll();
//            fr.getContentPane().add(inf.getInfor());
            pn1.removeAll();
            pn1.setLayout(new BorderLayout());
            pn1.setBackground(Color.white);
            pn1.add(e1, BorderLayout.WEST);
            pn1.add(inf.getP(), BorderLayout.CENTER);
            System.out.println("2");
            refreshFrame();
        }
        else if (press.equals(mu3)){
            pn1.removeAll();
            pn1.setLayout(new BorderLayout());
            pn1.setBackground(Color.white);
            pn1.add(e1, BorderLayout.WEST);
            pn1.add(rig.getRights(), BorderLayout.CENTER);
            System.out.println("3");
            refreshFrame();
        }
        
    }

    private void refreshFrame() {
        fr.revalidate();
        fr.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    
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

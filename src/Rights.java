
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Rights implements ActionListener, ItemListener{
    public JPanel pn1,pn2,pn3,pn4,pm1,pm2,pm3,pm4,pm5,pm6,pm7,pm8,pm9,pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9,pp10,p1,p2,p3,p4,p5,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,b1,b2,b3,b4,b5,b6,b7,b8,b9,c1,c2,c3,c4,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,y1,y2;
    public JPanel r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20;
    public JTextField name,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
    public JTextArea ta1,ta2,ta3;
    public JButton save, edit;
    public JRadioButton rb1, rb2, rb3, rb4, rb5, rb6,rb7,rb8,rb9;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,lb1,lb2,t1,t2,t4,pic,posi,t5,t6,t7,t8,t9,t10,u1,u2,u3,u4,u5,u6,u7,u8,t3,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
    
    public Rights(){
        pn1 = new JPanel(); 
        pn2 = new JPanel(); pn2.setOpaque(false);
        pn3 = new JPanel(); pn3.setOpaque(false);
        pn4 = new popUp.RoundFillPanel(new Color(243,234,252), 218, 418, 20);  pn4.setOpaque(false);
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
        l1 = new JLabel("สิทธิในการจัดการระบบ"); l1.setForeground(new Color(100,80,153)); l1.setFont(new Font("Mitr", Font.PLAIN, 24));
        l2 = new JLabel("Room"); l2.setForeground(new Color(100,80,153)); l2.setFont(new Font("Mitr Light", Font.BOLD, 20));
        l3 = new JLabel("Room Setting"); l3.setForeground(new Color(100,80,153)); l3.setFont(new Font("Mitr Light", Font.BOLD, 20));
        l4 = new JLabel("Service"); l4.setForeground(new Color(100,80,153)); l4.setFont(new Font("Mitr Light", Font.BOLD, 20));
        l5 = new JLabel("Bill"); l5.setForeground(new Color(100,80,153)); l5.setFont(new Font("Mitr Light", Font.BOLD, 20));
        
        rb1 = new JRadioButton("ข้อมูลผู้เช่า"); rb1.setForeground(new Color(100,80,153)); rb1.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb1.setOpaque(false);
        rb2 = new JRadioButton("ข้อมูลการติดต่อ"); rb2.setForeground(new Color(100,80,153)); rb2.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb2.setOpaque(false);
        rb3 = new JRadioButton("ข้อมูลห้องพักที่เช่า"); rb3.setForeground(new Color(100,80,153)); rb3.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb3.setOpaque(false);
        rb4 = new JRadioButton("ข้อมูลห้องพัก"); rb4.setForeground(new Color(100,80,153)); rb4.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb4.setOpaque(false);
        rb5 = new JRadioButton("ข้อมูลห้องเช่า / ซ่อมบำรุง"); rb5.setForeground(new Color(100,80,153)); rb5.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb5.setOpaque(false);
        rb6 = new JRadioButton("บันทึกความประสงค์ในการใช้บริการทำความสะอาด / ซ่อมบำรุง"); rb6.setForeground(new Color(100,80,153)); rb6.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb6.setOpaque(false);
        rb7 = new JRadioButton("บันทึกรายการค่าใช้จ่ายของผู้เช่าในแต่ละห้อง"); rb7.setForeground(new Color(100,80,153)); rb7.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb7.setOpaque(false);
        rb8 = new JRadioButton("บันทึกมิเตอร์น้ำ - ไฟ"); rb8.setForeground(new Color(100,80,153)); rb8.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb8.setOpaque(false);
        rb9 = new JRadioButton("แก้ไขสถานะในการชำระเงิน"); rb9.setForeground(new Color(100,80,153)); rb9.setFont(new Font("Mitr Light", Font.PLAIN, 12)); rb9.setOpaque(false);
        
        
        l6 = new JLabel("ชื่อ"); l6.setForeground(new Color(100,80,153)); l6.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l7 = new JLabel("นามสกุล"); l7.setForeground(new Color(100,80,153)); l7.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l8 = new JLabel("บัตรประจำตัวประชาชน"); l8.setForeground(new Color(100,80,153)); l8.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l9 = new JLabel("อาชีพ"); l9.setForeground(new Color(100,80,153)); l9.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        
        l10 = new JLabel("ชื่อ"); l10.setForeground(new Color(100,80,153)); l10.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l11 = new JLabel("นามสกุล"); l11.setForeground(new Color(100,80,153)); l11.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l12 = new JLabel("บัตรประจำตัวประชาชน"); l12.setForeground(new Color(100,80,153)); l12.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l13 = new JLabel("อาชีพ"); l13.setForeground(new Color(100,80,153)); l13.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        
        l14 = new JLabel("ความสามารถ"); l14.setForeground(new Color(100,80,153)); l14.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l15 = new JLabel("ประวัติอาชญากรรม"); l15.setForeground(new Color(100,80,153)); l15.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l16 = new JLabel("ประสบการณ์ทำงาน"); l16.setForeground(new Color(100,80,153)); l16.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        
        f1 = new JTextField(8); f1.setForeground(new Color(56,53,120)); f1.setCaretColor(new Color(247,203,45)); f1.setBackground(new Color(250,244,255)); f1.setSelectedTextColor(new Color(190,18,233)); f1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f2 = new JTextField(10); f2.setForeground(new Color(56,53,120)); f2.setCaretColor(new Color(247,203,45)); f2.setBackground(new Color(250,244,255)); f2.setSelectedTextColor(new Color(190,18,233)); f2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f3 = new JTextField(10); f3.setForeground(new Color(56,53,120)); f3.setCaretColor(new Color(247,203,45)); f3.setBackground(new Color(250,244,255)); f3.setSelectedTextColor(new Color(190,18,233)); f3.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f4 = new JTextField(8); f4.setForeground(new Color(56,53,120)); f4.setCaretColor(new Color(247,203,45)); f4.setBackground(new Color(250,244,255)); f4.setSelectedTextColor(new Color(190,18,233)); f4.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f5 = new JTextField(13); f5.setForeground(new Color(56,53,120)); f5.setCaretColor(new Color(247,203,45)); f5.setBackground(new Color(250,244,255)); f5.setSelectedTextColor(new Color(190,18,233)); f5.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f6 = new JTextField(8); f6.setForeground(new Color(56,53,120)); f6.setCaretColor(new Color(247,203,45)); f6.setBackground(new Color(250,244,255)); f6.setSelectedTextColor(new Color(190,18,233)); f6.setFont(new Font("Mitr Light", Font.BOLD, 12));
        
        f7 = new JTextField(10); f7.setForeground(new Color(56,53,120)); f7.setCaretColor(new Color(247,203,45)); f7.setBackground(new Color(250,244,255)); f7.setSelectedTextColor(new Color(190,18,233)); f7.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f8 = new JTextField(10); f8.setForeground(new Color(56,53,120)); f8.setCaretColor(new Color(247,203,45)); f8.setBackground(new Color(250,244,255)); f8.setSelectedTextColor(new Color(190,18,233)); f8.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f9 = new JTextField(13); f9.setForeground(new Color(56,53,120)); f9.setCaretColor(new Color(247,203,45)); f9.setBackground(new Color(250,244,255)); f9.setSelectedTextColor(new Color(190,18,233)); f9.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f10 = new JTextField(7); f10.setForeground(new Color(56,53,120)); f10.setCaretColor(new Color(247,203,45)); f10.setBackground(new Color(250,244,255)); f10.setSelectedTextColor(new Color(190,18,233)); f10.setFont(new Font("Mitr Light", Font.BOLD, 12));
        
        f11 = new JTextField(10); f11.setForeground(new Color(56,53,120)); f11.setCaretColor(new Color(247,203,45)); f11.setBackground(new Color(250,244,255)); f11.setSelectedTextColor(new Color(190,18,233)); f11.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f12 = new JTextField(10); f12.setForeground(new Color(56,53,120)); f12.setCaretColor(new Color(247,203,45)); f12.setBackground(new Color(250,244,255)); f12.setSelectedTextColor(new Color(190,18,233)); f12.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f13 = new JTextField(13); f13.setForeground(new Color(56,53,120)); f13.setCaretColor(new Color(247,203,45)); f13.setBackground(new Color(250,244,255)); f13.setSelectedTextColor(new Color(190,18,233)); f13.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f14 = new JTextField(7); f14.setForeground(new Color(56,53,120)); f14.setCaretColor(new Color(247,203,45)); f14.setBackground(new Color(250,244,255)); f14.setSelectedTextColor(new Color(190,18,233)); f14.setFont(new Font("Mitr Light", Font.BOLD, 12));
        
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
        
        ta1 = new JTextArea(5,17); ta1.setForeground(new Color(56,53,120)); ta1.setCaretColor(new Color(247,203,45)); ta1.setBackground(new Color(250,244,255)); ta1.setSelectedTextColor(new Color(190,18,233)); ta1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        ta2 = new JTextArea(5,17); ta2.setForeground(new Color(56,53,120)); ta2.setCaretColor(new Color(247,203,45)); ta2.setBackground(new Color(250,244,255)); ta2.setSelectedTextColor(new Color(190,18,233)); ta2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        ta3 = new JTextArea(5,17); ta3.setForeground(new Color(56,53,120)); ta3.setCaretColor(new Color(247,203,45)); ta3.setBackground(new Color(250,244,255)); ta3.setSelectedTextColor(new Color(190,18,233)); ta3.setFont(new Font("Mitr Light", Font.BOLD, 12));
        
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
        
        r1 = new JPanel(); r1.setOpaque(false);
        r2 = new JPanel(); r2.setOpaque(false);
        r3 = new JPanel(); r3.setOpaque(false);
        r4 = new JPanel(); r4.setOpaque(false);
        r5 = new JPanel(); r5.setOpaque(false);
        r6 = new JPanel(); r6.setOpaque(false);
        r7 = new JPanel(); r7.setOpaque(false);
        r8 = new JPanel(); r8.setOpaque(false);
        r9 = new JPanel(); r9.setOpaque(false);
        r10 = new JPanel(); r10.setOpaque(false);
        r11 = new JPanel(); r11.setOpaque(false);
        r12 = new JPanel(); r12.setOpaque(false);
        r13 = new JPanel(); r13.setOpaque(false);
        r14 = new JPanel(); r14.setOpaque(false);
        r15 = new JPanel(); r15.setOpaque(false);
        r16 = new JPanel(); r16.setOpaque(false);
        r17 = new JPanel(); r17.setOpaque(false);
        r18 = new JPanel(); r18.setOpaque(false);
        r19 = new JPanel(); r19.setOpaque(false);
        r20 = new JPanel(); r20.setOpaque(false);
        
               
        name = new JTextField("name");
        pic = new JLabel();
        posi = new JLabel("position"); posi.setForeground(new Color(100,80,153)); posi.setFont(new Font("Mitr Light", Font.BOLD, 12));
        
        pn1.setLayout(new BorderLayout());
        pn1.setBackground(Color.white);
        pn1.add(e1, BorderLayout.WEST);
        pn1.add(pp8, BorderLayout.CENTER);
        
        //Don't Touch
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
        
        
        // edit
        pp8.add(r1, BorderLayout.CENTER);
        r1.setLayout(new FlowLayout(FlowLayout.LEADING));
        r1.add(l1); r1.add(r2); r2.setPreferredSize(new Dimension(300, 10));
        r1.add(l2); r1.add(r3); r3.setPreferredSize(new Dimension(500, 10));
        
        r1.add(r4); r1.add(r5); r5.setPreferredSize(new Dimension(400, 10));
        r4.setLayout(new GridLayout(3,1));
        r4.add(rb1); r4.add(rb2); r4.add(rb3);
        
        r1.add(l3); r1.add(r6); r6.setPreferredSize(new Dimension(400, 10));
        r1.add(r7); r1.add(r8); r8.setPreferredSize(new Dimension(400, 10));
        r7.setLayout(new GridLayout(2,1));
        r7.add(rb4); r7.add(rb5);
        
        r1.add(l4); r1.add(r9); r9.setPreferredSize(new Dimension(400, 10));
        r1.add(r10); r1.add(r11); r11.setPreferredSize(new Dimension(200, 10));
        r10.setLayout(new GridLayout(1,1));
        r10.add(rb6);
        
        r1.add(l5); r1.add(r12); r12.setPreferredSize(new Dimension(400, 10));
        r1.add(r13); r1.add(r14); r14.setPreferredSize(new Dimension(400, 10));
        r13.setLayout(new GridLayout(3,1));
        r13.add(rb7); r13.add(rb8); r13.add(rb9);
        
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
        rb4.addItemListener(this);
        rb5.addItemListener(this);
        rb6.addItemListener(this);
        rb7.addItemListener(this);
        rb8.addItemListener(this);
        rb9.addItemListener(this);
        
        
        
    }
    public JPanel getRights(){
        return pn1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(edit)) {
        edit.setForeground(new Color(190, 18, 233));

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose Image");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog(pn1);
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
    public void itemStateChanged(ItemEvent e) {
        if (rb1.isSelected()){
            System.out.println("s1");
        } 
        else{
            System.out.println("n1");
        }
        
        if (rb2.isSelected()){
            System.out.println("s2");
        } 
        else{
            System.out.println("n2");
        }
        
        if (rb3.isSelected()){
            System.out.println("s3");
        } 
        else{
            System.out.println("n3");
        }
        
        if (rb4.isSelected()){
            System.out.println("s4");
        } 
        else{
            System.out.println("n4");
        }
        
        if (rb5.isSelected()){
            System.out.println("s5");
        } 
        else{
            System.out.println("n5");
        }
        
        if (rb6.isSelected()){
            System.out.println("s6");
        } 
        else{
            System.out.println("n6");
        }
        
        if (rb7.isSelected()){
            System.out.println("s7");
        } 
        else{
            System.out.println("n7");
        }
        
        if (rb8.isSelected()){
            System.out.println("s8");
        } 
        else{
            System.out.println("n8");
        }
        
        if (rb9.isSelected()){
            System.out.println("s9");
        } 
        else{
            System.out.println("n9");
        }
        
    }

}

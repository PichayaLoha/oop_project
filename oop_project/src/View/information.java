package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class information implements ActionListener{
    public JPanel pn1,pn2,pn3,pn4,pm1,pm2,pm3,pm4,pm5,pm6,pm7,pm8,pm9,pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9,pp10,p1,p2,p3,p4,p5,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,b1,b2,b3,b4,b5,b6,b7,b8,b9,c1,c2,c3,c4,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,y1,y2;
    public JPanel o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23,o24,o25,o26,o27,o28;
    public JPanel a1;
    public JPanel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30,m31,m32,m33,m34,m35,m36,m37,m38,m39,m40,m41,m42,m43,m44;
    public JPanel h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,h15,h16,h17,h18;
    public JTextField name,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
    public JTextArea ta1,ta2,ta3;
    public JButton save, edit;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,lb1,lb2,t1,t2,t4,pic,posi,t5,t6,t7,t8,t9,t10,u1,u2,u3,u4,u5,u6,u7,u8,t3,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
    public information(){
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
        lb1 = new JLabel("Kg"); lb1.setForeground(new Color(100,80,153)); lb1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        lb2 = new JLabel("cm"); lb2.setForeground(new Color(100,80,153)); lb2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        l1 = new JLabel("สถานภาพส่วนตัว"); l1.setForeground(new Color(100,80,153)); l1.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l2 = new JLabel("ประวัติการศึกษา"); l2.setForeground(new Color(100,80,153)); l2.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l3 = new JLabel("เงินเดือน"); l3.setForeground(new Color(100,80,153)); l3.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l4 = new JLabel("โบนัสที่ได้รับ"); l4.setForeground(new Color(100,80,153)); l4.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l5 = new JLabel("บัญชีธนาคาร"); l5.setForeground(new Color(100,80,153)); l5.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        
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
        
        a1 = new JPanel(); a1.setOpaque(false);
        
        o1 = new JPanel(); o1.setOpaque(false);
        o2 = new JPanel(); o2.setOpaque(false);
        o3 = new JPanel(); o3.setOpaque(false);
        o4 = new JPanel(); o4.setOpaque(false);
        o5 = new JPanel(); o5.setOpaque(false);
        o6 = new JPanel(); o6.setOpaque(false);
        o7 = new JPanel(); o7.setOpaque(false);
        o8 = new JPanel(); o8.setOpaque(false);
        o9 = new JPanel(); o9.setOpaque(false);
        o10 = new JPanel(); o10.setOpaque(false);
        o11 = new JPanel(); o11.setOpaque(false);
        o12 = new JPanel(); o12.setOpaque(false);
        o13 = new JPanel(); o13.setOpaque(false);
        o14 = new JPanel(); o14.setOpaque(false);
        o15 = new JPanel(); o15.setOpaque(false);
        o16 = new JPanel(); o16.setOpaque(false);
        o17 = new JPanel(); o17.setOpaque(false);
        o18 = new JPanel(); o18.setOpaque(false);
        o19 = new JPanel(); o19.setOpaque(false);
        o20 = new JPanel(); o20.setOpaque(false);
        o21 = new JPanel(); o21.setOpaque(false);
        o22 = new JPanel(); o22.setOpaque(false);
        o23 = new JPanel(); o23.setOpaque(false);
        o24 = new JPanel(); o24.setOpaque(false);
        o25 = new JPanel(); o25.setOpaque(false);
        o26 = new JPanel(); o26.setOpaque(false);
        o27 = new JPanel(); o27.setOpaque(false);
        o28 = new JPanel(); o28.setOpaque(false);
        
        m1 = new JPanel(); m1.setOpaque(false);
        m2 = new JPanel(); m2.setOpaque(false);
        m3 = new JPanel(); m3.setOpaque(false);
        m4 = new JPanel(); m4.setOpaque(false);
        m5 = new JPanel(); m5.setOpaque(false);
        m6 = new JPanel(); m6.setOpaque(false);
        m7 = new JPanel(); m7.setOpaque(false);
        m8 = new JPanel(); m8.setOpaque(false);
        m9 = new JPanel(); m9.setOpaque(false);
        m10 = new JPanel(); m10.setOpaque(false);
        m11 = new JPanel(); m11.setOpaque(false);
        m12 = new JPanel(); m12.setOpaque(false);
        m13 = new JPanel(); m13.setOpaque(false);
        m14 = new JPanel(); m14.setOpaque(false);
        m15 = new JPanel(); m15.setOpaque(false);
        m16 = new JPanel(); m16.setOpaque(false);
        m17 = new JPanel(); m17.setOpaque(false);
        m18 = new JPanel(); m18.setOpaque(false);
        m19 = new JPanel(); m19.setOpaque(false);
        m20 = new JPanel(); m20.setOpaque(false);
        m21 = new JPanel(); m21.setOpaque(false);
        m22 = new JPanel(); m22.setOpaque(false);
        m23 = new JPanel(); m23.setOpaque(false);
        m24 = new JPanel(); m24.setOpaque(false);
        m25 = new JPanel(); m25.setOpaque(false);
        m26 = new JPanel(); m26.setOpaque(false);
        m27 = new JPanel(); m27.setOpaque(false);
        m28 = new JPanel(); m28.setOpaque(false);
        m29 = new JPanel(); m29.setOpaque(false);
        m30 = new JPanel(); m30.setOpaque(false);
        m31 = new JPanel(); m31.setOpaque(false);
        m32 = new JPanel(); m32.setOpaque(false);
        m33 = new JPanel(); m33.setOpaque(false);
        m34 = new JPanel(); m34.setOpaque(false);
        m35 = new JPanel(); m35.setOpaque(false);
        m36 = new JPanel(); m36.setOpaque(false);
        m37 = new JPanel(); m37.setOpaque(false);
        m38 = new JPanel(); m38.setOpaque(false);
        m39 = new JPanel(); m39.setOpaque(false);
        m40 = new JPanel(); m40.setOpaque(false);
        m41 = new JPanel(); m41.setOpaque(false);
        m42 = new JPanel(); m42.setOpaque(false);
        m43 = new JPanel(); m43.setOpaque(false);
        m44 = new JPanel(); m44.setOpaque(false);
        
        h1 = new JPanel(); h1.setOpaque(false);
        h2 = new JPanel(); h2.setOpaque(false);
        h3 = new JPanel(); h3.setOpaque(false);
        h4 = new JPanel(); h4.setOpaque(false);
        h5 = new JPanel(); h5.setOpaque(false);
        h6 = new JPanel(); h6.setOpaque(false);
        h7 = new JPanel(); h7.setOpaque(false);
        h8 = new JPanel(); h8.setOpaque(false);
        h9 = new JPanel(); h9.setOpaque(false);
        h10 = new JPanel(); h10.setOpaque(false);
        h11 = new JPanel(); h11.setOpaque(false);
        h12 = new JPanel(); h12.setOpaque(false);
        h13 = new JPanel(); h13.setOpaque(false);
        h14 = new JPanel(); h14.setOpaque(false);
        h15 = new JPanel(); h15.setOpaque(false);
        h16 = new JPanel(); h16.setOpaque(false);
        h17 = new JPanel(); h17.setOpaque(false);
        h18 = new JPanel(); h18.setOpaque(false);
        
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
        a1.setPreferredSize(new Dimension(200, 560));
        JScrollPane scrollPane = new JScrollPane(a1);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setPreferredSize(new Dimension(13, 400));
        verticalScrollBar.setOpaque(true);
        
        pp8.add(scrollPane, BorderLayout.CENTER);
        
        a1.setLayout(new BorderLayout());
        a1.add(o1, BorderLayout.NORTH);
        a1.add(m1, BorderLayout.CENTER);
        a1.add(h1, BorderLayout.SOUTH);
        
        o1.setLayout(new BorderLayout());
        o1.add(o2, BorderLayout.WEST);
        o2.setLayout(new GridLayout(2,2));
        o2.add(o4); o2.add(o5);
        o2.add(o6); o2.add(o7);
        
        o4.setLayout(new FlowLayout(FlowLayout.LEFT));
        o5.setLayout(new FlowLayout(FlowLayout.LEFT));
        o6.setLayout(new FlowLayout(FlowLayout.LEFT));
        o7.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        o4.add(o8);
        o8.add(o12);
        o12.setLayout(new BorderLayout());
        o12.add(o22, BorderLayout.CENTER);
        o22.setLayout(new FlowLayout(FlowLayout.LEFT));
        o22.add(l1);
        o12.add(o23, BorderLayout.SOUTH);
        o23.setLayout(new FlowLayout(FlowLayout.LEFT));
        o23.add(f1);
        
        o5.add(o9);
        o9.add(o13);
        o13.setLayout(new BorderLayout());
        o13.add(o16, BorderLayout.CENTER);
        o16.setLayout(new FlowLayout(FlowLayout.LEFT));
        o16.add(l2);
        o13.add(o17, BorderLayout.SOUTH);
        o17.setLayout(new FlowLayout(FlowLayout.LEFT));
        o17.add(f2);
        
        o6.add(o10);
        o10.add(o14);
        o14.setLayout(new BorderLayout());
        o14.add(o18, BorderLayout.CENTER);
        o18.setLayout(new FlowLayout(FlowLayout.LEFT));
        o18.add(l3);
        o14.add(o19, BorderLayout.SOUTH);
        o19.setLayout(new FlowLayout(FlowLayout.LEFT));
        o19.add(f3);
        
        o7.add(o11);
        o11.add(o15);
        o15.setLayout(new BorderLayout());
        o15.add(o20, BorderLayout.CENTER);
        o20.setLayout(new FlowLayout(FlowLayout.LEFT));
        o20.add(l4);
        o15.add(o21, BorderLayout.SOUTH);
        o21.setLayout(new FlowLayout(FlowLayout.LEFT));
        o21.add(f4);
        
        o1.add(o3, BorderLayout.CENTER);
        o3.setLayout(new GridLayout(2,1));
        o3.add(o24);
        o3.add(o25);
        o25.add(o28);
        o28.setLayout(new BorderLayout());
        o28.add(o26, BorderLayout.CENTER);
        o26.setLayout(new FlowLayout(FlowLayout.LEFT));
        o26.add(l5);
        o28.add(o27, BorderLayout.SOUTH);
        o27.setLayout(new FlowLayout(FlowLayout.LEFT));
        o27.add(f6); o27.add(f5);
        
        m1.setLayout(new GridLayout(1,2));
        m1.add(m2); m1.add(m3);
        TitledBorder titledBorder = BorderFactory.createTitledBorder("ข้อมูลบิดา");
        titledBorder.setTitleFont(new Font("Mitr Light", Font.BOLD, 30));
        titledBorder.setTitleColor(new Color(100,80,153));

        m2.setBorder(titledBorder);
        m2.add(m4);
        m2.setLayout(new BorderLayout());
        m2.add(m4, BorderLayout.CENTER);
        m4.setLayout(new BorderLayout());
        m4.add(m6, BorderLayout.NORTH);
        m6.setLayout(new GridLayout(1,2));
        m6.add(m9); m6.add(m10);
        
        m9.add(m11);
        m9.setLayout(new FlowLayout(FlowLayout.LEFT));
        m11.setLayout(new BorderLayout());
        m11.add(m12, BorderLayout.CENTER);
        m12.setLayout(new FlowLayout(FlowLayout.LEFT));
        m12.add(l6);
        m11.add(m13, BorderLayout.SOUTH);
        m13.setLayout(new FlowLayout(FlowLayout.LEFT));
        m13.add(f7);
        
        m10.add(m14);
        m10.setLayout(new FlowLayout(FlowLayout.LEFT));
        m14.setLayout(new BorderLayout());
        m14.add(m15, BorderLayout.CENTER);
        m15.setLayout(new FlowLayout(FlowLayout.LEFT));
        m15.add(l7);
        m14.add(m16, BorderLayout.SOUTH);
        m16.setLayout(new FlowLayout(FlowLayout.LEFT));
        m16.add(f8);
        
        m4.add(m7, BorderLayout.CENTER);
        m7.setLayout(new FlowLayout(FlowLayout.LEFT));
        m7.add(m17);
        m17.setLayout(new FlowLayout(FlowLayout.LEFT));
        m17.add(m18);
        m18.setLayout(new BorderLayout());
        m18.add(m19, BorderLayout.CENTER);
        m19.setLayout(new FlowLayout(FlowLayout.LEFT));
        m19.add(l8);
        m18.add(m20, BorderLayout.SOUTH);
        m20.setLayout(new FlowLayout(FlowLayout.LEFT));
        m20.add(f9);
        
        m4.add(m8, BorderLayout.SOUTH);
        m8.setLayout(new FlowLayout(FlowLayout.LEFT));
        m8.add(m21);
        m21.setLayout(new FlowLayout(FlowLayout.LEFT));
        m21.add(m22);
        m22.setLayout(new BorderLayout());
        m22.add(m23,BorderLayout.CENTER);
        m23.setLayout(new FlowLayout(FlowLayout.LEFT));
        m23.add(l9);
        m22.add(m24, BorderLayout.SOUTH);
        m24.setLayout(new FlowLayout(FlowLayout.LEFT));
        m24.add(f10);
        
        m3.add(m5);
        TitledBorder titledBorderM3 = BorderFactory.createTitledBorder("ข้อมูลมารดา");
        titledBorderM3.setTitleFont(new Font("Mitr Light", Font.BOLD, 12));
        titledBorderM3.setTitleColor(new Color(100, 80, 153));

        m3.setBorder(titledBorderM3);
        m3.setLayout(new BorderLayout());
        m3.add(m25, BorderLayout.CENTER);
        m3.add(m25);
        m25.setLayout(new BorderLayout());
        m25.add(m26, BorderLayout.NORTH);
        m26.setLayout(new GridLayout(1,2));
        m26.add(m27); m26.add(m28);
        
        m27.add(m29);
        m27.setLayout(new FlowLayout(FlowLayout.LEFT));
        m29.setLayout(new BorderLayout());
        m29.add(m30, BorderLayout.CENTER);
        m30.setLayout(new FlowLayout(FlowLayout.LEFT));
        m30.add(l10);
        m29.add(m31, BorderLayout.SOUTH);
        m31.setLayout(new FlowLayout(FlowLayout.LEFT));
        m31.add(f11);
        
        m28.add(m32);
        m28.setLayout(new FlowLayout(FlowLayout.LEFT));
        m32.setLayout(new BorderLayout());
        m32.add(m33, BorderLayout.CENTER);
        m33.setLayout(new FlowLayout(FlowLayout.LEFT));
        m33.add(l11);
        m32.add(m34, BorderLayout.SOUTH);
        m34.setLayout(new FlowLayout(FlowLayout.LEFT));
        m34.add(f12);
        
        m25.add(m35, BorderLayout.CENTER);
        m35.setLayout(new FlowLayout(FlowLayout.LEFT));
        m35.add(m36);
        m36.setLayout(new FlowLayout(FlowLayout.LEFT));
        m36.add(m37);
        m37.setLayout(new BorderLayout());
        m37.add(m38, BorderLayout.CENTER);
        m38.setLayout(new FlowLayout(FlowLayout.LEFT));
        m38.add(l12);
        m37.add(m39, BorderLayout.SOUTH);
        m39.setLayout(new FlowLayout(FlowLayout.LEFT));
        m39.add(f13);
        
        m25.add(m40, BorderLayout.SOUTH);
        m40.setLayout(new FlowLayout(FlowLayout.LEFT));
        m40.add(m41);
        m41.setLayout(new FlowLayout(FlowLayout.LEFT));
        m41.add(m42);
        m42.setLayout(new BorderLayout());
        m42.add(m43,BorderLayout.CENTER);
        m43.setLayout(new FlowLayout(FlowLayout.LEFT));
        m43.add(l13);
        m42.add(m44, BorderLayout.SOUTH);
        m44.setLayout(new FlowLayout(FlowLayout.LEFT));
        m44.add(f14);
        
        h1.setLayout(new GridLayout(1,3));
        h1.add(h2); h1.add(h3); h1.add(h4);
        
        h2.add(h5);
        h5.setLayout(new BorderLayout());
        h5.add(h6, BorderLayout.NORTH);
        h6.setLayout(new FlowLayout(FlowLayout.LEFT));
        h6.add(l14);
        h5.add(h7, BorderLayout.CENTER);
        h7.setLayout(new FlowLayout(FlowLayout.LEFT));
        h7.add(ta1);
        
        h3.add(h8);
        h8.setLayout(new BorderLayout());
        h8.add(h9, BorderLayout.NORTH);
        h9.setLayout(new FlowLayout(FlowLayout.LEFT));
        h9.add(l15);
        h8.add(h10, BorderLayout.CENTER);
        h10.setLayout(new FlowLayout(FlowLayout.LEFT));
        h10.add(ta2);
        
        h4.add(h11);
        h11.setLayout(new BorderLayout());
        h11.add(h12, BorderLayout.NORTH);
        h12.setLayout(new FlowLayout(FlowLayout.LEFT));
        h12.add(l16);
        h11.add(h13, BorderLayout.CENTER);
        h13.setLayout(new FlowLayout(FlowLayout.LEFT));
        h13.add(ta3);
        
    }
    
    public JPanel getInfor(){
        return pn1;
    }
    public JPanel getP(){
        return pp8;
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
}

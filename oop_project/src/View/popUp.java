package View;

import Models.empModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
import java.util.List;
import java.sql.*;

public class popUp implements ActionListener, MouseListener {

    private JFrame fr;
    private JPanel pn1, pn2, pn3, pn4, pm1, pm2, pm3, pm4, pm5, pm6, pm7, pm8, pm9, pp1, pp2, pp3, pp4, pp5, pp6, pp7, pp8, pp9, pp10, p1, p2, p3, p4, p5, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, b1, b2, b3, b4, b5, b6, b7, b8, b9, c1, c2, c3, c4;
   private JPanel e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, y1, y2, y3;
    private JTextField name, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14;
    private JMenu mu1, mu2, mu3;
    private JButton save, edit;
    private JTextArea ta1, ta2;
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, lb1, lb2, t1, t2, t4, pic, posi, t5, t6, t7, t8, t9, t10, u1, u2, u3, u4, u5, u6, u7, u8, t3, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13;
//    public Employee em;
    private JMenuBar mb;
    private Rights rig;
//    public data acData;
//    public ArrayList<data> dt;
//    private int index;

    public popUp() {
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn2.setOpaque(false);
        pn3 = new JPanel();
        pn3.setOpaque(false);
        pn4 = new RoundFillPanel(new Color(243, 234, 252), 218, 418, 20);
        pn4.setOpaque(false);
        pm1 = new JPanel();
        pm1.setOpaque(false);
        pm2 = new JPanel();
        pm2.setOpaque(false);
        pm3 = new JPanel();
        pm3.setOpaque(false);
        pm4 = new JPanel();
        pm4.setOpaque(false);
        pm5 = new JPanel();
        pm5.setOpaque(false);
        pm6 = new JPanel();
        pm6.setOpaque(false);
        pm7 = new JPanel();
        pm7.setOpaque(false);
        pm8 = new JPanel();
        pm8.setOpaque(false);
        pm9 = new JPanel();
        pm9.setOpaque(false);
        pp1 = new JPanel();
        pp1.setOpaque(false);
        pp2 = new JPanel();
        pp2.setOpaque(false);
        pp3 = new JPanel();
        pp3.setOpaque(false);
        pp4 = new JPanel();
        pp4.setOpaque(false);
        pp5 = new JPanel();
        pp5.setOpaque(false);
        pp6 = new JPanel();
        pp6.setOpaque(false);
        pp7 = new JPanel();
        pp7.setOpaque(false);
        pp8 = new JPanel();
        pp8.setOpaque(false);
        pp9 = new JPanel();
        pp9.setOpaque(false);
        pp10 = new JPanel();
        pp10.setOpaque(false);
        p1 = new JPanel();
        p1.setOpaque(false);
        p2 = new JPanel();
        p2.setOpaque(false);
        p3 = new JPanel();
        p3.setOpaque(false);
        p4 = new JPanel();
        p4.setOpaque(false);
        p5 = new JPanel();
        p5.setOpaque(false);
        n1 = new JPanel();
        n1.setOpaque(false);
        n2 = new JPanel();
        n2.setOpaque(false);
        n3 = new JPanel();
        n3.setOpaque(false);
        n4 = new JPanel();
        n4.setOpaque(false);
        n5 = new JPanel();
        n5.setOpaque(false);
        n6 = new JPanel();
        n6.setOpaque(false);
        n7 = new JPanel();
        n7.setOpaque(false);
        n8 = new JPanel();
        n8.setOpaque(false);
        n9 = new JPanel();
        n9.setOpaque(false);
        n10 = new JPanel();
        n10.setOpaque(false);
        n11 = new JPanel();
        n11.setOpaque(false);
        n12 = new JPanel();
        n12.setOpaque(false);
        n13 = new JPanel();
        n13.setOpaque(false);
        n14 = new JPanel();
        n14.setOpaque(false);
        lb1 = new JLabel("Bath");
        lb1.setForeground(new Color(100, 80, 153));
        lb1.setFont(new Font("Mitr Light", Font.BOLD, 12));
//        lb2 = new JLabel("cm");
//        lb2.setForeground(new Color(100, 80, 153));
//        lb2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        l1 = new JLabel("Firstname");
        l1.setForeground(new Color(100, 80, 153));
        l1.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l2 = new JLabel("Lastname");
        l2.setForeground(new Color(100, 80, 153));
        l2.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l3 = new JLabel("Gender");
        l3.setForeground(new Color(100, 80, 153));
        l3.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l4 = new JLabel("Position");
        l4.setForeground(new Color(100, 80, 153));
        l4.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l5 = new JLabel("ID Card");
        l5.setForeground(new Color(100, 80, 153));
        l5.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l6 = new JLabel("salary");
        l6.setForeground(new Color(100, 80, 153));
        l6.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l7 = new JLabel("nationality");
        l7.setForeground(new Color(100, 80, 153));
        l7.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l9 = new JLabel("education");
        l9.setForeground(new Color(100, 80, 153));
        l9.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l10 = new JLabel("bank number");
        l10.setForeground(new Color(100, 80, 153));
        l10.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l11 = new JLabel("Telephone number");
        l11.setForeground(new Color(100, 80, 153));
        l11.setFont(new Font("Mitr Light", Font.PLAIN, 12));
//        l12 = new JLabel("กรุ๊ปเลือด");
//        l12.setForeground(new Color(100, 80, 153));
//        l12.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l13 = new JLabel("address");
        l13.setForeground(new Color(100, 80, 153));
        l13.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l14 = new JLabel("congenital disease");
        l14.setForeground(new Color(100, 80, 153));
        l14.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        l8 = new JLabel("religion");
        l8.setForeground(new Color(100, 80, 153));
        l8.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        f1 = new JTextField(13);
        f1.setForeground(new Color(56, 53, 120));
        f1.setCaretColor(new Color(247, 203, 45));
        f1.setBackground(new Color(250, 244, 255));
        f1.setSelectedTextColor(new Color(190, 18, 233));
        f1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f2 = new JTextField(13);
        f2.setForeground(new Color(56, 53, 120));
        f2.setCaretColor(new Color(247, 203, 45));
        f2.setBackground(new Color(250, 244, 255));
        f2.setSelectedTextColor(new Color(190, 18, 233));
        f2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f3 = new JTextField(8);
        f3.setForeground(new Color(56, 53, 120));
        f3.setCaretColor(new Color(247, 203, 45));
        f3.setBackground(new Color(250, 244, 255));
        f3.setSelectedTextColor(new Color(190, 18, 233));
        f3.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f4 = new JTextField(13);
        f4.setForeground(new Color(56, 53, 120));
        f4.setCaretColor(new Color(247, 203, 45));
        f4.setBackground(new Color(250, 244, 255));
        f4.setSelectedTextColor(new Color(190, 18, 233));
        f4.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f5 = new JTextField(13);
        f5.setForeground(new Color(56, 53, 120));
        f5.setCaretColor(new Color(247, 203, 45));
        f5.setBackground(new Color(250, 244, 255));
        f5.setSelectedTextColor(new Color(190, 18, 233));
        f5.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f6 = new JTextField(8);
        f6.setForeground(new Color(56, 53, 120));
        f6.setCaretColor(new Color(247, 203, 45));
        f6.setBackground(new Color(250, 244, 255));
        f6.setSelectedTextColor(new Color(190, 18, 233));
        f6.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f7 = new JTextField(8);
        f7.setForeground(new Color(56, 53, 120));
        f7.setCaretColor(new Color(247, 203, 45));
        f7.setBackground(new Color(250, 244, 255));
        f7.setSelectedTextColor(new Color(190, 18, 233));
        f7.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f8 = new JTextField(8);
        f8.setForeground(new Color(56, 53, 120));
        f8.setCaretColor(new Color(247, 203, 45));
        f8.setBackground(new Color(250, 244, 255));
        f8.setSelectedTextColor(new Color(190, 18, 233));
        f8.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f9 = new JTextField(12);
        f9.setForeground(new Color(56, 53, 120));
        f9.setCaretColor(new Color(247, 203, 45));
        f9.setBackground(new Color(250, 244, 255));
        f9.setSelectedTextColor(new Color(190, 18, 233));
        f9.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f10 = new JTextField(5);
        f10.setForeground(new Color(56, 53, 120));
        f10.setCaretColor(new Color(247, 203, 45));
        f10.setBackground(new Color(250, 244, 255));
        f10.setSelectedTextColor(new Color(190, 18, 233));
        f10.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f11 = new JTextField(2);
        f11.setForeground(new Color(56, 53, 120));
        f11.setCaretColor(new Color(247, 203, 45));
        f11.setBackground(new Color(250, 244, 255));
        f11.setSelectedTextColor(new Color(190, 18, 233));
        f11.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f12 = new JTextField(10);
        f12.setForeground(new Color(56, 53, 120));
        f12.setCaretColor(new Color(247, 203, 45));
        f12.setBackground(new Color(250, 244, 255));
        f12.setSelectedTextColor(new Color(190, 18, 233));
        f12.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f13 = new JTextField(10);
        f13.setForeground(new Color(56, 53, 120));
        f13.setCaretColor(new Color(247, 203, 45));
        f13.setBackground(new Color(250, 244, 255));
        f13.setSelectedTextColor(new Color(190, 18, 233));
        f13.setFont(new Font("Mitr Light", Font.BOLD, 12));
        f14 = new JTextField(5);
        f14.setForeground(new Color(56, 53, 120));
        f14.setCaretColor(new Color(247, 203, 45));
        f14.setBackground(new Color(250, 244, 255));
        f14.setSelectedTextColor(new Color(190, 18, 233));
        f14.setFont(new Font("Mitr Light", Font.BOLD, 12));
        ta1 = new JTextArea(10, 25);
        ta1.setForeground(new Color(56, 53, 120));
        ta1.setCaretColor(new Color(247, 203, 45));
        ta1.setBackground(new Color(250, 244, 255));
        ta1.setSelectedTextColor(new Color(190, 18, 233));
        ta1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        ta2 = new JTextArea(10, 25);
        ta2.setForeground(new Color(56, 53, 120));
        ta2.setCaretColor(new Color(247, 203, 45));
        ta2.setBackground(new Color(250, 244, 255));
        ta2.setSelectedTextColor(new Color(190, 18, 233));
        ta2.setFont(new Font("Mitr Light", Font.BOLD, 12));

        t5 = new JLabel("name");
        t5.setForeground(new Color(100, 80, 153));
        t5.setFont(new Font("Mitr Light", Font.BOLD, 12));
        t6 = new JLabel("gender");
        t6.setForeground(new Color(100, 80, 153));
        t6.setFont(new Font("Mitr Light", Font.BOLD, 12));
//        t7 = new JLabel("อายุ");
//        t7.setForeground(new Color(100, 80, 153));
//        t7.setFont(new Font("Mitr Light", Font.BOLD, 12));
//        t8 = new JLabel("เชื้อชาติ");
//        t8.setForeground(new Color(100, 80, 153));
//        t8.setFont(new Font("Mitr Light", Font.BOLD, 12));
        t9 = new JLabel("nationality");
        t9.setForeground(new Color(100, 80, 153));
        t9.setFont(new Font("Mitr Light", Font.BOLD, 12));
        t10 = new JLabel("religion");
        t10.setForeground(new Color(100, 80, 153));
        t10.setFont(new Font("Mitr Light", Font.BOLD, 12));
        u1 = new JLabel("");
        u1.setForeground(new Color(100, 80, 153));
        u1.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u2 = new JLabel("");
        u2.setForeground(new Color(100, 80, 153));
        u2.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u3 = new JLabel("");
        u3.setForeground(new Color(100, 80, 153));
        u3.setFont(new Font("Mitr Light", Font.PLAIN, 12));
//        u4 = new JLabel("4"); u4.setForeground(new Color(100,80,153)); u4.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u5 = new JLabel("");
        u5.setForeground(new Color(100, 80, 153));
        u5.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u6 = new JLabel("");
        u6.setForeground(new Color(100, 80, 153));
        u6.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u7 = new JLabel("");
        u7.setForeground(new Color(100, 80, 153));
        u7.setFont(new Font("Mitr Light", Font.PLAIN, 12));
        u8 = new JLabel("");
        u8.setForeground(new Color(100, 80, 153));
        u8.setFont(new Font("Mitr Light", Font.BOLD, 12));

        b1 = new JPanel();
        b1.setOpaque(false);
        b2 = new JPanel();
        b2.setOpaque(false);
        b3 = new JPanel();
        b3.setOpaque(false);
        b4 = new JPanel();
        b4.setOpaque(false);
        b5 = new JPanel();
        b5.setOpaque(false);
        b6 = new JPanel();
        b6.setOpaque(false);
        b7 = new JPanel();
        b7.setOpaque(false);
        b8 = new JPanel();
        b8.setOpaque(false);
        b9 = new JPanel();
        b9.setOpaque(false);
        c1 = new JPanel();
        c1.setOpaque(false);
        c2 = new JPanel();
        c2.setOpaque(false);
        c3 = new JPanel();
        c3.setOpaque(false);
        c4 = new JPanel();
        c4.setOpaque(false);

        e1 = new JPanel();
        e1.setOpaque(false);
        e2 = new JPanel();
        e2.setOpaque(false);
        e3 = new JPanel();
        e3.setOpaque(false);
        e4 = new JPanel();
        e4.setOpaque(false);
        e5 = new JPanel();
        e5.setOpaque(false);
        e6 = new JPanel();
        e6.setOpaque(false);
        e7 = new JPanel();
        e7.setOpaque(false);
        e8 = new JPanel();
        e8.setOpaque(false);
        e9 = new JPanel();
        e9.setOpaque(false);
        e10 = new JPanel();
        e10.setOpaque(false);
        e11 = new JPanel();
        e11.setOpaque(false);
        e12 = new JPanel();
        e12.setOpaque(false);
        e13 = new JPanel();
        e13.setOpaque(false);
        e14 = new JPanel();
        e14.setOpaque(false);
        e15 = new JPanel();
        e15.setOpaque(false);
        e16 = new JPanel();
        e16.setOpaque(false);
        e17 = new JPanel();
        e17.setOpaque(false);
        e18 = new JPanel();
        e18.setOpaque(false);
        e19 = new JPanel();
        e19.setOpaque(false);
        e20 = new JPanel();
        e20.setOpaque(false);
        e21 = new JPanel();
        e21.setOpaque(false);

        y1 = new JPanel();
        y1.setOpaque(false);
        y2 = new JPanel();
        y2.setOpaque(false);
        y3 = new JPanel();
        y3.setOpaque(false);
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
        rig = new Rights();

        mb = new JMenuBar();
        name = new JTextField("name");
        URL imageURL = account.class.getResource("Kon na lak.png");
        ImageIcon imageIcon = new ImageIcon(imageURL);
        pic = new JLabel(imageIcon);

        posi = new JLabel("position");
        posi.setForeground(new Color(100, 80, 153));
        posi.setFont(new Font("Mitr Light", Font.BOLD, 12));
        mu1 = new JMenu("Employee information");
        mu1.setForeground(new Color(100, 80, 153));
        mu1.setFont(new Font("Mitr Light", Font.BOLD, 12));
        mu2 = new JMenu("Personal information");
        mu2.setForeground(new Color(100, 80, 153));
        mu2.setFont(new Font("Mitr Light", Font.BOLD, 12));
        mu3 = new JMenu("Rights management");
        mu3.setForeground(new Color(100, 80, 153));
        mu3.setFont(new Font("Mitr Light", Font.BOLD, 12));

        edit = new JButton("Edit Picture");
        edit.setContentAreaFilled(false);
        edit.setBorderPainted(false);
        edit.setForeground(new Color(100, 80, 153));
        edit.setFont(new Font("Mitr Light", Font.BOLD, 12));
        edit.addActionListener(this);

        save = new JButton("Save");
        save.setContentAreaFilled(false);
        save.setBorderPainted(false);
        save.setForeground(new Color(100, 80, 153));
        save.setFont(new Font("Mitr Light", Font.BOLD, 12));
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
        p1.setSize(5, 20);
        p1.add(b3);
        p2.add(b4);
        p3.add(b5);
        p4.add(b6);
        b3.setSize(10, 10);
        b4.setSize(10, 10);
        b5.setSize(10, 10);
        b6.setSize(10, 10);

        pp8.setSize(200, 458);

        pn2.add(pn4);
        pn2.setPreferredSize(new Dimension(233, 400));

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
        e6.setPreferredSize(new Dimension(157, 210));
        e9.add(e10);
        e10.setLayout(new BorderLayout());
        e10.add(e11, BorderLayout.CENTER);
        e11.add(e12);
        e12.setPreferredSize(new Dimension(157, 159));
        e12.add(pic);
        e10.add(e13, BorderLayout.SOUTH);
        e13.add(edit);

        pn4.add(e8, BorderLayout.CENTER);
        e8.add(e16);
        e16.setLayout(new BorderLayout());

        e16.add(e17, BorderLayout.CENTER);
        e16.setPreferredSize(new Dimension(157, 199));
        e17.add(e19);
        e19.setLayout(new FlowLayout(FlowLayout.LEADING));
        e19.setPreferredSize(new Dimension(160, 150));
        e19.add(e15);
        e15.setPreferredSize(new Dimension(140, 25));
        e15.add(posi);
        e19.add(t5);
        e19.add(s1);
        e19.add(u1);
        e19.add(s2);
        e19.add(u2);
        e19.add(t6);
        e19.add(s3);
        e19.add(u3);
        e19.add(s4);
        e19.add(t9);
        e19.add(s10);
        e19.add(u6);
        e19.add(t10);
        e19.add(u7);

        e16.add(e18, BorderLayout.SOUTH);
        e18.add(e20);
        e20.setLayout(new FlowLayout(FlowLayout.RIGHT));
        e20.add(save);

        pn3.setLayout(new BorderLayout());
        pn3.add(b8, BorderLayout.CENTER);
        pn3.add(pm2, BorderLayout.SOUTH);

        b8.setLayout(new BorderLayout());
        b9.add(c1);
        c1.setSize(10, 10);
        b8.add(b9, BorderLayout.NORTH);
        b8.add(pm1, BorderLayout.CENTER);
        pm1.setLayout(new GridLayout(3, 4));
        pm1.add(n1);
        pm1.add(n2);
        pm1.add(n3);
        pm1.add(n4);
        pm1.add(n5);
        pm1.add(n6);
        pm1.add(n7);
        pm1.add(n8);
        pm1.add(n9);
        pm1.add(n10);
        pm1.add(n11);
        pm1.add(n12);

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
//        n6.setLayout(new FlowLayout(FlowLayout.LEFT));
        pm9.setLayout(new BorderLayout());
        pm9.add(l6, BorderLayout.CENTER);
        pm9.add(y3, BorderLayout.SOUTH);
//        y3.setLayout(new FlowLayout(FlowLayout.LEFT));
        y3.add(f6);
        y3.add(lb1);

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
        p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        p5.add(f9);

        n10.add(pp4);
//        n10.setLayout(new FlowLayout(FlowLayout.LEFT));
        pp4.setLayout(new BorderLayout());
        pp4.add(l10, BorderLayout.CENTER);
        pp4.add(c3, BorderLayout.SOUTH);
        c3.setLayout(new FlowLayout(FlowLayout.LEFT));
        c3.add(f12);

        n11.add(pp5);
        n11.setLayout(new FlowLayout(FlowLayout.LEFT));
        pp5.setLayout(new BorderLayout());
        pp5.add(l11, BorderLayout.NORTH);
        pp5.add(c4, BorderLayout.SOUTH);
        c4.setLayout(new FlowLayout(FlowLayout.LEFT));
        c4.add(f13);

//        n12.add(pp10);
        n12.setLayout(new FlowLayout(FlowLayout.LEFT));
        pp10.setLayout(new BorderLayout());
//        pp10.add(l12, BorderLayout.NORTH);
        pp10.add(f14, BorderLayout.SOUTH);

        pm2.setLayout(new BorderLayout());

        pm2.add(pm3, BorderLayout.CENTER);
        pm2.add(pp9, BorderLayout.EAST);

        pm3.setLayout(new GridLayout(1, 2));
        pm3.add(b1);
        pm3.add(b7);
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
//        mb.add(mu2);
        mb.add(mu3);

        mu1.addMouseListener(this);
//        mu2.addMouseListener(this);
        mu3.addMouseListener(this);

        fr.setJMenuBar(mb);
        fr.add(pn1);
        fr.setSize(860, 528);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
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

    public JPanel getPm1() {
        return pm1;
    }

    public void setPm1(JPanel pm1) {
        this.pm1 = pm1;
    }

    public JPanel getPm2() {
        return pm2;
    }

    public void setPm2(JPanel pm2) {
        this.pm2 = pm2;
    }

    public JPanel getPm3() {
        return pm3;
    }

    public void setPm3(JPanel pm3) {
        this.pm3 = pm3;
    }

    public JPanel getPm4() {
        return pm4;
    }

    public void setPm4(JPanel pm4) {
        this.pm4 = pm4;
    }

    public JPanel getPm5() {
        return pm5;
    }

    public void setPm5(JPanel pm5) {
        this.pm5 = pm5;
    }

    public JPanel getPm6() {
        return pm6;
    }

    public void setPm6(JPanel pm6) {
        this.pm6 = pm6;
    }

    public JPanel getPm7() {
        return pm7;
    }

    public void setPm7(JPanel pm7) {
        this.pm7 = pm7;
    }

    public JPanel getPm8() {
        return pm8;
    }

    public void setPm8(JPanel pm8) {
        this.pm8 = pm8;
    }

    public JPanel getPm9() {
        return pm9;
    }

    public void setPm9(JPanel pm9) {
        this.pm9 = pm9;
    }

    public JPanel getPp1() {
        return pp1;
    }

    public void setPp1(JPanel pp1) {
        this.pp1 = pp1;
    }

    public JPanel getPp2() {
        return pp2;
    }

    public void setPp2(JPanel pp2) {
        this.pp2 = pp2;
    }

    public JPanel getPp3() {
        return pp3;
    }

    public void setPp3(JPanel pp3) {
        this.pp3 = pp3;
    }

    public JPanel getPp4() {
        return pp4;
    }

    public void setPp4(JPanel pp4) {
        this.pp4 = pp4;
    }

    public JPanel getPp5() {
        return pp5;
    }

    public void setPp5(JPanel pp5) {
        this.pp5 = pp5;
    }

    public JPanel getPp6() {
        return pp6;
    }

    public void setPp6(JPanel pp6) {
        this.pp6 = pp6;
    }

    public JPanel getPp7() {
        return pp7;
    }

    public void setPp7(JPanel pp7) {
        this.pp7 = pp7;
    }

    public JPanel getPp8() {
        return pp8;
    }

    public void setPp8(JPanel pp8) {
        this.pp8 = pp8;
    }

    public JPanel getPp9() {
        return pp9;
    }

    public void setPp9(JPanel pp9) {
        this.pp9 = pp9;
    }

    public JPanel getPp10() {
        return pp10;
    }

    public void setPp10(JPanel pp10) {
        this.pp10 = pp10;
    }

    public JPanel getP1() {
        return p1;
    }

    public void setP1(JPanel p1) {
        this.p1 = p1;
    }

    public JPanel getP2() {
        return p2;
    }

    public void setP2(JPanel p2) {
        this.p2 = p2;
    }

    public JPanel getP3() {
        return p3;
    }

    public void setP3(JPanel p3) {
        this.p3 = p3;
    }

    public JPanel getP4() {
        return p4;
    }

    public void setP4(JPanel p4) {
        this.p4 = p4;
    }

    public JPanel getP5() {
        return p5;
    }

    public void setP5(JPanel p5) {
        this.p5 = p5;
    }

    public JPanel getN1() {
        return n1;
    }

    public void setN1(JPanel n1) {
        this.n1 = n1;
    }

    public JPanel getN2() {
        return n2;
    }

    public void setN2(JPanel n2) {
        this.n2 = n2;
    }

    public JPanel getN3() {
        return n3;
    }

    public void setN3(JPanel n3) {
        this.n3 = n3;
    }

    public JPanel getN4() {
        return n4;
    }

    public void setN4(JPanel n4) {
        this.n4 = n4;
    }

    public JPanel getN5() {
        return n5;
    }

    public void setN5(JPanel n5) {
        this.n5 = n5;
    }

    public JPanel getN6() {
        return n6;
    }

    public void setN6(JPanel n6) {
        this.n6 = n6;
    }

    public JPanel getN7() {
        return n7;
    }

    public void setN7(JPanel n7) {
        this.n7 = n7;
    }

    public JPanel getN8() {
        return n8;
    }

    public void setN8(JPanel n8) {
        this.n8 = n8;
    }

    public JPanel getN9() {
        return n9;
    }

    public void setN9(JPanel n9) {
        this.n9 = n9;
    }

    public JPanel getN10() {
        return n10;
    }

    public void setN10(JPanel n10) {
        this.n10 = n10;
    }

    public JPanel getN11() {
        return n11;
    }

    public void setN11(JPanel n11) {
        this.n11 = n11;
    }

    public JPanel getN12() {
        return n12;
    }

    public void setN12(JPanel n12) {
        this.n12 = n12;
    }

    public JPanel getN13() {
        return n13;
    }

    public void setN13(JPanel n13) {
        this.n13 = n13;
    }

    public JPanel getN14() {
        return n14;
    }

    public void setN14(JPanel n14) {
        this.n14 = n14;
    }

    public JPanel getB1() {
        return b1;
    }

    public void setB1(JPanel b1) {
        this.b1 = b1;
    }

    public JPanel getB2() {
        return b2;
    }

    public void setB2(JPanel b2) {
        this.b2 = b2;
    }

    public JPanel getB3() {
        return b3;
    }

    public void setB3(JPanel b3) {
        this.b3 = b3;
    }

    public JPanel getB4() {
        return b4;
    }

    public void setB4(JPanel b4) {
        this.b4 = b4;
    }

    public JPanel getB5() {
        return b5;
    }

    public void setB5(JPanel b5) {
        this.b5 = b5;
    }

    public JPanel getB6() {
        return b6;
    }

    public void setB6(JPanel b6) {
        this.b6 = b6;
    }

    public JPanel getB7() {
        return b7;
    }

    public void setB7(JPanel b7) {
        this.b7 = b7;
    }

    public JPanel getB8() {
        return b8;
    }

    public void setB8(JPanel b8) {
        this.b8 = b8;
    }

    public JPanel getB9() {
        return b9;
    }

    public void setB9(JPanel b9) {
        this.b9 = b9;
    }

    public JPanel getC1() {
        return c1;
    }

    public void setC1(JPanel c1) {
        this.c1 = c1;
    }

    public JPanel getC2() {
        return c2;
    }

    public void setC2(JPanel c2) {
        this.c2 = c2;
    }

    public JPanel getC3() {
        return c3;
    }

    public void setC3(JPanel c3) {
        this.c3 = c3;
    }

    public JPanel getC4() {
        return c4;
    }

    public void setC4(JPanel c4) {
        this.c4 = c4;
    }

    public JPanel getE1() {
        return e1;
    }

    public void setE1(JPanel e1) {
        this.e1 = e1;
    }

    public JPanel getE2() {
        return e2;
    }

    public void setE2(JPanel e2) {
        this.e2 = e2;
    }

    public JPanel getE3() {
        return e3;
    }

    public void setE3(JPanel e3) {
        this.e3 = e3;
    }

    public JPanel getE4() {
        return e4;
    }

    public void setE4(JPanel e4) {
        this.e4 = e4;
    }

    public JPanel getE5() {
        return e5;
    }

    public void setE5(JPanel e5) {
        this.e5 = e5;
    }

    public JPanel getE6() {
        return e6;
    }

    public void setE6(JPanel e6) {
        this.e6 = e6;
    }

    public JPanel getE7() {
        return e7;
    }

    public void setE7(JPanel e7) {
        this.e7 = e7;
    }

    public JPanel getE8() {
        return e8;
    }

    public void setE8(JPanel e8) {
        this.e8 = e8;
    }

    public JPanel getE9() {
        return e9;
    }

    public void setE9(JPanel e9) {
        this.e9 = e9;
    }

    public JPanel getE10() {
        return e10;
    }

    public void setE10(JPanel e10) {
        this.e10 = e10;
    }

    public JPanel getE11() {
        return e11;
    }

    public void setE11(JPanel e11) {
        this.e11 = e11;
    }

    public JPanel getE12() {
        return e12;
    }

    public void setE12(JPanel e12) {
        this.e12 = e12;
    }

    public JPanel getE13() {
        return e13;
    }

    public void setE13(JPanel e13) {
        this.e13 = e13;
    }

    public JPanel getE14() {
        return e14;
    }

    public void setE14(JPanel e14) {
        this.e14 = e14;
    }

    public JPanel getE15() {
        return e15;
    }

    public void setE15(JPanel e15) {
        this.e15 = e15;
    }

    public JPanel getE16() {
        return e16;
    }

    public void setE16(JPanel e16) {
        this.e16 = e16;
    }

    public JPanel getE17() {
        return e17;
    }

    public void setE17(JPanel e17) {
        this.e17 = e17;
    }

    public JPanel getE18() {
        return e18;
    }

    public void setE18(JPanel e18) {
        this.e18 = e18;
    }

    public JPanel getE19() {
        return e19;
    }

    public void setE19(JPanel e19) {
        this.e19 = e19;
    }

    public JPanel getE20() {
        return e20;
    }

    public void setE20(JPanel e20) {
        this.e20 = e20;
    }

    public JPanel getE21() {
        return e21;
    }

    public void setE21(JPanel e21) {
        this.e21 = e21;
    }

    public JPanel getY1() {
        return y1;
    }

    public void setY1(JPanel y1) {
        this.y1 = y1;
    }

    public JPanel getY2() {
        return y2;
    }

    public void setY2(JPanel y2) {
        this.y2 = y2;
    }

    public JPanel getY3() {
        return y3;
    }

    public void setY3(JPanel y3) {
        this.y3 = y3;
    }

    public JTextField getName() {
        return name;
    }

    public void setName(JTextField name) {
        this.name = name;
    }

    public JTextField getF1() {
        return f1;
    }

    public void setF1(JTextField f1) {
        this.f1 = f1;
    }

    public JTextField getF2() {
        return f2;
    }

    public void setF2(JTextField f2) {
        this.f2 = f2;
    }

    public JTextField getF3() {
        return f3;
    }

    public void setF3(JTextField f3) {
        this.f3 = f3;
    }

    public JTextField getF4() {
        return f4;
    }

    public void setF4(JTextField f4) {
        this.f4 = f4;
    }

    public JTextField getF5() {
        return f5;
    }

    public void setF5(JTextField f5) {
        this.f5 = f5;
    }

    public JTextField getF6() {
        return f6;
    }

    public void setF6(JTextField f6) {
        this.f6 = f6;
    }

    public JTextField getF7() {
        return f7;
    }

    public void setF7(JTextField f7) {
        this.f7 = f7;
    }

    public JTextField getF8() {
        return f8;
    }

    public void setF8(JTextField f8) {
        this.f8 = f8;
    }

    public JTextField getF9() {
        return f9;
    }

    public void setF9(JTextField f9) {
        this.f9 = f9;
    }

    public JTextField getF10() {
        return f10;
    }

    public void setF10(JTextField f10) {
        this.f10 = f10;
    }

    public JTextField getF11() {
        return f11;
    }

    public void setF11(JTextField f11) {
        this.f11 = f11;
    }

    public JTextField getF12() {
        return f12;
    }

    public void setF12(JTextField f12) {
        this.f12 = f12;
    }

    public JTextField getF13() {
        return f13;
    }

    public void setF13(JTextField f13) {
        this.f13 = f13;
    }

    public JTextField getF14() {
        return f14;
    }

    public void setF14(JTextField f14) {
        this.f14 = f14;
    }

    public JMenu getMu1() {
        return mu1;
    }

    public void setMu1(JMenu mu1) {
        this.mu1 = mu1;
    }

    public JMenu getMu2() {
        return mu2;
    }

    public void setMu2(JMenu mu2) {
        this.mu2 = mu2;
    }

    public JMenu getMu3() {
        return mu3;
    }

    public void setMu3(JMenu mu3) {
        this.mu3 = mu3;
    }

    public JButton getSave() {
        return save;
    }

    public void setSave(JButton save) {
        this.save = save;
    }

    public JButton getEdit() {
        return edit;
    }

    public void setEdit(JButton edit) {
        this.edit = edit;
    }

    public JTextArea getTa1() {
        return ta1;
    }

    public void setTa1(JTextArea ta1) {
        this.ta1 = ta1;
    }

    public JTextArea getTa2() {
        return ta2;
    }

    public void setTa2(JTextArea ta2) {
        this.ta2 = ta2;
    }

    public JLabel getL1() {
        return l1;
    }

    public void setL1(JLabel l1) {
        this.l1 = l1;
    }

    public JLabel getL2() {
        return l2;
    }

    public void setL2(JLabel l2) {
        this.l2 = l2;
    }

    public JLabel getL3() {
        return l3;
    }

    public void setL3(JLabel l3) {
        this.l3 = l3;
    }

    public JLabel getL4() {
        return l4;
    }

    public void setL4(JLabel l4) {
        this.l4 = l4;
    }

    public JLabel getL5() {
        return l5;
    }

    public void setL5(JLabel l5) {
        this.l5 = l5;
    }

    public JLabel getL6() {
        return l6;
    }

    public void setL6(JLabel l6) {
        this.l6 = l6;
    }

    public JLabel getL7() {
        return l7;
    }

    public void setL7(JLabel l7) {
        this.l7 = l7;
    }

    public JLabel getL8() {
        return l8;
    }

    public void setL8(JLabel l8) {
        this.l8 = l8;
    }

    public JLabel getL9() {
        return l9;
    }

    public void setL9(JLabel l9) {
        this.l9 = l9;
    }

    public JLabel getL10() {
        return l10;
    }

    public void setL10(JLabel l10) {
        this.l10 = l10;
    }

    public JLabel getL11() {
        return l11;
    }

    public void setL11(JLabel l11) {
        this.l11 = l11;
    }

//    public JLabel getL12() {
//        return l12;
//    }
//
//    public void setL12(JLabel l12) {
//        this.l12 = l12;
//    }

    public JLabel getL13() {
        return l13;
    }

    public void setL13(JLabel l13) {
        this.l13 = l13;
    }

    public JLabel getL14() {
        return l14;
    }

    public void setL14(JLabel l14) {
        this.l14 = l14;
    }

    public JLabel getLb1() {
        return lb1;
    }

    public void setLb1(JLabel lb1) {
        this.lb1 = lb1;
    }

//    public JLabel getLb2() {
//        return lb2;
//    }

//    public void setLb2(JLabel lb2) {
//        this.lb2 = lb2;
//    }

    public JLabel getT1() {
        return t1;
    }

    public void setT1(JLabel t1) {
        this.t1 = t1;
    }

    public JLabel getT2() {
        return t2;
    }

    public void setT2(JLabel t2) {
        this.t2 = t2;
    }

    public JLabel getT4() {
        return t4;
    }

    public void setT4(JLabel t4) {
        this.t4 = t4;
    }

    public JLabel getPic() {
        return pic;
    }

    public void setPic(JLabel pic) {
        this.pic = pic;
    }

    public JLabel getPosi() {
        return posi;
    }

    public void setPosi(JLabel posi) {
        this.posi = posi;
    }

    public JLabel getT5() {
        return t5;
    }

    public void setT5(JLabel t5) {
        this.t5 = t5;
    }

    public JLabel getT6() {
        return t6;
    }

    public void setT6(JLabel t6) {
        this.t6 = t6;
    }

//    public JLabel getT7() {
//        return t7;
//    }
//
//    public void setT7(JLabel t7) {
//        this.t7 = t7;
//    }

//    public JLabel getT8() {
//        return t8;
//    }
//
//    public void setT8(JLabel t8) {
//        this.t8 = t8;
//    }

    public JLabel getT9() {
        return t9;
    }

    public void setT9(JLabel t9) {
        this.t9 = t9;
    }

    public JLabel getT10() {
        return t10;
    }

    public void setT10(JLabel t10) {
        this.t10 = t10;
    }

    public JLabel getU1() {
        return u1;
    }

    public void setU1(JLabel u1) {
        this.u1 = u1;
    }

    public JLabel getU2() {
        return u2;
    }

    public void setU2(JLabel u2) {
        this.u2 = u2;
    }

    public JLabel getU3() {
        return u3;
    }

    public void setU3(JLabel u3) {
        this.u3 = u3;
    }

    public JLabel getU4() {
        return u4;
    }

    public void setU4(JLabel u4) {
        this.u4 = u4;
    }

    public JLabel getU5() {
        return u5;
    }

    public void setU5(JLabel u5) {
        this.u5 = u5;
    }

    public JLabel getU6() {
        return u6;
    }

    public void setU6(JLabel u6) {
        this.u6 = u6;
    }

    public JLabel getU7() {
        return u7;
    }

    public void setU7(JLabel u7) {
        this.u7 = u7;
    }

    public JLabel getU8() {
        return u8;
    }

    public void setU8(JLabel u8) {
        this.u8 = u8;
    }

    public JLabel getT3() {
        return t3;
    }

    public void setT3(JLabel t3) {
        this.t3 = t3;
    }

    public JLabel getS1() {
        return s1;
    }

    public void setS1(JLabel s1) {
        this.s1 = s1;
    }

    public JLabel getS2() {
        return s2;
    }

    public void setS2(JLabel s2) {
        this.s2 = s2;
    }

    public JLabel getS3() {
        return s3;
    }

    public void setS3(JLabel s3) {
        this.s3 = s3;
    }

    public JLabel getS4() {
        return s4;
    }

    public void setS4(JLabel s4) {
        this.s4 = s4;
    }

    public JLabel getS5() {
        return s5;
    }

    public void setS5(JLabel s5) {
        this.s5 = s5;
    }

    public JLabel getS6() {
        return s6;
    }

    public void setS6(JLabel s6) {
        this.s6 = s6;
    }

    public JLabel getS7() {
        return s7;
    }

    public void setS7(JLabel s7) {
        this.s7 = s7;
    }

    public JLabel getS8() {
        return s8;
    }

    public void setS8(JLabel s8) {
        this.s8 = s8;
    }

    public JLabel getS9() {
        return s9;
    }

    public void setS9(JLabel s9) {
        this.s9 = s9;
    }

    public JLabel getS10() {
        return s10;
    }

    public void setS10(JLabel s10) {
        this.s10 = s10;
    }

    public JLabel getS11() {
        return s11;
    }

    public void setS11(JLabel s11) {
        this.s11 = s11;
    }

    public JLabel getS12() {
        return s12;
    }

    public void setS12(JLabel s12) {
        this.s12 = s12;
    }

    public JLabel getS13() {
        return s13;
    }

    public void setS13(JLabel s13) {
        this.s13 = s13;
    }

    public JMenuBar getMb() {
        return mb;
    }

    public void setMb(JMenuBar mb) {
        this.mb = mb;
    }

    public Rights getRig() {
        return rig;
    }

    public void setRig(Rights rig) {
        this.rig = rig;
    }

    public JFrame getFrame() {
        return fr;
    }

//    private void saveData() {
//        String url = "jdbc:mysql://localhost/oopject";
//        String username = "root";
//        String password = "";
//
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/oop", "root", ""
//        )) {
//            String query = "INSERT INTO employees (employee_firstname, employee_lastname, employee_role, employee_idcard, employee_gender, employee_religion, employee_nationality, employee_disease, employee_education, employee_bank, employee_address, employee_phone, employee_salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            PreparedStatement statement = conn.prepareStatement(query);
//            statement.setString(1, f1.getText()); // name
//            statement.setString(2, f2.getText()); // surname
//            statement.setString(3, f4.getText()); // role
//            statement.setString(4, f5.getText()); // idcad
//            statement.setString(5, f3.getText()); // gender
//            statement.setString(6, f8.getText()); // religion
//            statement.setString(7, f7.getText()); // nationality
//            statement.setString(8, ta2.getText()); // diease
//            statement.setString(9, f9.getText()); // edu
//            statement.setString(10, f12.getText()); // bank
//            statement.setString(11, ta1.getText()); // addr
//            statement.setString(12, f13.getText()); // phone
//            statement.setString(13, f6.getText()); // salary
//
//            int rowsInserted = statement.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.println("A new employee was inserted successfully!");
//            }
//        } catch (SQLException ex) {
//            System.out.println("SQL exception occurred: " + ex.getMessage());
//        }
//    }

    @Override
    public void actionPerformed(ActionEvent e) {

     if (e.getSource().equals(save)) {
             empModel model = new  empModel();
            model.insertUpdateEmp(f1.getText(),f2.getText(),
                    f4.getText(),f5.getText(),f3.getText(),f8.getText(),
                    f7.getText(),f9.getText(),f12.getText(),ta1.getText(),
                    f13.getText(),Integer.valueOf(f6.getText()), ta2.getText()
            
            );


        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JMenu press = (JMenu) e.getComponent();
        if (press.equals(mu1)) {
            pn1.removeAll();
            pn1.setLayout(new BorderLayout());
            pn1.setBackground(Color.white);
            pn1.add(e1, BorderLayout.WEST);
            pn1.add(pp8, BorderLayout.CENTER);

            System.out.println("1");
            refreshFrame();
        } 
        else if (press.equals(mu3)) {
         empModel model = new empModel();
    pn1.removeAll();
    pn1.setLayout(new BorderLayout());
    pn1.setBackground(Color.white);
    pn1.add(e1, BorderLayout.WEST);
    Rights rightsPanel = model.loadAccessAll(f5.getText());  
    pn1.add(rightsPanel.getRights(), BorderLayout.CENTER);

    System.out.println("hi1");
    refreshFrame();
        }

    }

    private void refreshFrame() {
        fr.revalidate();
        fr.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
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
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Combos extends JFrame implements ActionListener {
    String fcs,hcvs,hcns,cdvs,cdns;
    String customerid;
    JButton back;
    int c1,c2,c3,c4,c5=0;
    JButton plus1,plus2,plus3,plus4,plus5,minus1,minus2,minus3,minus4,minus5;
     JLabel count1,count2,count3,count4,count5;
    Combos(String customerid){
        this.customerid = customerid;
        JLabel head = new JLabel("Fries and Specials");
        head.setFont(new Font("TimesRoman",Font.ITALIC,35));
        head.setBounds(150,80,250,40);
        add(head);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/combooo.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel burger = new JLabel(i3);
        burger.setBounds(375,20,140,140);
        add(burger);


// First Combo
        JLabel it = new JLabel("Fries salted/Peri peri");
        it.setBounds(20,180,200,35);
        it.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(it);

        ImageIcon iti = new ImageIcon(ClassLoader.getSystemResource("icons/fieryCombo.jpeg"));
        Image iti2 = iti.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon iti3 = new ImageIcon(iti2);
        JLabel drink1 = new JLabel(iti3);
        drink1.setBounds(315,180,40,40);
        add(drink1);

        plus1 = new JButton("+");
        plus1.setForeground(Color.BLACK);
        plus1.setBackground(Color.LIGHT_GRAY);
        plus1.setBounds(375,180,45,30);
        plus1.setFont(new Font("TimesRoman",Font.BOLD,13));
        plus1.addActionListener(this);
        add(plus1);

        minus1 = new JButton("-");
        minus1.setForeground(Color.BLACK);
        minus1.setBackground(Color.LIGHT_GRAY);
        minus1.setBounds(430,180,45,30);
        minus1.setFont(new Font("TimesRoman",Font.BOLD,13));
        minus1.addActionListener(this);
        add(minus1);

        count1 = new  JLabel();
        count1.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count1.setBounds(485,180,80,30);
        add(count1);

        // 2nd Combo
        JLabel p = new JLabel("Hakuna Spl Fries");
        p.setBounds(20,230,250,35);
        p.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(p);

        ImageIcon pi = new ImageIcon(ClassLoader.getSystemResource("icons/Hattrick Combo veg.jpeg"));
        Image pi2 = pi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon pi3 = new ImageIcon(pi2);
        JLabel drink2 = new JLabel(pi3);
        drink2.setBounds(315,230,40,40);
        add(drink2);

        plus2 = new JButton("+");
        plus2.setForeground(Color.BLACK);
        plus2.setBackground(Color.LIGHT_GRAY);
        plus2.setBounds(375,230,45,30);
        plus2.setFont(new Font("TimesRoman",Font.BOLD,13));
        plus2.addActionListener(this);
        add(plus2);

        minus2 = new JButton("-");
        minus2.setForeground(Color.BLACK);
        minus2.setBackground(Color.LIGHT_GRAY);
        minus2.setBounds(430,230,45,30);
        minus2.setFont(new Font("TimesRoman",Font.BOLD,13));
        minus2.addActionListener(this);
        add(minus2);

        count2 = new  JLabel();
        count2.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count2.setBounds(485,230,80,30);
        add(count2);

        // 3rd combo
        JLabel m = new JLabel("White/Red Sauce Pasta");
        m.setBounds(20,280,280,35);
        m.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(m);

        ImageIcon mi = new ImageIcon(ClassLoader.getSystemResource("icons/hattrickComboChicken.jpeg"));
        Image mi2 = mi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon mi3 = new ImageIcon(mi2);
        JLabel drink3 = new JLabel(mi3);
        drink3.setBounds(315,280,40,40);
        add(drink3);

        plus3 = new JButton("+");
        plus3.setForeground(Color.BLACK);
        plus3.setBackground(Color.LIGHT_GRAY);
        plus3.setBounds(375,280,45,30);
        plus3.setFont(new Font("TimesRoman",Font.BOLD,13));
        plus3.addActionListener(this);
        add(plus3);

        minus3 = new JButton("-");
        minus3.setForeground(Color.BLACK);
        minus3.setBackground(Color.LIGHT_GRAY);
        minus3.setBounds(430,280,45,30);
        minus3.setFont(new Font("TimesRoman",Font.BOLD,13));
        minus3.addActionListener(this);
        add(minus3);

        count3 = new  JLabel();
        count3.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count3.setBounds(485,280,80,30);
        add(count3);

        // 4th Combo
        JLabel cs = new JLabel("Classic Duo Veg");
        cs.setBounds(20,330,250,35);
        cs.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(cs);

        ImageIcon csi = new ImageIcon(ClassLoader.getSystemResource("icons/classicDuoVeg.jpeg"));
        Image csi2 = csi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon csi3 = new ImageIcon(csi2);
        JLabel drink4 = new JLabel(csi3);
        drink4.setBounds(315,330,40,40);
        add(drink4);

        plus4 = new JButton("+");
        plus4.setForeground(Color.BLACK);
        plus4.setBackground(Color.LIGHT_GRAY);
        plus4.setBounds(375,330,45,30);
        plus4.setFont(new Font("TimesRoman",Font.BOLD,13));
        plus4.addActionListener(this);
        add(plus4);

        minus4 = new JButton("-");
        minus4.setForeground(Color.BLACK);
        minus4.setBackground(Color.LIGHT_GRAY);
        minus4.setBounds(430,330,45,30);
        minus4.setFont(new Font("TimesRoman",Font.BOLD,13));
        minus4.addActionListener(this);
        add(minus4);

        count4 = new  JLabel();
        count4.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count4.setBounds(485,330,80,30);
        add(count4);

        // 5th combo
        JLabel bs = new JLabel("Classic Duo NonVeg");
        bs.setBounds(20,380,250,35);
        bs.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(bs);

        ImageIcon bsi = new ImageIcon(ClassLoader.getSystemResource("icons/classicDuoNonVeg.jpeg"));
        Image bsi2 = bsi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon bsi3 = new ImageIcon(bsi2);
        JLabel drink5 = new JLabel(bsi3);
        drink5.setBounds(315,380,40,40);
        add(drink5);

        plus5 = new JButton("+");
        plus5.setForeground(Color.BLACK);
        plus5.setBackground(Color.LIGHT_GRAY);
        plus5.setBounds(375,380,45,30);
        plus5.setFont(new Font("TimesRoman",Font.BOLD,13));
        plus5.addActionListener(this);
        add(plus5);

        minus5 = new JButton("-");
        minus5.setForeground(Color.BLACK);
        minus5.setBackground(Color.LIGHT_GRAY);
        minus5.setBounds(430,380,45,30);
        minus5.setFont(new Font("TimesRoman",Font.BOLD,13));
        minus5.addActionListener(this);
        add(minus5);

        count5 = new  JLabel();
        count5.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count5.setBounds(485,380,80,30);
        add(count5);

        back = new JButton("Back");
        back.setFont(new Font("TimesRoman", Font.BOLD, 20));
        back.setBounds(450, 480, 100, 30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(600,600);
        setVisible(true);
        setLocation(450,100);
    }

    public void actionPerformed(ActionEvent ae){
        count1.setText(""+c1);
        count2.setText(""+c2);
        count3.setText(""+c3);
        count4.setText(""+c4);
        count5.setText(""+c5);
        if(ae.getSource()==back){
            fcs = ""+count1.getText();
            hcvs = ""+count2.getText();
            hcns = ""+count3.getText();
            cdvs = ""+count4.getText();
            cdns = ""+count5.getText();
            try{
                Conn c = new Conn();
                String query = "INSERT INTO combos VALUES('"+customerid+"','"+fcs+"','"+hcvs+"','"+hcns+"','"+cdvs+"','"+cdns+"')";
                c.s.executeUpdate(query);
            }catch (Exception e){
                System.out.println(e);
            }
            setVisible(false);
            new MenuDisplay(customerid).setVisible(true);
        }
        else if(ae.getSource()==plus1){
            count1.setText(""+(++c1));
        }
        else if(ae.getSource()==plus2){
            count2.setText(""+(++c2));
        }
        else if(ae.getSource()==plus3){
            count3.setText(""+(++c3));
        }
        else if(ae.getSource()==plus4){
            count4.setText(""+(++c4));
        }
        else if(ae.getSource()==minus1){
            if(c1<2) {
                c1=0;
                count1.setText(""+0);
            }else
                count1.setText(""+(--c1));
        }
        else if(ae.getSource()==plus5){
            count5.setText(""+(++c5));
        }
        else if(ae.getSource()==minus2){
            if(c2<2) {
                c2=0;
                count2.setText(""+0);
            }else
                count2.setText(""+(--c2));
        }
        else if(ae.getSource()==minus3){
            if(c3<2) {
                c3=0;
                count3.setText(""+0);
            }else
                count3.setText(""+(--c3));
        }
        else if(ae.getSource()==minus4){
            if(c4<2) {
                c4=0;
                count4.setText(""+0);
            }else
                count4.setText(""+(--c4));
        }
        else if(ae.getSource()==minus5){
            if(c5<2) {
                c5=0;
                count5.setText(""+0);
            }else
                count5.setText(""+(--c5));
        }
    }


    public static void main(String[] args) {
        new Combos("");
    }
}

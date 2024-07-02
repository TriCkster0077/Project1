import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Burgers extends JFrame implements ActionListener {
    String cvbs,vcbs,prbs,ccbs,fcbs,hsfs;
    String customerid;
    JButton back,plus1,plus2,plus3,plus4,plus5,plus6,minus1,minus2,minus3,minus4,minus5,minus6;
    JLabel count1,count2,count3,count4,count5,count6;
    int c1,c2,c3,c4,c5,c6=0;
    Burgers(String customerid){
        this.customerid = customerid;
        JLabel head = new JLabel("BURGERS & FRIES");
        head.setFont(new Font("TimesRoman",Font.ITALIC,35));
        head.setBounds(70,80,400,40);
        add(head);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/burgerAnimated.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel burger = new JLabel(i3);
        burger.setBounds(375,20,140,140);
        add(burger);


// First Burger
        JLabel vegBurger = new JLabel("Classic Burger");
        vegBurger.setBounds(60,180,300,35);
        vegBurger.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(vegBurger);

        ImageIcon cvb = new ImageIcon(ClassLoader.getSystemResource("icons/cvb.jpg"));
        Image cvb2 = cvb.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon cvb3 = new ImageIcon(cvb2);
        JLabel burger1 = new JLabel(cvb3);
        burger1.setBounds(315,180,40,40);
        add(burger1);

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

        count1 = new JLabel();
        count1.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count1.setBounds(485,180,40,20);
        add(count1);

        // 2nd Burger
        JLabel vcb = new JLabel("Veg Burger");
        vcb.setBounds(60,230,250,35);
        vcb.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(vcb);

        ImageIcon vcbi = new ImageIcon(ClassLoader.getSystemResource("icons/vegCheeseBurger.jpg"));
        Image vcbi2 = vcbi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon vcbi3 = new ImageIcon(vcbi2);
        JLabel burger2 = new JLabel(vcbi3);
        burger2.setBounds(315,230,40,40);
        add(burger2);

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

        count2 = new JLabel();
        count2.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count2.setBounds(485,230,40,20);
        add(count2);

        // 3rd Burger
        JLabel prb = new JLabel("Hakuna Spl. Burg.");
        prb.setBounds(60,280,250,35);
        prb.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(prb);

        ImageIcon prbi = new ImageIcon(ClassLoader.getSystemResource("icons/cvb.jpg"));
        Image prbi2 = prbi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon prbi3 = new ImageIcon(prbi2);
        JLabel burger3 = new JLabel(prbi3);
        burger3.setBounds(315,280,40,40);
        add(burger3);

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

        count3 = new JLabel();
        count3.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count3.setBounds(485,280,40,20);
        add(count3);

        // 4th Burger
        JLabel ccb = new JLabel("Double Patty Burg.");
        ccb.setBounds(60,330,250,35);
        ccb.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(ccb);

        ImageIcon ccbi = new ImageIcon(ClassLoader.getSystemResource("icons/crispyChickenBurger.jpg"));
        Image ccbi2 = ccbi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon ccbi3 = new ImageIcon(ccbi2);
        JLabel burger4 = new JLabel(ccbi3);
        burger4.setBounds(315,330,40,40);
        add(burger4);

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

        count4 = new JLabel();
        count4.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count4.setBounds(485,330,40,20);
        add(count4);

        // 5th Fries
        JLabel fcb = new JLabel("Fries Peri/Salted");
        fcb.setBounds(60,380,250,35);
        fcb.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(fcb);

        ImageIcon fcbi = new ImageIcon(ClassLoader.getSystemResource("icons/fieryChickenBurger.jpeg"));
        Image fcbi2 = fcbi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon fcbi3 = new ImageIcon(fcbi2);
        JLabel burger5 = new JLabel(fcbi3);
        burger5.setBounds(315,380,40,40);
        add(burger5);

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

        count5 = new JLabel();
        count5.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count5.setBounds(485,380,40,20);
        add(count5);

        // 6th Fries
        JLabel hsf = new JLabel("Hakuna Spl Fries");
        hsf.setBounds(60,430,250,35);
        hsf.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(hsf);

        ImageIcon hsfi = new ImageIcon(ClassLoader.getSystemResource("icons/fieryChickenBurger.jpeg"));
        Image hsfi2 = hsfi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon hsfi3 = new ImageIcon(hsfi2);
        JLabel burger6 = new JLabel(hsfi3);
        burger6.setBounds(315,430,40,40);
        add(burger6);

        plus5 = new JButton("+");
        plus5.setForeground(Color.BLACK);
        plus5.setBackground(Color.LIGHT_GRAY);
        plus5.setBounds(375,430,45,30);
        plus5.setFont(new Font("TimesRoman",Font.BOLD,13));
        plus5.addActionListener(this);
        add(plus5);

        minus5 = new JButton("-");
        minus5.setForeground(Color.BLACK);
        minus5.setBackground(Color.LIGHT_GRAY);
        minus5.setBounds(430,430,45,30);
        minus5.setFont(new Font("TimesRoman",Font.BOLD,13));
        minus5.addActionListener(this);
        add(minus5);

        count5 = new JLabel();
        count5.setFont(new Font("TimesRoman",Font.PLAIN,15));
        count5.setBounds(485,430,40,20);
        add(count5);

        back = new JButton("Back");
        back.setFont(new Font("TimesRoman",Font.BOLD,20));
        back.setBounds(450,480,100,30);
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
        count6.setText(""+c6);
        if(ae.getSource()==back){
            cvbs =""+count1.getText();
            vcbs = ""+count2.getText();
            prbs = ""+count3.getText();
            ccbs = ""+count4.getText();
            fcbs = ""+count5.getText();
            hsfs = ""+ count6.getText();
            try{
                Conn c = new Conn();
                String query = "INSERT INTO burgers VALUES('"+customerid+"','"+cvbs+"','"+vcbs+"','"+prbs+"','"+ccbs+"','"+fcbs+"','"+hsfs+"')";
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
        else if(ae.getSource()==plus6){
            count6.setText(""+(++c6));
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
            if(c2<1) {
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
        else if(ae.getSource()==minus6){
            if(c6<2) {
                c6=0;
                count6.setText(""+0);
            }else
                count6.setText(""+(--c6));
        }
    }
    public static void main(String[] args) {
        new Burgers("");
    }
}

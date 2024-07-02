import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Extras extends JFrame implements ActionListener {
    String crfs,chfs,chkfs,ccws,bcws;
    String customerid;
    JButton back;
    int c1,c2,c3,c4,c5=0;
    JButton plus1,plus2,plus3,plus4,plus5,minus1,minus2,minus3,minus4,minus5;
     JLabel count1,count2,count3,count4,count5;
    Extras(String customerid){
        this.customerid = customerid;
        JLabel head = new JLabel("EXTRAS");
        head.setFont(new Font("TimesRoman",Font.ITALIC,35));
        head.setBounds(150,80,200,40);
        add(head);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/extras.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel burger = new JLabel(i3);
        burger.setBounds(375,20,140,140);
        add(burger);


// First Extra
        JLabel vegBurger = new JLabel("Crispy Fries");
        vegBurger.setBounds(60,180,200,35);
        vegBurger.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(vegBurger);

        ImageIcon f = new ImageIcon(ClassLoader.getSystemResource("icons/fries.jpeg"));
        Image f2 = f.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel extra1 = new JLabel(f3);
        extra1.setBounds(315,180,40,40);
        add(extra1);

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

        // 2nd Extra
        JLabel cf = new JLabel("Cheesy Fries");
        cf.setBounds(60,230,250,35);
        cf.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(cf);

        ImageIcon cfi = new ImageIcon(ClassLoader.getSystemResource("icons/cheesyFries.jpeg"));
        Image cfi2 = cfi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon cfi3 = new ImageIcon(cfi2);
        JLabel extra2 = new JLabel(cfi3);
        extra2.setBounds(315,230,40,40);
        add(extra2);

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

        // 3rd Extra
        JLabel chf = new JLabel("Chicken Fries");
        chf.setBounds(60,280,250,35);
        chf.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(chf);

        ImageIcon chfi = new ImageIcon(ClassLoader.getSystemResource("icons/chickenFries.jpeg"));
        Image chfi2 = chfi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon chfi3 = new ImageIcon(chfi2);
        JLabel extra3 = new JLabel(chfi3);
        extra3.setBounds(315,280,40,40);
        add(extra3);

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

        // 4th Extra
        JLabel cw = new JLabel("Crispy Chicken Wings");
        cw.setBounds(20,330,250,35);
        cw.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(cw);

        ImageIcon cwi = new ImageIcon(ClassLoader.getSystemResource("icons/chickenWings.jpeg"));
        Image cwi2 = cwi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon cwi3 = new ImageIcon(cwi2);
        JLabel extra4 = new JLabel(cwi3);
        extra4.setBounds(315,330,40,40);
        add(extra4);

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

        // 5th Extra
        JLabel bcw = new JLabel("Boneless Chicken Wings");
        bcw.setBounds(20,380,280,35);
        bcw.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(bcw);

        ImageIcon bcwi = new ImageIcon(ClassLoader.getSystemResource("icons/bonelessWings.jpeg"));
        Image bcwi2 = bcwi.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon bcwi3 = new ImageIcon(bcwi2);
        JLabel extra5 = new JLabel(bcwi3);
        extra5.setBounds(315,380,40,40);
        add(extra5);

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
             crfs = ""+count1.getText();
             chfs = ""+count2.getText();
             chkfs= ""+count3.getText();
             ccws = ""+count4.getText();
             bcws = ""+count5.getText();
            try{
                Conn c = new Conn();
                String query = "INSERT INTO extras VALUES('"+customerid+"','"+crfs+"','"+chfs+"','"+chkfs+"','"+ccws+"','"+bcws+"')";
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
        else if(ae.getSource()==plus5) {
            count5.setText(""+(++c5));
        }
        else if(ae.getSource()==minus1){
            if(c1<2) {
                c1=0;
                count1.setText(""+0);
            }else
                count1.setText(""+(--c1));
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
        new Extras("");
    }
}

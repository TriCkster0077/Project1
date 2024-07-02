import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDisplay extends JFrame implements ActionListener {
    String customerid;
    JButton order1,order2,order3,order4,checkOut,cancel;
    MenuDisplay(String customerid){
        this.customerid = customerid;

        JLabel menu = new JLabel("MAIN MENU");
        menu.setFont(new Font("Raleway",Font.BOLD,35));
        menu.setBounds(180,50,250,40);
        add(menu);

        JLabel burgers = new JLabel("BURGERS & FRIES");
        burgers.setFont(new Font("Raleway",Font.ITALIC,30));
        burgers.setBounds(80,150,400,35);
        add(burgers);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/burgers.jpeg"));
//        Image i2 = i1.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel burger = new JLabel(i3);
//        burger.setBounds(250,150,40,40);
//        add(burger);

        order1 = new JButton("Order");
        order1.setFont(new Font("Oswald",Font.PLAIN,16));
        order1.setForeground(Color.BLACK);
        order1.setBackground(Color.white);
        order1.setBounds(430,150,100,30);
        order1.addActionListener(this);
        add(order1);

        JLabel beverages = new JLabel("DRINKS");
        beverages.setFont(new Font("Raleway",Font.ITALIC,30));
        beverages.setBounds(80,220,200,35);
        add(beverages);

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/beverages.jpeg"));
        Image b2 = b1.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel beverage = new JLabel(b3);
        beverage.setBounds(275,220,40,40);
        add(beverage);

        order2 = new JButton("Order");
        order2.setFont(new Font("Oswald",Font.PLAIN,16));
        order2.setForeground(Color.BLACK);
        order2.setBackground(Color.white);
        order2.setBounds(430,220,100,30);
        order2.addActionListener(this);
        add(order2);

        JLabel extras = new JLabel("MAGGI");
        extras.setFont(new Font("Raleway",Font.ITALIC,30));
        extras.setBounds(80,290,200,35);
        add(extras);

        ImageIcon e1 = new ImageIcon(ClassLoader.getSystemResource("icons/extras.jpeg"));
        Image e2 = e1.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon e3 = new ImageIcon(e2);
        JLabel extra = new JLabel(e3);
        extra.setBounds(215,290,40,40);
        add(extra);

        order3 = new JButton("Order");
        order3.setFont(new Font("Oswald",Font.PLAIN,16));
        order3.setForeground(Color.BLACK);
        order3.setBackground(Color.white);
        order3.setBounds(430,290,100,30);
        order3.addActionListener(this);
        add(order3);

        JLabel combos = new JLabel("SPECIALS");
        combos.setFont(new Font("Raleway",Font.ITALIC,30));
        combos.setBounds(80,360,200,35);
        add(combos);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/combos.jpeg"));
        Image c2 = c1.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel combo = new JLabel(c3);
        combo.setBounds(230,360,40,40);
        add(combo);

        order4 = new JButton("Order");
        order4.setFont(new Font("Oswald",Font.PLAIN,16));
        order4.setForeground(Color.BLACK);
        order4.setBackground(Color.white);
        order4.setBounds(430,360,100,30);
        order4.addActionListener(this);
        add(order4);

//        JLabel chickenWings = new JLabel("CHICKEN WINGS");
//        chickenWings.setFont(new Font("Raleway",Font.ITALIC,30));
//        chickenWings.setBounds(80,390,300,35);
//        add(chickenWings);
//
//        ImageIcon cw1 = new ImageIcon(ClassLoader.getSystemResource("icons/chickenWings.jpeg"));
//        Image cw2 = cw1.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
//        ImageIcon cw3 = new ImageIcon(cw2);
//        JLabel chickenwing = new JLabel(cw3);
//        chickenwing.setBounds(350,390,40,40);
//        add(chickenwing);
//
//        JButton order5 = new JButton("Order");
//        order5.setFont(new Font("Oswald",Font.PLAIN,16));
//        order5.setForeground(Color.BLACK);
//        order5.setBackground(Color.white);
//        order5.setBounds(430,390,100,30);
//        add(order5);

        checkOut = new JButton("CHECK OUT");
        checkOut.setFont(new Font("TimesRoman",Font.BOLD,20));
        checkOut.setBounds(100,450,200,30);
        checkOut.setBackground(Color.WHITE);
        checkOut.setForeground(Color.BLACK);
        checkOut.addActionListener(this);
        add(checkOut);

        cancel = new JButton("CANCEL");
        cancel.setFont(new Font("TimesRoman",Font.BOLD,20));
        cancel.setBounds(350,450,200,30);
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(600,600);
        setVisible(true);
        setLocation(450,100);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==cancel){
            System.exit(0);
        }
        else if(ae.getSource()==order1){
            setVisible(false);
            new Burgers(customerid).setVisible(true);
        }
        else if(ae.getSource()==order2){
            setVisible(false);
            new Beverages(customerid).setVisible(true);
        }
        else if(ae.getSource()==order3){
            setVisible(false);
            new Extras(customerid).setVisible(true);
        }
        else if(ae.getSource()==order4){
            setVisible(false);
            new Combos(customerid).setVisible(true);
        }
        else if(ae.getSource()==checkOut){
            setVisible(false);
            new Bill(customerid).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MenuDisplay("");
    }
}

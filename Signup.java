import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener {
    long random;
    JTextField nm,ps,pn;
    JPasswordField cps;
    JButton proceed,back;
    Signup(){
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel customerId = new JLabel("CUSTOMER ID : " + random);
        customerId.setFont(new Font("Oswald",Font.BOLD,38));
        customerId.setBounds(180,20,600,40);
        add(customerId);

        JLabel name = new JLabel("NAME: ");
        name.setFont(new Font("Serif", Font.BOLD, 28));
        name.setBounds(100, 160,200, 40);
        add(name);

        nm = new JTextField();
        nm.setBounds(450,160,300,40);
        nm.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(nm);

        JLabel phn = new JLabel("PHONE: ");
        phn.setFont(new Font("Serif", Font.BOLD, 28));
        phn.setBounds(100, 220,200, 40);
        add(phn);

        pn = new JTextField();
        pn.setBounds(450,220,300,40);
        pn.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(pn);

        JLabel password = new JLabel("PASSWORD: ");
        password.setFont(new Font("Serif", Font.BOLD, 28));
        password.setBounds(100, 280,200, 40);
        add(password);

        ps = new JTextField();
        ps.setBounds(450,280,300,40);
        ps.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(ps);

        JLabel cpass = new JLabel("CONFIRM PASSWORD: ");
        cpass.setFont(new Font("Serif", Font.BOLD, 28));
        cpass.setBounds(100,340 ,370, 40);
        add(cpass);

        cps = new JPasswordField();
        cps.setBounds(450,340,300,40);
        cps.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(cps);

        proceed = new JButton("PROCEED");
        proceed.setForeground(Color.white);
        proceed.setBackground(Color.black);
        proceed.setBounds(240, 420, 150, 30);
        proceed.setFont(new Font("Monospaced", Font.PLAIN, 20));
        proceed.addActionListener(this);
        add(proceed);

        back = new JButton("BACK");
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.setBounds(420, 420, 150, 30);
        back.setFont(new Font("Monospaced", Font.PLAIN, 20));
        back.addActionListener(this);
        add(back);

        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String customerid = ""+random;
        String name = nm.getText();
        String phn = pn.getText();
        String pass = ps.getText();
        String cpass = cps.getText();

        if(ae.getSource()==back){
            setVisible(false);
            new Welcome().setVisible(true);
        }
        else if(ae.getSource()==proceed){
            if(!cpass.equals(pass)){
                JOptionPane.showMessageDialog(null, "Password Mismatch");
            }else {
                try {
                    Conn con = new Conn();
                    String query = "INSERT INTO customer VALUES('" + customerid + "','" + name + "','"+phn+"','" + pass + "')";
                    con.s.executeUpdate(query);

                    setVisible(false);
                    new MenuDisplay(customerid).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}

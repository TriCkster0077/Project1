import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame implements ActionListener {
    JButton login,signup,exit;
Welcome(){
    setLayout(null);
    setTitle("Welcome to Burger King");

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images.jpeg"));
    Image i2 = i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel label = new JLabel(i3);
    label.setBounds(210,100,300,200);
    add(label);

    JLabel text = new JLabel("WELCOME TO HAKUNA BOYS");
    text.setFont(new Font("Helvetica",Font.BOLD,30));
    text.setForeground(Color.blue);
    text.setBounds(150,40,500,40);
    add(text);

    login = new JButton("Sign In");
    login.setBounds(240,310,125,30);
    login.setBackground(Color.white);
    login.setForeground(Color.BLACK);
    login.addActionListener(this);
    add(login);

    signup = new JButton("Sign Up");
    signup.setBounds(390,310,125,30);
    signup.setBackground(Color.white);
    signup.setForeground(Color.BLACK);
    signup.addActionListener(this);
    add(signup);

    exit = new JButton("Exit");
    exit.setBounds(310,350,125,30);
    exit.setBackground(Color.white);
    exit.setForeground(Color.BLACK);
    exit.addActionListener(this);
    add(exit);



    getContentPane().setBackground(Color.white);
    setSize(800,480);
    setVisible(true);
    setLocation(350,200);

}
 public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==login){
        setVisible(false);
        new Login().setVisible(true);
    } else if (ae.getSource()==exit) {
        System.exit(0);
    } else if (ae.getSource()==signup) {
        setVisible(false);
        new Signup().setVisible(true);
    }
 }

    public static void main(String[] args) {
        new Welcome();
    }
}

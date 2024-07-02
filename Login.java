import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton login,signup;
    JTextField pass,phone;
    Login(){
        JLabel text = new JLabel("Please Enter Details: ");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel number = new JLabel("Phone: ");
        number.setFont(new Font( "Osward",Font.BOLD,28));
        number.setBounds(150,140 ,300, 40);
        add(number);

        phone = new JTextField();
        phone.setFont(new Font("Osward", Font.PLAIN, 20));
        phone.setBounds(350,140,200,40);
        add(phone);

        JLabel password = new JLabel("Password: ");
        password.setFont(new Font("Osward",Font.BOLD,28));
        password.setBounds(150, 200, 200, 40);
        add(password);

        pass = new JTextField();
        pass.setFont(new Font("Osward", Font.PLAIN, 20));
        pass.setBounds(350,200,200,40);
        add(pass);

        login = new JButton("SIGN IN");
        login.setForeground(Color.white);
        login.setBackground(Color.BLACK);
        login.setBounds(225, 300,150, 40);
        add(login);

        signup = new JButton("SIGN UP");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.setBounds(420, 300, 150, 40);
        add(signup);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        setLayout(null);
        setTitle("LOGIN TO BURGER KING");
        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==login){
            Conn con = new Conn();
            String phn = phone.getText();
            String password = pass.getText();
            String query = "SELECT * FROM customer WHERE phone = '"+phn+"'AND pass = '"+password+"'";

            try{
                ResultSet rs = con.s.executeQuery(query);
                String customerid;
                if(rs.next()){
                    customerid = rs.getString("customerid");
                    setVisible(false);
                    new MenuDisplay(customerid).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==signup){
            setVisible(false);
            new Signup().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}

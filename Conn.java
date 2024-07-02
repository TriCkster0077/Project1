import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///foodorder" , "root", "Radhey@007");
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println("The Exception Is "+ e);
        }
    }
}

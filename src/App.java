import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","swamy");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select name from country where population<5000;");
            while(rs.next())
            {
                System.out.println(rs.getString((1)));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Hello, World!");
    }
}

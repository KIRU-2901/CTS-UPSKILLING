import java.sql.*;
public class StudentDAO {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );
            PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES(?, ?)");
            ps.setInt(1, 101);
            ps.setString(2, "Ram");
            ps.executeUpdate();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

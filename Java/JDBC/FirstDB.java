import com.mysql.cj.protocol.Resultset;

import java.sql.*;
public class FirstDB {
    public static void main(String[] args) {
        //MySQL connection details
        String url ="jdbc:mysql://localhost:3306"; //No specific DB
        String user = "root";//  User Name
        String password = "root"; // Password

        try {
            //Load Mysql JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to MySQL server(not to a specific DB
            Connection con = DriverManager.getConnection(url,user,password);
            //  Create a Statement
            Statement stmt = con.createStatement();
            // Run SHow DATABASES QUERY
            ResultSet rs = stmt.executeQuery("SHOW DATABASES");
            System.out.println("📝Existing Databases.");
            System.out.println("-----------");

            while (rs.next()){
                String dbName = rs.getString(1);
                System.out.println("📌" + dbName);

            }
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

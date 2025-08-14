import java.sql.*;
public class ConnectToDB {
    public static void main(String[] args) {
        //MySQL connection details
        String url = "jdbc:mysql://localhost:3306/school1"; //No specific DB
        String user = "root";//  User Name
        String password = "root"; // Password

        try {
            //Step 2: Load  JDBC Driver (Type 4)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step 3: Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            //Step 4: Create a Statement
            if(con!=null) {
                System.out.println("✅Connection Successful!");
            }else{
                System.out.println("❌Connection Fail.");
            }

            //Step 5: Close Connection
            con.close();
        }catch (Exception e){
            e.printStackTrace();  // Print error if connection fails
        }
    }
}

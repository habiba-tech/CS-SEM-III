import java.sql.*;

public class ArchitectureExample {
    public static void main(String[] args) {
        //MySQL connection details
        String url ="jdbc:mysql://localhost:3306/school1"; //No specific DB
        String user = "root";//  User Name
        String password = "root"; // Password

        try{
            //Step 1: Load  JDBC Driver (Type 4)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step 2: Establish connection
            Connection con = DriverManager.getConnection(url,user,password);

            //Step 3: Create a Statement
            Statement stmt = con.createStatement();

            //Step 4: Execute Sql Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            //Step 5: Print result set
            System.out.println("Students Table:");
            while (rs.next()){
                System.out.println("ID:"+ rs.getInt("id")+ ",Name: " + rs.getString("name"));
            }
            //Step 6: Close connection
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

import java.sql.*;
public class ValueInsertion {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher1", "root", "root");
            if (con != null) {
                System.out.println("Connect to the database");

                //Creating a Statement
                Statement stmt = con.createStatement();

                //Specify the values for the new record
                String name = "Fatima ji";
                int age = 18;
                String email = "Fatimaji@Gmail.com";

                //Executing an INSERT query to insert a new record
                int rowsAffected = stmt.executeUpdate("INSERT INTO teachers1(name, age,email)VALUES('" + name + "'," + age + ",'" + email + "')");

                if (rowsAffected > 0) {
                    System.out.println("Record inserted successfully!");
                } else {
                    System.out.println("Failed to insert record!");
                }
                stmt.close();
                con.close();
            }
        }catch (SQLException e){
            System.out.println("Connection failed Check output console");
            e.printStackTrace();
        }
    }
}


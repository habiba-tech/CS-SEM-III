import java.sql.*;

public class DeleteRecord {
    public static void main(String[] args) {
        try {
            //Establishing the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher1", "root", "root");
            if (con != null) {
                System.out.println("Connect to the database");

                //Creating a Statement
                Statement stmt = con.createStatement();

                //Print Values before delete
                System.out.println("Values before delete:");
                displayRecord(stmt,"Fatima ji");

                //Delete the record
                int rowsAffected = stmt.executeUpdate("DELETE FROM teachers1 WHERE name='Fatima ji'");

                if (rowsAffected > 0){
                    System.out.println("Record deleted successfully!");
                }else{
                    System.out.println("Failed to delete record!");
                }
                //Closing the resources
                stmt.close();
                con.close();
            }
        }catch (SQLException e){
            System.out.println("Connection failed! Check output console!");
            e.printStackTrace();
        }
    }
    //Function to display the record for a given name
    private static void displayRecord(Statement stmt, String name) throws SQLException{
        ResultSet rs = stmt.executeQuery("SELECT*FROM teachers1 WHERE name ='"+name+"'");
        if (rs.next()){
            System.out.println("Name:" + rs.getString("name"));
            System.out.println("Age:" + rs.getInt("age"));
            System.out.println("Email:" + rs.getString("email"));
        }else{
            System.out.println("Record with name'"+name+"'not Found!");
        }
        rs.close();
    }
}
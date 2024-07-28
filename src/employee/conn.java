import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection( "jdbc:mysql://localhost:3306/employeemanagement","root","siddhesh@28");
            statement=connection.createStatement();
            
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
}


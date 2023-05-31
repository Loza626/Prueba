package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {

    private Connection con;
    private final String User = "root";
    private final String Password = "123456";
    private final String Url = "jdbc:sqlserver://localhost:1433;databaseName=SneakyGameDB";
    
    protected Connection GetSqlConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(Url, User, Password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en  la conección al servidor", 0);
        }
        return con;
    }
}

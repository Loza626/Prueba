package AppModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {

    private Connection con;
    private final String User = "root";
    private final String Password = "123456";
    private final String Url = "jdbc:sqlserver://localhost:1433;databaseName=SneakyGameDB;trustServerCertificate=true";

    protected Connection GetSqlConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(Url, User, Password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error en  la conexión al servidor", 0);
        }
        return con;
    }
}

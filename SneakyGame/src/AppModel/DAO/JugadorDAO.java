package AppModel.DAO;

import AppModel.Database;
import AppModel.Jugador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JugadorDAO extends Database {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public Boolean SignUp(Jugador jugador) throws SQLException {
        Boolean responce = false;
        try {
            con = GetSqlConnection();
            ps = con.prepareStatement("insert into JUGADOR(Username,Nombre,Correo,PartidasGanadas,Password) values (?,?,?,?,ENCRYPTBYPASSPHRASE('SystemSneakyGame',?))");
            ps.setString(1, jugador.getUsername());
            ps.setString(2, jugador.getNombre());
            ps.setString(3, jugador.getCorreo());
            ps.setInt(4, jugador.getPartidasGanadas());
            ps.setString(5, jugador.getPassword());
            int upload = ps.executeUpdate();
            responce = upload != 0;
        } catch (SQLException e) {
        } finally {
            con.close();
            ps.close();
        }
        return responce;
    }

    public Jugador Login(String user, String password) throws SQLException {
        Jugador jugador = null;
        try {
            con = GetSqlConnection();
            ps = con.prepareStatement("select * from JUGADOR where Username = ? and CONVERT(varchar(max), DECRYPTBYPASSPHRASE('SystemSneakyGame',Password) ) = ?");
            ps.setString(1, user);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                jugador = new Jugador();
                jugador.setId(rs.getInt("Id"));
                jugador.setUsername(rs.getString("Username"));
                jugador.setNombre(rs.getString("Nombre"));
                jugador.setCorreo(rs.getString("Correo"));
                jugador.setPartidasGanadas(rs.getInt("PartidasGanadas"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error en el servidor", 0);
        } finally {
            con.close();
            rs.close();
            ps.close();
        }
        return jugador;
    }
}

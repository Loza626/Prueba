package AppModel.DAO;

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
            responce = ps.executeUpdate() != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        } finally {
            con.close();
            ps.close();
        }
        return responce;
    }

    public Boolean CheckPlayerData(String username, String email) throws SQLException {
        Boolean check = false;
        try {
            con = GetSqlConnection();
            ps = con.prepareStatement("select * from JUGADOR where Username = ? or Correo = ?");
            ps.setString(1, username);
            ps.setString(2, email);
            rs = ps.executeQuery();
            check = rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        } finally {
            con.close();
            rs.close();
            ps.close();
        }
        return check;
    }

    public Jugador Login(String user, String password) throws SQLException {
        Jugador jugador = null;
        try {
            con = GetSqlConnection();
            ps = con.prepareStatement("select * from JUGADOR where (Username = ? or Correo = ?) and CONVERT(varchar(max), DECRYPTBYPASSPHRASE('SystemSneakyGame',Password) ) = ?");
            ps.setString(1, user);
            ps.setString(2, user);
            ps.setString(3, password);
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
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        } finally {
            con.close();
            rs.close();
            ps.close();
        }
        return jugador;
    }
}

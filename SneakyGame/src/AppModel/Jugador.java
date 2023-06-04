package AppModel;

public class Jugador {

    private int id;
    private String username;
    private String nombre;
    private String correo;
    private int partidasGanadas;
    private char[] password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public Jugador(int id, String username, String nombre, String correo, int partidasGanadas, char[] password) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.correo = correo;
        this.partidasGanadas = partidasGanadas;
        this.password = password;
    }

    public Jugador() {
    }

}

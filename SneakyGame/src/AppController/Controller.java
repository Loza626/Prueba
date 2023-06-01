package AppController;

import AppView.*;
import AppModel.DAO.*;
import AppModel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Controller implements ActionListener {

    //Model
    Jugador jugador = null;

    //Objects Data Acces
    JugadorDAO jugadorDAO = new JugadorDAO();

    //Interface
    Login loginView;
    SignUp signUpView;
    Principal principalView;

    public Controller() {
        this.loginView = new Login();
        this.signUpView = new SignUp();
        this.principalView = new Principal();

        loginView.getBtnLogin().addActionListener(this);
        loginView.getBtnClose().addActionListener(this);
        loginView.getBtnSignUp().addActionListener(this);
        signUpView.getBtnClose().addActionListener(this);
        signUpView.getBtnSignUp().addActionListener(this);
    }

    public void StartApplication() {
        loginView.setTitle("Iniciar Sesion");
        loginView.setVisible(true);
    }

    public void CloseApplication() {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //LoginView
            if (e.getSource() == loginView.getBtnLogin()) {
                jugador = jugadorDAO.Login(loginView.getTxtusuario().getText(), Arrays.toString(loginView.getTxtPassword().getPassword()));
                if (jugador != null) {
                    principalView.setVisible(true);
                    principalView.setTitle("Principal");
                    loginView.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(loginView, "Usuario o contraseña incorrectos");
                }
            }
            if (e.getSource() == loginView.getBtnClose()) {
                CloseApplication();
            }
            if (e.getSource() == loginView.getBtnSignUp()) {
                signUpView.setVisible(true);
                signUpView.setTitle("Crea tu cuenta de usuario");
            }

            //SignUpView
            if (e.getSource() == signUpView.getBtnClose()) {
                signUpView.setVisible(false);
            }
            if (e.getSource() == signUpView.getBtnSignUp()) {
                Jugador entities = new Jugador();
                entities.setCorreo(signUpView.getTxtCorreo().getText());
                entities.setNombre(signUpView.getTxtNombre().getText());
                entities.setPartidasGanadas(0);
                entities.setPassword(Arrays.toString(signUpView.getTxtPassword().getPassword()));
                entities.setUsername(signUpView.getTxtUsuario().getText());

                // Si usuario y correo ya son usados por otro jugador entonces no va a registrar los datos en la bases de datos caso contrario se hace el registro
                if (jugadorDAO.CheckPlayerData(entities.getUsername(), entities.getCorreo())) {
                    JOptionPane.showMessageDialog(signUpView, "Lo sentimos, usuario y correo ya son utilizdos por otro jugador", "Datos usados", 2);
                } else {
                    if (jugadorDAO.SignUp(entities)) {
                        JOptionPane.showMessageDialog(signUpView, "Tus datos se registraron exitosamente", "En hora buena", 1);
                        signUpView.setVisible(false);
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        }
    }
}

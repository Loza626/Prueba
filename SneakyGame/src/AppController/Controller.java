package AppController;

import AppView.*;
import AppModel.DAO.*;
import AppModel.*;
import java.awt.HeadlessException;
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
    PrincipalPrueba principalView;

    public Controller() {
        this.loginView = new Login();
        this.signUpView = new SignUp();
        this.principalView = new PrincipalPrueba();

        loginView.getBtnLogin().addActionListener(this);
        loginView.getBtnClose().addActionListener(this);
        loginView.getBtnSignUp().addActionListener(this);
        signUpView.getBtnClose().addActionListener(this);
        signUpView.getBtnSignUp().addActionListener(this);
    }

    //La aplicacion se ejecuta desde Config
    public void StartApplication() {
        loginView.setTitle("Iniciar Sesion");
        loginView.setVisible(true);
    }

    //La aplicacion deja de ejecutarse
    public void CloseApplication() {
        System.exit(0);
    }

    //Obtener todos los datos para el registro del jugador
    public Jugador GetEntities() {
        Jugador entities = new Jugador();
        entities.setCorreo(signUpView.getTxtCorreo().getText());
        entities.setNombre(signUpView.getTxtNombre().getText());
        entities.setPartidasGanadas(0);
        entities.setPassword(signUpView.getTxtPassword().getPassword());
        entities.setUsername(signUpView.getTxtUsuario().getText());
        return entities;
    }

    //Validar  el registro del jugador
    public Boolean ValidateSignUp(Jugador entities) {
        return !(/*Inicio de la condicion*/(entities.getUsername().length() <= 8 || "Usuario".equals(entities.getUsername()))
                || (entities.getNombre().length() <= 7 || "Nombre".equals(entities.getNombre()))
                || (entities.getCorreo().length() <= 9 || "Correo electronico".equals(entities.getCorreo())) /*Fin de la condicion*/);
    }

    private boolean PasswordIncorrect(char[] input) {
        String pass = new String(input);
        return ("Password".equals(pass) || pass.length() <= 5);
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
                signUpView.setTitle("Registrarme");
            }

            //SignUpView
            if (e.getSource() == signUpView.getBtnClose()) {
                signUpView.setVisible(false);
            }
            if (e.getSource() == signUpView.getBtnSignUp()) {
                Jugador entities = GetEntities();
                if (ValidateSignUp(entities)) {
                    if (!PasswordIncorrect(entities.getPassword())) {
                        if (jugadorDAO.SignUp(entities)) {
                            JOptionPane.showMessageDialog(signUpView, "Tus datos se registraron exitosamente", "En hora buena", 1);
                            signUpView.setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(signUpView, "Lo sentimos, usuario y correo ya son utilizdos por otro jugador", "Datos usados", 2);
                        }
                    } else {
                        JOptionPane.showMessageDialog(signUpView, "La contraseña debe ser mayor a 5 caracteres", "Contraseña incorrecta", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(signUpView, "Por favor registrese de manera corrrecta.", "Datos erroneos", 2);
                }
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        }
    }
}

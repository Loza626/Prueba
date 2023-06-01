package AppController;

import AppView.Login;
import AppModel.DAO.*;
import AppModel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Controller implements ActionListener {

    Jugador jugador = null;
    JugadorDAO jugadorDAO = new JugadorDAO();
    
    //Interface
    Login loginView;

    public Controller() {
        this.loginView = new Login();
        loginView.getBtnLogin().addActionListener(this);
        loginView.getBtnClose().addActionListener(this);
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
        if (e.getSource() == loginView.getBtnLogin()) {
            try {
                jugador = jugadorDAO.Login(loginView.getTxtusuario().getText(), loginView.getTxtPassword().getText());
                if(jugador != null){
                    
                }else{
                    JOptionPane.showMessageDialog(loginView, "Usuario o contraeña incorrectos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == loginView.getBtnClose()) {
            CloseApplication();
        }
    }

}

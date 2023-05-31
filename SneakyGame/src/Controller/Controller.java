package Controller;

import View.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

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
            
        }
        if (e.getSource() == loginView.getBtnClose()) {
            CloseApplication();
        }
    }

}

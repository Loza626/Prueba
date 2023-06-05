package AppView;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
    }

    public void ResizeImage(JLabel lbl, String url) {
        ImageIcon imagen = new ImageIcon(url);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
        lbl.setIcon(icono);
        this.repaint();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Resources/favicon.jpeg"));
        return retValue;
    }

    public JButton getBtnClose() {
        return btnClose;
    }

    public void setBtnClose(JButton btnClose) {
        this.btnClose = btnClose;
    }

    public JButton getBtnSignUp() {
        return btnSignUp;
    }

    public void setBtnSignUp(JButton btnSignUp) {
        this.btnSignUp = btnSignUp;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btnSignUp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrate nuevo jugador!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(44, 0, 320, 49);

        btnClose.setBackground(new java.awt.Color(0, 0, 0));
        btnClose.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(153, 0, 0));
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setDefaultCapable(false);
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.setPreferredSize(new java.awt.Dimension(22, 22));
        btnClose.setRequestFocusEnabled(false);
        btnClose.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnClose);
        btnClose.setBounds(370, 0, 30, 30);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Usuario");
        txtUsuario.setAutoscrolls(false);
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(20, 60, 360, 38);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Nombre");
        txtNombre.setAutoscrolls(false);
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(20, 130, 360, 38);

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setText("Correo");
        txtCorreo.setAutoscrolls(false);
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        jPanel1.add(txtCorreo);
        txtCorreo.setBounds(20, 200, 360, 38);

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("Password");
        txtPassword.setAutoscrolls(false);
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(153, 153, 153));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(20, 270, 360, 38);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        btnSignUp.setBackground(new java.awt.Color(0, 0, 102));
        btnSignUp.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(51, 204, 0));
        btnSignUp.setText("Crear cuenta de usuario");
        btnSignUp.setBorder(null);
        btnSignUp.setBorderPainted(false);
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setFocusPainted(false);
        btnSignUp.setRequestFocusEnabled(false);
        btnSignUp.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 350, 340, 40);

        jPanel3.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 99, 360, 2);

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 169, 360, 2);

        jPanel5.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 239, 360, 2);

        jPanel6.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(20, 309, 360, 2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setText(null);
        txtUsuario.setForeground(Color.BLACK);
        txtUsuario.setCaretColor(Color.GREEN);
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        txtNombre.setText(null);
        txtNombre.setForeground(Color.BLACK);
        txtNombre.setCaretColor(Color.GREEN);
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
        txtCorreo.setText(null);
        txtCorreo.setForeground(Color.BLACK);
        txtCorreo.setCaretColor(Color.GREEN);
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        txtPassword.setText(null);
        txtPassword.setForeground(Color.BLACK);
        txtPassword.setCaretColor(Color.GREEN);
    }//GEN-LAST:event_txtPasswordMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

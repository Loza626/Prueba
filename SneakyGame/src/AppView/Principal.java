package AppView;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public final class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        this.ResziseImageLabel(lblLogo, "src/Resources/Logo.png");
        this.ResziseImageLabel(lblBackground, "src/Resources/Principal.jpg");
        this.ResziseImageLabel(lblUsuarioImg, "src/Resources/User.png");
        this.ResziseImageButtom(btnPlay, "src/Resources/Play.png");
        this.ResziseImageButtom(btnIcons, "src/Resources/SelectIcons.png");
        this.ResziseImageButtom(btnPlayers, "src/Resources/Medalla.png");
    }

    public void ResziseImageLabel(JLabel lbl, String url) {
        ImageIcon imagen = new ImageIcon(url);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
        lbl.setIcon(icono);
        this.repaint();
    }

    public void ResziseImageButtom(JButton buttom, String url) {
        ImageIcon imagen = new ImageIcon(url);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(buttom.getWidth(), buttom.getHeight(), Image.SCALE_SMOOTH));
        buttom.setIcon(icono);
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

    public JButton getBtnIcons() {
        return btnIcons;
    }

    public JButton getBtnLogin() {
        return btnPlayers;
    }

    public JButton getBtnPlay() {
        return btnPlay;
    }

    public JLabel getLblUsername() {
        return lblUsername;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPlayers = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnIcons = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblUsuarioImg = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Principal"); // NOI18N
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlayers.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        btnPlayers.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayers.setBorder(null);
        btnPlayers.setBorderPainted(false);
        btnPlayers.setContentAreaFilled(false);
        btnPlayers.setDefaultCapable(false);
        btnPlayers.setFocusPainted(false);
        btnPlayers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlayers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 150, 150));

        btnPlay.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(255, 255, 255));
        btnPlay.setBorder(null);
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setDefaultCapable(false);
        btnPlay.setFocusPainted(false);
        btnPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 150, 150));

        btnIcons.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        btnIcons.setForeground(new java.awt.Color(255, 255, 255));
        btnIcons.setBorder(null);
        btnIcons.setBorderPainted(false);
        btnIcons.setContentAreaFilled(false);
        btnIcons.setDefaultCapable(false);
        btnIcons.setFocusPainted(false);
        btnIcons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIcons.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnIcons, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 150, 150));

        btnClose.setBackground(new java.awt.Color(0, 0, 0));
        btnClose.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setDefaultCapable(false);
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.setPreferredSize(new java.awt.Dimension(22, 22));
        btnClose.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, 30));

        lblUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblUsername.setFont(new java.awt.Font("Arial Black", 3, 15)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setText("lblUsername");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, 170, 50));
        jPanel1.add(lblUsuarioImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 50, 50));
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 480, 100));
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnIcons;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPlayers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsuarioImg;
    // End of variables declaration//GEN-END:variables
}

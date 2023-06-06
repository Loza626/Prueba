package AppView;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class IndividualGame extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    private int posicionJugador;

    public IndividualGame() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.Imagen(this.lblImagen, "src/Resources/tablero.jpg");
        this.Imagen(this.lblTapa, "src/Resources/tapa.png");
        this.Imagen(this.lblDado, "src/Resources/dado0.png");

        lblImagen.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mostrarPosicionMouse(e.getX(), e.getY());
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PointsLabel = new javax.swing.JPanel();
        DadoLabel = new javax.swing.JPanel();
        lblDado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDado = new javax.swing.JButton();
        TablePanel = new javax.swing.JPanel();
        lblTapa = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelPrincipal.setPreferredSize(new java.awt.Dimension(960, 540));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PointsLabel.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout PointsLabelLayout = new javax.swing.GroupLayout(PointsLabel);
        PointsLabel.setLayout(PointsLabelLayout);
        PointsLabelLayout.setHorizontalGroup(
            PointsLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PointsLabelLayout.setVerticalGroup(
            PointsLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        PanelPrincipal.add(PointsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 232, -1));

        DadoLabel.setBackground(new java.awt.Color(51, 204, 0));
        DadoLabel.setMaximumSize(new java.awt.Dimension(197, 230));
        DadoLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDado.setPreferredSize(new java.awt.Dimension(120, 120));
        DadoLabel.add(lblDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 160, 150));

        jPanel1.setBackground(new java.awt.Color(0, 0, 130));

        btnDado.setBackground(new java.awt.Color(0, 0, 102));
        btnDado.setFont(new java.awt.Font("Arial Black", 3, 13)); // NOI18N
        btnDado.setForeground(new java.awt.Color(51, 204, 0));
        btnDado.setText("Lanzar dado");
        btnDado.setBorder(null);
        btnDado.setBorderPainted(false);
        btnDado.setContentAreaFilled(false);
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDado, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDado, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        DadoLabel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 220, 50));

        PanelPrincipal.add(DadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 270, 240, 270));

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTapa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(lblTapa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        );

        PanelPrincipal.add(TablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed
        int nuevaPosicion;
        int random = (int) (Math.random() * 6) + 1;

        this.setLocationRelativeTo(this);
        switch (random) {
            case 1 -> {
                this.Imagen(this.lblDado, "src/Resources/dado1.png");
                moverLabel(random);
            }
            case 2 -> {
                this.Imagen(this.lblDado, "src/Resources/dado2.png");
                moverLabel(random);
            }
            case 3 -> {
                this.Imagen(this.lblDado, "src/Resources/dado3.png");
                moverLabel(random);
            }
            case 4 -> {
                this.Imagen(this.lblDado, "src/Resources/dado4.png");
                moverLabel(random);
            }
            case 5 -> {
                this.Imagen(this.lblDado, "src/Resources/dado5.png");
                moverLabel(random);
            }
            case 6 -> {
                this.Imagen(this.lblDado, "src/Resources/dado6.png");
                moverLabel(random);
            }
            default -> throw new AssertionError();
        }
    }//GEN-LAST:event_btnDadoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IndividualGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndividualGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndividualGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndividualGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndividualGame().setVisible(true);
            }
        });
    }

    private void mostrarPosicionMouse(int x, int y) {
        System.out.println("Posicion del mouse - X: " + x + ", Y: " + y);
    }

    private void moverLabel(int random) {
        posicionJugador += random; // Actualizar la posición del jugador

        // Calcular la posición actual en el tablero
        int fila = 4 - (posicionJugador - 1) / 10; // Calcular la fila actual (comenzando desde la última)
        int columna;

        //Calcular columna actual
        if (fila % 2 == 0) {
            columna = (posicionJugador - 1) % 10;
        } else {
            columna = 9 - (posicionJugador - 1) % 10;
        }

        // Calcular el tamaño de cada cuadro del tablero
        int anchoCuadro = 960 / 10; // Ancho del tablero dividido por el número de columnas
        int altoCuadro = 540 / 5; // Alto del tablero dividido por el número de filas

        // Calcular las coordenadas x e y en el centro del cuadro
        int x = columna * anchoCuadro + (anchoCuadro / 2) - (lblTapa.getWidth() / 2);
        int y = fila * altoCuadro + (altoCuadro / 2) - (lblTapa.getHeight() / 2);
        // Mover la etiqueta del jugador al centro del cuadro
        lblTapa.setLocation(x, y);

        switch (posicionJugador) {
            case 13 -> {
                // Serpiente - Casilla 13 a 8
                posicionJugador = 8;
                JOptionPane.showMessageDialog(null, "Ups! Pisaste una serpinete"
                        + "\nRegresaras a la posicion 8");
                lblTapa.setLocation(683, 451);
            }
            case 14 -> {
                // Escalera - Casilla 14 a 34
                posicionJugador = 25;
                JOptionPane.showMessageDialog(null, "Oh! una escalera"
                        + "\nAvance a la posicion 25");
                lblTapa.setLocation(586, 240);
            }
            case 4 -> {
                // Escalera - Casilla 16 a 24
                posicionJugador = 17;
                JOptionPane.showMessageDialog(null, "Oh! una escalera"
                        + "\nAvance a la posicion 17");
                lblTapa.setLocation(303, 345);
            }
            case 23 -> {
                // Escalera - Casilla 23 a 43
                posicionJugador = 38;
                JOptionPane.showMessageDialog(null, "Oh! una escalera"
                        + "\nAvance a la posicion 38");
                lblTapa.setLocation(211, 137);
            }
            case 41 -> {
                // Serpiente - Casilla 41 a 21
                posicionJugador = 21;
                JOptionPane.showMessageDialog(null, "Ups! Piasate una serpinete"
                        + "\nRegresaras a la posicion 21");
                lblTapa.setLocation(16, 236);
            }
            case 49 -> {
                // Serpiente - Casilla 49 a 29
                posicionJugador = 29;
                JOptionPane.showMessageDialog(null, "Ups! Pisaste una serpinete"
                        + "\nRegresaras a la posicion 29");
                lblTapa.setLocation(781, 238);
            }
        }

        if (posicionJugador == 50) {
            lblTapa.setLocation(x, y);
            JOptionPane.showMessageDialog(null, "¡¡¡Felicidades, Usted ha ganado el juego!!!"
                    + "\nHas ganado el juego");
            return;
        } else if (posicionJugador >= 50) {
            JOptionPane.showMessageDialog(null, "Perdiste el juego :("
                    + "\nVuelve a Intentarlo");
            posicionJugador = 0;
            lblTapa.setLocation(-60, 550);
            this.Imagen(this.lblDado, "src/Resources/dado0.png");
        }

        // lblTapa.repaint(); // Actualizar la posición del label en el panel
    }

    private void Imagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_SMOOTH
                )
        );

        lbl.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DadoLabel;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PointsLabel;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JButton btnDado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTapa;
    // End of variables declaration//GEN-END:variables
}

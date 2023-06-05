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
        //para ver posicion x,y
        lblImagen.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mostrarPosicionMouse(e.getX(), e.getY());
            }
        });
    }

    //metodo para ver posicion x,y
    private void mostrarPosicionMouse(int x, int y) {
        System.out.println("Posicion del mouse - X: " + x + ", Y: " + y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelImagen = new javax.swing.JPanel();
        lblTapa = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPuntaje = new javax.swing.JLabel();
        lblDado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        PanelImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelImagen.add(lblTapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 540, 80, 80));

        lblImagen.setBackground(new java.awt.Color(153, 204, 255));
        PanelImagen.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 648));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnDado.setText("Lanzar Dado");
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 216));

        lblPuntaje.setBackground(new java.awt.Color(255, 255, 255));
        lblPuntaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPuntaje.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntaje.setText("Puntaje:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblPuntaje)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDado)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnDado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnDado.getAccessibleContext().setAccessibleDescription("");

        PanelImagen.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1158, -2, -1, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed
        int nuevaPosicion;
        int random = (int) (Math.random() * 6) + 1;
        
        this.setLocationRelativeTo(this);
        switch (random) {
            case 1 -> {
                this.Imagen(this.lblDado,"src/Resources/dado1.png");
                moverLabel(random);
            }
            case 2 -> {
                this.Imagen(this.lblDado,"src/Resources/dado2.png");
                moverLabel(random);
            }
            case 3 -> {
                this.Imagen(this.lblDado,"src/Resources/dado3.png");
                moverLabel(random);
            }
            case 4 -> {
                this.Imagen(this.lblDado,"src/Resources/dado4.png");
                moverLabel(random);
            }
            case 5 -> {
                this.Imagen(this.lblDado,"src/Resources/dado5.png");
                moverLabel(random);
            }
            case 6 -> {
                this.Imagen(this.lblDado,"src/Resources/dado6.png");
                moverLabel(random);
            }
            default -> throw new AssertionError();
        }
    }//GEN-LAST:event_btnDadoActionPerformed

    
    private void Imagen(JLabel lbl, String ruta){
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
        int anchoCuadro = 1152 / 10; // Ancho del tablero dividido por el número de columnas
        int altoCuadro = 648 / 5; // Alto del tablero dividido por el número de filas
        
        // Calcular las coordenadas x e y en el centro del cuadro
        int x = columna * anchoCuadro + (anchoCuadro / 2) - (lblTapa.getWidth() / 2);
        int y = fila * altoCuadro + (altoCuadro / 2) - (lblTapa.getHeight() / 2);
        // Mover la etiqueta del jugador al centro del cuadro
        lblTapa.setLocation(x, y);

        switch (posicionJugador) {
            case 13 -> {
                // Serpiente - Casilla 13 a 8
                posicionJugador = 8;
                JOptionPane.showMessageDialog(null, "Ups! Pisaste una serpinete" +
                        "\nRegresaras a la posicion 8");
                lblTapa.setLocation(825, 546);
            }
            case 14 -> {
                // Escalera - Casilla 14 a 34
                posicionJugador = 25;
                JOptionPane.showMessageDialog(null, "Oh! una escalera" +
                        "\nAvance a la posicion 25");
                lblTapa.setLocation(709, 288);
            }
            case 4 -> {
                // Escalera - Casilla 16 a 24
                posicionJugador = 17;
                JOptionPane.showMessageDialog(null, "Oh! una escalera" +
                        "\nAvance a la posicion 17");
                lblTapa.setLocation(367, 420);
            }
            case 23 -> {
                // Escalera - Casilla 23 a 43
                posicionJugador = 38;
                JOptionPane.showMessageDialog(null, "Oh! una escalera" +
                        "\nAvance a la posicion 38");
                lblTapa.setLocation(250, 160);
            }
            case 41 -> {
                // Serpiente - Casilla 41 a 21
                posicionJugador = 21;
                JOptionPane.showMessageDialog(null, "Ups! Piasate una serpinete" +
                        "\nRegresaras a la posicion 21");
                lblTapa.setLocation(16, 292);
            }
            case 49 -> {
                // Serpiente - Casilla 49 a 29
                posicionJugador = 29;
                JOptionPane.showMessageDialog(null, "Ups! Pisaste una serpinete" +
                        "\nRegresaras a la posicion 29");
                lblTapa.setLocation(930, 285);
            }
        }

        if (posicionJugador == 50) {
            lblTapa.setLocation(x, y);
            JOptionPane.showMessageDialog(null, "¡¡¡Felicidades, Usted ha ganado el juego!!!" +
                        "\nHas ganado el juego");
            return;
        }
        else if(posicionJugador >= 50){
            JOptionPane.showMessageDialog(null, "Perdiste el juego :(" +
                        "\nVuelve a Intentarlo");
            posicionJugador = 0;
            lblTapa.setLocation(-60,550);
            this.Imagen(this.lblDado,"src/Resources/dado0.png");
        }

       // lblTapa.repaint(); // Actualizar la posición del label en el panel
    }



     



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelImagen;
    private javax.swing.JButton btnDado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblTapa;
    // End of variables declaration//GEN-END:variables
}

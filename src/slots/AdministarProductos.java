package slots;

import visuals.LayoutAdmin;

public class AdministarProductos extends javax.swing.JPanel {

    public AdministarProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Discos = new javax.swing.JButton();
        RAMs = new javax.swing.JButton();
        PlacasMadre = new javax.swing.JButton();
        TarjetasGraficas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Discos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-disco-duro-100.png"))); // NOI18N
        Discos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscosActionPerformed(evt);
            }
        });
        add(Discos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 100, 100));

        RAMs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-ram-de-computadora-100.png"))); // NOI18N
        RAMs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAMsActionPerformed(evt);
            }
        });
        add(RAMs, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 100, 100));

        PlacasMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-placa-base-100.png"))); // NOI18N
        PlacasMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacasMadreActionPerformed(evt);
            }
        });
        add(PlacasMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 100, 100));

        TarjetasGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-tarjeta-de-video-100.png"))); // NOI18N
        TarjetasGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetasGraficasActionPerformed(evt);
            }
        });
        add(TarjetasGraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 100, 100));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("MEMORIA RAM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("TARJETA GRÁFICA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("desde el sistema operativo hasta archivos personales.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("PLACA MADRE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 760, 10));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("DISCO");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("INFORMACIÓN ACERCA DE LOS PRODUCTOS");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Es un dispositivo de almacenamiento permanente que guarda datos de manera no volátil,");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("lo que significa que conserva la información incluso cuando la computadora está apagada.");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Los discos pueden ser HDD (discos duros) o SSD (unidades de estado sólido), y almacenan");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("datos cuando se apaga la computadora.");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("PLACA MADRE:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Es una forma de almacenamiento de acceso aleatorio y temporal utilizado por la ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 570, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("computadora para almacenar datos e instrucciones necesarios para que el procesador ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("pueda acceder rápidamente a ellos. La RAM es volátil, lo que significa que pierde sus");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("MEMORIA RAM:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("teclados, ratones y dispositivos de red.");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Es la tarjeta principal de circuito impreso en una computadora que conecta y permite la ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 620, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("comunicación entre todos los componentes esenciales de hardware, como el procesador,");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("la memoria, la tarjeta gráfica, el almacenamiento y otros dispositivos periféricos. La placa ");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("base también proporciona interfaces para la conexión externa de dispositivos como");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("relacionadas con gráficos, juegos y aplicaciones de diseño.");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Es un componente de hardware que se encarga de procesar y renderizar gráficos en");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 600, -1));

        jLabel24.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("una computadora. A menudo viene como una tarjeta separada con su propia unidad de ");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        jLabel25.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("procesamiento gráfico (GPU), diseñada para manejar cargas de trabajo intensivas");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("TARJETA GRÁFICA:");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("DISCO:");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void DiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscosActionPerformed
        Discos discos = new Discos();
        LayoutAdmin.getInstance().switchPanel(discos);
    }//GEN-LAST:event_DiscosActionPerformed

    private void RAMsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAMsActionPerformed
        RAMs rams = new RAMs();
        LayoutAdmin.getInstance().switchPanel(rams);
    }//GEN-LAST:event_RAMsActionPerformed

    private void PlacasMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacasMadreActionPerformed
        PlacasMadre placas = new PlacasMadre();
        LayoutAdmin.getInstance().switchPanel(placas);
    }//GEN-LAST:event_PlacasMadreActionPerformed

    private void TarjetasGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetasGraficasActionPerformed
        TarjetasGraficas tarjetas = new TarjetasGraficas();
        LayoutAdmin.getInstance().switchPanel(tarjetas);
    }//GEN-LAST:event_TarjetasGraficasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Discos;
    private javax.swing.JButton PlacasMadre;
    private javax.swing.JButton RAMs;
    private javax.swing.JButton TarjetasGraficas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

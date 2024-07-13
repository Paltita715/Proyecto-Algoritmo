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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Discos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Procesador.png"))); // NOI18N
        Discos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscosActionPerformed(evt);
            }
        });
        add(Discos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 100, 100));

        RAMs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-ram-de-computadora-100.png"))); // NOI18N
        RAMs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAMsActionPerformed(evt);
            }
        });
        add(RAMs, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 100, 100));

        PlacasMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-placa-base-100.png"))); // NOI18N
        add(PlacasMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 100, 100));

        TarjetasGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-tarjeta-de-video-100.png"))); // NOI18N
        add(TarjetasGraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 100, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void DiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscosActionPerformed
        Discos discos = new Discos();
        LayoutAdmin.getInstance().switchPanel(discos);
    }//GEN-LAST:event_DiscosActionPerformed

    private void RAMsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAMsActionPerformed
        RAMs rams = new RAMs();
        LayoutAdmin.getInstance().switchPanel(rams);
    }//GEN-LAST:event_RAMsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Discos;
    private javax.swing.JButton PlacasMadre;
    private javax.swing.JButton RAMs;
    private javax.swing.JButton TarjetasGraficas;
    // End of variables declaration//GEN-END:variables
}

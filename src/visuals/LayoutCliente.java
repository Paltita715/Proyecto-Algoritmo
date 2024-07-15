package visuals;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;
import javax.swing.Timer;
import slots.General;

public class LayoutCliente extends javax.swing.JFrame {

    public LayoutCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        General general = new General();
        switchPanel(general);
        actualizarFecha();
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Actualizar la hora
                actualizarHora();
            }
        });

        // Iniciar el Timer
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        pnlNavSup = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblUserType = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNavSup.setBackground(new java.awt.Color(51, 51, 51));
        pnlNavSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("User01");
        pnlNavSup.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, 25));

        lblUserType.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblUserType.setForeground(new java.awt.Color(255, 255, 255));
        lblUserType.setText("Cliente");
        pnlNavSup.add(lblUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 25));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/iconUser.png"))); // NOI18N
        pnlNavSup.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 80));

        btnCerrarSesion.setBackground(new java.awt.Color(102, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("CERRAR SESIÓN");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });
        pnlNavSup.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 160, 50));

        lblHora.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("           ");
        pnlNavSup.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        lblFecha.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("           ");
        pnlNavSup.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, -1, -1));

        bg.add(pnlNavSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 100));

        pnlBody.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        bg.add(pnlBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1370, 668));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUserName(String userName) {
        lblUserName.setText(userName);
    }
    
    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    public final void switchPanel(JPanel panel) {
        panel.setSize(1370, 668);
        panel.setLocation(0, 0);
        pnlBody.removeAll();
        pnlBody.add(panel, BorderLayout.CENTER);
        pnlBody.revalidate();
        pnlBody.repaint();
    }
    
    private void actualizarFecha() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd/MM/yy");
        String fechaFormateada = fechaActual.format(formatterFecha);
        lblFecha.setText(fechaFormateada);
    }

    // Método para actualizar la hora actual en lblHora
    private void actualizarHora() {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada = horaActual.format(formatterHora);
        lblHora.setText(horaFormateada);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel iconUser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlNavSup;
    // End of variables declaration//GEN-END:variables
}

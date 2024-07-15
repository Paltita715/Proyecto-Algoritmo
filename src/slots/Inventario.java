package slots;

import DAO.implementaciones.DiscoDAOImpl;
import DAO.implementaciones.PlacaMadreDAOImpl;
import DAO.implementaciones.RamDAOImpl;
import DAO.implementaciones.TarjetaGraficaDAOImpl;
import DAO.interfaces.DiscoDAO;
import DAO.interfaces.PlacaMadreDAO;
import DAO.interfaces.RamDAO;
import DAO.interfaces.TarjetaGraficaDAO;
import javax.swing.table.DefaultTableModel;

public class Inventario extends javax.swing.JPanel {

    public Inventario() {
        initComponents();
        cargarDatosDiscos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRams = new javax.swing.JButton();
        btnDiscos = new javax.swing.JButton();
        btnTarjetasGraficas = new javax.swing.JButton();
        btnPlacasMadre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableComponentes = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-ram-de-computadora-100.png"))); // NOI18N
        btnRams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRamsActionPerformed(evt);
            }
        });
        add(btnRams, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 100, 100));

        btnDiscos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-disco-duro-100.png"))); // NOI18N
        btnDiscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscosActionPerformed(evt);
            }
        });
        add(btnDiscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 100));

        btnTarjetasGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-tarjeta-de-video-100.png"))); // NOI18N
        btnTarjetasGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetasGraficasActionPerformed(evt);
            }
        });
        add(btnTarjetasGraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 100, 100));

        btnPlacasMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-placa-base-100.png"))); // NOI18N
        btnPlacasMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasMadreActionPerformed(evt);
            }
        });
        add(btnPlacasMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 100, 100));

        TableComponentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableComponentes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 830, 390));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 950, 10));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("MEMORIA RAM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 360, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("COMPONENTES DISPONIBLES");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("TARJETA GRÁFICA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("DISCO");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("PLACA MADRE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscosActionPerformed
        cargarDatosDiscos();
    }//GEN-LAST:event_btnDiscosActionPerformed

    private void btnRamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRamsActionPerformed
        cargarDatosRAM();
    }//GEN-LAST:event_btnRamsActionPerformed

    private void btnPlacasMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasMadreActionPerformed
        cargarDatosMotherboards();
    }//GEN-LAST:event_btnPlacasMadreActionPerformed

    private void btnTarjetasGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetasGraficasActionPerformed
        cargarDatosTarjetasGraficas();
    }//GEN-LAST:event_btnTarjetasGraficasActionPerformed
  
    private void cargarDatosDiscos() {
        try {
            DiscoDAO dao = new DiscoDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            model.setColumnIdentifiers(new Object[]{"ID", "Supplier ID", "Name", "Type", "Capacity", "Interface", "Read Speed", "Write Speed", "Quantity"});
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getDiskId(),
                u.getSupplierId(),
                u.getName(),
                u.getType(),
                u.getCapacity(),
                u.getInterface(),
                u.getReadSpeed(),
                u.getWriteSpeed(),
                u.getQuantity(),
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    private void cargarDatosRAM() {
        try {
            RamDAO dao = new RamDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            model.setColumnIdentifiers(new Object[]{"ID", "Supplier ID", "Name", "Type", "Capacity", "Speed", "Latency", "Voltage", "Quantity"});
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getRamId(),
                u.getSupplierId(),
                u.getName(),
                u.getType(),
                u.getCapacity(),
                u.getSpeed(),
                u.getLatency(),
                u.getVoltage(),
                u.getQuantity(),
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    private void cargarDatosTarjetasGraficas() {
        try {
            TarjetaGraficaDAO dao = new TarjetaGraficaDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            model.setColumnIdentifiers(new Object[]{"ID", "Supplier ID", "Name", "Interface", "Memory", "Type Memory", "Bandwidth", "Quantity"});
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getGraphicsCardId(),
                u.getSupplierId(),
                u.getName(),
                u.getPCIe(),
                u.getMemory(),
                u.getTypeMemory(),
                u.getBandwidth(),
                u.getQuantity(),
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    private void cargarDatosMotherboards() {
        try {
            PlacaMadreDAO dao = new PlacaMadreDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            model.setColumnIdentifiers(new Object[]{"ID", "Supplier ID", "Name", "socket", "ramType", "maxRam", "PCIe", "storagePorts" ,"Quantity"});
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getMotherboardId(),
                u.getSupplierId(),
                u.getName(),
                u.getSocket(),
                u.getRamType(),
                u.getMaxRam(),
                u.getPCIe(),
                u.getStoragePorts(),
                u.getQuantity(),
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableComponentes;
    private javax.swing.JButton btnDiscos;
    private javax.swing.JButton btnPlacasMadre;
    private javax.swing.JButton btnRams;
    private javax.swing.JButton btnTarjetasGraficas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

package slots;

import visuals.LayoutAdmin;

import DAO.implementaciones.RamDAOImpl;
import DAO.interfaces.RamDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.RamModel;

public class RAMs extends javax.swing.JPanel {

    public RAMs() {
        initComponents();
        tablaRAMs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRams = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaRams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Proveedor", "Nombre", "Tipo", "Capacidad", "Velocidad", "Latencia", "Voltaje", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(TablaRams);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 859, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdministarProductos ingreso = new AdministarProductos();
        LayoutAdmin.getInstance().switchPanel(ingreso);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaRAMs(){
        try {
            RamDAO dao = new RamDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TablaRams.getModel();
            model.setRowCount(0);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaRams;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

package slots;

import visuals.LayoutAdmin;
import DAO.implementaciones.RamDAOImpl;
import DAO.implementaciones.ProveedorDAOlmpl;
import DAO.interfaces.RamDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.RamModel;
import modelos.ProveedorModel;
import java.util.HashMap;

public class RegistrarRam extends javax.swing.JPanel {

    public RegistrarRam() {
        initComponents();
        cargarProveedores();
    }
    
    private HashMap<String, Integer> proveedorMap = new HashMap<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JSpinner();
        txtCantidad = new javax.swing.JSpinner();
        txtLatencia = new javax.swing.JSpinner();
        txtVoltaje = new javax.swing.JSpinner();
        txtTipo = new javax.swing.JComboBox<>();
        txtVelocidad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR NUEVA RAM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 300, 10));

        btnEditar.setText("REGISTRAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 120, 50));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 120, 50));
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 50));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 210, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 20, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("CL");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 30, 50));
        add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 50));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Proveedor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tipo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Capacidad");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Velocidad");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cantidad");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Voltaje");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));
        add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 210, 50));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 210, 50));
        add(txtLatencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 210, 50));

        txtVoltaje.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.1d));
        add(txtVoltaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 210, 50));

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR4", "DDR5" }));
        txtTipo.setToolTipText("");
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 210, 50));
        add(txtVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 210, 50));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Latencia");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String RamId = txtId.getText();
        String nombreProveedor = (String) txtProveedor.getSelectedItem(); // Obtén el nombre
        int supplierId = proveedorMap.getOrDefault(nombreProveedor, -1); //aqui quiero recuperar la ID del proveedor
        System.out.println(supplierId);
        String name = txtNombre.getText();
        String type = (String) txtTipo.getSelectedItem();
        int capacity = (int) txtCapacidad.getValue();
        int speed = (int) txtVelocidad.getValue();
        int latency = (int) txtLatencia.getValue();
        double voltage = (double) txtVoltaje.getValue();
        int quantity = (int) txtCantidad.getValue();
        if(nombreProveedor.isEmpty() || type.isEmpty() || name.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        RamModel ram = new RamModel();
        ram.setRamId(RamId);
        ram.setSupplierId(supplierId);
        ram.setName(name);
        ram.setType(type);
        ram.setCapacity(capacity);
        ram.setSpeed(speed);
        ram.setLatency("CL"+latency);
        ram.setVoltage(voltage);
        ram.setQuantity(quantity);
        RamDAO dao = new RamDAOImpl();
        try {
            dao.create(ram);
            JOptionPane.showMessageDialog(null, "RAM creado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error");
            System.err.println(e);
        } finally{
            RAMs rams = new RAMs();
            LayoutAdmin.getInstance().switchPanel(rams);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        RAMs rams = new RAMs();
        LayoutAdmin.getInstance().switchPanel(rams);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cargarProveedores() {
        ProveedorDAOlmpl proveedorDAO = new ProveedorDAOlmpl();
    try {
        ArrayList<ProveedorModel> proveedores = proveedorDAO.readAll();
        for (ProveedorModel proveedor : proveedores) {
            txtProveedor.addItem(proveedor.getName()); // Agrega solo el nombre
            proveedorMap.put(proveedor.getName(), proveedor.getSupplierId()); // Mapa para ID
        }
    } catch (Exception e) {
        e.printStackTrace(); // Manejo de errores
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JSpinner txtCapacidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JSpinner txtLatencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtProveedor;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JSpinner txtVelocidad;
    private javax.swing.JSpinner txtVoltaje;
    // End of variables declaration//GEN-END:variables
}

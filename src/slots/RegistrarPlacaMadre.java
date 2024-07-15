package slots;

import visuals.LayoutAdmin;
import DAO.implementaciones.PlacaMadreDAOImpl;
import DAO.implementaciones.ProveedorDAOlmpl;
import DAO.interfaces.PlacaMadreDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.PlacaMadreModel;
import modelos.ProveedorModel;
import java.util.HashMap;

public class RegistrarPlacaMadre extends javax.swing.JPanel {

    public RegistrarPlacaMadre() {
        initComponents();
        cargarProveedores();
    }
    
    private HashMap<String, Integer> proveedorMap = new HashMap<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        txtPuertos = new javax.swing.JSpinner();
        txtRamMax = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtSocket = new javax.swing.JTextField();
        txtTipoRam = new javax.swing.JComboBox<>();
        txtPCIe = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSATA = new javax.swing.JCheckBox();
        txtNVMe = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR NUEVA PLACA MADRE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, 10));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 130, 50));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 130, 50));
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 210, 50));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 210, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 20, -1));
        add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 210, 50));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Proveedor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Socket");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Tipo de RAM");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("RAM max");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cantidad");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Puertos");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 210, 50));
        add(txtPuertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 210, 50));
        add(txtRamMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 210, 50));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("PCIe");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));
        add(txtSocket, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 210, 50));

        txtTipoRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR4", "DDR5" }));
        txtTipoRam.setToolTipText("");
        add(txtTipoRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 210, 50));

        txtPCIe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "8", "16" }));
        txtPCIe.setToolTipText("");
        add(txtPCIe, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 210, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COMPATIBILIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, -1));

        txtSATA.setText("SATA");
        jPanel1.add(txtSATA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        txtNVMe.setText("NVMe");
        jPanel1.add(txtNVMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 300, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String motherboardId = txtId.getText();
        String nombreProveedor = (String) txtProveedor.getSelectedItem(); // Obtén el nombre
        int supplierId = proveedorMap.getOrDefault(nombreProveedor, -1); //aqui quiero recuperar la ID del proveedor
        System.out.println(supplierId);
        String name = txtNombre.getText();
        String socket = txtSocket.getText();
        String ramType = (String) txtTipoRam.getSelectedItem();
        int maxRam = (int) txtRamMax.getValue();
        int PCIe = Integer.parseInt((String) txtPCIe.getSelectedItem());
        int storagePorts = (int) txtPuertos.getValue();
        int quantity = (int) txtCantidad.getValue();
        boolean compatibleWithSATA = txtSATA.isSelected();
        boolean compatibleWithNVMe = txtNVMe.isSelected();
        
        if (nombreProveedor.isEmpty() || name.isEmpty() || socket.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos obligatorios.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        PlacaMadreModel placa = new PlacaMadreModel();
        placa.setMotherboardId(motherboardId);
        placa.setSupplierId(supplierId);
        placa.setName(name);
        placa.setSocket(socket);
        placa.setRamType(ramType);
        placa.setMaxRam(maxRam);
        placa.setPCIe(PCIe);
        placa.setStoragePorts(storagePorts);
        placa.setQuantity(quantity);
        placa.setCompatibleWithSATA(compatibleWithSATA);
        placa.setCompatibleWithNVMe(compatibleWithNVMe);

        PlacaMadreDAO dao = new PlacaMadreDAOImpl();
        try {
            dao.create(placa);
            JOptionPane.showMessageDialog(null, "Placa madre registrada correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar la placa madre.");
            System.err.println(e);
        } finally {
            PlacasMadre placas = new PlacasMadre();
            LayoutAdmin.getInstance().switchPanel(placas);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PlacasMadre placas = new PlacasMadre();
        LayoutAdmin.getInstance().switchPanel(placas);
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
    private javax.swing.JButton btnRegistrar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JCheckBox txtNVMe;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtPCIe;
    private javax.swing.JComboBox<String> txtProveedor;
    private javax.swing.JSpinner txtPuertos;
    private javax.swing.JSpinner txtRamMax;
    private javax.swing.JCheckBox txtSATA;
    private javax.swing.JTextField txtSocket;
    private javax.swing.JComboBox<String> txtTipoRam;
    // End of variables declaration//GEN-END:variables
}

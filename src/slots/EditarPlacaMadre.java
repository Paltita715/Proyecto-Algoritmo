package slots;

import visuals.LayoutAdmin;
import DAO.implementaciones.ProveedorDAOlmpl;
import DAO.implementaciones.PlacaMadreDAOImpl;
import DAO.interfaces.PlacaMadreDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.ProveedorModel;
import java.util.HashMap;
import modelos.PlacaMadreModel;

public class EditarPlacaMadre extends javax.swing.JPanel {
    
    PlacaMadreModel editPlaca;

    public EditarPlacaMadre(PlacaMadreModel placa) {
        editPlaca = placa;
        initComponents();
        cargarProveedores();
        cargarDatos();
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
        txtProveedor = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JSpinner();
        txtPuertos = new javax.swing.JSpinner();
        txtRamMax = new javax.swing.JSpinner();
        txtSocket = new javax.swing.JTextField();
        txtTipoRam = new javax.swing.JComboBox<>();
        txtPCIe = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSATA = new javax.swing.JCheckBox();
        txtNVMe = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR NUEVA PLACA MADRE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 410, 10));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 110, 50));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 120, 50));

        txtId.setEditable(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 210, 50));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 210, 50));
        add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 210, 50));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 210, 50));
        add(txtPuertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 210, 50));
        add(txtRamMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 210, 50));
        add(txtSocket, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 210, 50));

        txtTipoRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR4", "DDR5" }));
        txtTipoRam.setToolTipText("");
        add(txtTipoRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 210, 50));

        txtPCIe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "8", "16" }));
        txtPCIe.setToolTipText("");
        add(txtPCIe, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 210, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("COMPATIBILIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        txtSATA.setText("SATA");
        jPanel1.add(txtSATA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtNVMe.setText("NVMe");
        jPanel1.add(txtNVMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 290, 130));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("ID");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 20, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Proveedor");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Nombre");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Socket");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Tipo de RAM");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("RAM max");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Cantidad");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Puertos");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("PCIe");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
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
            dao.update(placa);
            JOptionPane.showMessageDialog(null, "Placa madre actualizada correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al actualizar la placa madre.");
            System.err.println(e);
        } finally {
            PlacasMadre placas = new PlacasMadre();
            LayoutAdmin.getInstance().switchPanel(placas);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PlacasMadre placas = new PlacasMadre();
        LayoutAdmin.getInstance().switchPanel(placas);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cargarProveedores() {
        ProveedorDAOlmpl proveedorDAO = new ProveedorDAOlmpl();
        try {
            ArrayList<ProveedorModel> proveedores = proveedorDAO.readAll();
            for (ProveedorModel proveedor : proveedores) {
                txtProveedor.addItem(proveedor.getName());
                proveedorMap.put(proveedor.getName(), proveedor.getSupplierId());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de errores
        }
    }
    
    private void cargarDatos(){
        txtId.setText(editPlaca.getMotherboardId());
        for (String nombreProveedor : proveedorMap.keySet()) {
            if (proveedorMap.get(nombreProveedor).equals(editPlaca.getSupplierId())) {
                txtProveedor.setSelectedItem(nombreProveedor);
                break;
            }
        }
        txtNombre.setText(editPlaca.getName());
        txtSocket.setText(editPlaca.getSocket());
        txtTipoRam.setSelectedItem(editPlaca.getRamType());
        txtRamMax.setValue(editPlaca.getMaxRam());
        txtPCIe.setSelectedItem(editPlaca.getPCIe());
        txtPuertos.setValue(editPlaca.getStoragePorts());
        txtCantidad.setValue(editPlaca.getQuantity());
        txtSATA.setSelected(editPlaca.isCompatibleWithSATA());
        txtNVMe.setSelected(editPlaca.isCompatibleWithNVMe());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
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

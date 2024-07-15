package slots;

import visuals.LayoutAdmin;
import DAO.implementaciones.ProveedorDAOlmpl;
import DAO.implementaciones.TarjetaGraficaDAOImpl;
import DAO.interfaces.TarjetaGraficaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.ProveedorModel;
import java.util.HashMap;
import modelos.TarjetaGraficaModel;

public class EditarTarjetaGrafica extends javax.swing.JPanel {
    
    TarjetaGraficaModel editTarjeta;

    public EditarTarjetaGrafica(TarjetaGraficaModel tarjeta) {
        editTarjeta = tarjeta;
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
        jLabel2 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMemoria = new javax.swing.JSpinner();
        txtCantidad = new javax.swing.JSpinner();
        txtAnchoBanda = new javax.swing.JSpinner();
        txtPCIe = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtTipoMemoria = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDITAR TARJETA GRAFICA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 320, 10));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 130, 50));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 130, 50));

        txtId.setEditable(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 210, 50));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 210, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 30, -1));
        add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 210, 50));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Proveedor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("PCIe");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Memoria");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tipo de memoria");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cantidad");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));
        add(txtMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 210, 50));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 210, 50));
        add(txtAnchoBanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 210, 50));

        txtPCIe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "8", "16" }));
        txtPCIe.setToolTipText("");
        add(txtPCIe, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 210, 50));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Ancho de banda");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));
        add(txtTipoMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 210, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String graphicsCardId = txtId.getText();
        String nombreProveedor = (String) txtProveedor.getSelectedItem(); // Obtén el nombre
        int supplierId = proveedorMap.getOrDefault(nombreProveedor, -1); //aqui quiero recuperar la ID del proveedor
        System.out.println(supplierId);
        String name = txtNombre.getText();
        int PCIe = Integer.parseInt((String) txtPCIe.getSelectedItem());
        int memory = (int) txtMemoria.getValue();
        String typeMemory = txtTipoMemoria.getText();
        int bandwidth = (int) txtAnchoBanda.getValue();
        int quantity = (int) txtCantidad.getValue();
        if(nombreProveedor.isEmpty() || name.isEmpty() || typeMemory.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        TarjetaGraficaModel tarjeta = new TarjetaGraficaModel();
        tarjeta.setGraphicsCardId(graphicsCardId);
        tarjeta.setSupplierId(supplierId);
        tarjeta.setName(name);
        tarjeta.setPCIe(PCIe);
        tarjeta.setMemory(memory);
        tarjeta.setTypeMemory(typeMemory);
        tarjeta.setBandwidth(bandwidth);
        tarjeta.setQuantity(quantity);
        TarjetaGraficaDAO dao = new TarjetaGraficaDAOImpl();
        try {
            dao.update(tarjeta);
            JOptionPane.showMessageDialog(null, "Tarjeta actualizada correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error");
            System.err.println(e);
        } finally{
            TarjetasGraficas tarjetas = new TarjetasGraficas();
            LayoutAdmin.getInstance().switchPanel(tarjetas);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TarjetasGraficas tarjetas = new TarjetasGraficas();
        LayoutAdmin.getInstance().switchPanel(tarjetas);
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
        txtId.setText(editTarjeta.getGraphicsCardId());
        for (String nombreProveedor : proveedorMap.keySet()) {
            if (proveedorMap.get(nombreProveedor).equals(editTarjeta.getSupplierId())) {
                txtProveedor.setSelectedItem(nombreProveedor);
                break;
            }
        }
        txtNombre.setText(editTarjeta.getName());
        txtPCIe.setSelectedItem(editTarjeta.getPCIe());
        txtMemoria.setValue(editTarjeta.getMemory());
        txtTipoMemoria.setText(editTarjeta.getTypeMemory());
        txtAnchoBanda.setValue(editTarjeta.getBandwidth());
        txtCantidad.setValue(editTarjeta.getQuantity());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner txtAnchoBanda;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JSpinner txtMemoria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtPCIe;
    private javax.swing.JComboBox<String> txtProveedor;
    private javax.swing.JTextField txtTipoMemoria;
    // End of variables declaration//GEN-END:variables
}

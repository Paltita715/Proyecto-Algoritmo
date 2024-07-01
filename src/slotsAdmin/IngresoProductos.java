/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package slotsAdmin;

import DAO.implementaciones.ProductosDAOImpl;
import DAO.interfaces.ProductosDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.ProductosModel;

public class IngresoProductos extends javax.swing.JPanel {

    /**
     * Creates new form IngresoProductos
     */
    public IngresoProductos() {
        initComponents();
        tablaProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Marca", "Cantidad", "ID Proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaProductosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESO DE PRODUCTOS");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("TIPO:");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("MARCA:");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("CANTIDAD:");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setText("ID PROVEEDOR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(jLabel1)
                .addContainerGap(604, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel2))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel3)
                            .addGap(11, 11, 11)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel6)
                            .addGap(11, 11, 11)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel7)
                            .addGap(11, 11, 11)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel8)
                            .addGap(11, 11, 11)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMousePressed
        int rowUser = TablaProductos.getSelectedRow();
        if (rowUser != -1) {
            txtNombre.setText((String) TablaProductos.getValueAt(rowUser, 1));
            txtTipo.setText((String) TablaProductos.getValueAt(rowUser, 2));
            txtMarca.setText((String) TablaProductos.getValueAt(rowUser, 3));
            txtCantidad.setText((String) TablaProductos.getValueAt(rowUser, 4));
            txtProveedor.setText((String) TablaProductos.getValueAt(rowUser, 5));
        }
    }//GEN-LAST:event_TablaProductosMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rowUser = TablaProductos.getSelectedRow();
        if(rowUser == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de usuarios. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ProductosModel productos = new ProductosModel();
        int IdProductos = (int) TablaProductos.getValueAt(rowUser, 0);
        productos.setIdProducto(IdProductos);
        ProductosDAO dao = new ProductosDAOImpl();
        try {
            dao.delete(productos);
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            tablaProductos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el usuario no se a eliminado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String name = txtNombre.getText();
        String type = txtTipo.getText();
        String brand = txtMarca.getText();
        String quantity = txtCantidad.getText();
        String idproveedor = txtProveedor.getText();
        if(name.isEmpty() || type.isEmpty() || brand.isEmpty()|| quantity.isEmpty()|| idproveedor.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ProductosModel productos = new ProductosModel();
        productos.setName(name);
        productos.setType(type);
        productos.setBrand(brand);
        productos.setQuantity(quantity);
        productos.setIdProveedor(idproveedor);
        ProductosDAO dao = new ProductosDAOImpl();
        try {
            dao.create(productos);
            JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
            tablaProductos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el usuario no se a creado");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int rowUser = TablaProductos.getSelectedRow();
        if(rowUser == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla de usuarios. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int IdProducto = (int) TablaProductos.getValueAt(rowUser, 0);
        String name = txtNombre.getText();
        String type = txtTipo.getText();
        String brand = txtMarca.getText();
        String quantity = txtCantidad.getText();
        String idproveedor = txtProveedor.getText();
        if(name.isEmpty() || type.isEmpty() || brand.isEmpty()|| quantity.isEmpty()|| idproveedor.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ProductosModel productos = new ProductosModel();
        productos.setName(name);
        productos.setType(type);
        productos.setBrand(brand);
        productos.setQuantity(quantity);
        productos.setIdProveedor(idproveedor);
        System.out.println(productos.getIdProducto() + productos.getName() + productos.getType() + productos.getBrand() + productos.getQuantity() + productos.getIdProveedor());
        ProductosDAO dao = new ProductosDAOImpl();
        try {
            dao.update(productos);
            JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
            tablaProductos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, el usuario no se a actualizado");
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    private void tablaProductos(){
        try {
            ProductosDAO dao = new ProductosDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TablaProductos.getModel();
            model.setRowCount(0);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getIdProducto(), 
                u.getName(),
                u.getType(),
                u.getBrand(),
                u.getQuantity(),
                u.getIdProveedor()
            })));
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtCantidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtProveedor;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

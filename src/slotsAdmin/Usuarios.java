
package slotsAdmin;

import implement.UserImpl;
import interfaces.UserInterface;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JPanel {

    public Usuarios() {
        initComponents();
        tablaUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsers = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(820, 530));
        setPreferredSize(new java.awt.Dimension(820, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Apellido", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaUsers);
        if (TablaUsers.getColumnModel().getColumnCount() > 0) {
            TablaUsers.getColumnModel().getColumn(0).setResizable(false);
            TablaUsers.getColumnModel().getColumn(0).setPreferredWidth(10);
            TablaUsers.getColumnModel().getColumn(1).setResizable(false);
            TablaUsers.getColumnModel().getColumn(2).setResizable(false);
            TablaUsers.getColumnModel().getColumn(3).setResizable(false);
            TablaUsers.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 440, -1));

        jButton1.setText("ELIMINAR");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 457, 100, 50));

        jButton2.setText("AGREGAR");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 457, 100, 50));

        jButton3.setText("EDITAR");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 457, 100, 50));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRAR USUARIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 320, 40));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 320, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("APELLIDO:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 320, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NOMBRE DE USUARIO:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CONTRASEÑA:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 320, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tablaUsers() {
        try {
            UserInterface User = new UserImpl();
            DefaultTableModel model = (DefaultTableModel) TablaUsers.getModel();
            User.listar().forEach((u -> model.addRow(new Object[]{u.getIdUser(), u.getName(),u.getLastName(),u.getUserName(),u.getPassword()})));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
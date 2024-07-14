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
import modelos.RamModel;
import modelos.DiscoModel;
import modelos.PlacaMadreModel;
import modelos.TarjetaGraficaModel;
import algoritmos.Recomendaciones;
import java.util.ArrayList;
import javax.swing.RowFilter;
import modelos.ComponenteModel;
import javax.swing.table.TableRowSorter;

public class General extends javax.swing.JPanel {
    
    String typeComponent;
    private Recomendaciones recomendaciones;
    private DefaultTableModel tableModel;
    private TableRowSorter<DefaultTableModel> rowSorter;

    public General() {
        initComponents();
        recomendaciones = new Recomendaciones();
        cargarDatosDiscos();
        typeComponent="Disk";
        setupTableAndSearch();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRams = new javax.swing.JButton();
        btnDiscos = new javax.swing.JButton();
        btnTarjetasGraficas = new javax.swing.JButton();
        btnPlacasMadre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableComponentes = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableRecomendaciones = new javax.swing.JTable();
        comBoxBuscarPor = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("COMPONENTES DISPONIBLES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, 20));

        btnRams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-ram-de-computadora-100.png"))); // NOI18N
        btnRams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRamsActionPerformed(evt);
            }
        });
        add(btnRams, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 100, 100));

        btnDiscos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Procesador.png"))); // NOI18N
        btnDiscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscosActionPerformed(evt);
            }
        });
        add(btnDiscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, 100));

        btnTarjetasGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-tarjeta-de-video-100.png"))); // NOI18N
        btnTarjetasGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetasGraficasActionPerformed(evt);
            }
        });
        add(btnTarjetasGraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 100, 100));

        btnPlacasMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/icons8-placa-base-100.png"))); // NOI18N
        btnPlacasMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasMadreActionPerformed(evt);
            }
        });
        add(btnPlacasMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 100, 100));

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
        TableComponentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableComponentesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TableComponentes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 720, 400));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 720, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 30, 620));

        TableRecomendaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableRecomendaciones);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 560, 350));

        add(comBoxBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 150, 50));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 500, 50));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/search.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRamsActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0);
        cargarDatosRAM();
        typeComponent="RAM";
    }//GEN-LAST:event_btnRamsActionPerformed

    private void btnDiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscosActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0);
        cargarDatosDiscos();
        typeComponent="Disk";
    }//GEN-LAST:event_btnDiscosActionPerformed

    private void btnTarjetasGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetasGraficasActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0);
        cargarDatosTarjetasGraficas();
        typeComponent="GraphicsCard";
    }//GEN-LAST:event_btnTarjetasGraficasActionPerformed

    private void btnPlacasMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasMadreActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0);
        cargarDatosMotherboards();
        typeComponent="Motherboard";
    }//GEN-LAST:event_btnPlacasMadreActionPerformed

    private void TableComponentesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableComponentesMousePressed
        int rowComponent = TableComponentes.getSelectedRow();
        if (rowComponent != -1) {
            ArrayList<ComponenteModel> recomendacionesList = null;
            switch (typeComponent) {
                case "RAM" -> {
                    RamModel ram = new RamModel();
                    ram.setName((String) TableComponentes.getValueAt(rowComponent, 0));
                    ram.setType((String) TableComponentes.getValueAt(rowComponent, 1));
                    ram.setCapacity((int) TableComponentes.getValueAt(rowComponent, 2));
                    ram.setSpeed((int) TableComponentes.getValueAt(rowComponent, 3));
                    ram.setLatency((String) TableComponentes.getValueAt(rowComponent, 4));
                    ram.setVoltage((double) TableComponentes.getValueAt(rowComponent, 5));
                    ram.setQuantity((int) TableComponentes.getValueAt(rowComponent, 6));
                    recomendacionesList = recomendaciones.recomendacionRam(ram);
                }
                case "Disk" -> {
                    DiscoModel disco = new DiscoModel();
                    disco.setName((String) TableComponentes.getValueAt(rowComponent, 0));
                    disco.setType((String) TableComponentes.getValueAt(rowComponent, 1));
                    disco.setCapacity((int) TableComponentes.getValueAt(rowComponent, 2));
                    disco.setInterface((String) TableComponentes.getValueAt(rowComponent, 3));
                    disco.setReadSpeed((int) TableComponentes.getValueAt(rowComponent, 4));
                    disco.setWriteSpeed((int) TableComponentes.getValueAt(rowComponent, 5));
                    disco.setQuantity((int) TableComponentes.getValueAt(rowComponent, 6));
                    recomendacionesList = recomendaciones.recomendacionDisco(disco);
                }
                case "GraphicsCard" -> {
                    TarjetaGraficaModel tarjeta = new TarjetaGraficaModel();
                    tarjeta.setName((String) TableComponentes.getValueAt(rowComponent, 0));
                    tarjeta.setPCIe((int) TableComponentes.getValueAt(rowComponent, 1));
                    tarjeta.setMemory((int) TableComponentes.getValueAt(rowComponent, 2));
                    tarjeta.setTypeMemory((String) TableComponentes.getValueAt(rowComponent, 3));
                    tarjeta.setBandwidth((int) TableComponentes.getValueAt(rowComponent, 4));
                    tarjeta.setQuantity((int) TableComponentes.getValueAt(rowComponent, 5));
                    recomendacionesList = recomendaciones.recomendacionTarjeta(tarjeta);
                }
                case "Motherboard" -> {
                    PlacaMadreModel placa = new PlacaMadreModel();
                    placa.setName((String) TableComponentes.getValueAt(rowComponent, 0));
                    placa.setSocket((String) TableComponentes.getValueAt(rowComponent, 1));
                    placa.setRamType((String) TableComponentes.getValueAt(rowComponent, 2));
                    placa.setMaxRam((int) TableComponentes.getValueAt(rowComponent, 3));
                    placa.setPCIe((int) TableComponentes.getValueAt(rowComponent, 4));
                    placa.setStoragePorts((int) TableComponentes.getValueAt(rowComponent, 5));
                    placa.setQuantity((int) TableComponentes.getValueAt(rowComponent, 6));
                    placa.setCompatibleWithSATA((boolean) TableComponentes.getModel().getValueAt(rowComponent, 7));
                    placa.setCompatibleWithNVMe((boolean) TableComponentes.getModel().getValueAt(rowComponent, 8));
                    recomendacionesList = recomendaciones.recomendacionPlaca(placa);
                }
                default -> throw new AssertionError();
            }
            if (recomendacionesList != null) {
                cargarRecomendaciones(recomendacionesList);
            }
        }
    }//GEN-LAST:event_TableComponentesMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        //Capturar por que se esta buscando segun el comboBox
        
        //obtener el texto de txtBuscar
        
        //y buscar el texto en la tabla segun la columna del comboBox y ocualtar todas las flas que no coincidad
        String text = txtBuscar.getText().trim();
        int columnIndex = comBoxBuscarPor.getSelectedIndex();
        if (columnIndex != -1 && !text.isEmpty()) {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, columnIndex));
        } else {
            rowSorter.setRowFilter(null); // Si no hay texto, mostrar todas las filas
        }
    }//GEN-LAST:event_txtBuscarActionPerformed
    
    private void cargarRecomendaciones(ArrayList<ComponenteModel> recomendacionesList) {
        DefaultTableModel model = (DefaultTableModel) TableRecomendaciones.getModel();
        model.setRowCount(0); // Limpiar tabla
        model.setColumnIdentifiers(new Object[]{"Tipo Componente", "Nombre", "Tipo", "Cantidad"});
        for (ComponenteModel componente : recomendacionesList) {
            model.addRow(new Object[]{
                componente.getTipoComponente(),
                componente.getNombre(),
                componente.getTipo(),
                componente.getCantidad()
            });
        }
    }
    
    private void cargarDatosDiscos() {
        try {
            DiscoDAO dao = new DiscoDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            String[] columnNames = {"Name", "Type", "Capacity", "Interface", "Read Speed", "Write Speed", "Quantity"};
            model.setColumnIdentifiers(columnNames);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getName(),
                u.getType(),
                u.getCapacity(),
                u.getInterface(),
                u.getReadSpeed(),
                u.getWriteSpeed(),
                u.getQuantity(),
            })));
            comBoxBuscarPor.removeAllItems();
            for (String columnName : columnNames) {
                comBoxBuscarPor.addItem(columnName);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    private void cargarDatosRAM() {
        try {
            RamDAO dao = new RamDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            String[] columnNames = {"Name", "Type", "Capacity", "Speed", "Latency", "Voltage", "Quantity"};
            model.setColumnIdentifiers(columnNames);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getName(),
                u.getType(),
                u.getCapacity(),
                u.getSpeed(),
                u.getLatency(),
                u.getVoltage(),
                u.getQuantity(),
            })));
            comBoxBuscarPor.removeAllItems();
            for (String columnName : columnNames) {
                comBoxBuscarPor.addItem(columnName);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    private void cargarDatosTarjetasGraficas() {
        try {
            TarjetaGraficaDAO dao = new TarjetaGraficaDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            String[] columnNames = {"Name", "PCIe", "Memory", "Type Memory", "Bandwidth", "Quantity"};
            model.setColumnIdentifiers(columnNames);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getName(),
                u.getPCIe(),
                u.getMemory(),
                u.getTypeMemory(),
                u.getBandwidth(),
                u.getQuantity(),
            })));
            comBoxBuscarPor.removeAllItems();
            for (String columnName : columnNames) {
                comBoxBuscarPor.addItem(columnName);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    private void cargarDatosMotherboards() {
        try {
            PlacaMadreDAO dao = new PlacaMadreDAOImpl();
            DefaultTableModel model = (DefaultTableModel) TableComponentes.getModel();
            model.setRowCount(0); // Limpiar tabla
            String[] columnNames = {"Name", "socket", "ramType", "maxRam", "PCIe", "storagePorts", "Quantity", "compatibleWithSATA", "compatibleWithNVMe"};
            model.setColumnIdentifiers(columnNames);
            dao.readAll().forEach((u -> model.addRow(new Object[]{
                u.getName(),
                u.getSocket(),
                u.getRamType(),
                u.getMaxRam(),
                u.getPCIe(),
                u.getStoragePorts(),
                u.getQuantity(),
                u.isCompatibleWithSATA(), // Campo oculto
                u.isCompatibleWithNVMe()  // Campo oculto
            })));
            TableComponentes.removeColumn(TableComponentes.getColumnModel().getColumn(7)); // Oculta compatibleWithSATA
            TableComponentes.removeColumn(TableComponentes.getColumnModel().getColumn(7)); // Oculta compatibleWithNVMe
            comBoxBuscarPor.removeAllItems();
            for (String columnName : columnNames) {
                comBoxBuscarPor.addItem(columnName);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    private void setupTableAndSearch() {
        // Configurar el TableRowSorter
        tableModel = (DefaultTableModel) TableComponentes.getModel();
        rowSorter = new TableRowSorter<>(tableModel);
        TableComponentes.setRowSorter(rowSorter);

        // Agregar nombres de columnas al comBoxBuscarPor
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            comBoxBuscarPor.addItem(tableModel.getColumnName(i));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableComponentes;
    private javax.swing.JTable TableRecomendaciones;
    private javax.swing.JButton btnDiscos;
    private javax.swing.JButton btnPlacasMadre;
    private javax.swing.JButton btnRams;
    private javax.swing.JButton btnTarjetasGraficas;
    private javax.swing.JComboBox<String> comBoxBuscarPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

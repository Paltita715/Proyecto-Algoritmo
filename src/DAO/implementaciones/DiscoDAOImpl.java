package DAO.implementaciones;

import DAO.interfaces.DiscoDAO;
import dataBase.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.DiscoModel;

public class DiscoDAOImpl extends DBConnection implements DiscoDAO{

    @Override
    public void create(DiscoModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Disks(diskId, supplierId, name, type, capacity, Interface, readSpeed, writeSpeed, quantity) VALUES(?,?,?,?,?,?,?,?,?)");
            st.setString(1,t.getDiskId());
            st.setInt(2, t.getSupplierId());
            st.setString(3,t.getName());
            st.setString(4,t.getType());
            st.setInt(5,t.getCapacity());
            st.setString(6,t.getInterface());
            st.setInt(7,t.getReadSpeed());
            st.setInt(8,t.getWriteSpeed());
            st.setInt(9,t.getQuantity());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public ArrayList<DiscoModel> readAll() throws Exception {
        ArrayList<DiscoModel> listDisks = new ArrayList();
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `Disks`");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {  
                DiscoModel  disco = new DiscoModel();
                disco.setDiskId(rs.getString("diskId"));
                disco.setSupplierId(rs.getInt("supplierId"));
                disco.setName(rs.getString("name"));
                disco.setType(rs.getString("type"));
                disco.setCapacity(rs.getInt("capacity"));
                disco.setInterface(rs.getString("Interface"));
                disco.setReadSpeed(rs.getInt("readSpeed"));
                disco.setWriteSpeed(rs.getInt("writeSpeed"));
                disco.setQuantity(rs.getInt("quantity"));
                listDisks.add(disco);
           }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return listDisks;
    }

    @Override
    public DiscoModel readBy(DiscoModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(DiscoModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `Disks` SET supplierId = ?, name = ?, type = ?, capacity = ?, Interface = ?, readSpeed = ?, writeSpeed = ?, quantity = ? WHERE diskId = ?");
            st.setInt(1, t.getSupplierId());
            st.setString(2,t.getName());
            st.setString(3,t.getType());
            st.setInt(4,t.getCapacity());
            st.setString(5,t.getInterface());
            st.setInt(6,t.getReadSpeed());
            st.setInt(7,t.getWriteSpeed());
            st.setInt(8,t.getQuantity());
            st.setString(9,t.getDiskId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public void delete(DiscoModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM Disks WHERE diskId = ?");
            st.setString(1, t.getDiskId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
}

package DAO.implementaciones;

import DAO.interfaces.RamDAO;
import dataBase.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.RamModel;

public class RamDAOImpl extends DBConnection implements RamDAO{

    @Override
    public void create(RamModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO RAMs(ramId, supplierId, name, type, capacity, speed, latency, voltage, quantity) VALUES(?,?,?,?,?,?,?,?,?)");
            st.setString(1,t.getRamId());
            st.setInt(2, t.getSupplierId());
            st.setString(3,t.getName());
            st.setString(4,t.getType());
            st.setInt(5,t.getCapacity());
            st.setInt(6,t.getSpeed());
            st.setString(7,t.getLatency());
            st.setDouble(8,t.getVoltage());
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
    public ArrayList<RamModel> readAll() throws Exception {
        ArrayList<RamModel> listRams = new ArrayList();
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `RAMs`");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {  
                RamModel  ram = new RamModel();
                ram.setRamId(rs.getString("ramId"));
                ram.setSupplierId(rs.getInt("supplierId"));
                ram.setName(rs.getString("name"));
                ram.setType(rs.getString("type"));
                ram.setCapacity(rs.getInt("capacity"));
                ram.setSpeed(rs.getInt("speed"));
                ram.setLatency(rs.getString("latency"));
                ram.setVoltage(rs.getDouble("voltage"));
                ram.setQuantity(rs.getInt("quantity"));
                listRams.add(ram);
           }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return listRams;
    }

    @Override
    public RamModel readBy(RamModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(RamModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `RAMs` SET supplierId = ?, name = ?, type = ?, capacity = ?, speed = ?, latency = ?, voltage = ?, quantity = ? WHERE ramId = ?");
            st.setInt(1, t.getSupplierId());
            st.setString(2,t.getName());
            st.setString(3,t.getType());
            st.setInt(4,t.getCapacity());
            st.setInt(5,t.getSpeed());
            st.setString(6,t.getLatency());
            st.setDouble(7,t.getVoltage());
            st.setInt(8,t.getQuantity());
            st.setString(9,t.getRamId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public void delete(RamModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM RAMs WHERE ramId = ?");
            st.setString(1, t.getRamId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
}

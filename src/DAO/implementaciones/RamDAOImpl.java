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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
                ram.setVoltage(rs.getInt("voltage"));
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(RamModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

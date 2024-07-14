package DAO.implementaciones;

import DAO.interfaces.PlacaMadreDAO;
import dataBase.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.PlacaMadreModel;

public class PlacaMadreDAOImpl extends DBConnection implements PlacaMadreDAO{

    @Override
    public void create(PlacaMadreModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO MotherBoards(motherboardId, supplierId, name, socket, ramType, maxRam, PCIe, storagePorts, quantity, compatibleWithSATA, compatibleWithNVMe) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1,t.getMotherboardId());
            st.setInt(2, t.getSupplierId());
            st.setString(3,t.getName());
            st.setString(4,t.getSocket());
            st.setString(5,t.getRamType());
            st.setInt(6,t.getMaxRam());
            st.setInt(7,t.getPCIe());
            st.setInt(8,t.getStoragePorts());
            st.setInt(9,t.getQuantity());
            st.setBoolean(10, t.isCompatibleWithSATA());
            st.setBoolean(11, t.isCompatibleWithNVMe());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public ArrayList<PlacaMadreModel> readAll() throws Exception {
        ArrayList<PlacaMadreModel> listMotherBoards = new ArrayList();
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `MotherBoards`");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {  
                PlacaMadreModel  placaMadre = new PlacaMadreModel();
                placaMadre.setMotherboardId(rs.getString("motherboardId"));
                placaMadre.setSupplierId(rs.getInt("supplierId"));
                placaMadre.setName(rs.getString("name"));
                placaMadre.setSocket(rs.getString("socket"));
                placaMadre.setRamType(rs.getString("ramType"));
                placaMadre.setMaxRam(rs.getInt("maxRam"));
                placaMadre.setPCIe(rs.getInt("PCIe"));
                placaMadre.setStoragePorts(rs.getInt("storagePorts"));
                placaMadre.setQuantity(rs.getInt("quantity"));
                placaMadre.setCompatibleWithSATA(rs.getBoolean("compatibleWithSATA"));
                placaMadre.setCompatibleWithNVMe(rs.getBoolean("compatibleWithNVME"));
                listMotherBoards.add(placaMadre);
           }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return listMotherBoards;
    }

    @Override
    public PlacaMadreModel readBy(PlacaMadreModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(PlacaMadreModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `MotherBoards` SET supplierId = ?, name = ?, socket = ?, ramType = ?, maxRam = ?, PCIe = ?, storagePorts = ?, quantity = ?, compatibleWithSATA = ?, compatibleWithNVMe = ? WHERE motherboardId = ?");
            st.setInt(1, t.getSupplierId());
            st.setString(2,t.getName());
            st.setString(3,t.getSocket());
            st.setString(4,t.getRamType());
            st.setInt(5,t.getMaxRam());
            st.setInt(6,t.getPCIe());
            st.setInt(7,t.getStoragePorts());
            st.setInt(8,t.getQuantity());
            st.setBoolean(9, t.isCompatibleWithSATA());
            st.setBoolean(10, t.isCompatibleWithNVMe());
            st.setString(11,t.getMotherboardId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public void delete(PlacaMadreModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM MotherBoards WHERE motherboardId = ?");
            st.setString(1, t.getMotherboardId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
}

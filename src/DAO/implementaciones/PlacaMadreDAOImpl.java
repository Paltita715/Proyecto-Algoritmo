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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(PlacaMadreModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

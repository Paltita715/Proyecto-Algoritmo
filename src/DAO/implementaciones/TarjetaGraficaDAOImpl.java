package DAO.implementaciones;

import DAO.interfaces.TarjetaGraficaDAO;
import dataBase.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.TarjetaGraficaModel;

public class TarjetaGraficaDAOImpl extends DBConnection implements TarjetaGraficaDAO{

    @Override
    public void create(TarjetaGraficaModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO GraphicsCards(graphicsCardId, supplierId, name, PCIe, memory, typeMemory, bandwidth, quantity) VALUES(?,?,?,?,?,?,?,?)");
            st.setString(1,t.getGraphicsCardId());
            st.setInt(2, t.getSupplierId());
            st.setString(3,t.getName());
            st.setInt(4,t.getPCIe());
            st.setInt(5,t.getMemory());
            st.setString(6,t.getTypeMemory());
            st.setInt(7,t.getBandwidth());
            st.setInt(8,t.getQuantity());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public ArrayList<TarjetaGraficaModel> readAll() throws Exception {
        ArrayList<TarjetaGraficaModel> listGraphicsCards = new ArrayList();
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `GraphicsCards`");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {  
                TarjetaGraficaModel  tarjetaGrafica = new TarjetaGraficaModel();
                tarjetaGrafica.setGraphicsCardId(rs.getString("graphicsCardId"));
                tarjetaGrafica.setSupplierId(rs.getInt("supplierId"));
                tarjetaGrafica.setName(rs.getString("name"));
                tarjetaGrafica.setPCIe(rs.getInt("PCIe"));
                tarjetaGrafica.setMemory(rs.getInt("memory"));
                tarjetaGrafica.setTypeMemory(rs.getString("typeMemory"));
                tarjetaGrafica.setBandwidth(rs.getInt("bandwidth"));
                tarjetaGrafica.setQuantity(rs.getInt("quantity"));
                listGraphicsCards.add(tarjetaGrafica);
           }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return listGraphicsCards;
    }

    @Override
    public TarjetaGraficaModel readBy(TarjetaGraficaModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(TarjetaGraficaModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `GraphicsCards` SET supplierId = ?, name = ?, PCIe = ?, memory = ?, typeMemory = ?, bandwidth = ?, quantity = ? WHERE graphicsCardId = ?");
            st.setInt(1, t.getSupplierId());
            st.setString(2,t.getName());
            st.setInt(3,t.getPCIe());
            st.setInt(4,t.getMemory());
            st.setString(5,t.getTypeMemory());
            st.setInt(6,t.getBandwidth());
            st.setInt(7,t.getQuantity());
            st.setString(8,t.getGraphicsCardId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public void delete(TarjetaGraficaModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM GraphicsCards WHERE graphicsCardId = ?");
            st.setString(1, t.getGraphicsCardId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
}

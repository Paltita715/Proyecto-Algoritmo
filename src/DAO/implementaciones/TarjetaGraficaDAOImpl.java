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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
                tarjetaGrafica.setInterface(rs.getString("Interface"));
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(TarjetaGraficaModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

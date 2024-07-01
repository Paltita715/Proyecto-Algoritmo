package DAO.implementaciones;

import DAO.interfaces.ProductosDAO;
import dataBase.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.ProductosModel;

public class ProductosDAOImpl extends DBConnection implements ProductosDAO{

    @Override
    public void create(ProductosModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO productos(Name, Type, Brand, Quantity, idProveedor) VALUES(?,?,?,?,?)");
            st.setString(1,t.getName());
            st.setString(2,t.getType());
            st.setString(3,t.getBrand());
            st.setString(4,t.getQuantity());
            st.setString(5,t.getIdProveedor());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public ArrayList<ProductosModel> readAll() throws Exception {
        ArrayList<ProductosModel> listProductos = new ArrayList();
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `productos`");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {  
                ProductosModel  productos = new ProductosModel();
                productos.setIdProducto(rs.getInt("IdProducto"));
                productos.setName(rs.getString("Name"));
                productos.setType(rs.getString("Type"));
                productos.setBrand(rs.getString("Brand"));
                productos.setQuantity(rs.getString("Quantity"));
                productos.setIdProveedor(rs.getString("IdProveedor"));
                listProductos.add(productos);
           }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return listProductos;
    }

    @Override
    public ProductosModel readBy(ProductosModel t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ProductosModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `productos` SET Name = ?, Type = ?, Brand = ?, Quantity = ?, IdProveedor = ? WHERE idProductosr = ?");
            st.setString(1,t.getName());
            st.setString(2,t.getType());
            st.setString(3,t.getBrand());
            st.setString(4,t.getQuantity());
            st.setString(5,t.getIdProveedor());
            st.setInt(6, t.getIdProducto());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    @Override
    public void delete(ProductosModel t) throws Exception {
        try {
            conectarDB();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM productos WHERE idProducto = ?");
            st.setInt(1,t.getIdProducto());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
}

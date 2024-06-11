
package implement;

import dataBase.DBConnection;
import interfaces.UserInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.UserModel;

public class UserImpl extends DBConnection implements UserInterface{

    @Override
    public void Crear(UserModel user) {
        try {
            Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuario(Nombres,Apellido,User,Clave,Cargo,Estado) VALUES(?,?,?,?,?,?)");
            st.setString(1,user.getName());
            st.setString(2,user.getLastName());
            st.setString(3,user.getUserName());
            st.setString(4,user.getPassword());
            st.executeUpdate();
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<UserModel> listar() {
        List<UserModel> lista = null;
        try {
            Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `user`");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {  
               UserModel  user = new UserModel();
               user.setIdUser(rs.getInt("idUser"));
               user.setName(rs.getString("Name"));
               user.setLastName(rs.getString("LastName"));
               user.setUserName(rs.getString("UserName"));
               user.setPassword(rs.getString("Password"));
               lista.add(user);
           }
            rs.close();
            st.close();
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    @Override
    public void Actualizar(UserModel user) {
    }

    @Override
    public void Eliminiar(UserModel userId) {
    }

}
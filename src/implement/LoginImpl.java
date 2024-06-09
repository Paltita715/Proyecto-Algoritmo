/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

import dataBase.DBConnection;
import interfaces.LoginInterface;
import modelos.LoginModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginImpl extends DBConnection implements LoginInterface{

    @Override
    public LoginModel ObtenerUser(String userName) {
        LoginModel loginModel = new LoginModel();
        try {
            Conectar();
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM `user` WHERE UserName = ? ");
            st.setString(1,userName);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {  
                loginModel.setIdUser(rs.getInt("idUser"));
                loginModel.setUserName(rs.getString("UserName"));
                loginModel.setPassword(rs.getString("Password"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(LoginImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                this.cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(LoginImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return loginModel;
    }
}

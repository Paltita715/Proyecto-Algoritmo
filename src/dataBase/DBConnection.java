/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    protected Connection conexion;
    String dbName="proyecto_algoritmo"; //Nombre de la base de datos
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/"+dbName;
    private final String USER = "root";
    private final String PASS = "";
    public void Conectar() throws ClassNotFoundException {
        try {
            System.out.println("Se conecto la base de datos");
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
            System.out.println("No se conecto a la base de datos");
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cerrar() throws SQLException{
        if (conexion != null) {
            if (!conexion.isClosed()){
                conexion.close();
                System.out.println("Se desconecto la base de datos");
            }
        }
    }
}
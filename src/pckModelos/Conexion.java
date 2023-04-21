/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckModelos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author huawei
 */
public class Conexion {
    Connection conexion;
    public Connection Conectar(String user, String pass){
        try{
        DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
        String nombreServidor = "168.234.74.80";
        String numPuerto = "1521";
        String sid = "umg";
        String url = "jdbc:oracle:thin:@"+ nombreServidor+":" + numPuerto+":"+sid;
        conexion =DriverManager.getConnection(url,user,pass);
        JOptionPane.showMessageDialog(null, "Conexión exitosa!");
        return conexion;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se ha podido conectar a la base de datos por "+e.getMessage());
        }
        return conexion;
    }
}
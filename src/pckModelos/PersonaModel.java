/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckModelos;

import java.sql.*;
/**
 *
 * @author huawei
 */
public class PersonaModel {
    String apellidos;
    String nombre;
    int telefono;
    Connection con;

    public PersonaModel(String apellidos, String nombre, int telefono) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void GuardarPersona(){
        try{
            Conexion nuevaConexion = new Conexion();
            this.con = nuevaConexion.Conectar(nombre, nombre);
            Statement sentencia = con.createStatement();
            sentencia.execute("insert into Persona values ('apellidos', 'nombre', 'telefono')");
        }
    }
}

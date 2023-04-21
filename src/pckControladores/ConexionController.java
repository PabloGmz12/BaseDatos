/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pckModelos.Conexion;
import pckVistas.frmLogin;
import pckVistas.frmPrincipal;

/**
 *
 * @author huawei
 */
public class ConexionController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmLogin VistaLogin;
    Conexion ModeloConexion;

    public ConexionController(frmPrincipal VistaPrincipal, frmLogin VistaLogin, Conexion ModeloConexion) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaLogin = VistaLogin;
        this.ModeloConexion = ModeloConexion;

        //LEVANTAR FORM PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);

        //PONER A LA ESCUCHA EL BOTÓN PRINCIPAL
        this.VistaLogin.btnConectar.addActionListener(this);

        //LEVANTAR EL LOGIN
        this.VistaLogin.setLocationRelativeTo(null);
        this.VistaLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLogin.btnConectar){
            this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(), this.VistaLogin.txtPassword.getText());
        }
    }
}

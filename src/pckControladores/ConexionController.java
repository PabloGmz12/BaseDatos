/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pckModelos.Conexion;
import pckModelos.PersonaModel;
import pckVistas.frmLogin;
import pckVistas.frmPersonas;
import pckVistas.frmPrincipal;

/**
 *
 * @author huawei
 */
public class ConexionController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmLogin VistaLogin;
    frmPersonas VistaPersonas;
    Conexion ModeloConexion;
    PersonaModel ModeloPersona;

    public ConexionController(frmPrincipal VistaPrincipal, frmLogin VistaLogin,
            Conexion ModeloConexion, frmPersonas VistaPersonas, PersonaModel ModeloPersona) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaLogin = VistaLogin;
        this.ModeloConexion = ModeloConexion;
        this.VistaPersonas = VistaPersonas;
        this.ModeloPersona = ModeloPersona;

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
            
            if(ModeloConexion!=null){
                this.VistaLogin.dispose();
                this.VistaPersonas.btnGuardar.addActionListener(this);
                this.VistaPersonas.setLocationRelativeTo(null);
                this.VistaPersonas.setVisible(true);
            }
        }
        if(e.getSource()== this.VistaPersonas.btnGuardar){
            this.ModeloPersona.GuardarPersona(this.VistaPersonas.txtApellidos.getText(),this.VistaPersonas.txtNombre.getText(),
                    this.VistaPersonas.txtTelefono.getText());
        }
    }
}

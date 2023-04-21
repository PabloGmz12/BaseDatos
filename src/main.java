
import pckControladores.ConexionController;
import pckModelos.Conexion;
import pckModelos.PersonaModel;
import pckVistas.frmLogin;
import pckVistas.frmPersonas;
import pckVistas.frmPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author huawei
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLogin VistaLogin = new frmLogin(VistaPrincipal,true);
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal,true);
        Conexion ModeloConexion = new Conexion();
        PersonaModel ModeloPersona = new PersonaModel();
        ConexionController ControladorConexion = new ConexionController(VistaPrincipal, VistaLogin, ModeloConexion, VistaPersonas,ModeloPersona);

    }
}

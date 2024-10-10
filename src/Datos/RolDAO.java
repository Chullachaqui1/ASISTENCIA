package Datos;

import Database.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.ROL;
import Datos.RolDAO;

/**
 *
 * @author A07
 */
public class RolDAO {
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    ROL obja = new ROL();
    
    public RolDAO(){
        CON=Conexion.getInstancia();
    }

    public List<ROL> listar() {
        List<ROL> registros=new ArrayList();
        try {
            ps=CON.conectar().prepareStatement("SELECT * FROM ROL");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new ROL(rs.getInt(1),rs.getString(2)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            rs=null;
            CON.desconectar();
        }
        return registros;
    }
}

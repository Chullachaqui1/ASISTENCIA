/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Database.Conexion;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author A16
 */
public class USUARIOSDAO {
    

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public USUARIOSDAO() {
        CON=Conexion.getInstancia();
    }
    
    
        
    
    
    public List<Usuario> listar1(String texto) {
        List<Usuario> registros=new ArrayList();
        try {
            ps=CON.conectar().prepareStatement("SELECT * FROM USUARIOS WHERE DNI LIKE ?");
	    ps.setString(1,"%" + texto +"%");
            rs=ps.executeQuery();
            while(rs.next()){
         registros.add(new Usuario(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
                
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
	

	 public boolean insertar(Usuario obj) {
        resp=false;
        try {
            ps=CON.conectar().prepareStatement("INSERT INTO Usuario (IdUsuarios,Nombres,Apellidos,correo,DNI,Clave,IdRol) VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, obj.getIdUsuarios());
            ps.setString(2, obj.getNombres());
            ps.setString(3, obj.getApellidos());
            ps.setString(4, obj.getCorreo());
	    ps.setInt(5, obj.getDNI());
            ps.setString(6, obj.getClave());
            ps.setInt(7, obj.getIdRol());

            if (ps.executeUpdate()>0){
                resp=true;
            }
            ps.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            CON.desconectar();
        }
        return resp;
     }
	public boolean actualizar(Usuario obj) {
        resp=false;
        try {
            ps=CON.conectar().prepareStatement("UPDATE Usuario SET nombre=?, descripcion=? ");
            ps.setString(1, obj.getNombres());
          //  ps.setString(2, obj.getDescripcion());
            
            if (ps.executeUpdate()>0){
                resp=true;
            }
            ps.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            CON.desconectar();
        }
        return resp;
    }

}

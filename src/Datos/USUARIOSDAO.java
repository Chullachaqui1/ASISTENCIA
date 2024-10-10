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
        CON = Conexion.getInstancia();
    }

    public List<Usuario> listar1(String texto) {
        List<Usuario> registros = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM USUARIOS WHERE Nombres LIKE ?");
            ps.setString(1, "%" + texto + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getBytes(6), rs.getInt(7)));

            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return registros;
    }

    /*public Usuario login(String texto) {

        try {
            ps=CON.conectar().prepareStatement("SELECT * FROM USUARIOS WHERE correo LIKE ?");
	    ps.setString(1,"%" + texto +"%");
            rs=ps.executeQuery();
            while(rs.next()){
            new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getBytes(6),rs.getInt(7));   
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
        return new Usuario();
    }*/
    public Usuario login(String texto) {
        Usuario usuario = null;

        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM USUARIOS WHERE correo = ?");
            ps.setString(1, texto);  // Se elimina el uso de LIKE si es una búsqueda exacta por correo
            rs = ps.executeQuery();

            if (rs.next()) {

                usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getInt(5),rs.getBytes(6), rs.getInt(7));
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }

        return usuario;  // Devolvemos el usuario encontrado o null si no se encontró
    }

    public boolean insertar(Usuario obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO USUARIOS (Nombres,Apellidos,correo,DNI,Clave,IdRol) VALUES (?,?,?,?,?,?)");
            ps.setString(1, obj.getNombres());
            ps.setString(2, obj.getApellidos());
            ps.setString(3, obj.getCorreo());
            ps.setInt(4, obj.getDNI());
            ps.setBytes(5, obj.getClave());
            ps.setInt(6, obj.getIdRol());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    public boolean actualizar(Usuario obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET nombre=?, descripcion=? ");
            ps.setString(1, obj.getNombres());
            //  ps.setString(2, obj.getDescripcion());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

}

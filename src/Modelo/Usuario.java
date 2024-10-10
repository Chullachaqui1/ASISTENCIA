/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class Usuario {
    private int IdUsuarios, DNI, IdRol;
    private String Nombres, Apellidos, correo;
    private byte[] Clave;

    public Usuario() {
    }

    public Usuario(String correo, byte[] Clave,int IdRol) {
        this.IdRol = IdRol;
        this.correo = correo;
        this.Clave = Clave;
    }

    public Usuario(String Nombres, String Apellidos, String correo, int DNI, byte[] Clave, int IdRol) {
        this.DNI = DNI;
        this.IdRol = IdRol;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.correo = correo;
        this.Clave = Clave;
    }

    
    public Usuario(int IdUsuarios, String Nombres, String Apellidos, String correo, int DNI, byte[] Clave, int IdRol) {
        this.IdUsuarios = IdUsuarios;
        this.DNI = DNI;
        this.IdRol = IdRol;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.correo = correo;
        this.Clave = Clave;
    }

    public int getIdUsuarios() {
        return IdUsuarios;
    }

    public void setIdUsuarios(int IdUsuarios) {
        this.IdUsuarios = IdUsuarios;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public byte[] getClave() {  // Cambio aquí
        return Clave;
    }

    public void setClave(byte[] Clave) {  // Cambio aquí
        this.Clave = Clave;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class Alumno {
    public int DNIALUMNO ;
	public String nombres,apellidos,direccion,refDirec ;

    public Alumno() {
    }

    public Alumno(int DNIALUMNO, String nombres, String apellidos, String direccion, String refDirec) {
        this.DNIALUMNO = DNIALUMNO;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.refDirec = refDirec;
    }

    public int getDNIALUMNO() {
        return DNIALUMNO;
    }

    public void setDNIALUMNO(int DNIALUMNO) {
        this.DNIALUMNO = DNIALUMNO;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRefDirec() {
        return refDirec;
    }

    public void setRefDirec(String refDirec) {
        this.refDirec = refDirec;
    }
        
        
	
    
}

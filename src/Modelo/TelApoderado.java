/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class TelApoderado {
    
    private int DNIALUMNO,IdFamiliaridad,celular,telefono;
    private String nombreApoderado;

    public TelApoderado() {
    }

    public TelApoderado(int DNIALUMNO, int IdFamiliaridad, int celular, int telefono, String nombreApoderado) {
        this.DNIALUMNO = DNIALUMNO;
        this.IdFamiliaridad = IdFamiliaridad;
        this.celular = celular;
        this.telefono = telefono;
        this.nombreApoderado = nombreApoderado;
    }

    public int getDNIALUMNO() {
        return DNIALUMNO;
    }

    public void setDNIALUMNO(int DNIALUMNO) {
        this.DNIALUMNO = DNIALUMNO;
    }

    public int getIdFamiliaridad() {
        return IdFamiliaridad;
    }

    public void setIdFamiliaridad(int IdFamiliaridad) {
        this.IdFamiliaridad = IdFamiliaridad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }
    
}

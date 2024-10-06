/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class FAMILIARIDAD {
    
    int IdFamiliaridad;
    String tipoFamiliaridad;

    public FAMILIARIDAD() {
    }

    public FAMILIARIDAD(int IdFamiliaridad, String tipoFamiliaridad) {
        this.IdFamiliaridad = IdFamiliaridad;
        this.tipoFamiliaridad = tipoFamiliaridad;
    }

    public int getIdFamiliaridad() {
        return IdFamiliaridad;
    }

    public void setIdFamiliaridad(int IdFamiliaridad) {
        this.IdFamiliaridad = IdFamiliaridad;
    }

    public String getTipoFamiliaridad() {
        return tipoFamiliaridad;
    }

    public void setTipoFamiliaridad(String tipoFamiliaridad) {
        this.tipoFamiliaridad = tipoFamiliaridad;
    }
    
}

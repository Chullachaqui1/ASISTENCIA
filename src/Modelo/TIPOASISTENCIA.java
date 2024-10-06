/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class TIPOASISTENCIA {
 
   String idTipoAsis,NombreTipo;

    public TIPOASISTENCIA() {
    }

    public TIPOASISTENCIA(String idTipoAsis, String NombreTipo) {
        this.idTipoAsis = idTipoAsis;
        this.NombreTipo = NombreTipo;
    }

    public String getIdTipoAsis() {
        return idTipoAsis;
    }

    public void setIdTipoAsis(String idTipoAsis) {
        this.idTipoAsis = idTipoAsis;
    }

    public String getNombreTipo() {
        return NombreTipo;
    }

    public void setNombreTipo(String NombreTipo) {
        this.NombreTipo = NombreTipo;
    }
   
}

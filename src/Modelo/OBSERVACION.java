/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class OBSERVACION {
    
    private int IdObservaciones,IdAsistencia;
    private String Observacion;

    public OBSERVACION() {
    }

    public OBSERVACION(int IdObservaciones, int IdAsistencia, String Observacion) {
        this.IdObservaciones = IdObservaciones;
        this.IdAsistencia = IdAsistencia;
        this.Observacion = Observacion;
    }

    public int getIdObservaciones() {
        return IdObservaciones;
    }

    public void setIdObservaciones(int IdObservaciones) {
        this.IdObservaciones = IdObservaciones;
    }

    public int getIdAsistencia() {
        return IdAsistencia;
    }

    public void setIdAsistencia(int IdAsistencia) {
        this.IdAsistencia = IdAsistencia;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }
    
}
